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

package org.n52.series.db.beans.ereporting;

import java.util.Collection;
import java.util.Set;

import org.n52.series.db.beans.DataEntity;
import org.n52.series.db.beans.UnitEntity;
import org.n52.series.db.beans.data.Data.ProfileData;

public class EReportingProfileDataEntity extends EReportingDataEntity<Set<DataEntity< ? >>> implements ProfileData {

    private static final long serialVersionUID = -3450153841771781000L;
    private String verticalfromName;
    private String verticaltoName;
    private UnitEntity verticalUnit;

    @Override
    public boolean isNoDataValue(Collection<String> noDataValues) {
        return getValue() == null;
    }

    @Override
    public boolean isSetValue() {
        return getValue() != null;
    }

    @Override
    public String getValueAsString() {
        return isSetValue()
                ? getValue().toString()
                : "";
    }

    public String getVerticalFromName() {
        return verticalfromName;
    }

    public void setVerticalFromName(String name) {
        this.verticalfromName = name;
    }

    public String getVerticalToName() {
        return verticaltoName;
    }

    public void setVerticalToName(String name) {
        this.verticaltoName = name;
    }

    public UnitEntity getVerticalUnit() {
        return verticalUnit;
    }

    public void setVerticalUnit(UnitEntity unit) {
        this.verticalUnit = unit;
    }

}
