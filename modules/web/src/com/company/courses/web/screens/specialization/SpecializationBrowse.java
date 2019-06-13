package com.company.courses.web.screens.specialization;

import com.haulmont.cuba.gui.screen.*;
import com.company.courses.entity.Specialization;

@UiController("courses_Specialization.browse")
@UiDescriptor("specialization-browse.xml")
@LookupComponent("specializationsTable")
@LoadDataBeforeShow
public class SpecializationBrowse extends StandardLookup<Specialization> {
}