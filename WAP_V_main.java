/*
 * WAP Sys V -- Java implementation
 * --------------------------------
 * Author:  Antonio Jose Gomes
 * License: Artistic License 2.0
 */

//aaaaapackage WAP_V_main ;

import java.io.* ;


import WAP_V.* ;
import WAP_V.IPL.* ;
import WAP_V.CRE.* ;
import WAP_V.FCORE.* ;
import WAP_V.APL.* ;

/**
 *
 * @author ADMIN
 */
public class WAP_V_main
{
    
    private static boolean xpto = false ;
    
    private final static Wap_V xpto_obj = null ;
    
    /**
     * Property to hold the Wap_V class object
     */
    protected Wap_V Wap_V = null ;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        System.out.println( "Alive and kicking!!!" ) ;
        System.out.println() ;
        xpto = new WAP_V.Wap_V().show_main_objects() ;
    }
    
    
    /**
     * This is the class constructor
     */
    public WAP_V_main()
    {
        this.Wap_V = new WAP_V.Wap_V() ;
    }
    
    
}
