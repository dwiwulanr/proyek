/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Order {

    private String nama;
    private String levelPedas;
    private String topping;
    private int totalHarga;

    public Order(String nama, String levelPedas,
            String topping, int totalHarga) {

        this.nama = nama;
        this.levelPedas = levelPedas;
        this.topping = topping;
        this.totalHarga = totalHarga;
    }

    public String getNama() {
        return nama;
    }

    public String getLevelPedas() {
        return levelPedas;
    }

    public String getTopping() {
        return topping;
    }

    public int getTotalHarga() {
        return totalHarga;
    }
}
