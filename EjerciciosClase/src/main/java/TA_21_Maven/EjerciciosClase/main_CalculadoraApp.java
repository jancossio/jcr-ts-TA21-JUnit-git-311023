package TA_21_Maven.EjerciciosClase;

public class main_CalculadoraApp {

	public static void main(String[] args) {

		try {
			CalculadoraGUI calculadora = new CalculadoraGUI();
			calculadora.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
