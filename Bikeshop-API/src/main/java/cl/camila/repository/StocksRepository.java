package cl.camila.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.camila.model.Stocks;

@Repository
public interface StocksRepository extends JpaRepository<Stocks, Integer> {
	

	@Query(value="SELECT * FROM stocks WHERE store_id= ?1", nativeQuery = true)
	List<Stocks> findAllByStoreId(Integer storeId);
	
	List<Stocks> findByProductId(Integer productId);
	
	

}
