package com.simplediet.app.repository.spoonacular;

import com.simplediet.app.model.entity.spoonacular.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByExternalId(Long externalId);

    Product findBySearchValue(String searchValue);

}
