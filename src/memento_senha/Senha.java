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
	public void todasSenhas(){
		int tamanhoArray = caretaker.getTodasSenhas().size();
		System.out.println("------");
		System.out.println("Senha atual: "+ this.senha);
		System.out.println("Senhas anteriores: ");
		for(int i = 1; i < tamanhoArray ; i++){
			System.out.println("Senha do índice "+ i + " : " + caretaker.getTodasSenhas().get(i).getEstadoMemento());
		} 
	}
}
