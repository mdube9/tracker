package VehicleRest.Repository;

import VehicleRest.Entity.Vehicle;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository

public class VehicleRepositoryImpl implements VehicleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Vehicle findOne(String id) {
        Vehicle em=entityManager.find(Vehicle.class,id);
        return em;
    }
     public Vehicle create(Vehicle emp) {
        entityManager.persist(emp);
        return emp;

    }

    public Vehicle update(String id, Vehicle emp) {
        entityManager.merge(emp);
        return emp;
    }
}
