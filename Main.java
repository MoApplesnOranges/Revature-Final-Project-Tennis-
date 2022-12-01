import java.util.*;

class Main {
    public static void main(String[] args) {

        TennisPlayers tp1 = new TennisPlayers("Roger Federer", "08/08/1981", "Switzerland");
        TennisPlayers tp2 = new TennisPlayers("Rafael Nadal", "06/03/1986", "Spain");
        TennisPlayers tp3 = new TennisPlayers("Novak Djokovic", "05/20/1987", "Serbia");
        TennisPlayers tp4 = new TennisPlayers("Rod Laver", "08/09/1938", "Australia");
        TennisPlayers tp5 = new TennisPlayers("Tony Roche", "05/17/1945", "Australia");
        TennisPlayers tp6 = new TennisPlayers("Fred Perry", "05/18/1909", "Great Britain");

        OpenEra oe = new OpenEra("Roger Federer", 20);
        Map<String, Integer> gsNumber = new HashMap<>();
        gsNumber.put("Roger Federer", 20);
        gsNumber.put("Rafael Nadal", 22);
        gsNumber.put("Novak Djokovic", 21);
        gsNumber.put("Rod Laver", 11);
        gsNumber.put("Fred Perry", 8);
        gsNumber.put("Tony Roche", 1);

        History history = new History(1877, "London");

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the name of your favorite tennis player.");
        String tp = sc.nextLine();
        tp1.TP1(tp);
        System.out.println();

        System.out.println("Enter a tennis player from the list to get a fact! [Roger Federer, Rafael Nadal, Novak Djokovic, Fred Perry, Rod Laver, Tony Roche]");
        String tpName = sc.nextLine();
        if (tpName.equals("Roger Federer")) {
            tp1.TennisPlayer1();
        } else if (tpName.equals("Rafael Nadal")) {
            tp2.TennisPlayer2();
        } else if (tpName.equals("Novak Djokovic")) {
            tp3.TennisPlayer3();
        } else if (tpName.equals("Rod Laver")) {
            tp4.TennisPlayer4();
        } else if (tpName.equals("Tony Roche")) {
            tp5.TennisPlayer5();
        } else if (tpName.equals("Fred Perry")) {
            tp6.TennisPlayer6();
        } else {
            System.out.println("Check your spelling!");
        }
        System.out.println();

        System.out.println("Enter another tennis player from the list to get a fact! [Roger Federer, Rafael Nadal, Novak Djokovic, Fred Perry, Rod Laver, Tony Roche]");
        String tpName2 = sc.nextLine();
        if (tpName2.equals("Roger Federer")) {
            tp1.TennisPlayer1();
        } else if (tpName2.equals("Rafael Nadal")) {
            tp2.TennisPlayer2();
        } else if (tpName2.equals("Novak Djokovic")) {
            tp3.TennisPlayer3();
        } else if (tpName2.equals("Rod Laver")) {
            tp4.TennisPlayer4();
        } else if (tpName2.equals("Tony Roche")) {
            tp5.TennisPlayer5();
        } else if (tpName2.equals("Fred Perry")) {
            tp6.TennisPlayer6();
        } else {
            System.out.println("Check your spelling!");
        }
        System.out.println();

        System.out.println("Guess which three tennis players are from the pre-Open Era. [Roger Federer, Rafael Nadal, Novak Djokovic, Fred Perry, Rod Laver, Tony Roche]");
        String poeNames = sc.nextLine();
        if (poeNames.equals("Fred Perry, Rod Laver, Tony Roche")) {
            oe.poePlayers();
        } else if (!poeNames.equals("Fred Perry, Rod Laver, Tony Roche")) {
            System.out.println("try again!");
            String poeNames2 = sc.nextLine();
            if (poeNames2.equals("Fred Perry, Rod Laver, Tony Roche")) {
                oe.poePlayers();
            } else {
                System.out.println("The answer is Fred Perry, Rod Laver, Tony Roche!");
            }
        }
        System.out.println();

        System.out.println("Guess which three tennis players are from the Open Era? [Roger Federer, Rafael Nadal, Novak Djokovic, Fred Perry, Rod Laver, Tony Roche]");
        String oeNames = sc.nextLine();
        if (oeNames.equals("Roger Federer, Rafael Nadal, Novak Djokovic")) {
            oe.poePlayers();
        } else {
            System.out.println("The answer was 'Roger Federer, Rafael Nadal, Novak Djokovic'!");
        }
        System.out.println();

        System.out.println("Where was the first Grand Slam played at? (Guess!)");
        String first = sc.nextLine();
        history.firstGS();

        System.out.println("How many Grand Slams does Roger Federer have?");
        int num = 20;
        try {
            num = Integer.parseInt(sc.nextLine());
            if (num == 20) {
                System.out.println("You are correct!");
            } else {
                System.out.println(oe.name + " has " + oe.GrandSlams + " grandslams!");
            }
        } catch (Exception e) {
            System.out.println("Enter in integer format!");
            num = Integer.parseInt(sc.nextLine());
            if (num == 20) {
                System.out.println("You are correct!");
            } else {
                System.out.println(oe.name + " has " + oe.GrandSlams + " grandslams!");
            }
        }
        System.out.println();

        System.out.println("Type one of the six tennis player's name to get their total number of Grand Slams.");
        String playerName = sc.nextLine();
        switch (playerName) {
            case "Roger Federer":
                System.out.println(gsNumber.get("Roger Federer"));
                break;
            case "Rafael Nadal":
                System.out.println(gsNumber.get("Rafael Nadal"));
                break;
            case "Novak Djokovic":
                System.out.println(gsNumber.get("Novak Djokovic"));
                break;
            case "Rod Laver":
                System.out.println(gsNumber.get("Rod Laver"));
                break;
            case "Fred Perry":
                System.out.println(gsNumber.get("Fred Perry"));
                break;
            case "Tony Roche":
                System.out.println(gsNumber.get("Tony Roche"));
                break;
            default:
                System.out.println("Not a player from the list!");
        }
        System.out.println();

        System.out.println("Type 'enter' to get all the players Grand Slams.");
        String allGrandslams = sc.nextLine();
        System.out.println(gsNumber.entrySet());
        System.out.println();

        System.out.println("Which of the six tennis players is your favorite player?");
        String player = sc.nextLine();
        switch (player) {
            case "Roger Federer":
                System.out.println("Roger Federer is a great player!");
                break;
            case "Rafael Nadal":
                System.out.println("Rafael Nadal is a great player!");
                break;
            case "Novak Djokovic":
                System.out.println("Novak Djokovic is a great player!");
                break;
            case "Fred Perry":
                System.out.println("Fred Perry is a great player!");
                break;
            case "Rod Laver":
                System.out.println("Rod Laver is a great player!");
                break;
            case "Tony Roche":
                System.out.println("Tony Roche is a great player!");
                break;
            default:
                System.out.println("Check your spelling!");
        }
        System.out.println();
        sc.close();
    }
}