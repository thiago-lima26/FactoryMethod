package factory;

//Produto
public abstract class Triangulo {
	
	private float ladoA;
	private float ladoB;
	private float ladoC;
	private String nome;

	Triangulo(float ladoA, float ladoB, float ladoC){
		
		if(condicaoExistencia(ladoA, ladoB, ladoC)) {
			this.ladoA=ladoA;
			this.ladoB=ladoB;
			this.ladoC=ladoC;
		}else {
			condicaoPadrao();
		}
	}	
	
	protected boolean condicaoExistencia(float ladoA, float ladoB, float ladoC) {
		return ((Math.abs(ladoA - ladoC) < ladoB && ladoB < ladoA + ladoC)||(Math.abs(ladoA - ladoB) < ladoC && ladoC < ladoA + ladoB)||
				(Math.abs(ladoB - ladoC) < ladoA && ladoA < ladoB + ladoC));
	}
	
	public void setNome(String nome) {
		this.nome=nome;		
	}
	
	public float getLadoA() {
		return ladoA;
	}

	public void setLadoA(float ladoA) {
		if (condicaoExistencia(ladoA, ladoB, ladoC)) {
			this.ladoA = ladoA;
			altnome();
		} else
			System.out.println("======Impossivel realizar alteração=======");
	}

	public float getLadoB() {
		return ladoB;
	}

	public void setLadoB(float ladoB) {
		if (condicaoExistencia(ladoA, ladoB, ladoC)) {
			this.ladoB = ladoB;
			altnome();
		} else
			System.out.println("======Impossivel realizar alteração=======");
	}

	public float getLadoC() {
		return ladoC;
	}

	public void setLadoC(float ladoC) {
		if (condicaoExistencia(ladoA, ladoB, ladoC)) {
			this.ladoC = ladoC;
			altnome();
		} else
			System.out.println("======Impossivel realizar alteração=======");
	}
	public void condicaoPadrao() {
		this.ladoA=1;
		this.ladoB=1;
		this.ladoC=1;
		this.nome="Equilatero";
	}
	public void altnome() {
		if (this.ladoA==this.ladoB&&this.ladoB==this.ladoC&&this.ladoA==this.ladoC) {
			setNome("Equilatero");
		}else if((ladoA==ladoB&&ladoB!=ladoC&&ladoA!=ladoC)||(ladoA==ladoC&&ladoC!=ladoB&&ladoA!=ladoB)||
				(ladoB==ladoC&&ladoC!=ladoA&&ladoB!=ladoA)) {
			setNome("Isosceles");
		}else if (this.ladoA!=this.ladoB&&this.ladoB!=this.ladoC&&this.ladoA!=this.ladoC) {
			setNome("Escaleno");
		} 
	}

	@Override
	public String toString() {
		return "Triangulo " + nome + " - [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + "]";
	}

}
