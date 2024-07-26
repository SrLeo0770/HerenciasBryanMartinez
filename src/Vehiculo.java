public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String color;

    public Vehiculo(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void arrancar() {
        System.out.println("El vehículo está arrancando.");
    }

    public void detener() {
        System.out.println("El vehículo se está deteniendo.");
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando.");
    }

    public void frenar() {
        System.out.println("El vehículo está frenando.");
    }

    public void girarIzquierda() {
        System.out.println("El vehículo está girando a la izquierda.");
    }

    public void girarDerecha() {
        System.out.println("El vehículo está girando a la derecha.");
    }

    public void encenderLuces() {
        System.out.println("El vehículo está encendiendo las luces.");
    }

    public void apagarLuces() {
        System.out.println("El vehículo está apagando las luces.");
    }

    public void tocarBocina() {
        System.out.println("El vehículo está tocando la bocina.");
    }

    public void mostrarVelocidad() {
        System.out.println("El vehículo está mostrando la velocidad.");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", color='" + color + '\'' +
                '}';
    }
}