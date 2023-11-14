package Validators.LessonsValidators;

import Requests.Lessons.AddLessonRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;
import Validate.ValidateString;


import java.util.ArrayList;
import java.util.List;

public class AddLessonValidator implements IRequestValidator<AddLessonRequest> {

    @Override
    public List<String> validate(AddLessonRequest request) {
        List<String> errors = new ArrayList<>();
        errors.addAll(ValidateID.validateId(request.getGroupID(), "groupID"));
        errors.addAll(ValidateID.validateId(request.getTeacherID(), "teacherID"));
        errors.addAll(ValidateID.validateId(request.getNumber(), "lessonID"));
        errors.addAll(ValidateString.validateString(request.getDate()));
        return errors;
    }
}
