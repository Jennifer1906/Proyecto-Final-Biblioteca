/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Estudiante;

/**
 *
 * @author quizh
 */
public class ListaSimpleEstudiante {
    class Nodo {
        // Variable en la cual se va a guardar el estudiante.

        private Estudiante estudiante;
        // Variable para enlazar los nodos.
        private Nodo siguiente;

        /**
         * Constructor que inicializamos el estudiante de las variables.
         */
        public void Nodo() {
            this.estudiante = null;
            this.siguiente = null;
        }

        // Métodos get y set para los atributos.
        public Estudiante getEstudiante() {
            return estudiante;
        }

        public void setEstudiante(Estudiante estudiante) {
            this.estudiante = estudiante;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }
    // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
    private Nodo inicio;
    // Variable para registrar el tamaño de la lista.
    private int tamanio;

    /**
     * Constructor por defecto.
     */
    public void Lista() {
        inicio = null;
        tamanio = 0;
    }

    /**
     * Consulta si la lista esta vacia.
     *
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia() {
        return inicio == null;
    }

    /**
     * Consulta cuantos elementos (nodos) tiene la lista.
     *
     * @return numero entero entre [0,n] donde n es el numero de elementos que
     * contenga la lista.
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * Agrega un nuevo nodo al final de la lista.
     *
     * @param estudiante a agregar.
     */
    public void agregarAlFinal(Estudiante estudiante) {
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al estudiante al nodo.
        nuevo.setEstudiante(estudiante);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
            // Caso contrario recorre la lista hasta llegar al ultimo nodo
            //y agrega el nuevo.
        } else {
            // Crea ua copia de la lista.
            Nodo aux = inicio;
            // Recorre la lista hasta llegar al ultimo nodo.
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setSiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
        tamanio++;
    }

    /**
     * Agrega un nuevo nodo al inicio de la lista.
     *
     * @param estudiante a agregar.
     */
    public void agregarAlInicio(Estudiante estudiante) {
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al estudiante al nodo.
        nuevo.setEstudiante(estudiante);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
            // Caso contrario va agregando los nodos al inicio de la lista.
        } else {
            // Une el nuevo nodo con la lista existente.
            nuevo.setSiguiente(inicio);
            // Renombra al nuevo nodo como el inicio de la lista.
            inicio = nuevo;
        }
        // Incrementa el contador de tamaño de la lista.
        tamanio++;
        //System.out.println("llego "+tamanio);
    }

    /**
     * Inserta un nuevo nodo despues de otro, ubicado por el estudiante que
     * contiene.
     *
     * @param referencia estudiante del nodo anterios al nuevo nodo a insertar.
     * @param estudiante del nodo a insertar.
     */
    /*public void insertarPorReferencia(int referencia, Estudiante estudiante) {
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al estudiante al nodo.
        nuevo.setEstudiante(estudiante);
        // Verifica si la lista contiene elementos
        if (!esVacia()) {
            // Consulta si el estudiante existe en la lista.
            if (buscar(referencia)) {
                // Crea ua copia de la lista.
                Nodo aux = inicio;
                // Recorre la lista hasta llegar al nodo de referencia.
                while (aux.getEstudiante() != referencia) {
                    aux = aux.getSiguiente();
                }
                // Crea un respaldo de la continuación de la lista.
                Nodo siguiente = aux.getSiguiente();
                // Enlaza el nuevo nodo despues del nodo de referencia.
                aux.setSiguiente(nuevo);
                // Une la continuacion de la lista al nuevo nodo.
                nuevo.setSiguiente(siguiente);

                // Incrementa el contador de tamaño de la lista.
                tamanio++;
            }
        }
    }*/
    /**
     * Busca si existe un estudiante en la lista.
     *
     * @param referencia estudiante a buscar.
     * @return true si existe el estudiante en la lista.
     */
    public Estudiante buscar(Estudiante referencia) {
        // Crea una copia de la lista.
        Nodo aux = inicio;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while (aux != null) {
            // Consulta si el estudiante del nodo es igual al de referencia.
            if (referencia.getCedula().equals(aux.getEstudiante().getCedula())) {
                return aux.getEstudiante();
            } else {
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el resultado de la bandera.
        return null;
    }

    /**
     * Actualiza el estudiante de un nodo que se encuentre en la lista ubicado
     * por un estudiante de referencia.
     *
     * @param referencia estudiante del nodo el cual se desea actualizar.
     * @param estudiante nuevo estudiante para el nodo.
     */
    public boolean editarPorReferencia(Estudiante estudiante) {
        // Consulta si el estudiante existe en la lista.
        // Crea ua copia de la lista.
        // Recorre la lista hasta llegar al nodo de referencia.
        if (!esVacia()) {
            Nodo nodo = inicio;
            do {
                if (estudiante.getCedula().equals(nodo.estudiante.getCedula())) {
                    nodo.estudiante.setNombres(estudiante.getNombres());
                    nodo.estudiante.setApellidos(estudiante.getApellidos());
                    nodo.estudiante.setDireccion(estudiante.getDireccion());
                    nodo.estudiante.setTelefono(estudiante.getTelefono());
                    nodo.estudiante.setEmail(estudiante.getEmail());
                    nodo.estudiante.setCiclo(estudiante.getCiclo());
                    return true;
                }
                nodo = nodo.getSiguiente();
            } while (nodo != inicio);
        }
        return false;
    }

    /**
     * Elimina un nodo que se encuentre en la lista ubicado por un estudiante de
     * referencia.
     *
     * @param referencia estudiante del nodo que se desea eliminar.
     */
    public void removerPorReferencia(Estudiante referencia) {
        // Consulta si el estudiante de referencia existe en la lista.
        // Consulta si el nodo a eliminar es el pirmero
        if (inicio.getEstudiante().getCedula() == referencia.getCedula()) {
            // El primer nodo apunta al siguiente.
            inicio = inicio.getSiguiente();
        } else {
            // Crea ua copia de la lista.
            Nodo aux = inicio;
            // Recorre la lista hasta llegar al nodo anterior 
            // al de referencia.
            while (aux.getSiguiente().getEstudiante().getCedula() != referencia.getCedula()) {
                aux = aux.getSiguiente();
            }
            // Guarda el nodo siguiente del nodo a eliminar.
            Nodo siguiente = aux.getSiguiente().getSiguiente();
            // Enlaza el nodo anterior al de eliminar con el 
            // sguiente despues de el.
            aux.setSiguiente(siguiente);
        }
        // Disminuye el contador de tamaño de la lista.
        tamanio--;
    }

    /**
     * Elimina la lista
     */
    public void eliminar() {
        // Elimina el estudiante y la referencia a los demas nodos.
        inicio = null;
        // Reinicia el contador de tamaño de la lista a 0.
        tamanio = 0;
    }

    /**
     * Mustra en pantalla los elementos de la lista.
     */
    public List<Estudiante> listar() {
        List<Estudiante> listEstu = new ArrayList<>();
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            Nodo aux = inicio;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el estudiante del nodo.
                listEstu.add(aux.getEstudiante());
                //System.out.print(i + ".[ " + aux.getEstudiante() + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
            }
            return listEstu;
        }
        return null;
    }
}
