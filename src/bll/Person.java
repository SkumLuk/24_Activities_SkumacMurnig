package bll;

public class Person {
    int id;
    Activity activity;
    String firstName;
    String lastName;

    public int getId() {
        return id;
    }

    public Activity getActivity() {
        return activity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(int id, Activity activity, String firstName, String lastName) {
        this.id = id;
        this.activity = activity;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
