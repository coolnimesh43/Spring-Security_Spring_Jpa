package org.nimesh.spring_security.service.impl;

import java.util.List;

import org.nimesh.spring_security.model.AppUser;
import org.nimesh.spring_security.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation class for Entity AppUser
 * 
 * @author nimesh
 *
 */
@Transactional(readOnly = true)
@Service
public class AppUserServiceImpl {

    @Autowired
    private AppUserRepository appUserRepository;

    @Transactional
    public AppUser save(AppUser user) {
        return appUserRepository.save(user);
    }

    @Transactional
    public void delete(AppUser user) {
        appUserRepository.delete(user);
    }

    public AppUser findById(Long id) {
        return appUserRepository.findOne(id);
    }

    public List<AppUser> findAll() {
        return (List<AppUser>) appUserRepository.findAll();
    }

    public AppUser findByEmail(String email) {
        return appUserRepository.findByEmail(email);
    }

    public AppUser findByUserName(String userName) {
        return appUserRepository.findByUserName(userName);
    }
}
