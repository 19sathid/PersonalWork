package Strings;

public class BestFriends {
	private String friend1;
	private String friend2;
	private String friend3;

	public BestFriends() {
		friend1 = "Bob Smith";
		friend2 = "Judy Jones";
		friend3 = "Billy Miller";
	}
	public boolean changeFriend(String newFriend1,int rank1, String newFriend2,int rank2, String newFriend3,int rank3) {
		if (newFriend1.contains(" ")) {
			friend1 = newFriend1;
		}
		if (newFriend2.contains(" ")) {
			friend2 = newFriend2;
		}
		if (newFriend3.contains(" ")) {
			friend3 = newFriend3;
		}
		boolean answer;
		if (friend1 == newFriend1 && friend2 == newFriend2 && friend3 == newFriend3) {
			answer = true;
		} else {
			answer = false;
		}
		return answer;
	}

	public String getFriend1() {
		int space = friend1.indexOf(' ');
		String lastName = friend1.substring(space + 1, friend1.length());
		return lastName;
	}

	public int getLastLength3() {
		int space = friend3.indexOf(' ');
		String lastName = friend3.substring(space + 1, friend3.length());
		int length = lastName.length();
		return length;
	}

}
