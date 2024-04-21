import java.util.Random;
import java.util.Scanner; //just to take inpput from keyboard,i am writing these comments bcz it is my 1st project in java pr
class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.print("Enter your move (Rock, Paper, Scissors, or type 'quit' to exit): ");
            String userMove = scanner.nextLine().toLowerCase();//string input

            if (userMove.equals("quit")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")) {//just a normal if statement using logical operators to make a decission
                int computerMoveIndex = random.nextInt(3);
                String[] moves = {"rock", "paper", "scissors"};
                String computerMove = moves[computerMoveIndex];

                System.out.println("Computer's move: " + computerMove);

                if (userMove.equals(computerMove))if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")){
                    System.out.println("It's a tie!");
                } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                        (userMove.equals("paper") && computerMove.equals("rock")) ||
                        (userMove.equals("scissors") && computerMove.equals("paper"))) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }
            } else {
                System.out.println("Invalid move. Please enter Rock, Paper, Scissors, or type 'quit' to exit.");
            }
        }

        scanner.close();
    }
}
