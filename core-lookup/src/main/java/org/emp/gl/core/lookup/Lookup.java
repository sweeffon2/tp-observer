/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.core.lookup;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Teacher
 */
public class Lookup {
    
    Map<Class, Object> services = new HashMap<>() ; 
    
    public <T> void register (Class<? super T> service, T instance){
        services.put(service, instance) ;
    }
    
    public <T> T getService (Class<T> service){
        T instance = (T) services.get(service) ;
        return  instance ; 
    }
    
    private Lookup() {
    }
    
    private static Lookup INSTANCE = null ;
    private static Object lock = new Object() ;

    public static Lookup getInstance() {
        if (INSTANCE == null){
            synchronized(lock){
                if (INSTANCE ==null)
                INSTANCE = new Lookup() ;
            }
        }
        return INSTANCE;
    }
}
