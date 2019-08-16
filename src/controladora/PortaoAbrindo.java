package controladora;

public class PortaoAbrindo implements IPortao {

	private Controladora controladora;
	
	public PortaoAbrindo(Controladora controladora) {
		this.controladora = controladora;
	}
	
	@Override
	public void tratarTempo() {
		
	}

	@Override
	public void tratarBotao() {

	}

	@Override
	public void tratarObstaculo() {

	}

}
