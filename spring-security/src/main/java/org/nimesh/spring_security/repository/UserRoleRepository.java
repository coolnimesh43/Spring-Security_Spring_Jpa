package org.nimesh.spring_security.repository;

import java.util.List;

import org.nimesh.spring_security.model.AppUser;
import org.nimesh.spring_security.model.Role;
import org.nimesh.spring_security.model.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Long> {

    List<UserRole> findByAppUser(AppUser appuser);

    List<UserRole> findByRole(Role role);

    List<UserRole> findByAppUserAndRole(AppUser appUser, Role role);
}
