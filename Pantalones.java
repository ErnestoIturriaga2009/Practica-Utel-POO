package TareaSemana6Utel;

public class Pantalones extends Prenda{
        //byte tiene un rango de -128 to 127 bytes
        private byte talla;
        private byte largo;

        public Pantalones(int id, String descripcion, float precio, int existencia, int talla, int largo) {

            super(id, descripcion,
                    precio, existencia);

            this.talla = (byte) talla;
            this.largo = (byte) largo;
        }

        public byte getTalla() {
            return talla;
        }

        public void setTalla(byte talla) {
            this.talla = talla;
        }

        public byte getLargo() {
            return largo;
        }

        public void setLargo(byte largo) {
            this.largo = largo;
        }
        public void desplegarInfoPantalon(){
            System.out.println("id: " + getId());
            System.out.println("Descripicion: " + getDescripcion());
            System.out.println("Precio: $" + getPrecio());
            System.out.println("Existencia: " + getExistencia());
            System.out.println("Talla del pantalon: " + getTalla());
            System.out.println("El largo de los pantalones es: " + getLargo());
            System.out.println("---------------------------");
        }
    }
