import algo.AlgoClassification;
import algo.*;
import donnees.ChargementData;
import donnees.Donnees;
import donnees.Imagette;

import java.io.IOException;

public class Statistiques {
    public static void main(String[] args) throws IOException {
        AlgoClassification algo = new kNN(10);
        Donnees testData = new ChargementData("data/t10k-images.idx3-ubyte", "data/t10k-labels.idx1-ubyte", 100).donnees;
        int nbCorrect = 0;
        for (Imagette img : testData.getImg()) {
            if (algo.predict(img) == img.getLabel()) {
                nbCorrect++;
            }
        }
        System.out.println("Pourcentage de reussite : " + (nbCorrect * 100 / testData.getImg().size()) + "%");
        System.out.println("Nombre de reussite : " + nbCorrect);
        System.out.println("Nombre d'echec : " + (testData.getImg().size() - nbCorrect));
    }
}
