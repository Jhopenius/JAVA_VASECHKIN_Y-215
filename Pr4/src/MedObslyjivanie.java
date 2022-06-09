/*
Медицинское обслуживание пациентов. Создать родительский
класс «МедОбслуживание» (название поликлиники, адрес поликлиники, фамилия пациента,
номер полиса, лата осмотра, фамилия врача, должность врача, диагноз) и дочерние классы:
— «планово-предупредительный осмотр». (вид (амбулаторный/стационарный), год проведения, период действия, результат);
— «вакцинация» (название вакцины, дата вакцинации, период действия);
— медобсуживание детей и подростков» (свидетельство о рождении, пол,возраст ребенка).
Реализовать класс для хранения списка медицинского обслуживания пациентов
с методом добавления и методом печати списка.
 */
public class MedObslyjivanie {
    private String namePolik;
    private String Adres;
    private String SurnameP;
    private String SurnameV;
    private String Doljnost;
    private String Diagnoz;
    private String dataOsm;
    private String nomerPol;

    public MedObslyjivanie(String thePolik, String theAdres, String
            theSurnameP, String theDoljnost, String theSurnameV, String theDiagnoz, String
                                   theNomerPol, String theDataOsm) {
        this.namePolik = thePolik;
        this.Adres = theAdres;
        this.SurnameP = theSurnameP;
        this.nomerPol = theNomerPol;
        this.dataOsm = theDataOsm;
        this.SurnameV = theSurnameV;
        this.Diagnoz = theDiagnoz;
        this.Doljnost = theDoljnost;
    }

    public String getNamePolik() {
        return namePolik;
    }

    public String getAdres() {
        return Adres;
    }

    public String getSurnameP() {
        return SurnameP;
    }

    public String getSurnameV() {
        return SurnameV;
    }

    public String getDoljnost() {
        return Doljnost;
    }

    public String getDiagnoz() {
        return Diagnoz;
    }

    public String getNomerPol() {
        return nomerPol;
    }

    public String getDataOsm() {
        return dataOsm;
    }

    public void setNamePolik(String theNameL) {
        this.namePolik = theNameL;
    }

    public void setAdres(String theAdres) {
        this.Adres = theAdres;
    }

    public void setSurnameP(String theSurnameP) {
        this.SurnameP = theSurnameP;
    }

    public void setDoljnost(String Doljnost) {
        this.Doljnost = Doljnost;
    }

    public void setSurnameV(String SurnameV) {
        this.SurnameV = SurnameV;
    }

    public void setDiagnoz(String Diagnoz) {
        this.Diagnoz = Diagnoz;
    }

    public void setNomerPol(String TheNomerPol) {
        this.nomerPol = TheNomerPol;
    }

    public void setDataOms(String theDataOsm) {
        this.dataOsm = theDataOsm;
    }

    @Override
    public String toString() {
        return "Название поликлиники:" + namePolik + "\n" + " Адрес поликлиники:"
                + Adres + "\n" + " Фамилия пациента:" + SurnameP + "\n" + " Номер полиса: " + nomerPol
                + "\n" + " Дата осмотра:" + dataOsm + "\n" + " Фамилия врача:"
                + SurnameV + "\n" + " Должность врача:"
                + Doljnost + "\n" + " Диагноз:" + Diagnoz;
    }
}