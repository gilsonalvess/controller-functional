package controladora;

public class PortaoParado implements IPortao{
	
	private Controladora controladora;
	
	public PortaoParado(Controladora controladora) {
		this.controladora = controladora;
	}

	@Override
	public void tratarTempo() {
		// aguardando o botao ser pressionado 
	}

	@Override
	public void tratarBotao() {

		
	}

	@Override
	public void tratarObstaculo() {
		// aguardando o botao ser pressionado
	}
}
