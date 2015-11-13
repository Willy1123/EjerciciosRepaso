/*
 * Repaso9
 * Cuando hago click en la mitad superior del rect�ngulo, este se mueve hacia arriba,
 * y si hago click en la mitad inferior, el rect�ngulo se mueve hacia abajo
 */

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;
public class Repaso9 extends GraphicsProgram{

	//declaro una variable de instancia para guardar el rect�ngulo
	GRect rectangulo;
	//declaro una variable de tipo aleatorio
	RandomGenerator aleatorio = new RandomGenerator();

	public void init() {
		setSize(800,600);
		rectangulo = new GRect(120, 100);
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

		//si en la posici�n en la que se ha hecho clic
		//est� en l rect�ngulo entonces lo relleno

		//la funci�n se llama getElement
		if (getElementAt(evento.getX(), evento.getY()) == rectangulo) {
			double distanciaAlCentroDelRectangulo =
					evento.getY() - rectangulo.getY();
			
			if(distanciaAlCentroDelRectangulo < rectangulo.getHeight()/2) {
			rectangulo.move(0, -20);
			}
			else{
				rectangulo.move(0, 20);
			}
			rectangulo.setFilled(true);
			rectangulo.setFillColor(aleatorio.nextColor());

		}
	}
}
