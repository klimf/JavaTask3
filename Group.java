import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<JournalEntry> entries = new ArrayList<JournalEntry>();
    private List<Teacher> teachers = new ArrayList<Teacher>();
    private List<Pupil> pupils = new ArrayList<Pupil>();
    private List<Subject> subjects = new ArrayList<Subject>();

    public Group(String groupName, List<Teacher> teachers, List<Subject> subjects, List<Pupil> pupils) {
        this.groupName = groupName;
        this.teachers = teachers;
        this.pupils = pupils;
        this.subjects = subjects;
    }

    /*public List<JournalEntry> getEntries(Pupil pupil) {
        return entries
                .stream()
                .filter(journalEntry -> journalEntry.getPupil().getId() == pupil.getId())
                .collect(toList());
    }

    public List<JournalEntry> getEntries(Subject subject) {
        return entries
                .stream()
                .filter(journalEntry -> journalEntry.getSubject().getId() == subject.getId())
                .collect(toList());
    }*/

    public void printObj(Object obj) {
        System.out.println(obj.toString());
    }

    public List<JournalEntry> getEntries() {
        return entries;
    }


    public void createEntry(Subject subject, Teacher teacher, Pupil pupil, int grade, String note) {
        if (!check(pupil)) {
            //System.out.println("IllegalStateException()");
            throw new IllegalArgumentException(pupil.toString() + " isn't in this group");
        }
        if (!check(subject)) {
            throw new IllegalArgumentException(subject.toString() + " isn't in this group");
        }
        if (teacher.getSubject().getId() != subject.getId()) {
            throw new IllegalArgumentException(teacher.toString() + " doesn't teach this " + subject.toString());
        }
        entries.add(new JournalEntry(subject, teacher, pupil, grade, note));

    }

    public void createEntry(Subject subject, Teacher teacher, Pupil pupil, int grade) {
        createEntry(subject, teacher, pupil, grade, "");
    }

    /*public List<User> getUserId(String name) {
        List<User> users = new ArrayList<>();
        users.addAll(teachers);
        users.addAll(pupils);
        return users
                .stream()
                .filter(object -> object.getName() == name)
                .collect(toList());
    }*/

    public User getUserById(int id) {
        List<User> users = new ArrayList<User>();
        users.addAll(teachers);
        users.addAll(pupils);
        if (users.size() == 0) {
            throw new NullPointerException();
        }
        for (User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return new User();//very bad useless code(

        //Or i can use this -> return users.get(id) // but it isn't correct
    }


    private boolean check(Pupil pupilToCheck) {
        boolean isChecked = false;
        for (Pupil pupil : pupils) {
            if (pupilToCheck.getId() == pupil.getId()) {
                isChecked = true;
            }
        }
        return isChecked;
    }

    private boolean check(Subject subjectToCheck) {
        boolean isChecked = false;
        for (Subject subject : subjects) {
            if (subjectToCheck.getId() == subject.getId()) {
                isChecked = true;
            }
        }
        return isChecked;
    }

    public double getAvgGrade() {
        double sum = 0;
        for (JournalEntry entry : entries) {
            sum += entry.getMark();
        }
        return sum / entries.size();
    }

    public double getAvgGrade(Pupil pupil) {
        double sum = 0;
        int qty = 0;
        for (JournalEntry entry : entries) {
            if(entry.getPupil().getId()==pupil.getId()) {
                sum += entry.getMark();
                qty++;
            }
        }
        return sum / qty;
    }

    public double getAvgGrade(Teacher teacher) {
        double sum = 0;
        int qty = 0;
        for (JournalEntry entry : entries) {
            if(entry.getTeacher().getId()==teacher.getId()) {
                sum += entry.getMark();
                qty++;
            }
        }
        return sum / qty;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<Pupil> getPupils() {
        return new ArrayList<Pupil>(pupils);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

}
