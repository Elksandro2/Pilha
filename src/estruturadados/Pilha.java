package estruturadados;

public class Pilha<T> {

    private T[] elementos;
    private int tamanho;

    public Pilha() {
        this(10);
    }
    public Pilha(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public int size() {
        return tamanho;
    }

    public boolean estaVazio(){
        return this.tamanho == 0;
    }

    public boolean empilhar(T elemento){
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho++] = elemento;
            return true;
        }
        return false;
    }

    public T desempilhar(){
        if (!this.estaVazio()){
            return this.elementos[--tamanho];
        }
        return null;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }

}
