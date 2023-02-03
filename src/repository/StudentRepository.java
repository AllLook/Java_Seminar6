package repository;

import data.Student;

public class StudentRepository implements UserRepository<Student, Integer> {

    @Override
    public Student save(Student entiry) {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }
}
