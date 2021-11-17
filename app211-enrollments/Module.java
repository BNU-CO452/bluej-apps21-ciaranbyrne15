
/**
 * This class represents a module in a course and credit value of a module
 *
 * @author Ciaran Byrne
 * @version 10/11/2021
 */
public class Module
{
    // Variables
    private String code;
    
    private String title;
    
    private int credit; 

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        this.code = code;
        this.title = title;
        this.credit = 15;
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
