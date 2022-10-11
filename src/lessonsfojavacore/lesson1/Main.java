package lessonsfojavacore.lesson1;
public class Main {



    public static void main(String[] args) {
        Competitor [] competitor = new Competitor[4];
        System.out.println();
        competitor[0] = new Competitor("Саша", 3);
        competitor[1] = new Competitor("Петя",7 );
        competitor[2] = new Competitor("Настя",9);
        competitor[3] = new Competitor("Маша",5);
        Team team =new Team("Совы", competitor);
        TargetShooting targetShooting = new TargetShooting(10,20,30);
        String result = targetShooting.goTargetShooting(team);
        System.out.println(result);

    }
}