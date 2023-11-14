package Validators.TeacherValidators;

import Requests.Teacher.EditTeacherRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;
import Validate.ValidateString;

import java.util.List;

public class EditTeacherRequestValidator implements IRequestValidator<EditTeacherRequest> {
    @Override
    public List<String> validate(EditTeacherRequest request) {
        List<String> errors = ValidateString.validateString(request.getFirstName());
        errors.addAll(ValidateString.validateString(request.getMiddleName()));
        errors.addAll(ValidateString.validateString(request.getLastName()));
        errors.addAll(ValidateID.validateId(request.getTeacherID(), "TeacherID"));
        return errors;
    }
}
