package ru.vsuet.kindergarden.domain;


public class Kid {

    private String FIO;
    private Genders gender;
    private String age;

    public Kid(String FIO, Genders gender, String age){
        this.FIO = FIO;
        this.gender = gender;
        this.age = age;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public Genders getGender() {
        return gender;
    }

    public void setGender(Genders gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {this.age = age;}

    @Override
    public String toString() {
        return "Kid:" + '\n' +
                "FIO : " + FIO + ", Gender : " + gender + ", Age : " + age;
    }
}