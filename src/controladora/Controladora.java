package controladora;

public class Controladora {

	IPortao portao;
	private int posicaoPortao = 0;
	private int posicaoMaximaPortao = 5;
	private boolean portaoAbrindo = true;
	private int estado = 0;

	public boolean isPortaoAbrindo() {
		return portaoAbrindo;
	}

	public void tratarTempo(int posicaoPortao, int estado) {
		if (estado == 1) {
			posicaoPortao = posicaoPortao + 1;
			if (posicaoPortao >= posicaoMaximaPortao) {
				estado = 0;
			}
		}
		if (estado == 2) {
			posicaoPortao = posicaoPortao - 1;
			if (posicaoPortao == 0) {
				estado = 0;
			}
		}
	}

	public void tratarBotao(int posicaoPortao, int estado) {
		if (estado == 0) {

		}
	}

	public void tratarObstaculo() {

	}

	public String executar(String entrada) {
		String saida = "";

		for (int i = 0; i < entrada.length(); i++) {
			switch (entrada.charAt(i)) {
				case '.':                        // NADA A FAZER
					this.portao.tratarTempo();
					break;

				case 'P':                        // BOTAO PRESSIONADO
					this.portao.tratarBotao();
					this.portao.tratarTempo();
					break;

				case 'O':                        // OBSTACULO
					this.portao.tratarObstaculo();
					this.portao.tratarTempo();
					break;
			}
			saida += Integer.toString(posicaoPortao);
		}

		return saida;
	}


}
