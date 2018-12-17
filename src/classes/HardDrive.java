package classes;

import java.util.ArrayList;

public class HardDrive {
	private String name;
	private ArrayList<Integer> fileSizes;
	private final int capacity;
	private int spaceLeft;

	/*
	 @ xSpace has to be greater than 0 and less than capacity
	 @ the sum of xSpace and size of fileSizes has to equal capacity
	 @ xSpace has to be less than or equal to capacity
	 */

	public HardDrive(String xName, ArrayList<Integer> xSize, int xCapacity, int xSpace) {
		name = xName;
		capacity = xCapacity;
		if (fileSizes.size() <= capacity) {
			fileSizes = xSize;
		}
		if (xSpace + fileSizes.size() == capacity && xSpace > 0 && xSpace <= capacity) {
			spaceLeft = xSpace;
		} else {
			spaceLeft = capacity - fileSizes.size();
		}
	}

	public void addFile(int size) {
		fileSizes.add(size);
	}

	public void deleteFile(int index) {
		fileSizes.remove(index);
	}

	public boolean isFull() {
		if (fileSizes.size() == capacity) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (fileSizes.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
