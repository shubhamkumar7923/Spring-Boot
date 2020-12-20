package com.abc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.TicketBookingDao;
import com.abc.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}
	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findOne(ticketId);
	}
	public Iterable<Ticket> getAllBookedTickets(){
		return ticketBookingDao.findAll();
	}
	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.delete(ticketId);
	}
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketFromDB = ticketBookingDao.findOne(ticketId);
		ticketFromDB.setEmail(newEmail);
		Ticket updateTicket= ticketBookingDao.save(ticketFromDB);
		return updateTicket;
	}
}
