package com.revature.SpringBootWeb;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeRepository repository;

	@Transactional
	public Employee save(@NotNull @Valid final Employee employee) {
		LOGGER.debug("Creating {}", employee);
		return repository.save(employee);
	}

	@Transactional
	public List<Employee> getList() {
		LOGGER.debug("Retrieving the list of all users");
		return repository.findAll();
	}

}
