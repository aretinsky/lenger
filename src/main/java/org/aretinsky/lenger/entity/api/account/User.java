package org.aretinsky.lenger.entity.api.account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aretinsky.lenger.entity.api.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // пожалуйста не спрашивайте почему я не юзаю Long
    private Integer id;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;

    private String username;

    private String email;

    private String password;

    @Transient
    private String password_confirm;

    private String first_name;

    private String second_name;

    private Integer age;

    private String avatar_link;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getRoles();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
