import java.util.Objects;

public class Soccer {
    public static void main(String[] args) {
        SoccerPlayer player1 = new SoccerPlayer("Jonathan", 50, "Team1", "9");
        SoccerPlayer player2 = new SoccerPlayer("Declan","Team2", 20);
        player2.setScoredGoals("10");
        SoccerPlayer player3 = new SoccerPlayer("John", 30,"5");
        player3.setTeam("Team3");
        SoccerPlayer player4 = new SoccerPlayer("Jack", 27, "Team4", "7");
        SoccerPlayer player5 = new SoccerPlayer("Graig", 34, "Team5", "9");

        // Player 1
        System.out.println("======= Player 1 ==========");
        System.out.println("Name: " + player1.getName());
        System.out.println("Aage: " + player1.getAge());
        System.out.println("Score: " + player1.getScoredGoals());
        System.out.println("Team: " + player1.getTeam());

        // Player 2
        System.out.println("======= Player 2 ==========");
        System.out.println("Name: " + player2.getName());
        System.out.println("Age " + player2.getAge());
        System.out.println("Scores " + player2.getScoredGoals());
        System.out.println("Team " + player2.getTeam());

        // Player 3
        System.out.println("======= Player 3 ==========");
        System.out.println("Name " + player3.getName());
        System.out.println("Age " + player3.getAge());
        System.out.println("Scores " + player3.getScoredGoals());
        System.out.println("Team " + player3.getTeam());

        // Player 4
        System.out.println("======= Player 4 ==========");
        System.out.println("Name " + player4.getName());
        System.out.println("Age " + player4.getAge());
        System.out.println("Scores " + player4.getScoredGoals());
        System.out.println("Team " + player4.getTeam());

        // Player 5
        System.out.println("======= Player 5 ==========");
        System.out.println("Name " + player5.getName());
        System.out.println("Age " + player5.getAge());
        System.out.println("Scores " + player5.getScoredGoals());
        System.out.println("Team " + player5.getTeam());

        // Compare Player 1 with Player 2
        System.out.println("========== Player 1 vs Player 2");
        System.out.println("is Player 1 equal to Player two - " + player1.equals(player2));

    }
}

class SoccerPlayer {
    private String name;
    private int age;
    private String team;
    private String scoredGoals;

    public SoccerPlayer(String name, int age, String team, String scoredGoals) {
        this.name = name;
        this.age = age;
        this.team = team;
        this.scoredGoals = scoredGoals;
    }

    public SoccerPlayer(String name, int age, String scoredGoals) {
        this.name = name;
        this.age = age;
        this.scoredGoals = scoredGoals;
    }

    public SoccerPlayer(String name, String team, int age) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(String scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", team='" + team + '\'' +
                ", scoredGoals='" + scoredGoals + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoccerPlayer that = (SoccerPlayer) o;
        return Objects.equals(team, that.team) && Objects.equals(scoredGoals, that.scoredGoals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(team, scoredGoals);
    }
}

