package Validators.LessonsValidators;



import Requests.Lessons.GetLessonsByGroupRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;
import Validate.ValidateString;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class GetLessonsByGroupValidator implements IRequestValidator<GetLessonsByGroupRequest> {
    @Override
    public List<String> validate(GetLessonsByGroupRequest request) {
        List<String> errors = new ArrayList<>();
        errors.addAll(ValidateString.validateString(request.getStartDate()));
        errors.addAll(ValidateString.validateString(request.getEndDate()));
        errors.addAll(ValidateID.validateId(request.getGroupId(), "groupID"));
        return errors;
    }
}
