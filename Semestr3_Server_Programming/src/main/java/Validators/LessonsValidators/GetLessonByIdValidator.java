package Validators.LessonsValidators;


import Requests.Lessons.GetLessonByIDRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;
import Validate.ValidateString;

import java.util.ArrayList;
import java.util.List;

public class GetLessonByIdValidator implements IRequestValidator<GetLessonByIDRequest> {

    @Override
    public List<String> validate(GetLessonByIDRequest request) {
        return new ArrayList<>(ValidateID.validateId(request.getLessonID(), "LessonID"));
    }
}
