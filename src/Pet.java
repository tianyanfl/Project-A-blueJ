
public class Pet {
    private static String type = "Dog";

    private String name;
    private int age;
    private boolean eatMeat;


    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s: [name=%s][age=%d][eatMeat=%s]", type, name, age, eatMeat);
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Pet.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEatMeat() {
        return eatMeat;
    }

    public void setEatMeat(boolean eatMeat) {
        this.eatMeat = eatMeat;
    }
}
