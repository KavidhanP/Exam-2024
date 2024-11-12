
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import pkg2024examprogq1.MovieTickets;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kanda
 */
public class MovieTicketsTest {
     @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        int[] sales = {3000, 1500, 1700};
        MovieTickets movie = new MovieTickets("Napolean ", sales);
        assertEquals(6200, movie.getTotalSales(), 0.01);
        
    } //total sales for napolean test
    
     @Test
    public void TopMovieSales_ReturnsTopMovie() {
        String[] movieNames = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {6200, 6300}; // Total sales for each movie
        MovieTickets movieTickets = new MovieTickets("Test", new int[]{0}); // Instantiate a MovieTickets object to access the TopMovie method .
    
    assertEquals("Oppenheimer", movieTickets.TopMovie(movieNames, totalSales));
    }
    

}
