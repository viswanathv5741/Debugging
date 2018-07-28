//source: http://www.cs.usyd.edu.au/~jchan3/soft1001/jme/debugging/debugging_task.html

package _02_debug_me;

class Person 
{ 
  // Instance variables 
    private String name; 
    private int age; 
  
  // Constructor 
    public Person(String _name, int _age) 
    { 
        name = _name; 
        age = _age; 
    } 

  // Instance methods 
    public String getName() 
    { 
        return name; 
    } 

    public int getAge() 
    { 
        return age; 
    } 
} 