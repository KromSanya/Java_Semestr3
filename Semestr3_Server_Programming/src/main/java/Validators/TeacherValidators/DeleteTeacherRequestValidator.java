package Validators.TeacherValidators;

import Requests.Teacher.DeleteTeacherRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;

import java.util.List;

public class DeleteTeacherRequestValidator implements IRequestValidator<DeleteTeacherRequest> {
    @Override
    public List<String> validate(DeleteTeacherRequest request) {
        List<String> errors = ValidateID.validateId(request.getTeacherId(), "TeacherID");
        return errors;
    }
}
