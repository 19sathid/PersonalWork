package objectorientedprogramming;

public class Phone {
	// instance fields
	private int myphonenumber;
	private int speeddial;
	private int lastnumbercalled;
	private final int emergencynumber = 911;
	private int numberofcalls;
	private int talktime;

	// constructors
	public Phone() {
		myphonenumber = 123456;
		speeddial = 123456;
		lastnumbercalled = 123456;
		numberofcalls = 100;
		talktime = 60;
	}

	public Phone(int newMyphonenumber, int newSpeeddial, int newLastnumbercalled, int newNumberofcalls,
			int newTalktime) {
		myphonenumber = newMyphonenumber;
		speeddial = newSpeeddial;
		lastnumbercalled = newLastnumbercalled;
		numberofcalls = newNumberofcalls;
		talktime = newTalktime;
	}

	// Mutator methods
	public void MakeaCall(int newLastnumbercalled, int newTalktime) {
		lastnumbercalled = newLastnumbercalled;
		talktime = newTalktime;

	}

	// Accessor methods
	public int getLastnumbercalled() {
		return lastnumbercalled;
	}

	public int getTalktime() {
		return talktime;
	}

	public int getMyphonenumber() {
		return myphonenumber;
	}

}
