package com.company.testrestapi.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.Date;

@JmixEntity
@Table(name = "KnowledgePoints")
@Entity
public class KnowledgePoints {

    @JmixGeneratedValue
    @Column(name = "Id", nullable = false)
    @Id
    private Integer id;

    @InstanceName
    @Column(name = "Name")
    private String name;

    @Column(name = "CreatedTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

    @Column(name = "UpdatedTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}