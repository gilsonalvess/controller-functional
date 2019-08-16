package controladora;

public class PortaoFechando implements IPortao{

	private Controladora controladora;
	
	public PortaoFechando(Controladora controladora) {
		this.controladora = controladora;
		this.controladora.setPortaoAbrindo(false);
	}
	
	@Override
	public void tratarTempo() {
		// movimentando o portao
		this.controladora.setPosicaoPortao(this.controladora.getPosicaoPortao() - 1);
		// verificando se o portao chegou no limite inferior
		if (this.controladora.getPosicaoPortao() == 0) {
			// proximo movimento sera de abertura
			this.controladora.setPortaoAbrindo(true);
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
		// abrindo o portao
		this.controladora.setPortao(new PortaoAbrindo(this.controladora));
	}

}
