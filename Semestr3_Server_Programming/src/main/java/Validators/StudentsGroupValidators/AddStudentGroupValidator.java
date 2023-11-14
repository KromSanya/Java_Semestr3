package Validators.StudentsGroupValidators;

import Requests.StudentGroup.AddStudentGroupRequest;
import Validate.IRequestValidator;
import Validate.ValidateString;

import java.util.List;

public class AddStudentGroupValidator implements IRequestValidator<AddStudentGroupRequest> {

    @Override
    public List<String> validate(AddStudentGroupRequest request) {
        List<String> errors = ValidateString.validateString(request.getGroupName());
        return errors;
    }
}
