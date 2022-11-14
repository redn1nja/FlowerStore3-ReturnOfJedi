//package com.User;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "/api/user")
//public class AppUserController {
//    private AppUserService appUserService;
//
//    @Autowired
//    public AppUserController(AppUserService appUserService) {
//        this.appUserService = appUserService;
//    }
//
//    @GetMapping
//    public List<AppUser> getAppUsers(){
//        return appUserService.getAppUsers();
//    }
//    @PostMapping
//    public void addAppUser(@RequestBody AppUser user){
//        appUserService.addAppUser(user);
//    }
//}
