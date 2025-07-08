package ux.edu.mx.model;

/**
 * Loan: Each purchase is converted into a loan, deducting the loan amount from the client's credit line.
 */
public class Prestamo {

    private String clienteId;
    private double montoPrestamo;
    private String fechaPrestamo;
    private String fechaVencimiento;
    private double tasaInteres;

    // Constructor
    public Prestamo(String clienteId, double montoPrestamo, String fechaPrestamo, String fechaVencimiento, double tasaInteres) {
        this.clienteId = clienteId;
        this.montoPrestamo = montoPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaVencimiento = fechaVencimiento;
        this.tasaInteres = tasaInteres;
    }

    // Getters and Setters
    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public double getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(double montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

}
