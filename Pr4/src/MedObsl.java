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
import java.io.*;
import java.util.Scanner;
public class MedObsl extends MedObslyjivanie{
    public MedObsl(String thePolik,String theAdres,String theSurnameP,String
            theDiagnoz,String theDoljnost,String theSurnameV,String theNomerPol,String
                           theDataOsm) {
        super(thePolik, theAdres, theSurnameP, theDiagnoz, theDoljnost,
                theSurnameV, theNomerPol, theDataOsm);
    }
    @Override
    public String toString() {
        return "Мед. обслуживание пациентов " + getNamePolik()+"\n";
    }
    public void show(){
        try {
            File file = new File("MedObsl.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            System.out.println("Список Мед.Обслуживания пациентов: ");
            while (line != null) {
                System.out.println(line+"\n");
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String add() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ФИО пациента: ");
        String newPacient = in.nextLine();
        try (FileWriter writer = new FileWriter("MedObsl.txt", true)) {
            writer.write(newPacient);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return newPacient;
    }
}
