package com.company.courses.entity;

import com.haulmont.cuba.core.entity.BaseLongIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Table(name = "COURSES_QUESTION")
@Entity(name = "courses_Question")
public class Question extends BaseLongIdEntity implements HasUuid {
    private static final long serialVersionUID = -820591702431626695L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Lob
    @Column(name = "TEXT")
    protected String text;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TEST_ID")
    protected Test test;

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}