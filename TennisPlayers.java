import java.util.*;

public class TennisPlayers {
    private String name;
    private String DOB;
    private String nationality;

    TennisPlayers(String name, String DOB, String nationality) {
        this.name = name;
        this.DOB = DOB;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void TP1(String tp) {
        System.out.println("Go " + tp + "!!!");
    }
    public void TennisPlayer1() {
        this.name = "Roger Federer";
        this.DOB = "08/08/1981";
        this.nationality = "Switzerland";

        System.out.println(this.name + " is from " + this.nationality + " and was born on " + this.DOB + ".");
    }

    public void TennisPlayer2() {
        this.name = "Rafael Nadal";
        this.DOB = "06/03/1986";
        this.nationality = "Spain";

        System.out.println(this.name + " is from " + this.nationality + " and was born on " + this.DOB + ".");
    }

    public void TennisPlayer3() {
        this.name = "Novak Djokovic";
        this.DOB = "05/20/1987";
        this.nationality = "Serbia";

        System.out.println(this.name + " is from " + this.nationality + " and was born on " + this.DOB + ".");
    }

    public void TennisPlayer4() {
        this.name = "Rod Laver";
        this.DOB = "08/09/1938";
        this.nationality = "Australia";

        System.out.println(this.name + " is from " + this.nationality + " and was born on " + this.DOB + ".");
    }

    public void TennisPlayer5() {
        this.name = "Tony Roche";
        this.DOB = "05/17/1945";
        this.nationality = "Australia";

        System.out.println(this.name + " is from " + this.nationality + " and was born on " + this.DOB + ".");
    }

    public void TennisPlayer6() {
        this.name = "Fred Perry";
        this.DOB = "05/18/1909";
        this.nationality = "Great Britain";

        System.out.println(this.name + " is from " + this.nationality + " and was born on " + this.DOB + ".");
    }
}