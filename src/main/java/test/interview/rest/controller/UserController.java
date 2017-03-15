package test.interview.rest.controller;

import org.springframework.web.bind.annotation.*;
import test.interview.dao.domain.LoginInfo;
import test.interview.service.UserService;

import java.io.IOException;
import java.util.List;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by kasar on 3/15/2017.
 */

@RestController
public class UserController {
    private UserService userservice;

    public UserController(UserService userservice) {
        this.userservice = userservice;
    }

    @RequestMapping(value = "/api/v1/user", method = RequestMethod.POST)
    public Long createUser(@RequestBody LoginInfo loginInfo ){

        return userservice.save(loginInfo);
    }
    @RequestMapping(value="/api/v1/user")
    public List<LoginInfo> getDetails(){
        List<LoginInfo> list=userservice.getUsers();
        return list;
    }
    @RequestMapping(value="/api/v1/user/{id}")
    public LoginInfo getUser(@PathVariable("id") Long id) throws IOException{
        return userservice.userInfo(id);
    }

}
