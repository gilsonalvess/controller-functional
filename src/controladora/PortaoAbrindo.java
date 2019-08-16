package controladora;

public class PortaoAbrindo implements IPortao {

	private Controladora controladora;
	
	public PortaoAbrindo(Controladora controladora) {
		this.controladora = controladora;
		this.controladora.setPortaoAbrindo(true);
	}
	
	@Override
	public void tratarTempo() {
		// movimentando o portao 
		this.controladora.setPosicaoPortao(this.controladora.getPosicaoPortao() + 1);
		// verificando se o portao atingiu o limite maximo de abertura
		if (this.controladora.getPosicaoPortao() >= this.controladora.getPosicaoMaximaPortao()) {
			// proximo movimento sera de fechamento
			this.controladora.setPortaoAbrindo(false);
			this.controladora.setPortao(new PortaoParado(this.controladora));
		}
		
	}

	@Override
	public void tratarBotao() {
		// parando o portao
		this.controladora.setPortao(new PortaoParado(this.controladora));
	}

	@Override
	public void tratarObstaculo() {
		// fechando o portao
		this.controladora.setPortao(new PortaoFechando(this.controladora));
	}

}
