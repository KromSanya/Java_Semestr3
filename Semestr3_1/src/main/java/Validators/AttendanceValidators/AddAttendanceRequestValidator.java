package Validators.AttendanceValidators;

import Requests.Attendance.AddAttendanceRequest;
import Validate.IRequestValidator;
import Validate.ValidateID;
import Validate.ValidateString;


import java.util.List;

public class AddAttendanceRequestValidator implements IRequestValidator<AddAttendanceRequest> {

    @Override
    public List<String> validate(AddAttendanceRequest request) {
        List<String> errors = null;
        for(long i : request.getStudentsID())
        {
          errors.addAll(ValidateID.validateId(request.getStudentsID().get((int) i), "StudentId"));
        }
        errors.addAll(ValidateID.validateId(request.getLessonID(), "LessonID"));
        return errors;
    }
}
