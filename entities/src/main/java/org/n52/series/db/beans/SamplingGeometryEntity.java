/*
 * Copyright 2015-2017 52°North Initiative for Geospatial Open Source
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

import java.sql.Timestamp;
import java.util.Date;

public class SamplingGeometryEntity extends GeometryEntity {

    private Date timestamp;

    private Long dataset;

    public Date getTimestamp() {
        return timestamp != null
                ? new Timestamp(timestamp.getTime())
                : null;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp != null
                ? new Timestamp(timestamp.getTime())
                : null;
    }

    @Deprecated
    public Long getSeriesPkid() {
        return dataset;
    }

    @Deprecated
    public void setSeriesPkid(Long dataset) {
        this.dataset = dataset;
    }

    public Long getDataset() {
        return dataset;
    }

    public void setDataset(Long dataset) {
        this.dataset = dataset;
    }
}
