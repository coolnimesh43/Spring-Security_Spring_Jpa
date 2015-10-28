package org.nimesh.spring_security.util;

import java.util.ArrayList;
import java.util.List;

import org.nimesh.spring_security.model.Role;

public class AppUtil {

    public AppUtil() {
    }

    /**
     * Method to get {@link List} of {@link Role} names from {@link List} of {@link Role}.
     * 
     * @author nimesh
     * @param roleList
     *            {@link List} of {@link Role}
     * @return {@link List} of {@link String} containing all the role names from parameter.
     */
    public static List<String> getRoleDescriptionFromRoleList(List<Role> roleList) {
        List<String> rolesDescriptionList = new ArrayList<String>();
        if (!roleList.isEmpty()) {
            for (Role role : roleList) {
                rolesDescriptionList.add(role.getRoleName());
            }
        }
        return rolesDescriptionList;
    }

}
