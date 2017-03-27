public class Level {
    private final String name;
    private final int level;

    private Level(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public static final Level OFF = new Level("OFF", Integer.MAX_VALUE);
    public static final Level ERROR = new Level("ERROR", 300);
    public static final Level INFO = new Level("INFO", 200);
    public static final Level ALL = new Level("ALL", 100);
    //off error info all
}
