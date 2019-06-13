package com.company.courses.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Table(name = "COURSES_COURSE")
@Entity(name = "courses_Course")
public class Course extends BaseLongIdEntity implements HasUuid {
    private static final long serialVersionUID = 148814348579190690L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Column(name = "TITLE")
    protected String title;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SPECIALIZATION_ID")
    protected Specialization specialization;

    @Composition
    @OneToMany(mappedBy = "course")
    protected List<Test> testList;

    public List<Test> getTestList() {
        return testList;
    }

    public void setTestList(List<Test> testList) {
        this.testList = testList;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}