package lessonsfojavacore.lesson1;

import java.util.Random;

public class TargetShooting {

    private int firstTarget;
    private int secondTarget;
    private int thirdTarget;
    private String info;
    private int result;
    private int shoot;
    private int chance;

    public TargetShooting(int firstTarget, int secondTarget, int thirdTarget){
        this.firstTarget = firstTarget;
        this.secondTarget = secondTarget;
        this.thirdTarget = thirdTarget;
    }

    public String goTargetShooting (Team team) {
        info = "Команда " + team.getTeamName() + " " + '\n';
        for(Competitor competitor: team.getPeople()){
            info += "Имя участнка: " + competitor.getName() + " Уровень стрельбы: " + competitor.getSkill()+ "\n";
            int complexity = competitor.getSkill();
            shootingAtTheFirstTarget(complexity);
            shootingAtTheSecondTarget(complexity);
            shootingAtTheThirdTarget(complexity);
        }
        return info;
    }

    private void shootingAtTheFirstTarget(int complexity){
        result=0;
        chance= complexity-(firstTarget/10);
        if (chance <0) {
            chance =0;
        }
        info +="Выстелы по первой мешени:\n";
        for (int i=0; i< 10; i++){
            shoot = new Random().ints(1, complexity-(firstTarget/10), 11).findFirst().getAsInt();
            result = result + shoot;
            info += shoot + " ";

        }
        info += "\nКоличество очков за первую мишень: " + result;
    }
    private void shootingAtTheSecondTarget(int complexity){
        chance= complexity-(secondTarget/10);
        if (chance <0) {
            chance =0;
        }
        info +="\nВыстелы по второй мешени:\n";
        for (int i=0; i< 10; i++){
            shoot = new Random().ints(1, chance, 11).findFirst().getAsInt();
            result = result + shoot;
            info += shoot + " ";

        }
        info +="\nКоличество очков за первую и вторую мишень: " + result;
    }
    private void shootingAtTheThirdTarget(int complexity){
        chance= complexity-(thirdTarget/10);
        if (chance <0) {
            chance =0;
        }
        info +="\nВыстелы по третьей мешени:\n";
        for (int i=0; i< 10; i++){
            shoot = new Random().ints(1, complexity-(thirdTarget/10), 11).findFirst().getAsInt();
            result = result + shoot;
            info += shoot + " ";

        }
        info +="\nКоличество очков за все мишени: " + result+"\n\n";
    }

}
