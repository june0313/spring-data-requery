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

package org.springframework.data.requery.kotlin.repository

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.repository.NoRepositoryBean

/**
 * Extension of [CoroutineCrudRepository] to provide additional methods
 * to retrieve entities using the pagination and sorting abstraction.
 *
 * @author debop
 * @since 18. 10. 14
 */
@NoRepositoryBean
interface CoroutinePagingAndSortingRepository<E : Any, ID : Any> : CoroutineCrudRepository<E, ID> {

    /**
     * Returns all entities sorted by the given options.
     *
     * @param sort
     * @return all entities sorted by the given options
     */
    suspend fun findAll(sort: Sort): Iterable<E>

    /**
     * Returns a [Page] of entities meeting the paging restriction provided in the `Pageable` object.
     *
     * @param pageable
     * @return a page of entities
     */
    suspend fun findAll(pageable: Pageable): Page<E>
}