package test.interview.service;

import org.springframework.stereotype.Service;
import test.interview.dao.LoginInfoRepository;
import test.interview.dao.domain.LoginInfo;

import java.util.List;

/**
 * Created by kasar on 3/15/2017.
 */

@Service
public class UserService {

    private LoginInfoRepository loginInfoRepository;

    public UserService(LoginInfoRepository loginInfoRepository) {
        this.loginInfoRepository = loginInfoRepository;
    }

    public Long save(LoginInfo loginInfo){
        LoginInfo info = loginInfoRepository.save(loginInfo);
        return info.getId();

    }

    public List<LoginInfo> getUsers() {
        return loginInfoRepository.findAll();
    }

    public LoginInfo userInfo(Long id) {
        return loginInfoRepository.findOne(id);
    }
}
