public class Pupil extends User {

    public Pupil(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Pupil {" +
                " id = " + getId() +
                " name = " + getName() +
                " surname = " + getSurname() +
                " }";
    }

}
