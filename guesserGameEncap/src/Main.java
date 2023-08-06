import java.util.Scanner;

class Guesser{
    int guessingNum;

    int passTheGuessNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the guessing num : ");
        guessingNum = scan.nextInt();
        return guessingNum;
    }
}
class Player{
    int numFromP1;
    int numFromP2;
    int numFromP3;

   int passTheNumFromP1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num from P1 : ");
        numFromP1 = scan.nextInt();
        return numFromP1;
    }
    int passTheNumFromP2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num from P2 : ");
        numFromP2 = scan.nextInt();
        return numFromP2;
    }
    int passTheNumFromP3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the num from P3 : ");
        numFromP3 = scan.nextInt();
        return numFromP3;
    }
}
class Umpire{

    Guesser g = new Guesser();
    int guessN = g.passTheGuessNum();
    Player p1 = new Player();
    int player1 = p1.passTheNumFromP1();
    Player p2 = new Player();
    int player2 = p2.passTheNumFromP2();
    Player p3 = new Player();
    int player3 = p3.passTheNumFromP3();
    void checkCond(){
        if (guessN == player1) {
            System.out.println("Player 1 Won.");
        }else if(guessN == player2){
            System.out.println("Player 2 Won.");
        }else if(guessN == player3) {
            System.out.println("Player 3 Won.");
        }else{
            System.out.println("Better Luck Next Time! Try again.");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Umpire callUmp = new Umpire();
        callUmp.checkCond();
    }
}