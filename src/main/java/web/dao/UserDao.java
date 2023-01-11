package web.dao;


import web.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserDao extends UserDetailsService {

    void createUser(User user);

    void deleteUser(long id);

    void updateUser(User user, long id);

    List<User> getAllUsers();

    User getUser(long id);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
