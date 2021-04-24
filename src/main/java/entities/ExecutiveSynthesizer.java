package entities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ExecutiveSynthesizer {


    public List<String> SynthetizerProject(List<Iteration> iterations)  {

        List<String> iterationdata = new ArrayList<>();

        for(Iteration s: iterations)
        {
            String name = s.getGoal();
            Duration duration;
            try
            {
                duration=s.getDuration();
            }
            catch (SabanaResearchException e)
            {
                duration = Duration.ofDays(0);
            }


            iterationdata.add(name+duration);
        }

        return iterationdata;
    }
}
