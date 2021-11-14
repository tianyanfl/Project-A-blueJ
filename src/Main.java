
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet pet = favoritePet(scanner);
        Game game = favoriteGame(scanner);

        System.out.println("Your favorite pet is:");
        System.out.println(pet);

        System.out.println("Your favorite game is:");
        System.out.println(game);

        modifyPet(pet, scanner);
        System.out.println("The new Pet:");
        System.out.println(pet);

        modifyGame(game, scanner);
        System.out.println("The new Game:");
        System.out.println(game);

    }

    private static void modifyGame(Game game, Scanner scanner) {
        System.out.print("Do you want to edit your favorite game (y/n): ");
        if (!"y".equalsIgnoreCase(scanner.nextLine())) {
            return;
        }

        System.out.println("What are your favorite Game type, online or moba game?");
        String type = scanner.nextLine();
        Game.setType(type);

        System.out.print("The new game name: ");
        String name = scanner.nextLine();
        game.setName(name);

        System.out.print("The new game start year: ");
        int year = Integer.parseInt(scanner.nextLine());
        game.setStartYear(year);

        System.out.print("Do your still play the new game everyday(y/n): ");
        boolean stillPlayer = scanner.nextLine().equalsIgnoreCase("y");
        game.setStillPlay(stillPlayer);
    }

    private static void modifyPet(Pet pet, Scanner scanner) {
        System.out.print("Do you want to edit your favorite pet (y/n): ");
        if (!"y".equalsIgnoreCase(scanner.nextLine())) {
            return;
        }

        System.out.print("What are your favorite Pet type: ");
        String type = scanner.nextLine();
        Pet.setType(type);

        System.out.print("The new pet name: ");
        String name = scanner.nextLine();
        pet.setName(name);

        System.out.print("The new pet age: ");
        int age = Integer.parseInt(scanner.nextLine());
        pet.setAge(age);

        System.out.print("The new pet eat meat(y/n): ");
        boolean eatMeat = scanner.nextLine().equalsIgnoreCase("y");
        pet.setEatMeat(eatMeat);

    }

    private static Game favoriteGame(Scanner scanner) {
        System.out.println("What are your favorite Game type, online or moba game?");
        String type = scanner.nextLine();

        System.out.print("The game name: ");
        String name = scanner.nextLine();

        System.out.print("The game start year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Do your still play the game everyday(y/n): ");
        boolean stillPlayer = scanner.nextLine().equalsIgnoreCase("y");

        Game game = new Game(name);
        Game.setType(type);
        game.setStartYear(year);
        game.setStillPlay(stillPlayer);

        return game;
    }

    private static Pet favoritePet(Scanner scanner) {
        System.out.print("What are your favorite Pet type: ");
        String type = scanner.nextLine();

        System.out.print("The pet name: ");
        String name = scanner.nextLine();

        System.out.print("The pet age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("The pet eat meat(y/n): ");
        boolean eatMeat = scanner.nextLine().equalsIgnoreCase("y");

        Pet pet = new Pet(name);
        Pet.setType(type);
        pet.setAge(age);
        pet.setEatMeat(eatMeat);

        return pet;
    }
}
