package org.jasper;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author PC-Jose
 */
public class Datos {
    public static Collection<Persona> generaDatosPersona(){
        List<Persona> result = new LinkedList<>();
        result.add(new Persona("Hans", "Muster"));
        result.add(new Persona("Ruth", "Mueller"));
        result.add(new Persona("Heinz", "Kurz"));
        result.add(new Persona("Cornelia", "Meier"));
       result.add(new Persona("Werner", "Meyer"));
       result.add(new Persona("Lydia", "Kunz"));
       result.add(new Persona("Anna", "Best"));
       result.add(new Persona("Stefan", "Meier"));
       result.add(new Persona("Martin", "Mueller"));  
       return result;
    }
}

