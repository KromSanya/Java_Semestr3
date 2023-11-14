package Validators.SubjectValidators;

import Requests.Subject.AddSubjectRequest;
import Validate.IRequestValidator;
import Validate.ValidateString;

import java.util.List;

public class AddSubjectRequestValidator implements IRequestValidator<AddSubjectRequest> {
    @Override
    public List<String> validate(AddSubjectRequest request) {
        List<String> errors = ValidateString.validateString(request.getName());
        return errors;
    }
}
