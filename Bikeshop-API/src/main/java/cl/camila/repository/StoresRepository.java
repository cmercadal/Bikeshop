package cl.camila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.camila.model.Stores;

@Repository
public interface StoresRepository extends JpaRepository<Stores, Integer>{

}
