package com.abc.dao;

import org.springframework.data.repository.CrudRepository;

import com.abc.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
