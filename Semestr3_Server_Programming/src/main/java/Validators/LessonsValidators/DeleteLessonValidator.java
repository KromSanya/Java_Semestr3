package Validators.LessonsValidators;

import Requests.Lessons.DeleteLessonRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;
import Validate.ValidateString;



import java.util.ArrayList;
import java.util.List;

public class DeleteLessonValidator implements IRequestValidator<DeleteLessonRequest> {

    @Override
    public List<String> validate(DeleteLessonRequest request) {
        List<String> errors = new ArrayList<>();
        errors.addAll(ValidateID.validateId(request.getLessonID(), "lessonID"));
        return errors;
    }
}
