
public class Game {
    private static String type;
    private String name;
    private int startYear;
    private boolean stillPlay;

    public Game(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s: [name=%s][startYear=%d][stillPlay=%s]", type, name, startYear, stillPlay);
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Game.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public boolean isStillPlay() {
        return stillPlay;
    }

    public void setStillPlay(boolean stillPlay) {
        this.stillPlay = stillPlay;
    }
}
