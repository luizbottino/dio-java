package dio.digitalinnovation;

public class No {

    private int dado;
    private No refNo;

    public No(int dado) {
        this.dado = dado;
    }

    public No() {
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setReNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
