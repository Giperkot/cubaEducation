package com.company.courses.web.screens.course;

import com.haulmont.cuba.gui.screen.*;
import com.company.courses.entity.Course;

@UiController("courses_Course.browse")
@UiDescriptor("course-browse.xml")
@LookupComponent("coursesTable")
@LoadDataBeforeShow
public class CourseBrowse extends StandardLookup<Course> {
}