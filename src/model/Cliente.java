package model;

public class Cliente {
    private String nombre;
    private int edad;
    private String numero_cedula;
    private Cuenta[] cuentas;
    private int numeroCuentas;
   


    public Cliente(String nombre, int Edad, String numero_cedula){
       this.nombre = nombre;
       this.edad = edad;
       this.numero_cedula = numero_cedula;
       this.cuentas = new Cuenta[10];
       this.numeroCuentas = 0;

    }

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;

    }

    public String getNumero_cedula() {
        return numero_cedula;
    }

    public void setNumero_cedula(String numero_cedula) {
        this.numero_cedula = numero_cedula;

    }

     public Cuentabancaria[] getCuentabancaria(){
        return cuentas;
    }

     public void setCuentabancaria(Cuentabancaria[] cuentas ) {
        this.cuentas = cuentas;

    }

     public int getNumeroCuentas() {
        return numeroCuentas;
    }

    public void setNumeroCuentas(int numeroCuentas) {
        this.numeroCuentas = numeroCuentas;
    }
}