package com.company.courses.web.screens.test;

import com.haulmont.cuba.gui.screen.*;
import com.company.courses.entity.Test;

@UiController("courses_Test.edit")
@UiDescriptor("test-edit.xml")
@EditedEntityContainer("testDc")
@LoadDataBeforeShow
public class TestEdit extends StandardEditor<Test> {
}