package Validators.TeacherValidators;

import Requests.Teacher.AddTeacherRequest;
import Validate.IRequestValidator;
import Validate.ValidateString;

import java.util.List;

public class AddTeacherRequestValidator implements IRequestValidator<AddTeacherRequest> {
    @Override
    public List<String> validate(AddTeacherRequest request) {
        List<String> errors = ValidateString.validateString(request.getFirstName());
        errors.addAll(ValidateString.validateString(request.getMiddleName()));
        errors.addAll(ValidateString.validateString(request.getLastName()));
        return errors;

    }
}
