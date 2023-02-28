package dio.digitalinnovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {

        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxilia = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refAuxilia);
    }

    public No pop(){

        if(isEmpty()){
            return null;
        }
        No noPoped = refNoEntradaPilha;
        refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        return noPoped;
    }
    public No top(){
        return refNoEntradaPilha;
    }
    public boolean isEmpty(){
//        if (refNoEntradaPilha == null)
//            return true;
//        else
//            return false;

        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "---------------\n";
        stringRetorno += "     Pilha \n";
        stringRetorno += "---------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                    stringRetorno += "[No{dado=" + noAuxiliar.getDado() +"}]\n";
                    noAuxiliar = noAuxiliar.getRefNo();
            }else
                break;
        }
        stringRetorno += "===============\n";
        return stringRetorno;
    }
}
