package homework_007;

public class Pacient {
    public int plan;
    public Doctor doc;

    public Pacient(int plan) {
        this.plan = plan;
    }

    public int getPlan() {
        return plan;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }
}