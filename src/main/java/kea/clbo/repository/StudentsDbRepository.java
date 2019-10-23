package kea.clbo.repository;

import kea.clbo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentsDbRepository implements IStudentsRepository {

    @Autowired
    private JdbcTemplate jdbc;
    private SqlRowSet sqlRowSet;

    @Override
    public void create(Student student) {

    }

    @Override
    public Student read(int id) {
        return null;
    }

    @Override
    public List<Student> readAll() {

        List<Student> students = new ArrayList<>();

        // selected from db
        String sql = "SELECT * FROM clbo.students";
        sqlRowSet = jdbc.queryForRowSet(sql);

        while(sqlRowSet.next()){
            students.add(new Student(sqlRowSet.getInt("id"), sqlRowSet.getString("name")));
            System.out.println(sqlRowSet.getString("name"));
        }
        // add til arraylisten
        return students;
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int id) {

    }
}
