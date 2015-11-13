/*
 * Repaso5 a�ade soporte al programa para poder escuchar
 * los clics del rat�n
 * Lo que har� el programa es cambiar el color de relleno
 * aleatoriamente de un rect�ungulo cada vez que se pulse click
 */

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;
public class Repaso5 extends GraphicsProgram{

	//declaro una variable de instancia para guardar el rect�ngulo
	GRect rectangulo;
	//declaro una variable de tipo aleatorio
	RandomGenerator aleatorio = new RandomGenerator();

	public void init() {
		setSize(800,600);
		rectangulo = new GRect(120, 80);
		//inserto el "escuchador" del rat�n
		addMouseListeners();
	}

	public void run() {
		add(rectangulo,
			getWidth()/2 - rectangulo.getWidth()/2,
			getHeight()/2 - rectangulo.getHeight()/2
			);
	}
	
	//a�ado el m�todo que escucha el evento del clic del rat�n
	
	public void mouseClicked(MouseEvent evento) {
		if (evento.getButton() == MouseEvent.BUTTON1)
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
	}
}
