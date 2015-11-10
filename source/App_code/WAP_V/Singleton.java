/*
 * WAP Sys V -- Java implementation
 * -----------------------------------------
 * Author:  Antonio Jose Gomes
 * License: Artistic License 2.0
 */
package WAP_V;

/**
 *
 * @author ADMIN
 */
public class Singleton
{
    /**
     * This is the private property used to hold the Singleton object
     */
    private static Singleton singleton_object ;

    
    /**
     * This is the Singleton class private constructor
     */
    private Singleton()
    {
        // Nothing to do
    }

    
    /**
     * This method creates the Singleton object, if it has not been created yet,
     * returning then after it.
     * 
     * @return  Sigleton_Object
     */
    public static Singleton get_Instance()
    {
        if ( singleton_object == null )
            // Call the class private constructor (internal call)
            singleton_object = new Singleton() ;
    
            // Return the Singleton object
            return  singleton_object ;
    }

    
    /**
     * This method overides the Object class clone() method
     * 
     * @return  void
     * @throws  CloneNotSupportedException 
     */
    public Object clone()
	throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException() ; 
    }

}
