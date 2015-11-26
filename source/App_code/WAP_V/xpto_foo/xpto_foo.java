/*
 * WAP Sys V -- Java implementation
 * -----------------------------------------
 * Author:  Antonio Jose Gomes
 * License: Artistic License 2.0
 */
package WAP_V.xpto_foo ;

import  java.lang.reflect.* ;
import  java.lang.Class.* ;


/**
 *
 * @author ADMIN
 */


public class xpto_foo
{
    


// boolean xpto_foo_obj_1 = true ;
// xpto_foo xpto_foo_obj_2 = new WAP_V.xpto_foo.xpto_foo() ;


    private static String xpto_string ;


    public xpto_foo()
    {
        xpto_string = "Hello World!!!\n" ;
    }


    public void out_data()
    {
        System.out.println( "Normal: " + xpto_string ) ;
    }
    
    public static void static_out_data()
    {
        System.out.println( "Static: " + xpto_string ) ;
    }
    
    public void user_out_data( Object param_data )
    {
        System.out.println( "Normal [param]: " + xpto_string ) ;
    }
    
    public static void user_static_out_data( Object param_data )
    {
        System.out.println( "Normal [param]: " + xpto_string ) ;
    }
    


    
    public void do_action( Object obj, String method_name, Object method_params ) throws NoSuchMethodException
    {
        Method called_method = obj.getClass().getMethod( method_name ) ;
        try
        {
            called_method.invoke( obj ) ;
        }
        catch( IllegalAccessException | InvocationTargetException exception )
        {
            System.out.println( "ERROR: " + exception.getMessage() );
        }
    }

}


class xpto_a
{
    private static String xpto_string ;


    public xpto_a()
    {
        xpto_string = "Hello World!!!\n" ;
    }


    private void out_data()
    {
        System.out.println( xpto_string ) ;
    }
    
    private static void static_out_data()
    {
        System.out.println( xpto_string ) ;
    }
    
    
    public void do_action( Object obj, String method_name, Object method_params ) throws NoSuchMethodException
    {
        Method called_method = obj.getClass().getMethod( method_name ) ;
        try
        {
            called_method.invoke( obj ) ;
        }
        catch( IllegalAccessException | InvocationTargetException exception )
        {
            System.out.println( "ERROR: " + exception.getMessage() );
        }
    }
}
