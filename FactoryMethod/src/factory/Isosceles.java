package factory;

//ConcreteProduct
public class Isosceles extends Triangulo {
	
	//public String nome = "Isosceles";
	
	Isosceles(float ladoA, float ladoB, float ladoC) {
		super(ladoA, ladoB, ladoC);
		if (condicaoExistencia(ladoA, ladoB, ladoC)) {
			setNome("Isosceles");
		}else
			condicaoPadrao();
	}	

}
