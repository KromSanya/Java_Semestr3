package Validators.LessonsValidators;

import Requests.Lessons.GetLessonsByTeacherRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;
import Validate.ValidateString;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class GetLessonsByTeacherValidator implements IRequestValidator<GetLessonsByTeacherRequest> {

    @Override
    public List<String> validate(GetLessonsByTeacherRequest request) {
        List<String> errors = new ArrayList<>();
        errors.addAll(ValidateString.validateString(request.getStartDate()));
        errors.addAll(ValidateString.validateString(request.getEndDate()));
        errors.addAll(ValidateID.validateId(request.getTeacherId(), "TeacherID"));
        return errors;
    }
}
