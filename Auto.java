public class Auto {
    
    private int cilindrata;
    private String targa;
    private String marca;
    private String modello;

    Auto(int cilindrata, String targa, String marca,String modello){

        this.setCilindrata(cilindrata);
        this.setTarga(targa);
        this.setMarca(marca);
        this.setMarca(modello);

    }
    //funzioni get per accedere alle variabili
    public int getCilindrata(){
        return cilindrata;
    }

    public String getTarga(){
        return targa;
    }

    public String getModello(){
        return modello;
    }

    public String getMarca(){
        return marca;
    }


    //fine

    //funzioni set per la costruttrice o cambiare valori nel main tramite funzioni
    public void setCilindrata(int cilindrata){
        this.cilindrata = cilindrata;
    }

    public void setTarga(String targa){
        this.targa = targa;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModello(String modello){
        this.modello = modello;
    }
}
