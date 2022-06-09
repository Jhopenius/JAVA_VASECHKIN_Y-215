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
public class Deti extends Vakcina {
    String svidetelstvo;
    String pol;
    int vozrast;
    public Deti(String thePolik, String theAdres, String theSurnameP, String
            theDoljnost, String theSurnameV,String theDiagnoz, String theNomerPol, String
                        theDataOsm, String theVid, int theGod, String thePeriod, String theRezyltat,
                String theNameVac, String theDataVac, String ThePeriodDo, String
                        theSvidetelstvo, String thePol, int TheVozrast) {
        super(thePolik, theAdres, theSurnameP, theDiagnoz, theDoljnost,
                theSurnameV, theNomerPol, theDataOsm, theVid, theGod, thePeriod, theRezyltat,
                theNameVac, theDataVac, ThePeriodDo);
        this.svidetelstvo = theSvidetelstvo;
        this.pol = thePol;
        this.vozrast = TheVozrast;
    }
    public String getSvidetelstvo() {
        return svidetelstvo;
    }
    public String getPol() {
        return pol;
    }
    public int getVozrast() {
        return vozrast;
    }
    public void setSvidetelstvo(String theSvidetelstvo) {
        this.svidetelstvo = theSvidetelstvo;
    }
    public void setPol(String thePol) {
        this.pol = thePol;
    }
    public void setVozrast(int theVozrast) {
        this.vozrast = theVozrast;
    }
    @Override
    public String toString() {
        return "мед.обсуживание детей и подростков в поликлинике = " +
                getNamePolik() + '\n' +
                "Свидетельство о рождении ребенка = " + svidetelstvo + '\n' +
                "Пол = " + pol + '\n' +
                "Возраст = " + vozrast + '\n';
    }
}