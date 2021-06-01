package bll;

public class Activity {
    int id;
    Season season;
    String name;

    public int getId() {
        return id;
    }

    public Season getSeason() {
        return season;
    }

    public String getName() {
        return name;
    }

    public Activity(int id, Season season, String name) {
        this.id = id;
        this.season = season;
        this.name = name;
    }
}
