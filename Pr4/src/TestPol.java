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
public class TestPol {
    public static void main (String[] args){
        //Создание Библиотеки и её запаса книг
        MedObslyjivanie pol1 = new MedObslyjivanie("5 Поликлиника", "ул. Ленина, 34", "Васечкин В.М.,","Заведующий отделением","Иванов А.Н.","Вывих", "4887699774000086", "22.08.2021");
        System.out.println(pol1);
        MedObsl Pol11 = new MedObsl(pol1.getNamePolik(), pol1.getAdres(),
                pol1.getSurnameP(),pol1.getDoljnost(),
                pol1.getSurnameV(),pol1.getDiagnoz(),pol1.getNomerPol(),pol1.getDataOsm());
        System.out.println(Pol11);
        Osmotr pol12 = new Osmotr(pol1.getNamePolik(), pol1.getAdres(),
                pol1.getSurnameP(),pol1.getDoljnost(),
                pol1.getSurnameV(),pol1.getDiagnoz(),pol1.getNomerPol(),pol1.getDataOsm(),
                "амбулаторный",2021,"Полгода","Здоров");
        System.out.println(pol12);
        Vakcina vac1 = new Vakcina(pol1.getNamePolik(), pol1.getAdres(),
                pol1.getSurnameP(),pol1.getDoljnost(),pol1.getDiagnoz(),pol1.getSurnameV(),
                pol1.getNomerPol(),pol1.getDataOsm(),

                pol12.getVid(),pol12.getGod(),pol12.getPeriod(),pol12.getRezyltat(),
                "Спутник V", "04.07.2021","Полгода");
        System.out.println(vac1);
        Deti pol13= new Deti(pol1.getNamePolik(), pol1.getAdres(),
                pol1.getSurnameP(),pol1.getDiagnoz(),pol1.getDoljnost(), pol1.getSurnameV(),
                pol1.getNomerPol(),pol1.getDataOsm(),

                pol12.getVid(),pol12.getGod(),pol12.getPeriod(),pol12.getRezyltat(),vac1.getNameVac(),vac1.getDataVac(),vac1.getPeriodDo(),
                "Fwo-823654","Ж",15);
        System.out.println(pol13);
        String newPacient = Pol11.add();
        Pol11.show();
    }
}