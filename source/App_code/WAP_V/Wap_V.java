/**
 * WAP Sys V -- Java implementation
 * --------------------------------
 * Author:  Antonio Jose Gomes
 * License: Artistic License 2.0
 */

/**
 * Import JAVA language needed classes
 */


/**
 * Define the WAP_V package
 */
package WAP_V ;


import java.io.* ;

/**                 
 * Import WAP_V needed classes
 */
import WAP_V.IPL.* ;
import WAP_V.CRE.* ;
import WAP_V.FCORE.* ;
import WAP_V.APL.* ;


/**
 *
 * @author ADMIN
 */
public class Wap_V
{
    
    /**
     * Property to hold the Module_Init main object
     */
    Object IPL = null ;
    
    /**
     * Property to hold the Module_Init main object
     */
    Object CRE = null ;
    
    /**
     * Property to hold the Module_Init main object
     */
    Object FCORE = null ;
    
    /**
     * Property to hold the Module_Init main object
     */
    Object APL = null ;

    
    /**
     * 
     * @return  WAP_V object
     */
    public Wap_V( )
    {
        // Create the Module_Init package global object and store it on the proper WAP_V
        // property
        this.IPL   = new WAP_V.IPL.Module_Init() ;
        this.CRE   = new WAP_V.CRE.Module_Init() ;
        this.FCORE = new WAP_V.FCORE.Module_Init() ;
        this.APL   = new WAP_V.APL.Module_Init() ;
        
    }
    
    
    public boolean show_main_objects()
    {
        System.out.println( "IPL Object: " + this.IPL ) ;
        System.out.println( "CRE Object: " + this.CRE ) ;
        System.out.println( "FCORE Object: " + this.FCORE ) ;
        System.out.println( "APL Object: " + this.APL ) ;
        
        return  true ;
    }
}
