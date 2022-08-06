package br.com;

public class lutador {
    //Atributos
	private String nome;
	private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    // Métodos Públicos
    public void apresentar() {
    	System.out.println("-------------------------------------------------");
    	System.out.println("CHEGOU A HORA! Apresentamos o lutador" + this.getNome());
    	System.out.println("Diretamente de " + this.getNacionalidade());
    	System.out.println("Com " + this.getIdade() + " anos e " + this.altura);
    	System.out.println(" Pesando " + this.getPeso() + "kg");
    	System.out.println(this.getVitorias() + "Vitorias"); 
        System.out.println(this.getDerrotas() + "Derrotas");
        System.out.println(this.getEmpates()  + "Empates");
    	}
    public void status() {
    	System.out.println(this.getNome() + " é um peso " + this.getCategoria());
    	System.out.println("Ganhou" + this.getVitorias() + "vezes");
    	System.out.println("Perdeu " + this.getDerrotas() + "Vezes");
    	System.out.println("Empatou " + this.getEmpates() + "Vezes");
    }
    public void ganharLuta() {
    	this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {
    	this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
    	this.setEmpates(this.getEmpates() + 1);
    }
	public lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.peso < 52.2) {
			this.categoria = "Inválido";
		}else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		}else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		}else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			categoria = "Inválido";
		}
	}
	
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
    
 
    
    
    
}
