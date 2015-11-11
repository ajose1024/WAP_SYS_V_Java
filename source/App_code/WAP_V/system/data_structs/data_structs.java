/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WAP_V.system.data_structs;

/**
 *
 * @author ADMIN
 */
public class data_structs
{
    /**
     * This package defines several data structs, which are initialized in here
     */
    
    
    /**
     * 
     */
    public enum valid_structs { ASSOC_ARRAY, QUEUE, STACK } ;
    
    
    /**
     * This is the data_structs class constructor
     * 
     * @param   struct  Enum        Name of the desired struct
     * 
     * @return  Object                  Struct object creeated
     */
    public Object data_structs( valid_structs struct )
    {
        Object ret_val ;
        ret_val = null ;
        
        switch( struct )
        {
            case ASSOC_ARRAY:
                // Return an ASSOC_ARRAY object
                ret_val = new String( "ASSOC_ARRAY" ) ;
                break ;
                
            case QUEUE:
                // Return a QUEUE object
                ret_val = new String( "QUEUE" ) ;
                 ;
                break ;
                
            case STACK:
                // Return a STACK object
                ret_val = new String( "STACK" ) ;
                break ;
                
            default:
                
                break ;
        }
        
        return  ret_val ;
    }
    
}

// Object assoc_arr = new data_structs( valid_structs.STACK ) ;
