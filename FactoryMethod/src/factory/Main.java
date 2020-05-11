package factory;

public class Main {

	public static void main(String[] args) {
		
		CriarFigura cf = new DefinirTriangulo();
		
		Triangulo t;
		System.out.println("1º Teste");
		t = cf.criarTriangulo(3, 3, 3);
		System.out.println(t);
		t.setLadoC(7);
		System.out.println(t);
		
		System.out.println("\n2º Teste");
		t = cf.criarTriangulo(2, 4, 4);
		System.out.println(t);
		t.setLadoA(4);
		System.out.println(t);
		
		System.out.println("\n3º Teste");
		t = cf.criarTriangulo(8, 12, 10);
		System.out.println(t);
		t.setLadoB(3);
		System.out.println(t);
	}

}
