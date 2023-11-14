package Validators.SubjectValidators;

import Requests.Subject.DeleteSubjectRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;

import java.util.List;

public class DeleteSubjectRequestValidator implements IRequestValidator<DeleteSubjectRequest> {
    @Override
    public List<String> validate(DeleteSubjectRequest request) {
        List<String> errors = ValidateID.validateId(request.getSubjectId(), "SubjectID");
        return errors;
    }
}
