package poo;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegarInternet  {

	@Override
	public void exibirPagina(String url) { 
	
		
		System.out.println("Exibindo a página " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		
		System.out.println("Nova aba adicionada");
		
	}

	@Override
	public void atualizarPagina() {
		
		System.out.println("Página atualizada");
		
	}

	@Override
	public void ligar(String numero) {
		
		System.out.println("Ligando para o número " + numero);
		
	}

	@Override
	public void atender() {
		
		System.out.println("Chamada atendida");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		
		System.out.println("Correio de voz iniciado");
		
	}

	@Override
	public void tocar() {
		
		System.out.println("Tocando musica");
		
	}

	@Override
	public void pausar() {

		System.out.println("Musica pausada");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		
		System.out.println("Musica selecionada: " + musica);
		
	}
}
