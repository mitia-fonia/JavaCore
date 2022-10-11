package lessonsfojavacore.lesson1;

public class Competitor {
    private String name;
    private int skill;

    public Competitor(String name, int Skill) {
        this.skill = Skill;
        this.name =name;
    }
    public String getName() {
        return this.name;
    }
    public int getSkill() {
        return this.skill;
    }
}
