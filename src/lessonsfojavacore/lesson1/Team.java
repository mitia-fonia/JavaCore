package lessonsfojavacore.lesson1;

import java.util.Scanner;

public class Team  {
    private String teamName;
    private Competitor [] people;

    public Team(String teamName, Competitor[] people){
        this.teamName = teamName;
        this.people = people;
    }

    public String getTeamName () { return this.teamName; }
    public Competitor [] getPeople () { return this.people; }


}
