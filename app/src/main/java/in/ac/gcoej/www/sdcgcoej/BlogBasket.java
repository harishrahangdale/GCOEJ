package in.ac.gcoej.www.sdcgcoej;

public class BlogBasket {
    private String rcb, mi, name1, goals1, name2, goals2, status, winner;

    public BlogBasket(String rcb, String mi, String name1, String goals1,
                       String name2, String goals2, String status, String winner) {
        this.rcb = rcb;
        this.mi = mi;
        this.name1 = name1;
        this.goals1 = goals1;
        this.name2 = name2;
        this.goals2 = goals2;
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

    public String getGoals1() {
        return goals1;
    }

    public void setGoals1(String goals1) {
        this.goals1 = goals1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getGoals2() {
        return goals2;
    }

    public void setGoals2(String goals2) {
        this.goals2 = goals2;
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

    public BlogBasket() {

    }
}
