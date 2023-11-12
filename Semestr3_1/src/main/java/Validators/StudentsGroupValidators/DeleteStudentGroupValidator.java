package Validators.StudentsGroupValidators;

import Requests.StudentGroup.DeleteStudentGroupRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;
import Validate.ValidateString;

import java.util.List;

public class DeleteStudentGroupValidator implements IRequestValidator<DeleteStudentGroupRequest> {
    @Override
    public List<String> validate(DeleteStudentGroupRequest request) {
        List<String> errors = ValidateID.validateId(request.getId(), "GroupID");
        return errors;
    }
}
