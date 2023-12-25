package TareaSemana6Utel;

public class Calcetines extends Prenda {
    private char codigoColor;

    public Calcetines(int id, String descripcion, char codigoColor,
                      int existencia ) {

        super(id, descripcion,
                codigoColor, existencia);
        this.codigoColor = codigoColor;
    }

    public char getCodigoColor() {
        return codigoColor;
    }

    public void setCodigoColor(char codigoColor) {
        this.codigoColor = codigoColor;
    }


    public void desplegarInfoCalcetines(){
        System.out.println("id de los calcetines: " + getId());
        System.out.println("Descripicion calcetines: " + getDescripcion());
        System.out.println("Codigo de color de los calcetines: " + getCodigoColor());
        System.out.println("Existencia: " + getExistencia());
        System.out.println("---------------------------");

    }
}
