/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024examprogq2;

/**
 *
 * @author kanda
 */
public class MovieTickets implements IMovieTickets{

    public MovieTickets(String standard_Ticket, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double CalculateTotalPrice(Double price, Double vat) {
        double totalprice = (vat + 1) * price;
    return totalprice;
    }

    @Override
    public boolean DataValidiation(String name, Double price, int number) {
          
        
        if (name.isEmpty()) {// checks if the name field is empty 
            return false;
        }
        
        try {
          
            if (price <= 0) {
                return false;// checks if the price of property is less than or equal to zero 
            }
        } catch (Exception e) {
            return false;
        }
         try {
          
            if (number <= 0) {
                return false;// checks if the price of property is less than or equal to zero 
            }
        } catch (Exception e) {
            return false;
        }
        return true;
   
}
}


