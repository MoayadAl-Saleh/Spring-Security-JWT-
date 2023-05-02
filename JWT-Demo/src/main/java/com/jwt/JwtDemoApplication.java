package com.jwt;

import com.jwt.entity.Role;
import com.jwt.entity.UserStore;
import com.jwt.repo.RepoRole;
import com.jwt.repo.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.*;

@SpringBootApplication
public class JwtDemoApplication
{
	@Autowired
	PasswordEncoder passwordEncoder ;

	@Autowired
	RepoUser repoUser ;

	public static void main(String[] args) {
		SpringApplication.run(JwtDemoApplication.class, args);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

//	@Override
//	public void run (String... args) throws Exception
//	{
//
//		Role admin = new Role();
//		admin.setName("storeAdmin");
//		Set<Role>  roles = new HashSet<>();
//		roles.add(admin);
//		UserStore userStore = new UserStore();
//		userStore.setUsername("moayad");
//		userStore.setPassword(passwordEncoder.encode("root"));
//		userStore.setRoles(roles);
//
////		repoUser.save(userStore);
//	}
}
