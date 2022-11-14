//package com.User;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class AppUserService {
//    private AppUserRepository appUserRepository;
//
//    @Autowired
//    public AppUserService(AppUserRepository appUserRepository) {
//        this.appUserRepository = appUserRepository;
//    }
//
//    public List<AppUser> getAppUsers(){
//        return appUserRepository.findAll();
//
//    }
//    public void addAppUser(AppUser user){
//        if(appUserRepository.findAppUserByEmail(user.getEmail()).isEmpty()){
//            appUserRepository.save(user);
//        }
//    }
//}
