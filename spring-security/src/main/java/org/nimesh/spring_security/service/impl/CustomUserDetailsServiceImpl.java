package org.nimesh.spring_security.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.nimesh.spring_security.model.AppUser;
import org.nimesh.spring_security.model.Role;
import org.nimesh.spring_security.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsServiceImpl implements UserDetailsService {

    private static final Logger LOG = LogManager.getLogger(CustomUserDetailsServiceImpl.class);
    @Autowired
    private AppUserServiceImpl appUserServiceImpl;

    @Autowired
    private UserRoleServiceImpl userRoleServiceImpl;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        LOG.info("Inside CustomUserDetailsServiceImpl#loadUserByUsername method. User name is: {}", userName);
        AppUser user = appUserServiceImpl.findByUserName(userName);
        if (user == null) {
            throw new UsernameNotFoundException("Username not found exception");
        }
        List<GrantedAuthority> authorityList = getGrantedAuthorities(user);
        LOG.info("User name and password from daabase is : {}", user.getUserName(), user.getPassword());

        return new User(userName, user.getPassword(), user.getIsEnabled(), true, true, true, authorityList);
    }

    private List<GrantedAuthority> getGrantedAuthorities(AppUser appUser) {
        LOG.info("Inside AuthenticationServiceImpl#getGrantedAuthorites method. Getting authorities for user: {}", appUser);
        List<Role> userRoleList = userRoleServiceImpl.getRolesByAppUser(appUser);
        List<String> roleNameList = AppUtil.getRoleDescriptionFromRoleList(userRoleList);
        List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
        if (!roleNameList.isEmpty()) {
            for (String role : roleNameList) {
                authorityList.add(new SimpleGrantedAuthority(role));
            }
        }
        LOG.info(" Granted Authority list is: {}", authorityList);
        return authorityList;
    }
}
