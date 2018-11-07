package randomNumbers;
import java.util.Random;
public class Yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator = new Random();
int randomNum = 0;
int min = 1;
int max = 6;
int rolls = 0;
for(int i = 1; i<=5; i++){
	randomNum = min + generator.nextInt(max - min + 1);
}
	}

}
