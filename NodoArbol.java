
public class NodoArbol
{
    private int valor;
    public NodoArbol left,rigth;
    
    public NodoArbol(int valor){
        this.valor = valor;
        this.left = null;
        this.rigth = null;
    }
    
    public int getValor(){return valor;}
    
    public void Insertar(int val){
        if(val < this.valor){
            // Insert Left
            if(left == null){
                left = new NodoArbol(val);
            }
            else{
                left.Insertar(val);
            }
        } else
        {
            if(rigth == null){
                rigth = new NodoArbol(val);
            }else {
                rigth.Insertar(val);
            }
        }
    }
}
