public class Subject {
    private static int ID_GENERATOR;

    private int id;
    private String name;

    public Subject(String name) {
        this.id = ID_GENERATOR++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject {" +
                " id=" + id +
                ", name='" + name + '\'' +
                " }";
    }
}
