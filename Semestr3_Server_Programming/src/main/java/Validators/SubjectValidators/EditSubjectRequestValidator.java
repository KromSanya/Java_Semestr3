package Validators.SubjectValidators;

import Requests.Subject.EditSubjectRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;
import Validate.ValidateString;

import java.util.List;

public class EditSubjectRequestValidator implements IRequestValidator<EditSubjectRequest> {
    @Override
    public List<String> validate(EditSubjectRequest request) {
        List<String> errors = ValidateString.validateString(request.getName());
        errors.addAll(ValidateID.validateId(request.getSubjectID(), "SubjectID"));
        return errors;
    }
}
