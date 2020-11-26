package com.springsecurity.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springsecurity.auth.model.User;
import com.springsecurity.auth.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityDatabaseAuthApplication implements CommandLineRunner {

	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDatabaseAuthApplication.class, args);
	}
	
	@Override
    public void run(String...args) throws Exception {
        userRepository.save(new User("admin", bCryptPasswordEncoder.encode("admin")));
    }

}
