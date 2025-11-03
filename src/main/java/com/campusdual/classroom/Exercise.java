package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise {

    public static Map<String, Person> createHashMap() {
        Map<String,Person> personas = new HashMap<>();
        personas.put("person", new Person("John", "Smith"));
        personas.put("teacher", new Teacher("María", "Montessori", "Educación"));
        personas.put("police", new PoliceOfficer("Jake","Peralta", "B-99"));
        personas.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));
        return personas;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value); /// aqui o que fago e que o mapa añada o tipo de persona que é e agregue os valores o map
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String,Person> entry : map.entrySet()){ ///  Aquí recorro todo el mapa y obtengo cada entrada (clave-valor)
            Person person = entry.getValue();  /// Creo una variable que guarda el valor de la entrada, es decir, el objeto Person
            person.getDetails();  ///  Llamo al método getDetails() para que me muestre los detalles del objeto por pantalla
        }
    }


}
