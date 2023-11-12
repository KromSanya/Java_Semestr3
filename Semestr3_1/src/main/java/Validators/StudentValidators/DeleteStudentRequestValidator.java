package Validators.StudentValidators;

import Validate.IRequestValidator;
import Validate.ValidateID;
import requests.Studentsrequests.DeleteStudentRequest;

import java.util.List;

public class DeleteStudentRequestValidator implements IRequestValidator<DeleteStudentRequest> {
    @Override
    public List<String> validate(DeleteStudentRequest request) {
        return ValidateID.validateId(request.getId(), "studentID");
    }
}
