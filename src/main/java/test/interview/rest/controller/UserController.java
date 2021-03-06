package test.interview.rest.controller;

import org.springframework.web.bind.annotation.*;
import test.interview.dao.domain.UserLogin;
import test.interview.dao.domain.LoginInfo;
import test.interview.service.UserService;

import java.io.IOException;
import java.util.List;

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
    public String createUser(@RequestBody LoginInfo loginInfo ){

        return userservice.save(loginInfo)+" Saved";
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
    @RequestMapping(value = "/api/v1/user/{id}", method = RequestMethod.DELETE)
    public String removeId(@PathVariable ("id") Long id) throws  IOException{
        userservice.deleteId(id);
        return id + " Deleted";
    }
    @RequestMapping(value = "/api/v1/user/search/{searchByFirstName}")
    public List<LoginInfo> getUserByName(@PathVariable("searchByFirstName") String firstname) throws IOException{
       List<LoginInfo> list= userservice.getByFirstName(firstname);
        return list;
    }
    @RequestMapping(value= "/api/v1/user/search/like/{searchByLike}")
    public List<LoginInfo> getUserByLike(@PathVariable("searchByLike") String like) throws IOException {
        List<LoginInfo> list = userservice.getByLike(like);
        return list;
    }

    @RequestMapping(value="/api/v1/login", method = RequestMethod.POST)

    public String userAuthentication(@RequestBody UserLogin userLogin) throws IOException{
        String name =userLogin.toString();
        return name;
    }
}
