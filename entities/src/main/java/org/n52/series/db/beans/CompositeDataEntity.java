/*
 * Copyright 2015-2018 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.n52.series.db.beans;

import java.util.Collection;
import java.util.Set;

public abstract class CompositeDataEntity extends DataEntity<Set<DataEntity< ? >>> {

    private static final long serialVersionUID = -2942122854792122664L;

    @Override
    public boolean isNoDataValue(Collection<String> noDataValues) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Set<DataEntity< ? >> getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(Set<DataEntity< ? >> value) {
        super.setValue(value);
    }

}
