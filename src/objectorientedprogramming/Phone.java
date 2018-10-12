package objectorientedprogramming;

public class Phone {
//instance fields
	private int myphonenumber;
	private int speeddial;
	private int lastnumbercalled;
	private final int emergencynumber;
	private int numberofcalls;
	private double talktime;

	// constructors
	public Phone() {
		emergencynumber = 911;
	}

	public Phone(int newMyphonenumber, int newSpeeddial, int newLastnumbercalled, int newNumberofcalls,
			double newTalktime) {
		myphonenumber = newMyphonenumber;
		speeddial = newSpeeddial;
		lastnumbercalled = newLastnumbercalled;
		numberofcalls = newNumberofcalls;
		talktime = newTalktime;
	}

	// Mutator methods
	public void MakeaCall(int newLastnumbercalled, double newTalktime) {
		lastnumbercalled = newLastnumbercalled;
		talktime = newTalktime;
	}

	// Accessor methods
	public int getLastnumbercalled() {
		return lastnumbercalled;
	}

	public double getTalktime() {
		return talktime;
	}

}
