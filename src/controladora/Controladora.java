package controladora;

public class Controladora {

	private IPortao portao;
	private int posicaoPortao;
	private int posicaoMaximaPortao;
	private boolean portaoAbrindo;
	
	public Controladora() {
		this.portao = new PortaoParado(this);
		this.posicaoPortao = 0;
		this.posicaoMaximaPortao = 5;
		this.portaoAbrindo = true;
	}
	
	// GETTERS E SETTERS
	public IPortao getPortao() {
		return portao;
	}


	public void setPortao(IPortao portao) {
		this.portao = portao;
	}


	public int getPosicaoPortao() {
		return posicaoPortao;
	}


	public void setPosicaoPortao(int posicaoPortao) {
		this.posicaoPortao = posicaoPortao;
	}


	public int getPosicaoMaximaPortao() {
		return posicaoMaximaPortao;
	}


	public void setPosicaoMaximaPortao(int posicaoMaximaPortao) {
		this.posicaoMaximaPortao = posicaoMaximaPortao;
	}


	public boolean isPortaoAbrindo() {
		return portaoAbrindo;
	}


	public void setPortaoAbrindo(boolean portaoAbrindo) {
		this.portaoAbrindo = portaoAbrindo;
	}

	

	public String executar(String entrada) {
		String saida = "";
		
		for (int i = 0; i < entrada.length(); i++) {
			switch (entrada.charAt(i)) {
			case '.': 						// NADA A FAZER
				this.portao.tratarTempo();
				break;

			case 'P':						// BOTAO PRESSIONADO
				this.portao.tratarBotao();
				this.portao.tratarTempo();
				break;
				
			case 'O':						// OBSTACULO
				this.portao.tratarObstaculo();
				this.portao.tratarTempo();
				break;
			}
			saida += Integer.toString(this.getPosicaoPortao());
		}
		
		return saida;
	}

	
}
