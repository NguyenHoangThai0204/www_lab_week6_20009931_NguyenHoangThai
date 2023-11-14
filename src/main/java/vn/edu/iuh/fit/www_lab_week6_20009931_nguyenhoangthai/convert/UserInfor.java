package vn.edu.iuh.fit.www_lab_week6_20009931_nguyenhoangthai.convert;

public class UserInfor {
    private String ufname;
    private String ulname;
    private String umname;
    private String usdt;
    private String umail;
    private String upass;
    private String upassAgain;

    public String getUfname() {
        return ufname;
    }

    @Override
    public String toString() {
        return "UserInfor{" +
                "ufname='" + ufname + '\'' +
                ", ulname='" + ulname + '\'' +
                ", umname='" + umname + '\'' +
                ", usdt='" + usdt + '\'' +
                ", umail='" + umail + '\'' +
                ", upass='" + upass + '\'' +
                ", upassAgain='" + upassAgain + '\'' +
                '}';
    }

    public void setUfname(String ufname) {
        this.ufname = ufname;
    }

    public String getUlname() {
        return ulname;
    }

    public void setUlname(String ulname) {
        this.ulname = ulname;
    }

    public String getUmname() {
        return umname;
    }

    public void setUmname(String umname) {
        this.umname = umname;
    }

    public String getUsdt() {
        return usdt;
    }

    public void setUsdt(String usdt) {
        this.usdt = usdt;
    }

    public String getUmail() {
        return umail;
    }

    public void setUmail(String umail) {
        this.umail = umail;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUpassAgain() {
        return upassAgain;
    }

    public void setUpassAgain(String upassAgain) {
        this.upassAgain = upassAgain;
    }

    public UserInfor(String ufname, String ulname, String umname, String usdt, String umail, String upass, String upassAgain) {
        this.ufname = ufname;
        this.ulname = ulname;
        this.umname = umname;
        this.usdt = usdt;
        this.umail = umail;
        this.upass = upass;
        this.upassAgain = upassAgain;
    }

    public UserInfor() {
    }

}
