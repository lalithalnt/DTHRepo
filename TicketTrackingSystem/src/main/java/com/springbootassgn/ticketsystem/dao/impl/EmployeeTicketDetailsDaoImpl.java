package com.springbootassgn.ticketsystem.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import com.springbootassgn.ticketsystem.dao.EmployeeTicketDetailsDao;
import com.springbootassgn.ticketsystem.model.EmployeeTicketDetails;

public class EmployeeTicketDetailsDaoImpl implements EmployeeTicketDetailsDao {

	 @Autowired 
	 private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional
	@Modifying
	public List<EmployeeTicketDetails> getEmployeeTicketDetails() {
		
		List<EmployeeTicketDetails> list=new ArrayList<EmployeeTicketDetails>();
		return em.createNamedStoredProcedureQuery("viewEmployeeTicketDetails").getResultList();
		
	}
	
	
	
	@Override
	public List<EmployeeTicketDetails> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeTicketDetails> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeTicketDetails> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EmployeeTicketDetails> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends EmployeeTicketDetails> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<EmployeeTicketDetails> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public EmployeeTicketDetails getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EmployeeTicketDetails> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EmployeeTicketDetails> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<EmployeeTicketDetails> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EmployeeTicketDetails> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<EmployeeTicketDetails> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(EmployeeTicketDetails entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends EmployeeTicketDetails> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends EmployeeTicketDetails> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EmployeeTicketDetails> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EmployeeTicketDetails> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends EmployeeTicketDetails> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
