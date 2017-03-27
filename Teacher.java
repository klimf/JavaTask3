public class Teacher extends User {
    private Subject subject;

    public Teacher(String name, String surname, Subject subject) {
        super(name, surname);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher {" +
                " id = " + getId() +
                " name = " + getName() +
                " surname = " + getSurname() +
                " subject = " + subject +
                " }";
    }

    public Subject getSubject() {
        return subject;
    }
}
