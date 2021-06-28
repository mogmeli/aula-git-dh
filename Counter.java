public class Counter {
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    int valor = 0;

    public Counter(){
        valor = 0;
    }

    public Counter(int Val){
        valor = Val;
    }

    public void UpValue(){
        valor++;
    }

    public void DownValue(){
        valor--;
    }
}