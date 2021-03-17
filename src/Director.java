public class Director extends Employees implements Directorlmpl, Manegerlmpl {
    public Director(String name, String surName) {
        super(name, surName);
    }
    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public void issuesAnOrder() {
        System.out.println("Директор издает Приказ");
    }

    @Override
    public void holdsAMeeting(Maneger maneger, Consultant consultant) {
        causes(maneger, consultant);
        System.out.println("Cовет директоров и общее собрание участников");
    }

    @Override
    public void causes(Maneger maneger, Consultant consultant) {
        System.out.println(getName() + " вызывает " + maneger.getName() + " и " + consultant.getName());
    }

    @Override
    public void organizes(Director director, Maneger maneger) {
        System.out.println(getName() + "Oрганизует выполнение решений общего собрания ");
    }

    @Override
    public void analyzes(Director director, Maneger maneger) {
        System.out.println(getName() + "Анализирует и решает организационно-технические, экономические, " +
                "кадровые и социально-психологические проблемы ");
    }

    @Override
    public void control() {
        System.out.println(getName() + " Контралирует  решению задач консультантов и экспертов по различным вопросам");
    }


}