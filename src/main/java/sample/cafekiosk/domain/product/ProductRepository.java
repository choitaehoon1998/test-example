package sample.cafekiosk.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    /**
     * select * from product where selling_type in (~~)
     *
     * @param sellingStatuses
     * @return
     */
    List<Product> findAllBySellingStatusIn(List<ProductSellingStatus> sellingStatuses);

    /**
     * @param productNumbers
     * @return
     */
    List<Product> findAllByProductNumberIn(List<String> productNumbers);
}
