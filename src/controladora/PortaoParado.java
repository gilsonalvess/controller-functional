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
		// movimentar o portao quando o botao for pressionado
		if(this.controladora.isPortaoAbrindo()) {
			this.controladora.setPortao(new PortaoAbrindo(this.controladora));
		}else {
			this.controladora.setPortao(new PortaoFechando(this.controladora));
		}
		
	}

	@Override
	public void tratarObstaculo() {
		// aguardando o botao ser pressionado
	}
}
