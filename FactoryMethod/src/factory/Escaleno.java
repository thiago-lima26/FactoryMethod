package factory;

//ConcreteProduct
public class Escaleno extends Triangulo {
	
	//public String nome = "Escaleno";
	
	Escaleno(float ladoA, float ladoB, float ladoC) {
		super(ladoA, ladoB, ladoC);
		if (condicaoExistencia(ladoA, ladoB, ladoC)) {
			setNome("Escaleno");
		} else
			condicaoPadrao();
	}
	
}
