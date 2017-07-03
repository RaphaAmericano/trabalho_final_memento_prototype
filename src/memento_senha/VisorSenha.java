package memento_senha;

public class VisorSenha {

	public static void main(String[] args) {
		Senha senha = new Senha();
		senha.novaSenha("PSI");
		senha.exibirSenha();
		senha.novaSenha("LLP");
		senha.exibirSenha();
		senha.voltarSenha();
		senha.exibirSenha();
	}

}
