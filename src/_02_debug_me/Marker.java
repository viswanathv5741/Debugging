//source: http://www.cs.usyd.edu.au/~jchan3/soft1001/jme/debugging/debugging_task.html

package _02_debug_me;

class Marker 
{ 
    public Marker() 
    { 
        // no initialisation to do 
    } 

    public void printGrade(int mark) 
    { 
        if (mark >= 85) 
            System.out.println("High Distinction"); 
        if (mark >= 75) 
            System.out.println("Distinction"); 
        if (mark >= 65) 
            System.out.println("Credit"); 
        if (mark >= 50) 
            System.out.println("Pass"); 
        if (mark >= 45) 
            System.out.println("Concessional Pass"); 
        if (mark < 45) 
            System.out.println("Fail"); 
    } 
} 