package memento_senha;
import java.util.ArrayList;

public class SenhaCareTaker {
	private ArrayList<SenhaMemento> mementos = new ArrayList();
	
	public SenhaCareTaker(){
		mementos = new ArrayList<SenhaMemento>();
	}
	public void adicionarMemento( SenhaMemento memento){
		mementos.add(memento);
	}
	public SenhaMemento getUltimoEstadoSalvo(){
		if( mementos.size() <= 0){
			return new SenhaMemento("");
		}
		SenhaMemento estadoSalvo = mementos.get(mementos.size() - 1);
		mementos.remove(mementos.size() - 1);
		return estadoSalvo;
	}
	public ArrayList<SenhaMemento> getTodasSenhas(){
		return this.mementos;
	}
}
