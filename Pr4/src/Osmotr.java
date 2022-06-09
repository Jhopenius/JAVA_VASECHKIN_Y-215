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
public class Osmotr extends MedObslyjivanie {
    private String vid;
    private int god;
    private String period;
    private String rezyltat;
    public Osmotr(String thePolik,String theAdres,String theSurnameP,String
            theDiagnoz,String theDoljnost,String theSurnameV,String theNomerPol,String
                          theDataOsm, String theVid, int theGod, String thePeriod, String theRezyltat){
        super(thePolik, theAdres, theSurnameP, theDiagnoz, theDoljnost,
                theSurnameV, theNomerPol, theDataOsm);
        this.vid = theVid;
        this.god = theGod;
        this.period = thePeriod;
        this.rezyltat = theRezyltat;
    }
    public String getVid() {
        return vid;
    }
    public int getGod() {
        return god;
    }
    public String getPeriod() {
        return period;
    }
    public String getRezyltat() {
        return rezyltat;
    }
    public void setVid(String theVid) {
        this.vid = theVid;
    }
    public void setGod(int theGod) {
        this.god = theGod;
    }
    public void setPeriod(String thePeriod) {
        this.period = thePeriod;
    }
    public void setRezyltat(String theRetaliate) {
        this.rezyltat = theRetaliate ;
    }
    @Override
    public String toString() {
        return "Поликлиника, в которой проходил осмотр = " + getNamePolik() +
                '\n' +
                "Вид осмотра = " + vid + '\n' +
                "Год = " + god + '\n' +
                "Период действия = " + period + '\n' +
                "Результат = " + rezyltat + '\n';
    }
}