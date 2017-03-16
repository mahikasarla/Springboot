package test.interview.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import test.interview.dao.domain.LoginInfo;

import java.util.List;

/**
 * Created by kasar on 3/15/2017.
 */
public interface LoginInfoRepository extends CrudRepository<LoginInfo, Long> {
    List<LoginInfo> findAll();
    List<LoginInfo> findByFirstName(String firstName);

    @Query("select li from LoginInfo li where firstName like ('%'||:like||'%')")
    List<LoginInfo> findByLike(@Param("like") String like);
}
