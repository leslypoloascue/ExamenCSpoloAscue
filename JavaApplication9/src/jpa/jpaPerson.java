package mensualidad.control.jpa;

import ch.makery.address.model.Person;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author odali
 */
public class  jpaPerson {
    private ObservableList<Person> personData= FXCollections.observableArrayList();

    public ObservableList<Person> getPersonData() {
        return personData;
    }

    private EntityManagerFactory emf;

    public jpaPerson() {
        this.emf = Persistence.createEntityManagerFactory("BaseDatos");
    }

    public ObservableList<Person> cargarpersona() {
        EntityManager em = emf.createEntityManager();
        try {
            TypedQuery<Person> query = em.createQuery("SELECT e FROM Persona e", Person.class);
            List<Person> Person = query.getResultList();

            // Agregar los estudiantes a la lista observable
            personData.clear();
            personData.addAll(Person);

            return personData;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return personData;
    }
    public void insertapersona(Person dato) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = null;
        try {
            tx = em.getTransaction();
            tx.begin();
            em.persist(dato);
            tx.commit();
            System.out.println("persona agregado correctamente: " + dato.getFirstName());
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }
    }


}

