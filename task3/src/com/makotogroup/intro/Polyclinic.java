package com.makotogroup.intro;
public class Polyclinic {
    private String name;
    private String adress;
    private String fam;
    private int nomer1;
    private int nomer2;
    private int nomer3;
    private int nomer4;
    private String dataosm;
    private String famdoc;
    private String dolzhdoc;
    private String diagnoz;
    public Polyclinic( String name, String adress,String fam, int nomer1,int nomer2,int nomer3,int nomer4, String dataosm, String famdoc,String dolzhdoc,String diagnoz) {
        this.name = name;
        this.adress = adress;
        this.fam = fam;
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
        this.nomer3 = nomer3;
        this.nomer4 = nomer4;
        this.dataosm = dataosm;
        this.famdoc = famdoc;
        this.dolzhdoc = dolzhdoc;
        this.diagnoz = diagnoz;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getadress() {
        return adress;
    }
    public void setadress(String adress) {
        this.adress = adress;
    }
    public String getfam() {
        return fam;
    }
    public void setid(String fam) {
        this.fam = fam;
    }
    public int getnomer1() {
        return nomer1;
    }
    public void setnomer1(int nomer1) {
        this.nomer1 = nomer1;
    }
    public int getnomer2() {
        return nomer2;
    }
    public void setnomer2(int nomer2) {
        this.nomer2 = nomer2;
    }
    public int getnomer3() {
        return nomer3;
    }
    public void setnomer3(int nomer3) {
        this.nomer3 = nomer3;
    }
    public int getnomer4() {
        return nomer4;
    }
    public void setnomer4(int nomer4) {
        this.nomer4 = nomer4;
    }
    public String getdataosm() {
        return dataosm;
    }
    public void setdataosm(String dataosm) {
        this.dataosm = dataosm;
    }
    public String getfamdoc() {
        return famdoc;
    }
    public void setfamdoc(String famdoc) {
        this.famdoc = famdoc;
    }
    public String getdolzhdoc() {
        return dolzhdoc;
    }
    public void setdolzhdoc(String dolzhdoc) {
        this.dolzhdoc = dolzhdoc;
    }
    public String getdiagnoz() {
        return diagnoz;
    }
    public void setdiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }

    public String toString()
    {
        return " Nazvanie policlinici: " + name + ";\n Adress policlinici: "+adress+";\n Familiya pocienta: "+fam+";\n Nomer polisa: " + nomer1+" "+nomer2+" "+nomer3+" "+nomer4+ ";\n Data osmotra: "+dataosm+";\n Familiya vracha: "+famdoc+";\n Dolzhnost vracha: "+dolzhdoc+";\n Diagnoz: "+diagnoz+".";
    }
}

