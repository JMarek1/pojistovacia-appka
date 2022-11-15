import java.time.LocalDate;
public class Pojistenec {

    private LocalDate datumCas;
    private String meno;
    private String priezvisko;
    private int vek;
    private String telCislo;

    public Pojistenec( LocalDate datumCas,String meno, String priezvisko, int vek, String telCislo) {
        this.datumCas = datumCas;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
        this.telCislo = telCislo;
    }

    public LocalDate getDatumCas() {
        return datumCas;
    }

    public void setDatumCas(LocalDate datumCas) {
        this.datumCas = datumCas;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public String getTelCislo() {
        return telCislo;
    }

    public void setTelCislo(String telCislo) {
        this.telCislo = telCislo;
    }

    @Override
    public String toString() {
        return "Pojistenec: "+ meno +" "+ priezvisko +"," + " vek: "+ vek + " bol vytvorený dňa: "+ datumCas;
    }
}

