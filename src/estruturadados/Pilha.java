package estruturadados;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Pilha<T> implements Iterable<T>{

    private T[] elementos;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 8;

    public Pilha() {
        this.elementos = (T[]) new Object[CAPACIDADE_INICIAL];
        this.tamanho = 0;
    }

    public int size() {
        return tamanho;
    }

    public boolean estaVazio(){
        return this.tamanho == 0;
    }

    public void empilhar(T elemento){
        if (this.tamanho == this.elementos.length) redimensionar(this.elementos.length * 2);
        this.elementos[this.tamanho++] = elemento;
    }

    public T desempilhar(){
        if (this.estaVazio()) throw new NoSuchElementException("A pilha está vazia!");
        T desempilhado = this.elementos[--tamanho];
        this.elementos[tamanho] = null;
        if (this.tamanho > 0 && this.tamanho == this.elementos.length/4) redimensionar(this.elementos.length / 2);
        return desempilhado;
    }

    private void redimensionar(int capacidade){
        assert capacidade >= tamanho;
        T[] elementosNovos = (T[]) new Object[capacidade];
        for (int i=0; i<this.tamanho; i++){
            elementosNovos[i] = this.elementos[i];
        }
        this.elementos = elementosNovos;
    }

    public T espiar(){
        if (estaVazio()) throw new NoSuchElementException("Pilha está vazia!");
        return this.elementos[tamanho-1];
    }

    public Iterator<T> iterator(){
        return new ReverseArrayIterator();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Iterator<T> it = iterator();
        while (it.hasNext()){
            s.append(it.next());
            if (it.hasNext()) s.append(" ");
        }

        return s.toString();
    }


    private class ReverseArrayIterator implements Iterator<T> {
        private int i;

        public ReverseArrayIterator(){
            i = tamanho - 1;
        }

        public boolean hasNext(){
            return i >= 0;
        }

        public T next(){
            if (!hasNext()) throw new NoSuchElementException();
            return elementos[i--];
        }

    }



}
