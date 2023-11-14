package Validators.SubjectValidators;

import Requests.Subject.GetSubjectRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;

import java.util.List;

public class GetSubjectRequestValidator implements IRequestValidator<GetSubjectRequest> {
    @Override
    public List<String> validate(GetSubjectRequest request) {
        List<String> errors = ValidateID.validateId(request.getSubjectID(), "SubjectID");
        return errors;
    }
}
