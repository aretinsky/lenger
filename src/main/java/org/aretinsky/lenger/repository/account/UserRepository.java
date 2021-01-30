package org.aretinsky.lenger.repository.account;

import org.aretinsky.lenger.entity.api.account.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
