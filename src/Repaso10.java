/*
 * Repaso10
 * Mueve el rect�ngulo en diagonal, dependiendo en que cuadrante
 * del rect�ngulo hagas click.
 */

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;
public class Repaso10 extends GraphicsProgram{

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
			double distanciaAlCentroDelRectanguloX =
					evento.getX() - rectangulo.getX();
			
			double distanciaAlCentroDelRectanguloY =
					evento.getY() - rectangulo.getY();
			
			if(distanciaAlCentroDelRectanguloX < rectangulo.getWidth()/2) {
			rectangulo.move(-20, 0);
			}
			
			else{
				rectangulo.move(20, 0);
			}
			
			if(distanciaAlCentroDelRectanguloY < rectangulo.getHeight()/2) {
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
