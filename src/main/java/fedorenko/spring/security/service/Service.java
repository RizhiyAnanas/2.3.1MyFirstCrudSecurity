package fedorenko.spring.security.service;

import fedorenko.spring.security.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface Service {
    public void add(User user);
    public List<User> getList();
    public void deleteUser(Long id);
    public User show(Long id);
    public void update(User user, Long id);
}
