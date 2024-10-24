package Genetico;

public class ZeroMax implements Problema {

    @Override
    public double evalua(Cromosoma cromosoma) {
        int suma = 0;
        for (int i = 0; i < cromosoma.getLongitud(); i++) {
            if (cromosoma.getGen(i) == 0) {
                suma++;
            }
        }
        return suma; // La aptitud es la suma de los genes (número de 0's)
    }

}
