package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class StudentSynthesizer {


    public List<String> SynthetizerProject(List<Student> students) {

        List<String> studentsdata = new ArrayList<>();

        for(Student s: students)
        {
            String name = s.getName();
            Duration WorkedHours = s.getWorkedHours();

            studentsdata.add(name+WorkedHours);
        }

        return studentsdata;
    }

}
