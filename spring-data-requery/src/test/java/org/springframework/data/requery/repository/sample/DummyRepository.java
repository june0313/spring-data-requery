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

package org.springframework.data.requery.repository.sample;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.requery.domain.sample.Dummy;
import org.springframework.transaction.annotation.Transactional;

/**
 * DummyRepository
 *
 * @author debop
 * @since 18. 6. 25
 */
@Transactional
public interface DummyRepository extends CrudRepository<Dummy, Long> {

    // 모두 procedure 테스트용 예제이다. 
}
