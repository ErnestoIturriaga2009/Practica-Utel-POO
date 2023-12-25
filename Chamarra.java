package TareaSemana6Utel;

public class Chamarra extends Prenda{

    private byte talla;
        private String material;

        public Chamarra(int id, String descripcion, float precio, int existencia,
                        int talla, String material) {

            super(id, descripcion,
                    precio ,existencia);

            this.talla = (byte) talla;
            this.material = material;
        }

        public byte getTalla() {
            return talla;
        }

        public void setTalla(byte talla) {
            this.talla = talla;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

    public void desplegarInfoChamarra(){
        System.out.println("id de la chamarra: " + getId());
        System.out.println("Descripicion de la chamarra: " + getDescripcion());
        System.out.println("Precio de la chamarra: $" + getPrecio());
        System.out.println("Existencia de chamarras: " + getExistencia());
        System.out.println("Talla de la chamarra: " + getTalla());
        System.out.println("Material de la chamarra: " + getMaterial());
        System.out.println("---------------------------");
    }
}
