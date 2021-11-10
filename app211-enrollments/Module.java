
/**
 * This class represents a module in a course
 *
 * @author Ciaran Byrne
 * @version 1.0
 */
public class Module
{
    // Variables
    private String code; CO452
    
    private String title; Programming Concepts 
    
    private int credit; 0

    /**
     * Constructor for objects of class Module
     */
    public Module()
    {
        credit = 15;
    }

    /**
     * This method will print the Module code and title
     *
     */
    public void print()
    {   printHeading();
        
        System.out.println(" Module Code: " + code + ": " + title);
        System.out.println();
    }
    
    /**
     * Print out the details of the module to the terminal.
     */
    private void printHeading()
    {
        System.out.println(" --------------------------------");
        System.out.println("   App211: Module Details");
        System.out.println(" --------------------------------");
        System.out.println();
    }
}
