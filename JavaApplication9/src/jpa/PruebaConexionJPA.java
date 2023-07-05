package jpa;

import ch.makery.address.model.Person;


public class PruebaConexionJPA {

    public static void main(String[] args) {
        jpaPerson jpa = new jpaPerson ();

        // Insertar un nuevo estudiante
        Person nuevoPerson = new Person();
        nuevoPerson.setFirstName("lesly");
        nuevoPerson.setLastName("Polo");
        nuevoPerson.setStreet("san jeronimo");
        nuevoPerson.setpostalCode("421");
        nuevoPerson.setCity("calle hospital");
        nuevoPerson.setBirthday("21.02,199");


        jpa.insertapersona(nuevoPerson);

        // Cargar y mostrar toda la agenda de las persona en la base de datos
        jpa.cargarpersona().forEach(Person -> {
            System.out.println(Person.setFirstName() + " " + Person.setFirstName() + " " + Person.setStree()  + " "  +Person.setpostalCode() +" " +Person.setCity() + " " +Person.setBirthday()); 
        });
    }
}
