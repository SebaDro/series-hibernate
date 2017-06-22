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
 * Hibernate entiity for the verticalCRS
 *
 * @author <a href="mailto:c.hollmann@52north.org">Carsten Hollmann</a>
 * @since 1.0.0
 *
 */
public class VerticalCRSEntity extends ReferenceEntity implements HasRemarks<VerticalCRSEntity> {

    private String remarks;
    private Set<DomainOfValidityEntity> domainOfValidity;
    private Set<String> scope;
    private VerticalCSEntity verticalCS;
    private VerticalDatumEntity verticalDatum;

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
    public VerticalCRSEntity setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * @return the domainOfValidity
     */
    public Set<DomainOfValidityEntity> getDomainOfValidity() {
        return domainOfValidity;
    }

    /**
     * @param domainOfValidity
     *            the domainOfValidity to set
     */
    public void setDomainOfValidity(Set<DomainOfValidityEntity> domainOfValidity) {
        this.domainOfValidity = domainOfValidity;
    }

    public boolean hasDomainOfValidity() {
        return getDomainOfValidity() != null && !getDomainOfValidity().isEmpty();
    }

    /**
     * @return the scope
     */
    public Set<String> getScope() {
        return scope;
    }

    /**
     * @param scope
     *            the scope to set
     */
    public void setScope(Set<String> scope) {
        this.scope = scope;
    }

    public boolean hasScope() {
        return getScope() != null && !getScope().isEmpty();
    }

    /**
     * @return the verticalCS
     */
    public VerticalCSEntity getVerticalCS() {
        return verticalCS;
    }

    /**
     * @param verticalCS
     *            the verticalCS to set
     */
    public void setVerticalCS(VerticalCSEntity verticalCS) {
        this.verticalCS = verticalCS;
    }

    public boolean isSetVerticalCS() {
        return getVerticalCS() != null;
    }

    /**
     * @return the verticalDatum
     */
    public VerticalDatumEntity getVerticalDatum() {
        return verticalDatum;
    }

    /**
     * @param verticalDatum
     *            the verticalDatum to set
     */
    public void setVerticalDatum(VerticalDatumEntity verticalDatum) {
        this.verticalDatum = verticalDatum;
    }

    public boolean isSetVerticalDatum() {
        return getVerticalDatum() != null;
    }
}
