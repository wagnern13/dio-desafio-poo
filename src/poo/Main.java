package poo;

public class Main {

	public static void main(String[] args) {
		
		IPhone iphone = new IPhone();
		
		iphone.selecionarMusica("Alien Superstar");
		iphone.tocar();
		iphone.pausar();
		iphone.tocar();
		
		iphone.ligar("(15) 97070-6070");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.adicionarNovaAba();
		iphone.exibirPagina("https://nova.pagina.com.br");
		iphone.atualizarPagina(); 

	}

}
