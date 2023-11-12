package Repositories;

import org.example.Attendance;
import org.example.Lesson;
import org.example.StudentGroup;

import java.util.ArrayList;
import java.util.List;

public class RepositoryGroup implements IRepositoryGroup {
    @Override
    public int addGroup(StudentGroup group) {
        return 0;
    }

    @Override
    public void editGroup(StudentGroup group) {

    }

    @Override
    public void deleteGroupById(int groupId) {

    }

    @Override
    public StudentGroup getGroupById(int groupId) {
        return null;
    }

    @Override
    public List<StudentGroup> getAllGroups() {
        return null;
    }
}

