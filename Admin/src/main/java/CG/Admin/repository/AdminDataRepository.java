package CG.Admin.repository;

import CG.Admin.models.AdminData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface AdminDataRepository extends MongoRepository<AdminData, Integer> {

    @Query("{'userName': ?0}")
    public AdminData findByUserName(String userName);
}
