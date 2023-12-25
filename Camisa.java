package TareaSemana6Utel;

public class Camisa extends Prenda{
    private char codigoColor;
    private String talla;

    public Camisa(int id, String descripcion, char codigoColor, String talla, float precio, int existencia) {

        super(id,descripcion, precio, existencia);

        this.codigoColor = codigoColor;
        this.talla = talla;
    }

    public char getCodigoColor() {
        return codigoColor;
    }

    public void setCodigoColor(char codigoColor) {
        this.codigoColor = codigoColor;
    }


    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    public void desplegarInfoCamisa(){
        System.out.println("id de la camisa: " + getId());
        System.out.println("Descripicion de la camisa: " + getDescripcion());
        System.out.println("Codigo de color de la camisa: " + getCodigoColor());
        System.out.println("Talla de la camisa: " + getTalla());
        System.out.println("Precio de la camisa: $" + getPrecio());
        System.out.println("Cantidad en existencia de camisas: " + getExistencia());
        System.out.println("---------------------------");
    }

}
