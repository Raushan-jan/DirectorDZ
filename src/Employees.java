public class Employees {
    private String name;
    private String surName;

    public Employees(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
    public void voice(){
        System.out.println(surName+" "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
