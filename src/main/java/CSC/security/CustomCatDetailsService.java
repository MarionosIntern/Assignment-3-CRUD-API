package CSC.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import CSC._0.Assignment3.Cat.Cat;
import CSC._0.Assignment3.Cat.CatRepository;


@Service
public class CustomCatDetailsService {
    @Autowired
    private CatRepository catRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Cat cat = catRepository.findById(Long.parseLong(username))
                .orElseThrow(() -> new UsernameNotFoundException("Cat not found with id: " + username));
                

    }

}
