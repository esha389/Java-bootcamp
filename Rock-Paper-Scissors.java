import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String answer = scan.nextLine();
        
    if ( answer.equals("yes")) {
        System.out.println("Great!");
        System.out.println("rock - paper - scissors, shoot!");
        String yourChoice = scan.nextLine();
        String computerChoice = computerChoice();
        String result = result(yourChoice, computerChoice);
        printResult(yourChoice, computerChoice, result);
    }
    else
    {
        System.out.println("Darn, some other time...!");
    }
        scan.close();
    }


    public static String computerChoice() {
        int random = (int) (Math.random() * 3);
        if (random == 0) {
            return "rock";
        } else if (random == 1) {
            return "paper";
        } else if (random == 2) {
            return "scissors";
        }
        else {
            return "INVALID CHOICE";
        }
    }


    public static String result (String yourChoice, String computerChoice){
        String result = "";
        if(yourChoice.equals(computerChoice)){
            result = "It's a tie";
        }
        else if((yourChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (yourChoice.equals("paper") && computerChoice.equals("rock")) ||
                (yourChoice.equals("scissors") && computerChoice.equals("paper"))){
            result = "You win!";
        }
        else if((computerChoice.equals("rock") && yourChoice.equals("scissors")) ||
                (computerChoice.equals("paper") && yourChoice.equals("rock")) ||
                (computerChoice.equals("scissors") && yourChoice.equals("paper"))){
            result = "You lose";
        }
        else{
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
        return result;
    }

    public static String printResult(String yourChoice, String computerChoice, String result){
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
        return result;
    }

}
