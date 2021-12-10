///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author Angel
// */
//class ListaProducto {
//
//    /*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
//     */
//
//    /**
//     *
//     * @author Angel
//     */
//    public class ListaDobleProducto {
//
//        private NodoP inicio, fin;
//
//        public ListaDobleProducto() {
//            inicio = fin = null;
//        }
//
//        public void agregar(float entero) {
//            NodoP nuevo = new NodoP(entero);
//            if (inicio == null) {
//                inicio = fin = nuevo;
//            } else {
//                fin.setSig(nuevo);
//                nuevo.setAnt(fin);
//                fin = nuevo;
//            }
//        }
//        
//        public boolean vacia() {
//            return inicio == null;
//        }
//        
//        public NodoP buscar(int id){
//            for (NodoP i = inicio; i.getSig() != null; i = i.getSig()) {
//                if (i.getInfo().getID() == id)
//                    return i;
//            }
//            return null;
//        }
//
//        public boolean borrar(Producto busqueda) {
//            if (busqueda == null) {
//                return false;
//            }
//            if (busqueda == inicio && n == fin) {
//                inicio = fin = null;
//            } else if (n == inicio) {
//                fin.setSig(inicio.getSig());
//            } else if (n == fin) {
//                fin.getAnt().setSig(inicio);
//            } else {
//                n.getAnt().setSig(n.getSig());
//                n.getSig().setAnt(n.getAnt());
//                return true;
//            }
//            inicio.getSig().setAnt(fin);
//            inicio = inicio.getSig();
//            return true;
//        }
//    }
//}
