//source: http://www.cs.usyd.edu.au/~jchan3/soft1001/jme/debugging/debugging_task.html

package _02_debug_me;

class Marker 
{ 
	public static void main (String[] args) {
		Marker m = new Marker();
		m.printGrade(75);
	}
    public Marker() 
    { 
        // no initialisation to do 
    } 

    public void printGrade(int mark) 
    { 
        if (mark >= 85) 
            System.out.println("High Distinction"); 
        else if (mark >= 75) 
            System.out.println("Distinction"); 
        else if (mark >= 65) 
            System.out.println("Credit"); 
        else if (mark >= 50) 
            System.out.println("Pass"); 
        else if (mark >= 45) 
            System.out.println("Concessional Pass"); 
        else if (mark < 45) 
            System.out.println("Fail"); 
    } 
} 