package hse.lab.neighbourhood.method;

import org.apache.commons.math3.linear.RealMatrix;

/**
 * @author vkuzn on 05.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        String path = "/small/cfp_small_1.txt";
        Parser parser = new Parser();

        RealMatrix matrix = parser.parser(path);

        GeneralVNS generalVNS = new GeneralVNS();
        generalVNS.generalVNS(matrix, 6, 10);
    }
}
