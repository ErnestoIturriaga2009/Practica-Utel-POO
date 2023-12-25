package TareaSemana6Utel;

public class Prenda {
    private int id;
    private String descripcion;
    private int existencia;
    private float precio;


    //CONSTRUCTOR


    public Prenda(int id, String descripcion, float precio, int existencia) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.existencia = existencia;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }


    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    //METODO PARA IMPRIMIR LA INFORMACION DE LA CLASE Y SUPERCLASES
    public void desplegarInformacionPrenda(){
        System.out.println("\nid " + getId());
        System.out.println("Descripicion " + getDescripcion());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Existencia: " + getExistencia());
    }
}
