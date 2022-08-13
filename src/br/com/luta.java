package br.com;

import java.util.Random;

public class luta {

	// Atributos
		private lutador desafiado;
		private lutador desafiante;
		private int rounds;
		private boolean aprovada;
		//Métodos Públicos
		public void marcarLuta(lutador l1, lutador l2) {
			if(l1.getCategoria().equals(l2.getCategoria()) 
		    && l1 != l2) {
				this.aprovada = true;
				this.desafiado = l1;
				this.desafiante = l2;
			}else {
				this.aprovada = false;
				this.desafiado = null;
				this.desafiante = null;
			}

		}
		public void Lutar(lutador l1, lutador l2) {
			if(this.aprovada) {
				System.out.println("### DESAFIADO ###");
				this.desafiado.apresentar();
				System.out.println("### DESAFIANTE ###");
				this.desafiante.apresentar();
				
	            Random aleatorio = new Random();
	            int Vencedor = aleatorio.nextInt(3);  // 0 1 2
	            System.out.println("==== RESULTADO DA LUTA ====");
	           
	            switch(Vencedor) {
	            case 0: //Empate
	            	System.out.println("Empatou!");
	            	this.desafiado.empatarLuta();
	            	this.desafiante.empatarLuta();
	            	break;
	            case 1: // Desafiado Vence
	            	System.out.println("Vitória do " + this.desafiado.getNome());
	            	this.desafiado.ganharLuta();
	            	this.desafiante.perderLuta();
	            	break;
	            case 2: // Desafiante Vence
	            	System.out.println("Vitória do " + this.desafiante.getNome());
	            	this.desafiante.ganharLuta();
	            	this.desafiado.perderLuta();
	            	break;
	            }
	            
	            System.out.println("========");
				
		    }else {
			System.out.println("A luta não pode acontecer!");
		}

		
	}
			
	 //Métodos Especiais
		public lutador getDesafiado() {
			return desafiado;
		}
		public void setDesafiado(lutador desafiado) {
			this.desafiado = desafiado;
		}
		public lutador getDesafiante() {
			return desafiante;
		}
		public void setDesafiante(lutador desafiante) {
			this.desafiante = desafiante;
		}
		public int getRounds() {
			return rounds;
		}
		public void setRounds(int rounds) {
			this.rounds = rounds;
		}
		public boolean isAprovada() {
			return aprovada;
		}
		public void setAprovada(boolean aprovada) {
			this.aprovada = aprovada;
		}
		public void lutar() {
			// TODO Auto-generated method stub
			
		}
		
		
		
			
		
		
		
		
		



	}


