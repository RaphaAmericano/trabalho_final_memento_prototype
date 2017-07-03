package memento_senha;

public class Senha {
	protected String senha;
	SenhaCareTaker caretaker;
	public Senha(){
		caretaker = new SenhaCareTaker();
		senha = new String();
	}
	public void novaSenha( String novaSenha){
		caretaker.adicionarMemento(new SenhaMemento(senha));
		senha = novaSenha;
	}
	public void voltarSenha(){
		senha = caretaker.getUltimoEstadoSalvo().getEstadoMemento();
	}
	public void exibirSenha(){
		System.out.println(senha);
	}
	//Método para exibir todas as senhas armazenadas
	
}
