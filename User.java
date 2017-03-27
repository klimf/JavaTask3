public class User {
    private static int ID_GENERATOR;

    private int id;
    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = ID_GENERATOR++;
    }

    public User() {
        this.name = "";
        this.surname = "";
        this.id = ID_GENERATOR++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User {" +
                " id = " + getId() +
                " name = " + getName() +
                " surname = " + getSurname() +
                " }";
    }

}
