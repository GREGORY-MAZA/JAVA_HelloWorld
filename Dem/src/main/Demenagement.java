package main;

public class Demenagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cartonsAncienLocal = 34;
		int cartonsNouveauLocal = 0;
		int cartonsCamion = 0;
		
		while(cartonsAncienLocal != 0) {
			if (cartonsCamion < 9) {
				cartonsAncienLocal -= 1;
				cartonsCamion += 1;
			} else {
			System.out.println("Le camion vient de prendre " + cartonsCamion + " cartons de l'ancien local");
			cartonsNouveauLocal += cartonsCamion;
			cartonsCamion = 0;
			System.out.println("Le nouveau local contient " + cartonsNouveauLocal + " cartons");
			}
			
		}if (cartonsAncienLocal == 0) {
			cartonsNouveauLocal += cartonsCamion;
			cartonsCamion =0;
			System.out.println("Livraison de " +cartonsCamion+ " cartons restant");
			System.out.println("Le nouveau local est en bordel avec les " +cartonsNouveauLocal+ " cartons");
		}

	}

}
