package bll;

public class Season {
    int id;
    private String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Season(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
