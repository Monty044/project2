package se.monty.projectarbete.repository;

import se.monty.projectarbete.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
