/**
 * Copyright (C) 2012-2017 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation.
 *
 * If the program is linked with libraries which are licensed under one of
 * the following licenses, the combination of the program with the linked
 * library is not considered a "derivative work" of the program:
 *
 *     - Apache License, version 2.0
 *     - Apache Software License, version 1.0
 *     - GNU Lesser General Public License, version 3
 *     - Mozilla Public License, versions 1.0, 1.1 and 2.0
 *     - Common Development and Distribution License (CDDL), version 1.0
 *
 * Therefore the distribution of the program linked with libraries licensed
 * under the aforementioned licenses, is permitted by the copyright holders
 * if the distribution is compliant with both the GNU General Public
 * License version 2 and the aforementioned licenses.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 */
package org.n52.series.db.beans.feature.gml;

import java.util.Set;

import org.n52.series.db.beans.feature.ReferenceEntity;
import org.n52.series.db.beans.HibernateRelations.HasRemarks;

/**
 * Hibernate entiity for the verticalCS
 *
 * @author <a href="mailto:c.hollmann@52north.org">Carsten Hollmann</a>
 * @since 1.0.0
 *
 */
public class VerticalCSEntity extends ReferenceEntity implements HasRemarks<VerticalCSEntity>{

    private String remarks;
    private Set<CoordinateSystemAxisEntity> coordinateSystemAxis;
    private String aggregation;

    /**
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     *            the remarks to set
     */
    public VerticalCSEntity setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * @return the coordinateSystemAxis
     */
    public Set<CoordinateSystemAxisEntity> getCoordinateSystemAxis() {
        return coordinateSystemAxis;
    }

    /**
     * @param coordinateSystemAxis
     *            the coordinateSystemAxis to set
     */
    public void setCoordinateSystemAxis(Set<CoordinateSystemAxisEntity> coordinateSystemAxis) {
        this.coordinateSystemAxis = coordinateSystemAxis;
    }

    public boolean hasCoordinateSystemAxis() {
        return getCoordinateSystemAxis() != null && !getCoordinateSystemAxis().isEmpty();
    }

    /**
     * @return the aggregation
     */
    public String getAggregation() {
        return aggregation;
    }

    /**
     * @param aggregation
     *            the aggregation to set
     */
    public void setAggregation(String aggregation) {
        this.aggregation = aggregation;
    }

    public boolean isSetAggregation() {
        return getAggregation() != null && !getAggregation().isEmpty();
    }
}
