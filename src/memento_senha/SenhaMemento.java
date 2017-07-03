package memento_senha;

public class SenhaMemento {
	private String estadosenha;
	public SenhaMemento(String estado){
		this.estadosenha = estado;
	}
	
	public String getEstadoMemento(){
		return estadosenha;
	}
}
