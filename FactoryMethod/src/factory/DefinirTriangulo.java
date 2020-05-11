package factory;

//ConcreteCreator
public class DefinirTriangulo implements CriarFigura{
	
	public Triangulo criarTriangulo(float ladoA, float ladoB, float ladoC) {
		Triangulo t = null;
		if (ladoA==ladoB&&ladoB==ladoC&&ladoA==ladoC) {
			t = new Equilatero(ladoA, ladoB, ladoC);
		}else if((ladoA==ladoB&&ladoB!=ladoC&&ladoA!=ladoC)||(ladoA==ladoC&&ladoC!=ladoB&&ladoA!=ladoB)||
				(ladoB==ladoC&&ladoC!=ladoA&&ladoB!=ladoA)) {
			t = new Isosceles(ladoA, ladoB, ladoC);
		}else if (ladoA!=ladoB&&ladoB!=ladoC&&ladoA!=ladoC) {
			t = new Escaleno(ladoA, ladoB, ladoC);
		} 
		return t;
	}
}
