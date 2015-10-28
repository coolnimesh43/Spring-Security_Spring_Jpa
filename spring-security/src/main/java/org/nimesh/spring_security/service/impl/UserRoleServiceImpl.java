package org.nimesh.spring_security.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.nimesh.spring_security.model.AppUser;
import org.nimesh.spring_security.model.Role;
import org.nimesh.spring_security.model.UserRole;
import org.nimesh.spring_security.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Service
public class UserRoleServiceImpl {

    private static final Logger LOG = LogManager.getLogger(UserRoleServiceImpl.class);
    @Autowired
    private UserRoleRepository userRoleRepository;

    @Transactional
    public UserRole save(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Transactional
    public void delete(long id) {
        userRoleRepository.delete(id);
    }

    public UserRole findById(Long id) {
        return userRoleRepository.findOne(id);
    }

    public List<UserRole> findByAppUser(AppUser appUser) {
        return userRoleRepository.findByAppUser(appUser);
    }

    public List<UserRole> findByRole(Role role) {
        return userRoleRepository.findByRole(role);
    }

    public List<UserRole> findByAppUserAndRole(AppUser appUser, Role role) {
        return userRoleRepository.findByAppUserAndRole(appUser, role);
    }

    public List<Role> getRolesByAppUser(AppUser appUser) {
        LOG.info("Inside UserRoleServiceImpl#getRoleByAppUser method. App user is: {}", appUser);
        List<Role> roleList = new ArrayList<Role>();
        List<UserRole> userRoleList = this.findByAppUser(appUser);

        LOG.info("User role list is: {}", userRoleList);
        if (!userRoleList.isEmpty()) {
            for (UserRole userRole : userRoleList) {
                roleList.add(userRole.getRole());
            }
        }
        LOG.info("Role list is: {}", roleList);
        return roleList;
    }
}
