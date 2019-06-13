package com.company.courses.web.screens.course;

import com.haulmont.cuba.gui.screen.*;
import com.company.courses.entity.Course;

@UiController("courses_Course.edit")
@UiDescriptor("course-edit.xml")
@EditedEntityContainer("courseDc")
@LoadDataBeforeShow
public class CourseEdit extends StandardEditor<Course> {
}