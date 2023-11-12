package Validators.StudentValidators;

import Requests.Students.GetStudentsByGroupRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;


import java.util.List;

public class GetSudentsByGroupRequestValidator implements IRequestValidator<GetStudentsByGroupRequest> {
    @Override
    public List<String> validate(GetStudentsByGroupRequest request) {
        return ValidateID.validateId(request.getGroupID(), "groupID");
    }
}
