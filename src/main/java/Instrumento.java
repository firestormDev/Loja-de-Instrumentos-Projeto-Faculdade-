//Luiz Guilherme Veloso Tinti RA 2101190
public class Instrumento {
    private int id;
    private int preço;
    private String marca;
    private String tipo;
    
    public Instrumento(){
        id = 0;
        marca = "";
        tipo = ""; 
        preço = 0;
        
    }

   

    public Instrumento(int cod, String marca, String tipo, int preço) {
        this.id = cod;
        this.preço = preço;
        this.marca = marca;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }
 
        
    
    
    
}
