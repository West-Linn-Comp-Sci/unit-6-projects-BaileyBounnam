import java.util.Scanner;
public class BattleShip1DRunner
{
    public static void main (String[] args){
       Scanner input = new Scanner(System.in);
       
       BattleShip1D game1 = new BattleShip1D();
       
       game1.setBattleShipLocation();
       
       game1.play();
       System.out.println("--------------------------");
       System.out.println(game1);
       System.out.println("--------------------------");
       
    }
}