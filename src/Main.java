public class Main {
    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", "Corolla", 2020, "Rojo", 450);

        miAuto.arrancar();
        miAuto.detener();
        miAuto.acelerar();
        miAuto.frenar();
        miAuto.girarIzquierda();
        miAuto.girarDerecha();
        miAuto.encenderLuces();
        miAuto.apagarLuces();
        miAuto.tocarBocina();
        miAuto.mostrarVelocidad();

        miAuto.abrirMaletero();
        miAuto.cerrarMaletero();

        System.out.println(miAuto);
    }
}
