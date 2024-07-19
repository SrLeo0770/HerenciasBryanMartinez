public class Auto extends Vehiculo {
    private int capacidadMaletero;

    public Auto(String marca, String modelo, int año, String color, int capacidadMaletero) {
        super(marca, modelo, año, color);
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public void abrirMaletero() {
        System.out.println("El auto está abriendo el maletero.");
    }

    public void cerrarMaletero() {
        System.out.println("El auto está cerrando el maletero.");
    }

    @Override
    public String toString() {
        return "Auto " +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", año=" + getAño() +
                ", color='" + getColor() + '\'' +
                ", capacidad de Maletero=" + capacidadMaletero +
                ' ';
    }
}
