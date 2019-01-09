package interfacesandpolymorphism;

import java.util.ArrayList;

public class TestFish {

	public static void main(String[] args) {
		ArrayList<Fish> seaFish = new ArrayList<Fish>();
		for(int i = 0; i < 5; i++) {
			seaFish.add(new Trout(i + 4; i + 1;"blue"));
		}
		
		for(int i = 0; i < 5; i++) {
			seaFish.add(new GoldFish(i + 3; i + 1;"blue"));
		}
		double longest = 0;
		for(Fish x : seaFish) {
			if(x.getLength() > longest) {
				longest = x.getLength();
			}
		}
	//	System.out.println("Longest fish length : " + longest + ", age : " +  + ", ");
	}

}
