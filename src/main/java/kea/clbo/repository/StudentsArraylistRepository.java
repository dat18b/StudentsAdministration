package kea.clbo.repository;

import kea.clbo.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsArraylistRepository implements IStudentsRepository {

    private List<Student> students = new ArrayList<>();

    public StudentsArraylistRepository(){
        students.add(new Student(1, "Claus"));
        students.add(new Student(2, "Anna"));
        students.add(new Student(3, "Peter"));
    }

    @Override
    public void create(Student student) {
        student.setId(students.size()+1);
        students.add(student);
    }
    @Override
    public Student read(int id) {
        return null;
    }

    @Override
    public List<Student> readAll() {
        return students;
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int id) {

    }
}
