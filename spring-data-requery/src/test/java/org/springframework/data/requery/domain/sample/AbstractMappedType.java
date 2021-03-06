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

package org.springframework.data.requery.domain.sample;

import io.requery.Generated;
import io.requery.Key;
import io.requery.Superclass;
import io.requery.Version;
import org.springframework.data.requery.domain.AbstractPersistable;

/**
 * AbstractMappedType
 *
 * @author debop
 * @since 18. 6. 25
 */
@Superclass
public abstract class AbstractMappedType extends AbstractPersistable<Long> {

    public AbstractMappedType() {}

    public AbstractMappedType(String attribute1) {
        this.attribute1 = attribute1;
    }

    @Key
    @Generated
    protected Long id;

    @Version
    protected Long version;

    String attribute1;


    private static final long serialVersionUID = 1828035517487100998L;
}
