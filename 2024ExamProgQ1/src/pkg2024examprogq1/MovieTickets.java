/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024examprogq1;

/**
 *
 * @author kanda
 */
public class MovieTickets implements IMovieTickets {

    // get and set methods
     private String name;
    private int[] sales;

    
    public MovieTickets(String name, int[] sales) {
        this.name = name;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public int getTotalSales() {
        return TotalMovieSales(sales);
    }
  public int[] getSales() {
        return sales;
    }
  //calculations
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for (int sale : movieTicketSales) {
            total += sale;
        }
        return total;
    }

   @Override
  public String TopMovie(String[] movies, int[] totalSales) {
    int topIndex = 0;
    for (int i = 1; i < totalSales.length; i++) {
        if (totalSales[i] > totalSales[topIndex]) {
            topIndex = i;
        }
    }
    return movies[topIndex];
}
    
}
