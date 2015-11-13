/*
 * Repaso7
 * Cuando se hace click en un rect�ngulo central, genera un
 * nuevo rect�ngulo aleatorio
 */

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;
public class Repaso7 extends GraphicsProgram{

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
		rectangulo.setFilled(true);
		rectangulo.setFillColor(aleatorio.nextColor());
		
		GRect auxiliar = new GRect(aleatorio.nextInt(200), aleatorio.nextInt(200));
		auxiliar.setFilled(true);
		auxiliar.setFillColor(aleatorio.nextColor());
		add(auxiliar, aleatorio.nextInt(800), aleatorio.nextInt(600));
		}
	}
}
