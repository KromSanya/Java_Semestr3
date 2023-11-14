package Validators.LessonsValidators;

import Requests.Lessons.EditLessonRequest;
import Validate.IRequestValidator;
import Validate.ValidateDate;
import Validate.ValidateID;
import Validate.ValidateString;


import java.util.ArrayList;
import java.util.List;

public class EditLessonValidator implements IRequestValidator<EditLessonRequest> {


    @Override
    public List<String> validate(EditLessonRequest request) {
        List<String> errors = new ArrayList<>();

        errors.addAll(ValidateID.validateId(request.getGroupID(), "groupID"));
        errors.addAll(ValidateID.validateId(request.getLessonID(), "groupID"));
        errors.addAll(ValidateID.validateId(request.getTeacherID(), "teacherID"));
        errors.addAll(ValidateID.validateId(request.getNumber(), "lessonID"));
        errors.addAll(ValidateString.validateString(request.getDate()));

        return errors;
    }
}
