package com.company.courses.web.screens.test;

import com.haulmont.cuba.gui.screen.*;
import com.company.courses.entity.Test;

@UiController("courses_Test.browse")
@UiDescriptor("test-browse.xml")
@LookupComponent("testsTable")
@LoadDataBeforeShow
public class TestBrowse extends StandardLookup<Test> {
}