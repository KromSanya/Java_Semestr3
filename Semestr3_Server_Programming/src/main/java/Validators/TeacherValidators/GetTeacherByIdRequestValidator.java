package Validators.TeacherValidators;

import Requests.Teacher.GetTeacherByIdRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;

import java.util.List;

public class GetTeacherByIdRequestValidator implements IRequestValidator<GetTeacherByIdRequest> {
    @Override
    public List<String> validate(GetTeacherByIdRequest request) {
        List<String> errors = ValidateID.validateId(request.getTeacherID(), "TeacherID");
        return errors;
    }
}
