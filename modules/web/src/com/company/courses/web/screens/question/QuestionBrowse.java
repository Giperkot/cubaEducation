package com.company.courses.web.screens.question;

import com.haulmont.cuba.gui.screen.*;
import com.company.courses.entity.Question;

@UiController("courses_Question.browse")
@UiDescriptor("question-browse.xml")
@LookupComponent("questionsTable")
@LoadDataBeforeShow
public class QuestionBrowse extends StandardLookup<Question> {
}