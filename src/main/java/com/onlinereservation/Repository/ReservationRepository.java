package com.onlinereservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinereservation.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
