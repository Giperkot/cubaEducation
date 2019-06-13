package com.company.courses.web.screens.specialization;

import com.haulmont.cuba.gui.screen.*;
import com.company.courses.entity.Specialization;

@UiController("courses_Specialization.edit")
@UiDescriptor("specialization-edit.xml")
@EditedEntityContainer("specializationDc")
@LoadDataBeforeShow
public class SpecializationEdit extends StandardEditor<Specialization> {
}