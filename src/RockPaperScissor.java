import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("Hi,Whats your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name + " ,Would you like to play a game? 1.YES 2.NO");
        int choice =scanner.nextInt();

        if(choice==1) {
            System.out.println("Okay.Lets go!");
            int personChoice = personPlayGame();
            int computerChoice = computerPlayGame();

            winner(personChoice,computerChoice);
        } else
            if(choice==2) {
                System.out.println("Maybe next time!");
            }
            else{
                System.out.println("INVALID!!!Please try again.");
            }

            personPlayGame();
            computerPlayGame();



    }
        public static int personPlayGame() {
            System.out.println("Please choose a number. 1 ROCK 2 PAPER 3 SCISSOR");
            Scanner scanner = new Scanner(System.in);
            int personChoice = scanner.nextInt();

            if (personChoice == 1) {
                System.out.println("You chose ROCK");
            } else if (personChoice == 2) {
                System.out.println("You Chose PAPER");
            } else if (personChoice == 3) {
                System.out.println("You chose SCISSOR");
            } else {
                System.out.println("ERROR!!!RETRY");
            }
            return personChoice;
        }
        public static int computerPlayGame() {
            Random random = new Random();
            int computerChoice = random.nextInt(3);

            if(computerChoice==1) {
                System.out.println("Computer chose ROCK");
            } else
                if( computerChoice==2) {
                    System.out.println("Computer chose PAPER");
                } else {
                    System.out.println("Computer chose SCISSOR");
                }
                return computerChoice;
        }

        public static void winner(int personChoice,int computerChoice) {
       if(personChoice==computerChoice) {
           System.out.println("REPLAY,Your choices were similar!!!");

        }else
            if(personChoice==1 && computerChoice==2) {
                System.out.println("COMPUTER WON");
            }else
                if(personChoice==2 && computerChoice==1) {
                    System.out.println("YOU WON");
                } else
                    if(personChoice==1 && computerChoice==3) {
                        System.out.println("COMPUTER WON");
                    } else
                        if(personChoice==3 && computerChoice==1) {
                            System.out.println("YOU WON");
                        }
        }

}
