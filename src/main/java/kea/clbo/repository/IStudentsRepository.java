package kea.clbo.repository;

import kea.clbo.model.Student;
import java.util.List;

public interface IStudentsRepository {

    // CRUD metoder defineres her

    void create(Student student);
    Student read(int id);
    List<Student> readAll();
    void update(Student student);
    void delete(int id);


}
