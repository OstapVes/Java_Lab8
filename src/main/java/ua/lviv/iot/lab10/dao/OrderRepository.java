package ua.lviv.iot.lab10.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.lab10.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
