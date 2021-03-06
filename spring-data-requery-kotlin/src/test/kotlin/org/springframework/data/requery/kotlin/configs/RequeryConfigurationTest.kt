/*
 * Copyright 2018 Coupang Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.data.requery.kotlin.configs

import io.requery.meta.EntityModel
import io.requery.sql.KotlinEntityDataStore
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.requery.kotlin.AbstractRequeryTest
import org.springframework.data.requery.kotlin.core.RequeryOperations
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner

/**
 * RequeryConfigurationTest
 *
 * @author debop
 */
@RunWith(SpringRunner::class)
@ContextConfiguration(classes = [RequeryTestConfiguration::class])
class RequeryConfigurationTest : AbstractRequeryTest() {

    @Autowired
    lateinit var dataStore: KotlinEntityDataStore<Any>

    @Autowired
    lateinit var requeryTemplate: RequeryOperations

    @Autowired
    lateinit var entityModel: EntityModel

    @Test
    fun `load entity model`() {
        logger.info { "EntityModel=$entityModel" }
        assertThat(entityModel).isNotNull
    }

    @Test
    fun `context loading`() {
        assertThat(dataStore).isNotNull
        assertThat(requeryTemplate).isNotNull
    }
}