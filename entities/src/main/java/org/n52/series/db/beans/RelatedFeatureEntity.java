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

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.n52.series.db.beans.HibernateRelations.HasFeature;
import org.n52.series.db.beans.HibernateRelations.HasOfferings;
import org.n52.series.db.beans.HibernateRelations.HasRelatedFeatureRoles;

/**
 * @since 1.0.0
 */
public class RelatedFeatureEntity extends PkidEntity
        implements Serializable, HasFeature<RelatedFeatureEntity>, HasRelatedFeatureRoles<RelatedFeatureEntity>,
        HasOfferings<RelatedFeatureEntity> {

    private static final long serialVersionUID = -8143897383050691280L;

    private AbstractFeatureEntity<RelatedFeatureEntity> feature;

    private Set<RelatedFeatureRoleEntity> relatedFeatureRoles = new HashSet<RelatedFeatureRoleEntity>(0);

    private Set<OfferingEntity> offerings = new HashSet<OfferingEntity>(0);

    public RelatedFeatureEntity() {
    }

    @Override
    public AbstractFeatureEntity<RelatedFeatureEntity> getFeature() {
        return this.feature;
    }

    @Override
    public RelatedFeatureEntity setFeature(AbstractFeatureEntity<RelatedFeatureEntity> feature) {
        this.feature = feature;
        return this;
    }

    @Override
    public Set<RelatedFeatureRoleEntity> getRelatedFeatureRoles() {
        return this.relatedFeatureRoles;
    }

    @Override
    public RelatedFeatureEntity setRelatedFeatureRoles(Set<RelatedFeatureRoleEntity> relatedFeatureRoles) {
        this.relatedFeatureRoles = relatedFeatureRoles;
        return this;
    }

    @Override
    public Set<OfferingEntity> getOfferings() {
        return this.offerings;
    }

    @SuppressWarnings("unchecked")
    @Override
    public RelatedFeatureEntity setOfferings(final Object offerings) {
        if (offerings instanceof Set< ? >) {
            this.offerings = (Set<OfferingEntity>) offerings;
        } else {
            getOfferings().add((OfferingEntity) offerings);
        }
        return this;
    }

    @Override
    public boolean isSetOfferings() {
        return getOfferings() != null && !getOfferings().isEmpty();
    }

}