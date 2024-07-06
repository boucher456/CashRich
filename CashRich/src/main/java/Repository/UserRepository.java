package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CashModel.User;

public interface UserRepository extends JpaRepository<User, Long> {
	boolean existsByEmail(String email);
    boolean existsByUsername(String username);
    User findByUsername(String username);
}