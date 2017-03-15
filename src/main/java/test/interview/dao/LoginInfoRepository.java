package test.interview.dao;

import org.springframework.data.repository.CrudRepository;
import test.interview.dao.domain.LoginInfo;

import java.util.List;

/**
 * Created by kasar on 3/15/2017.
 */
public interface LoginInfoRepository extends CrudRepository<LoginInfo, Long> {
    List<LoginInfo> findAll();

}
