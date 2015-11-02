/*
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


/**
 * Import WAP_V needed classes
 */
import WAP_V.IPL.IPL ;
import WAP_V.CRE.CRE ;
import WAP_V.FCORE.FCORE ;
import WAP_V.APL.APL ;


/**
 *
 * @author ADMIN
 */
class Wap_V {
    
    /**
     * Property to hold the IPL main object
     */
    Object IPL = null ;
    
    /**
     * Property to hold the CRE main object
     */
    Object CRE = null ;
    
    /**
     * Property to hold the FCORE main object
     */
    Object FCORE = null ;
    
    /**
     * Property to hold the APL main object
     */
    Object APL = null ;

    
    /**
     * 
     * @return  WAP_V object
     */
    public Wap_V( )
    {
        // Create the IPL package global object and store it on the proper WAP_V
        // property
        // this.IPL = IPL() ;
        this.IPL = WAP_V.Singleton.get_Instance() ;
        
    }
    
}
