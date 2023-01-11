package web.service;

import web.model.Role;

import java.util.List;

public interface RoleService {

    void createRole(Role role);

    List<Role> getAllRoles();

    Role finedRoleByRoleName(String roleName);

    Role finedRoleById(long id);

}
