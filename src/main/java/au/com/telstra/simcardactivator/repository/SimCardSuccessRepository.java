package au.com.telstra.simcardactivator.repository;

import au.com.telstra.simcardactivator.entity.SimCardSuccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimCardSuccessRepository extends JpaRepository<SimCardSuccess,Long> {
}
