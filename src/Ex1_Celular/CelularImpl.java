package Ex1_Celular;

import Ex1_Celular.Celular;

public class CelularImpl implements Celular {
    private String modelo;

    public CelularImpl(){
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void fazLigacao() {

    }

    @Override
    public void tiraFoto() {

    }
}
