//Luis Ernesto Cardona Iturriga
//010371762
//13 de febrero del 2023

package TareaSemana6Utel;

public class LuisErnesto {
    public static void main(String[] args) {

        Camisa camisa = new Camisa(15, "Camisa Modelo Boston", 'W', "XL", 89.99f, 75);
        Pantalones pantalones = new Pantalones(7, "Pantalones de gabardina", 57.96f, 55, 21, 34);
        Chamarra chamarra = new Chamarra(9, "Chamarra estilo cazadora", 1899.98f, 20, 38, "Piel");
        Calcetines calcetines = new Calcetines(3, "Calcetin Corto", 'N', 140);
        Prenda prenda = new Prenda( 1, "XXXXXXX", 0.0f, 0);

        camisa.desplegarInfoCamisa();
        pantalones.desplegarInfoPantalon();
        chamarra.desplegarInfoChamarra();
        calcetines.desplegarInfoCalcetines();
        prenda.desplegarInformacionPrenda();

    }
}