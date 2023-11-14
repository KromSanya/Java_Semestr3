package Validators.StudentValidators;

import Requests.Students.EditStudentRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;
import Validate.ValidateString;


import java.util.List;

public class EditStudentRequestValidator implements IRequestValidator<EditStudentRequest> {

    @Override
    public List<String> validate(EditStudentRequest request) {
        List<String> errors = ValidateString.validateString(request.getFirstName());
        errors.addAll(ValidateString.validateString(request.getMiddleName()));
        errors.addAll(ValidateString.validateString(request.getLastName()));
        errors.addAll(ValidateID.validateId(request.getGroupID(), "studentGroupID"));
        return errors;
    }
}
