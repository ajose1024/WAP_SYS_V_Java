/*
 * WAP Sys V -- Java implementation
 * --------------------------------
 * Author:  Antonio Jose Gomes
 * License: Artistic License 2.0
 */

package WAP_V_main ;

import java.io.* ;


import WAP_V.* ;
import WAP_V.IPL.* ;
import WAP_V.CRE.* ;
import WAP_V.FCORE.* ;
import WAP_V.APL.* ;

import WAP_V.xpto_foo.* ;

/**
 *
 * @author ADMIN
 */
public class WAP_V_main
{
    
    private static boolean xpto = false ;
    
    /**
     * Property to hold the Wap_V class object
     */
    protected Wap_V Wap_V = null ;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) throws NoSuchMethodException 
    {
        // TODO code application logic here
        System.out.println( "Alive and kicking!!!" ) ;
        System.out.println() ;
        xpto = new WAP_V.Wap_V().show_main_objects() ;
        System.out.println() ;
        System.out.println() ;
        
        WAP_V.xpto_foo.xpto_foo xpto_foo_obj = new WAP_V.xpto_foo.xpto_foo() ;
        
        xpto_foo_obj.do_action( xpto_foo_obj, "out_data", null );
        System.out.println() ;

        xpto_foo_obj.do_action( xpto_foo_obj, "static_out_data", null );
        System.out.println() ;

//        xpto_foo_obj.do_action( xpto_foo_obj, "user_out_data", "This is the param data!" );
        System.out.println() ;

//        xpto_foo_obj.do_action( xpto_foo_obj, "user_static_out_data", "This is the param_data!!!" );
        System.out.println() ;



    }
    
    
    /**
     * This is the class constructor
     */
    public WAP_V_main()
    {
        this.Wap_V = new WAP_V.Wap_V() ;
    }
    
    
}
