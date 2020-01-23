/*
    Class Name: []
    Author: [insert here]
    Date:  [assignment due date here]
    
    Description:
    [description of class]
*/

package studentlist;

/**
 *
 * @author Vanhae
 */
public class PartTimeStudent extends Student {

    private int numCourses;
    
    public PartTimeStudent(String name, int numCourses) {
        super(name);
        this.numCourses = numCourses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

}
