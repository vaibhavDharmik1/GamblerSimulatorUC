import java.util.*;

public class GamblerSimulatorUC_3 {
	static int AMOUNT_OF_STAKE=100;
	static int BET_AMOUNT=1;
	static int WON=1;
	static int LOST=0;
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Starting amount of stake is "+AMOUNT_OF_STAKE);
		 System.out.println("Amount to bet after every play "+BET_AMOUNT);
		 int cashInHand = AMOUNT_OF_STAKE;
		 while(cashInHand > 50 && cashInHand < 150) {
			 int play = (int) Math.floor(Math.random() * 10) % 2;
			 System.out.println("Gamblers play:"+play);
		 
			 switch(play) {
		 		case 1:
		 			cashInHand = cashInHand + BET_AMOUNT;
		 			System.out.println("Total current cash gambler has "+cashInHand);
		 			break;
		 		case 0:
		 			cashInHand = cashInHand - BET_AMOUNT;
		 			System.out.println("Total current cash gambler has "+cashInHand);
		 			break;
		 		default:
		 			System.out.println("default");
			 }
			 if(play == 1) {
				 System.out.println("Player won the current play");
			 }
			 else {
				 System.out.println("Player lost the current play");
			 }
		 
		 }
		 if(cashInHand==150 || cashInHand==50) {
			 System.out.println("Player would like to resign for current day");
		 }
	}

}
