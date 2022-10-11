package CG.Customer.repository;

import CG.Customer.model.CustomerInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerInfoRepository extends MongoRepository<CustomerInfo, Integer> {
    public CustomerInfo findByCustomerEmail(String email);

}
