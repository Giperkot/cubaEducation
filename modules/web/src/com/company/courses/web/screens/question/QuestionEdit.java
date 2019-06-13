package com.company.courses.web.screens.question;

import com.haulmont.cuba.gui.screen.*;
import com.company.courses.entity.Question;

@UiController("courses_Question.edit")
@UiDescriptor("question-edit.xml")
@EditedEntityContainer("questionDc")
@LoadDataBeforeShow
public class QuestionEdit extends StandardEditor<Question> {
}