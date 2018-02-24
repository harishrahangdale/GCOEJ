package in.ac.gcoej.www.sdcgcoej;

public class Blog {
    private String rcb, mi, name1, runs1, wickets1, overs1, name2, runs2, wickets2, overs2, status, winner;

    public Blog(String rcb, String mi, String name1, String runs1,
                String wickets1, String overs1, String name2, String runs2, String wickets2, String overs2, String status, String winner) {
        this.rcb = rcb;
        this.mi = mi;
        this.name1 = name1;
        this.runs1 = runs1;
        this.wickets1 = wickets1;
        this.overs1 = overs1;
        this.name2 = name2;
        this.runs2 = runs2;
        this.wickets2 = wickets2;
        this.overs2 = overs2;
        this.status = status;
        this.winner = winner;
    }

    public String getRcb() {
        return rcb;
    }

    public void setRcb(String rcb) {
        this.rcb = rcb;
    }

    public String getMi() {
        return mi;
    }

    public void setMi(String mi) {
        this.mi = mi;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getRuns1() {
        return runs1;
    }

    public void setRuns1(String runs1) {
        this.runs1 = runs1;
    }

    public String getWickets1() {
        return wickets1;
    }

    public void setWickets1(String wickets1) {
        this.wickets1 = wickets1;
    }

    public String getOvers1() {
        return overs1;
    }

    public void setOvers1(String overs1) {
        this.overs1 = overs1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getRuns2() {
        return runs2;
    }

    public void setRuns2(String runs2) {
        this.runs2 = runs2;
    }

    public String getWickets2() {
        return wickets2;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public void setWickets2(String wickets2) {
        this.wickets2 = wickets2;

    }

    public String getOvers2() {
        return overs2;
    }

    public void setOvers2(String overs2) {
        this.overs2 = overs2;
    }

    public Blog() {

    }
}
