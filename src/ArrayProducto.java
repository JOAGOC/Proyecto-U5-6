/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
class ArrayProducto {
    private int tope = 0, tam = 0;
    private Producto[] P;

    public ArrayProducto(int e) {
        this.P = new Producto[e];
        tam = e;
    }
    
    public void quickSort(boolean x){
        if (x)
            quickSortID(P, 0, tope-1);
        else
            quickSortVal(P, 0, tope-1);
    }

    public int getTope() {
        return tope;
    }

    public int getTam() {
        return tam;
    }

    public Producto[] getP() {
        return P;
    }
    
    public void quickSortVal(Producto A[], int izq, int der) {
        int i = izq, j = der;
        Producto aux = null, piv = A[izq];
        while (i < j) {
            while (A[i].getRelativeVal()<= piv.getRelativeVal() && i < j)
                i++;// busca los menores del piv por izq
            while (A[j].getRelativeVal() > piv.getRelativeVal())
                j--;// busca los mayores de piv por der
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            } // intercambia
        }
        A[izq] = A[j];
        A[j] = piv;// mover al pivote al centro
        if (izq < j)
            quickSortVal(A, izq, j - 1);// ordena la lista de los menores del piv
        if (i < der)
            quickSortVal(A, i, der);// ordena los mayores del piv
    }
    
    public void quickSortID(Producto A[], int izq, int der) {
        int i = izq, j = der;
        Producto aux = null, piv = A[izq];
        while (i < j) {
            while (A[i].getId() <= piv.getId() && i < j)
                i++;// busca los menores del piv por izq
            while (A[j].getId() > piv.getId())
                j--;// busca los mayores de piv por der
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            } // intercambia
        }
        A[izq] = A[j];
        A[j] = piv;// mover al pivote al centro
        if (izq < j)
            quickSortID(A, izq, j - 1);// ordena la lista de los menores del piv
        if (i < der)
            quickSortID(A, i, der);// ordena los mayores del piv
    }
    
    public boolean lleno(){
        return tam == tope;
    }
    
    public int busquedaBinaria(int numeroBuscado) {
        quickSort(true);
        for (int i = 0, f = tope-1, medio = (i + f) / 2; i <= f; medio = (i + f) / 2) {
            if (numeroBuscado == P[medio].getId()) {
                return medio;
            } else if (numeroBuscado > P[medio].getId()) {
                i = medio + 1;
            } else {
                f = medio - 1;
            }
        }
        return -1;
    }

    public boolean add(Producto p) {
        if (lleno())
            return false;
        P[tope++] = p;
        return true;
    }

    public void delete(int i) {
        if (tope-1 == 0){
            P[i] = null;
        }
        else if (i == tope-1){
            P[i] = null;
        }            
        else if(P[i] != P[tope-1]){
            Producto aux = P[i];
            P[i] = P[tope-1];
            P[tope-1] = null;
        }
        tope--;
    }
    
    
}
