import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Administration> list = new ArrayList<>();
        Administration<String, Director> administration1 = new Administration<>("director", new Director("Talgat", "Omarov"));
        Administration<String, Maneger> administration2 = new Administration<>("meneger", new Maneger("Sayat", "Esenov"));
        list.add(administration1);
        list.add(administration2);
        for (Administration administration : list) {
            administration.getObj().voice();
        }
        ArrayList<Workers> list2 = new ArrayList<>();
        Workers<String,Consultant> worker1=new Workers<>("consultant",new Consultant("Esim","Galym"));
        list2.add(worker1);
        for (Workers workers : list2) {
           worker1.getObj().voice();
        }
        worker1.getObj().consulting();
        administration1.getObj().control();
        administration1.getObj().holdsAMeeting(administration2.getObj(),worker1.getObj() );
        administration1.getObj().causes(administration2.getObj(),worker1.getObj());
    }
}
