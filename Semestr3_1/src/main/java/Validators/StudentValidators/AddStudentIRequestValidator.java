package Validators.StudentValidators;

import Requests.Students.AddStudentRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;
import Validate.ValidateString;


import java.util.List;

public class AddStudentIRequestValidator implements IRequestValidator<AddStudentRequest> {
    @Override
    public List<String> validate(AddStudentRequest request) {
        List<String> errors = ValidateString.validateString(request.getFirstName());
        errors.addAll(ValidateString.validateString(request.getMiddleName()));
        errors.addAll(ValidateString.validateString(request.getLastName()));
        errors.addAll(ValidateString.validateString(request.getStatus()));
        return errors;
    }
}


