package in.dhruvrajrana.billingsoftware.repository;

import in.dhruvrajrana.billingsoftware.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemEntityRepository extends JpaRepository<OrderItemEntity, Long> {
}
