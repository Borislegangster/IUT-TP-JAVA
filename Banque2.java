public class Banque2{
    public static void main(String[] args) {
        //Données pour les comptes privés (taux d'intérêt):
        double taux1 = 0.01;

        //Données pour les comptes d'épargne (taux d'intérêt):
        double taux2 = 0.02;

        //données pour le prmier client (nom et ville):
        String nom1 = "Pedro";
        String ville1 = "Geneve";

        //Données pour le compte privé du prmier client (solde):
        double solde1PremierClient = 1000.0;

        //Données pour le compte d'épargne du prmier client (solde):
        double solde2PremierClient = 2000.0;

        //données pour le deuxième client (nom et ville):
        String nom2 = "Alexandra";
        String ville2 = "Lausanne";

        //données pour le compte privé du deuxième client (solde):
        double solde1DeuxiemeClient = 3000.0;

        //données pour le compte d'épargne du deuxième client (solde):
        double solde2DeuxiemeClient = 4000.0;

        //Afficher les données du premier client:
        afficherClient(nom1, ville1, solde1PremierClient, solde2PremierClient);

        //Afficher les données du premier client:
        afficherClient(nom2, ville2, solde1PremierClient, solde2PremierClient);

        //Bouclement du compte privé du premier client:
        solde1PremierClient = bouclerCompte(solde1PremierClient, taux1);

        //Bouclement du compte d'épargne du premier client:
        solde2PremierClient = bouclerCompte(solde2PremierClient, taux2);

        //Bouclement du compte privé du deuxième client:
        solde1DeuxiemeClient = bouclerCompte(solde1DeuxiemeClient, taux1);

        //Bouclement du compte d'épargne du deuxième client:
        solde2DeuxiemeClient = bouclerCompte(solde2DeuxiemeClient, taux2);

        //Afficher les données du premier client:
        afficherClient(nom1, ville1, solde1PremierClient, solde2PremierClient);

        //Afficher les données du deuxième client:
        afficherClient(nom2, ville2, solde1DeuxiemeClient, solde2DeuxiemeClient);
    }

    static void afficherClient(String nom, String ville,double solde1, double solde2){

        //cette méthode affiche les données du client
        System.out.println("Client" + nom + "de" + ville);
        System.out.println("Compte prive: " + solde1 + "francs");
        System.out.println("Compte d'epargne:" + solde2 + "francs");
    }

    static double bouclerCompte(double solde, double taux){
        //cette méthode ajoute les intérêts au solde
        double interets = taux * solde;
        double nouveauSolde = solde + interets;
        return nouveauSolde;
    }
}