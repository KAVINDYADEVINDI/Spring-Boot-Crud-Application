import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = Arrays.asList(
            new Student(1,"kavindya","CS",2000),
            new Student(1,"kavindya","CS",2000),
            new Student(1,"kavindya","CS",2000)

    );
    public List<Student> getAllStudents(){
        return  students;
    }
}
