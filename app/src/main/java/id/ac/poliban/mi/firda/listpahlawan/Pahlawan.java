package id.ac.poliban.mi.firda.listpahlawan;

public class Pahlawan {
    private String img_hero;
    private String pahlawanName;
    private String pahlawanDesc;

    public Pahlawan(String img_hero, String pahlawanName, String pahlawanDesc) {
        this.img_hero = img_hero;
        this.pahlawanName = pahlawanName;
        this.pahlawanDesc = pahlawanDesc;

    }

    public String getImg_hero() {
        return img_hero;
    }

    public void setImg_hero(String img_hero) {
        this.img_hero = img_hero;
    }

    public String getPahlawanName() {
        return pahlawanName;
    }

    public void setPahlawanName(String pahlawanName) {
        this.pahlawanName = pahlawanName;
    }

    public String getPahlawanDesc() {
        return pahlawanDesc;
    }

    public void setPahlawanDesc(String pahlawanDesc) {
        this.pahlawanDesc = pahlawanDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s", getPahlawanName());
    }
}

