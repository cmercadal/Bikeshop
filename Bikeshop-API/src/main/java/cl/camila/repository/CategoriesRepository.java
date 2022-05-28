package cl.camila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.camila.model.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

}
