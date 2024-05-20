import java.util.Scanner;

class ScannerDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Game> gameSet = new Set<>();

        while (true) {
            print("Enter an option (0-6):");
            print("1. Add a game");
            print("2. Remove a game");
            print("3. Check if a game is contained");
            print("4. Check if the set is empty");
            print("5. Get the size of the set");
            print("6. Clear the set");
            print("0. Exit");
            print("");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (option == 0) {
                print("Exiting App...");
                print("");
                scanner.close();
                return;
            }

            switch (option) {
                case 1:
                    print("Enter the game name:");
                    String gameName = scanner.nextLine();
                    print("");
                    print("Enter the game price:");
                    double gamePrice = scanner.nextDouble();
                    print("");
                    scanner.nextLine(); // Consume the newline character

                    Game game = new Game(gameName, gamePrice);
                    gameSet.add(game);
                    print("Game added: " + game);
                    print("");
                    break;

                case 2:
                    print("Enter the game name:");
                    String removeGameName = scanner.nextLine();
                    print("");
                    print("Enter the game price:");
                    double removeGamePrice = scanner.nextDouble();
                    print("");
                    scanner.nextLine(); // Consume the newline character

                    Game removeGame = new Game(removeGameName, removeGamePrice);
                    gameSet.remove(removeGame);
                    print("Game removed: " + removeGame);
                    print("");
                    break;

                case 3:
                    print("Enter the game name:");
                    String containsGameName = scanner.nextLine();
                    print("");
                    print("Enter the game price:");
                    double containsGamePrice = scanner.nextDouble();
                    print("");
                    scanner.nextLine(); // Consume the newline character

                    Game containsGame = new Game(containsGameName, containsGamePrice);
                    boolean containsResult = gameSet.contains(containsGame);
                    print("Game contains " + containsGame + ": " + containsResult);
                    print("");
                    break;

                case 4:
                    boolean isEmpty = gameSet.isEmpty();
                    print("Set is empty: " + isEmpty);
                    print("");
                    break;

                case 5:
                    int size = gameSet.size();
                    print("Set size: " + size);
                    print("");
                    break;

                case 6:
                    gameSet.clear();
                    print("Set cleared.");
                    print("");
                    break;

                default:
                    print("Invalid option. Please try again.");
                    print("");
                    break;
            }
        }
    }
    public static void print(String s){
        System.out.println(s);   
    }
}