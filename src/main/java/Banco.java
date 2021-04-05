//Aluno Luiz Guilherme Veloso Tinti RA: 2101190
import java.util.List;
import java.util.ArrayList;


public class Banco{

	private List<Instrumento> BDInst = new ArrayList<Instrumento>();
        private  Instrumento Inst = new Instrumento();	
//********************************************************************************************

	public List<Instrumento> getBanco() {
		return BDInst;
	}
//********************************************************************************************        
	public Instrumento consInstId(Instrumento inst) {
		for (int i = 0; i < BDInst.size(); i++) {
			if (BDInst.get(i).getId() == inst.getId()) {
				return BDInst.get(i);
			}
		}
		return null;
	}
//********************************************************************************************
        
        public void impInst(Instrumento inst){
	
		System.out.println("\n ID: "+inst.getId()+ " Marca: "+inst.getMarca());

	} 
        
//********************************************************************************************
	
	public Instrumento excluiInst(Instrumento inst){
       		inst = consInstId(inst);        
        		if(BDInst.remove(inst)){
            		return inst;
        		}
        	return null;
    	}
//********************************************************************************************
}
	




