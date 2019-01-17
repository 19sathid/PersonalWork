package comparableInterfaces;
import java.util.ArrayList;
public class TestCat {

	public static void main(String[] args) {
		ArrayList<CatStart> kitty = new ArrayList<CatStart>();
for(int i = 0; i < 100; i++){
	kitty.add(new CatStart(i+3, i+5));
}
	}

}
