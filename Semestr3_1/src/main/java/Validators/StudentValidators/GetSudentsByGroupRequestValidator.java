package Validators.StudentValidators;

import Validate.IRequestValidator;
import Validate.ValidateID;
import requests.Studentsrequests.GetStudentsByGroupRequest;

import java.util.List;

public class GetSudentsByGroupRequestValidator implements IRequestValidator<GetStudentsByGroupRequest> {
    @Override
    public List<String> validate(GetStudentsByGroupRequest request) {
        return ValidateID.validateId(request.getGroupID(), "groupID");
    }
}
