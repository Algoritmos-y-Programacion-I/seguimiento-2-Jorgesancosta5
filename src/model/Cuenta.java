package model;

public class Cuenta {
    private String nombreBanco;
    private TipoCuenta tipo;
    private double saldo;
   
public void Cuenta(String nombreBanco, TipoCuenta tipo, double saldo, String numeroCuenta) {
        this.nombreBanco = nombreBanco;
        this.tipo = tipo;
        this.saldo = saldo;
        
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public TipoCuenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   
}