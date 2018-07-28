//source: http://www.cs.usyd.edu.au/~jchan3/soft1001/jme/debugging/debugging_task.html

package _02_debug_me;

class DebugMe2 {
	public static void main(String[] args) {
		Account a = new Account("Vainavi");
		a.deposit(100);
		System.out.println(a.getOwner() + " has $" + a.getBalance());
	}
}
