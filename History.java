public class History {
    private int year;
    private String location;

    History(int year, String location) {
        this.year = year;
        this.location = location;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    public void firstGS() {
        System.out.println("Wimbledon was played first in " + this.year + " at the All England Lawn Tennis Club in " + this.location);
    }
}
