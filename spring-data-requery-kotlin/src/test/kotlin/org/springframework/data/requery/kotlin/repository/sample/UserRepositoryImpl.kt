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

package org.springframework.data.requery.kotlin.repository.sample

import mu.KotlinLogging
import org.springframework.data.requery.kotlin.domain.sample.User

/**
 * org.springframework.data.requery.repository.sample.UserRepositoryImpl
 *
 * @author debop
 */
class UserRepositoryImpl : UserRepositoryCustom {

    companion object {
        private val log = KotlinLogging.logger { }
    }

    override fun findByOverrridingMethod() {
        log.debug { "A method overriding a finder was invoked!" }
    }

    override fun someCustomMethod(user: User) {
        log.debug { "Some custom method was invoked! user=$user" }
    }
}