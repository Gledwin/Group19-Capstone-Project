package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Booking;

public interface BookingRepository  extends JpaRepository<Booking, String> {
    Booking findBookingByBookingId(String bookingId);

}