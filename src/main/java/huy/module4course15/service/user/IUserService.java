package huy.module4course15.service.user;

import huy.module4course15.model.User;
import huy.module4course15.service.IGenericService;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUserService extends IGenericService<User> {
    UserDetails loadUserByUsername(String username);
    User findByUsername(String username);
}