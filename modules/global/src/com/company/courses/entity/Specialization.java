package com.company.courses.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Table(name = "COURSES_SPECIALIZATION")
@Entity(name = "courses_Specialization")
public class Specialization extends BaseLongIdEntity implements HasUuid {
    private static final long serialVersionUID = 8662887631102995206L;

    @Column(name = "UUID")
    protected UUID uuid;

    @NotNull
    @Column(name = "TITLE", nullable = false)
    protected String title;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Composition
    @OneToMany(mappedBy = "specialization")
    protected List<Course> courseList;

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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