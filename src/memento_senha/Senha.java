package memento_senha;

import java.util.List;
import java.util.ArrayList;

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
	public void senhaMaisAntiga(){
		System.out.println("Senha mais antiga");
		ArrayList<SenhaMemento> saida = caretaker.getTodasSenhas();
		System.out.println(saida.get(1).getEstadoMemento());
	}
	public void senhaPenultima(){
		System.out.println("Penúltima senha");
		ArrayList<SenhaMemento> saida = caretaker.getTodasSenhas();
		System.out.println(saida.get(saida.size()-1).getEstadoMemento());
	}
	//Método para exibir todas as senhas armazenadas
	public void todasSenhas(){
		System.out.println("Acessando as senha anteriores:");
		int tamanhoArray = caretaker.getTodasSenhas().size();
		System.out.println("------");
		System.out.println("Senha atual: "+ this.senha);
		System.out.println("Senhas anteriores: ");
		for(int i = 1; i < tamanhoArray ; i++){
			System.out.println("Senha do índice "+ i + " : " + caretaker.getTodasSenhas().get(i).getEstadoMemento());
		} 
	}
}
