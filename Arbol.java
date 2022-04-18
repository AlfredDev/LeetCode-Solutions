
public class Arbol
{
    NodoArbol root;

    public Arbol(){
        this.root = null;
    }

    public void Insertar(int val){
        if(root == null){
            root = new NodoArbol(val);
            return;
        }
        root.Insertar(val);
    }  

    public void Preoorden(){
        Preorden(root);
    }

    public void Preorden(NodoArbol nodo){
        if(nodo == null) return;
        System.out.println(nodo.getValor());
        Preorden(nodo.left);
        Preorden(nodo.rigth);
    }

    public void Inorden(){
        Preorden(root);
    }

    public void Inorden(NodoArbol nodo){
        if(nodo == null) return;
        Preorden(nodo.rigth);
        System.out.println(nodo.getValor());
        Preorden(nodo.left);
    }

    public void PosOrden(){
        Preorden(root);
    }

    public void PosOrden(NodoArbol nodo){
        if(nodo == null) return;
        Preorden(nodo.left);
        Preorden(nodo.rigth);
        System.out.println(nodo.getValor());

    }
}
