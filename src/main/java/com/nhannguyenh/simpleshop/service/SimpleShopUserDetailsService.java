package com.nhannguyenh.simpleshop.service;

import com.nhannguyenh.simpleshop.dto.SimpleShopUserDetails;
import com.nhannguyenh.simpleshop.entity.User;
import com.nhannguyenh.simpleshop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@RequiredArgsConstructor
public class SimpleShopUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));
        return new SimpleShopUserDetails(user);
    }
}
