package com.greatminds.stocks.dbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.greatminds.stocks.dbservice.model.Quote;

@Service
public interface QuotesRepository extends JpaRepository<Quote, Integer>{

	List<Quote> findByUserName(String userName);
}
