import uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal;
import uniandes.dpoo.swing.mundo.Diario;
import uniandes.dpoo.swing.mundo.Restaurante;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            Diario elDiario = new Diario();
            elDiario.agregarRestaurante(new Restaurante("Pita Pan", 4, 30, 30, true));
            elDiario.agregarRestaurante(new Restaurante("Lord of the Wings", 5, 170, 210, true));
            elDiario.agregarRestaurante(new Restaurante("Nacho Business", 2, 350, 170, false));
            elDiario.agregarRestaurante(new Restaurante("Thai Tanic", 1, 110, 100, false));
            elDiario.agregarRestaurante(new Restaurante("Planet of the Creppes", 3, 400, 400, true));
            new VentanaPrincipal(elDiario);
        });
    }
}