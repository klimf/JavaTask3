import java.util.Date;

public class JournalEntry {
    private Pupil pupil;
    private Teacher teacher;
    private Subject subject;
    private Date date;
    private int mark;
    private int oldMark = -1;
    private String note;

    public JournalEntry(Subject subject, Teacher teacher, Pupil pupil, int mark, String note) {
        if(mark<0||mark>5){
            throw new IllegalArgumentException("Mark is out of range (0 <= mark <= 5)");
        }
        this.subject = subject;
        this.pupil = pupil;
        this.teacher = teacher;
        this.mark = mark;
        this.date = new Date();
        this.note = note;
    }

    public void changeMark(int mark) {
        if(oldMark !=-1) {
            oldMark = this.mark;
            this.mark = mark;
        }
        else {
            throw new IllegalArgumentException("You can't change mark twice");
        }

    }

    public void changeNote(String note) {
        this.note = note;
    }

    public Pupil getPupil() {
        return pupil;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getMark() {
        return mark;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Date getDate() {
        return date;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "JournalEntry { " +
                "  \n" + pupil +
                ", \n" + teacher +
                ", \n" + subject +
                ", \nDate = "  + date +
                ", \nGrade = " + mark +
                ", \nNote = '" + note + '\'' +
                " \n}";
    }
}
