package algo;

import donnees.Imagette;

import java.io.IOException;

public class kNN extends AlgoClassification{
    public int k;
    public kNN(int k) throws IOException {
        super();
        this.k = k;
    }

    @Override
    public int predict(Imagette img) {
        int[] dist = new int[this.k];
        for (Imagette imagette : this.trainData.getImg()) {


        }

        return res;
    }
}
