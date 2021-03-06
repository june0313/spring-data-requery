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

import io.requery.Entity;
import io.requery.Key;
import io.requery.Transient;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.requery.domain.AbstractPersistable;
import org.springframework.data.requery.domain.ToStringBuilder;

import java.util.Objects;

/**
 * AbstractAdmin
 *
 * @author debop
 * @since 18. 6. 14
 */
@Getter
@Setter
@Entity
public abstract class AbstractCustomer extends AbstractPersistable<Long> {

    private static final long serialVersionUID = 5109744158340238800L;

    @Key
    protected Long id;

    protected String name;


    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Transient
    @Override
    protected ToStringBuilder buildStringHelper() {
        return super.buildStringHelper()
            .add("name", name);
    }
}
