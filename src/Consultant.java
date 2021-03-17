public class Consultant extends Employees implements Consultantlmpl {
    public Consultant(String name, String surName) {
        super(name, surName);
    }

    @Override
    public void voice() {
        super.voice();
    }
    @Override
    public void consulting() {
        System.out.println(getName() + " консультирует клиентов, оформляет нужные документы");
    }

}