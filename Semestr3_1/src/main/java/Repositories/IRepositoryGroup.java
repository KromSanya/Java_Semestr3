package Repositories;

import org.example.StudentGroup;

import java.util.List;

public interface IRepositoryGroup {
    int addGroup(StudentGroup group);

    void editGroup(StudentGroup group);

    void deleteGroupById(int groupId);

    StudentGroup getGroupById(int groupId);

    List<StudentGroup> getAllGroups();
}
