package com.employeeapp;

import com.employeeapp.entities.Employee;
import com.employeeapp.entities.UserEntity;
import com.employeeapp.repo.EmployeeRepo;
import com.employeeapp.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
@EntityScan(basePackages = "com.employeeapp.entities")
public class EmployeeappApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepo employeeRepo;

//	private Logger logger = (Logger) LoggerFactory.getLogger(EmployeeappApplication.class);

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeappApplication.class, args);
	}
	@Autowired
	private PasswordEncoder passwordEncoder;


	@Override
	public void run(String... args) throws Exception {

		employeeRepo.save(Employee.builder().name("RG").email("r@g.com").salary(1500).build());
		employeeRepo.save(Employee.builder().name("SR").email("s@r.com").salary(2000).build());
		employeeRepo.save(Employee.builder().name("SB").email("s@b.com").salary(1800).build());


//		logger.info(("Employee Added"));


		userService.addUserEntity(new UserEntity("raj",
				passwordEncoder.encode("raj123"), List.of("ROLE_ADMIN","ROLE_MGR","ROLE_CLERK")));

		userService.addUserEntity(new UserEntity("ekta",passwordEncoder.encode("ekta123"),
				List.of("ROLE_MGR","ROLE_CLERK")));

		userService.addUserEntity(new UserEntity("gun",passwordEncoder.encode("gun123"),
				List.of("ROLE_MGR","ROLE_CLERK")));

	}




}
