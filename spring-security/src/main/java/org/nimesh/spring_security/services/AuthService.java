package org.nimesh.spring_security.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.nimesh.spring_security.model.AppUser;
import org.nimesh.spring_security.service.impl.AppUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthService {
    private static final Logger LOG = LogManager.getLogger(AuthService.class);
    @Autowired
    private AppUserServiceImpl appUserServiceImpl;

    /**
     * <strong>Method to validate email address for {@link AppUser}.</strong> <br>
     * <br>
     * <i>The method validate the email address by checking whether or not an user with the corrosponding email address exists. If it
     * exists, the email address is valid. If not, the email address is not valid.</i>
     * 
     * @author nimesh
     * @param appUser
     *            {@link AppUser} object containing email address.
     * @return {@link Boolean} <code>true</code> if email address is valid, else <code>false</code>
     */
    public boolean validateUserEmail(String email) {
        LOG.info("Inside AuthService#validateUserEmail method. Email is: {} ", email);
        boolean isValid = Boolean.FALSE;
        if (email != null && !email.isEmpty()) {
            AppUser user = appUserServiceImpl.findByEmail(email);
            if (user != null) {
                isValid = Boolean.TRUE;
            }
        }
        return isValid;
    }
}
