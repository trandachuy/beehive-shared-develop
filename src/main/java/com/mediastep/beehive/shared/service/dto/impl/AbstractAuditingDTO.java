package com.mediastep.beehive.shared.service.dto.impl;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.ReadOnlyProperty;
import springfox.documentation.annotations.ApiIgnore;

import java.io.Serializable;
import java.time.Instant;

/**
 * Base abstract class for DTO which will hold definitions for created, last modified by and created,
 * last modified by date.
 */
public abstract class AbstractAuditingDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(readOnly = true)
    @ReadOnlyProperty
    private String createdBy;

    @ApiModelProperty(readOnly = true)
    @ReadOnlyProperty
    private Instant createdDate = Instant.now();

    @ApiModelProperty(readOnly = true)
    private String lastModifiedBy;

    @ApiModelProperty(readOnly = true)
    private Instant lastModifiedDate = Instant.now();

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
