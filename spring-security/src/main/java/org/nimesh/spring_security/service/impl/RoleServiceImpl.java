package org.nimesh.spring_security.service.impl;

import java.util.List;

import org.nimesh.spring_security.model.Role;
import org.nimesh.spring_security.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation class for Entity Role.
 * 
 * @author nimesh
 *
 */
@Transactional(readOnly = true)
@Service
public class RoleServiceImpl {

    @Autowired
    RoleRepository roleRepository;

    public Role findById(long id) {
        return roleRepository.findOne(id);
    }

    @Transactional
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Transactional
    public void deleteById(long id) {
        roleRepository.delete(id);
    }

    public List<Role> findAll() {
        return (List<Role>) roleRepository.findAll();
    }

}
