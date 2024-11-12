import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pkg2024examprogq2.MovieTickets;

public class MovieTicketsTest {

    // Test for calculateTotalTicketPrice()
    @Test
    public void testCalculateTotalTicketPrice() {
        // Test case: ticket price = 100, number of movies = 2, expected total = 228
        MovieTickets tickets = new MovieTickets("Standard Ticket", 100, 2);
        double expectedTotal = 100 * 2 * 1.14; // 228
        assertEquals(expectedTotal, tickets.CalculateTotalPrice(), 0.001, 
                     "Total price calculation should include 14% VAT.");
    }

    // Test for isValidTicketData() when all data is valid
    @Test
    public void testIsValidTicketDataValid() {
        MovieTickets tickets = new MovieTickets("Standard Ticket", 50, 1);
        assertTrue(tickets.DataValidiation(), "Validation should pass for valid data.");
    }

    // Test for isValidTicketData() when ticket name is empty
    @Test
    public void testIsValidTicketDataEmptyName() {
        MovieTickets tickets = new MovieTickets("", 50, 1);
        assertFalse(tickets.DataValidiation(), "Validation should fail if ticket name is empty.");
    }

    // Test for isValidTicketData() when ticket price is zero
    @Test
    public void testIsValidTicketDataZeroPrice() {
        MovieTickets tickets = new MovieTickets("Standard Ticket", 0, 1);
        assertFalse(tickets.DataValidiation(), "Validation should fail if ticket price is zero.");
    }

    // Test for isValidTicketData() when number of movies is zero
    @Test
    public void testIsValidTicketDataZeroMovies() {
        MovieTickets tickets = new MovieTickets("Standard Ticket", 50, 0);
        assertFalse(tickets.DataValidiation(), "Validation should fail if number of movies is zero.");
    }
}