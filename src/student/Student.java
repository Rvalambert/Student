
package student;

/**
 *
 * @author Rachel Lambert
 */

public class Student 
{
    public String studentName;
    public String studentEmail;
    
    public Student()
    {
        studentName = "UNASSIGNED";
        studentEmail = "UNASSIGNED";
    }
    
    public String getEmail()
    {
        return studentEmail;
    }
    
    public String getName()
    {
        return studentName;
    }
    
    public void setEmail(String email)
    {
        studentEmail = email;
    }
    
    public void setName(String name)
    {
        studentName = name;
    }
    
    public String toString()
    {
        return "The studen't name is " + studentName + " and his or her email address is " + studentEmail;
    }
}

