import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Pupil> pupilsGroup1 = Arrays.asList(
                new Pupil("Vasya", "Pupkin"),
                new Pupil("Dasha", "Pupkina"),
                new Pupil("Katya", "Pupkina"),
                new Pupil("Kolya", "Pupkin"),
                new Pupil("Nastia", "Pupkina"),
                new Pupil("Nikita", "Pupkin")
        );

        List<Subject> subjectsGroup1 = Arrays.asList(
                new Subject("Java programming"),
                new Subject("Math"),
                new Subject("English")
        );

        List<Teacher> teachersGroup1 = Arrays.asList(
                new Teacher("Vladislav", "Pupkin", subjectsGroup1.get(0)),
                new Teacher("Alexey", "Pupkin", subjectsGroup1.get(1)),
                new Teacher("Mihail", "Pupkin", subjectsGroup1.get(2))
        );

        Group group1 = new Group("Group 1", teachersGroup1, subjectsGroup1, pupilsGroup1);
        group1.createEntry(subjectsGroup1.get(0), teachersGroup1.get(0), pupilsGroup1.get(0), 5);
        group1.createEntry(subjectsGroup1.get(1), teachersGroup1.get(1), pupilsGroup1.get(0), 3);
        group1.createEntry(subjectsGroup1.get(2), teachersGroup1.get(2), pupilsGroup1.get(0), 2);
        group1.createEntry(subjectsGroup1.get(2), teachersGroup1.get(2), pupilsGroup1.get(1), 5);
        group1.createEntry(subjectsGroup1.get(0), teachersGroup1.get(0), pupilsGroup1.get(1), 5);

        List<User> users = new ArrayList<User>();

        users.addAll(pupilsGroup1);
        users.addAll(teachersGroup1);

        /*for (User user : users) {
            System.out.println(user.toString());
        }*/

        /*for (JournalEntry journalEntry : group1.getEntries()) {
            System.out.println(journalEntry.toString());
        }
        System.out.println(group1.getAvgGrade(pupilsGroup1.get(0)));*/


        Logger logger = new Logger();
        //List<String> entries = logger.getLog();
        //Map<String, String> map = logger.getConfig();
        Map<String, String> props = new HashMap<String, String>(){};
        props.put("date", new Date().toString());
        props.put("id", "1");
        props.put("level", "ERROR");
        props.put("message", "very bad error");

        //System.out.println(logger.replace(map.get("LOG_FORMAT"), props));

        /*for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }*/

        /*logger.log("firstLogString");
        logger.log("2LogString");*/

    }
}
