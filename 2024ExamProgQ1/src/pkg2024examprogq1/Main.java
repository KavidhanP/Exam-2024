/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024examprogq1;

/**
 *
 * @author kanda
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] sales = {
            {3000, 1500, 1700}, // Napoleon's sales 
            {3500, 1200, 1600}  // Oppenheimer's sales 
        };
        
        // Creating MovieTickets objects
        MovieTickets napoleon = new MovieTickets("Napoleon", sales[0]);
        MovieTickets oppenheimer = new MovieTickets("Oppenheimer", sales[1]);
        
        // Display report
        generateReport(new MovieTickets[] { napoleon, oppenheimer });
        
        // Calculating the TopMovie
        String topMovie = napoleon.getTotalSales() > oppenheimer.getTotalSales() ? napoleon.getName() : oppenheimer.getName();
        System.out.println("Top performing movie: " + topMovie);
    }
    
    public static void generateReport(MovieTickets[] movies) {
        String[] months = { "JAN", "FEB", "MAR" };
        
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println("--------------------------------");
        
        // Print header
        System.out.printf("%-15s", " ");
        for (String month : months) {
            System.out.printf("%-10s", month);
        }
        System.out.println();
        
        // Print the sales of each movie
        for (MovieTickets movie : movies) {
            System.out.printf("%-15s", movie.getName()); 
            int[] sales = movie.getSales();
            for (int sale : sales) {
                System.out.printf("%-10d", sale);
            }
            System.out.println();
        }
        
        System.out.println("--------------------------------");
        
        // Print total sales for each movie giving the name and movie
        for (MovieTickets movie : movies) {
            System.out.printf("Total movie ticket sales for %-10s: %d%n", movie.getName(), movie.getTotalSales());
        }
        
        System.out.println("--------------------------------");
    }
    }
    

