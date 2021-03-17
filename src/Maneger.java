public class Maneger extends Employees implements Consultantlmpl, Manegerlmpl {
    public Maneger(String name, String surName) {
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

    @Override
    public void organizes(Director director, Maneger maneger) {
        System.out.println(getName() +" организует связи с деловыми партнерами, систему сбора необходимой информации для расширения внешних связей");
    }

    @Override
    public void analyzes(Director director, Maneger maneger) {
        System.out.println(getName()+ " анализирует и решает организационно-технические, " +
                "экономические, кадровые и социально-психологические проблемы в целях стимулирования");
    }

    @Override
    public void control() {
        System.out.println(getName() + " Контралирует  решению задач консультантов по различным вопросам");
    }

}