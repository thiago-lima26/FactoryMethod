package factory;

//ConcreteProduct
public class Equilatero extends Triangulo{
	
	//public String nome = "Equilatero";
	
	Equilatero(float ladoA, float ladoB, float ladoC) {
		super(ladoA, ladoB, ladoC);
		if (condicaoExistencia(ladoA, ladoB, ladoC)) {
			setNome("Equilatero");
		}else
			condicaoPadrao();
	}
	
	

}
