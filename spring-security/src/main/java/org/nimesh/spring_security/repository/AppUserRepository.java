package org.nimesh.spring_security.repository;

import org.nimesh.spring_security.model.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long> {
    AppUser findByEmail(String email);

    AppUser findByUserName(String userName);
}
