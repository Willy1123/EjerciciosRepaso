/*
 * Repaso8
 * Cuando hago click en la mitad derecha del rect�ngulo, este se mueve a la derecha,
 * y si hago click en la mitad izquierda, el rect�ngulo se mueve a la izquierda
 */

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;
public class Repaso8 extends GraphicsProgram{

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

		//si en la posici�n en la que se ha hecho clic
		//est� en l rect�ngulo entonces lo relleno

		//la funci�n se llama getElement
		if (getElementAt(evento.getX(), evento.getY()) == rectangulo) {
			double distanciaAlCentroDelRectangulo =
					evento.getY();
			
			if(distanciaAlCentroDelRectangulo < rectangulo.getWidth()/2) {
			rectangulo.move(-20, 0);
			}
			else{
				rectangulo.move(20, 0);
			}
			rectangulo.setFilled(true);
			rectangulo.setFillColor(aleatorio.nextColor());

		}
	}
}
