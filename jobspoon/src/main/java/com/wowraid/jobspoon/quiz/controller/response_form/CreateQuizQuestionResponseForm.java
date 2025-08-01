package com.wowraid.jobspoon.quiz.controller.response_form;

import com.wowraid.jobspoon.quiz.entity.QuestionType;
import com.wowraid.jobspoon.quiz.service.response.CreateQuizQuestionResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CreateQuizQuestionResponseForm {
    private final String message;
    private final Long questionId;
    private final QuestionType questionType;
    private final String questionText;
    private final Integer questionAnswer;

    public static CreateQuizQuestionResponseForm from(CreateQuizQuestionResponse response) {
        return new CreateQuizQuestionResponseForm(
                response.getMessage(),
                response.getQuestionId(),
                response.getQuestionType(),
                response.getQuestionText(),
                response.getQuestionAnswer()
        );
    }
}
