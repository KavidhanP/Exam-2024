/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkg2024examprogq2;

/**
 *
 * @author kanda
 */
public interface IMovieTickets {
    double CalculateTotalPrice(Double price, Double vat);
boolean DataValidiation(String name, Double price, int number);
}
