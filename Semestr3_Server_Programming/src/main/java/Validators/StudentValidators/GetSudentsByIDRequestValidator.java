package Validators.StudentValidators;

import Requests.Students.GetStudentByIDRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;


import java.util.List;

public class GetSudentsByIDRequestValidator implements IRequestValidator<GetStudentByIDRequest> {
    @Override
    public List<String> validate(GetStudentByIDRequest request) {
         List<String> errors = ValidateID.validateId(request.getStudentID(), "studentID");
        return errors;
    }
}
