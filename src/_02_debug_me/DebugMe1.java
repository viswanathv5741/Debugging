//source: http://www.cs.usyd.edu.au/~jchan3/soft1001/jme/debugging/debugging_task.html

package _02_debug_me;

class DebugMe1 {
	public static void main(String[] args) {
		int[] numbers = new int[4];
		for (int i = 1; i < 5; i++) {
			System.out.println("About to try to insert " + (i-1) + " into the array at position " + (i-1));
			numbers[i-1] = i-1;
			System.out.println("Successful");
		}

		System.out.print("This is what is in the array: ");
		for (int i = 1; i < 5; i++) {
			int element = numbers[i-1];
			System.out.print(element + " ");
		}
		System.out.println();
	}
}