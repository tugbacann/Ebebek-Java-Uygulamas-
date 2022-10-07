package maasHesaplama;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) {

            return this.salary * 0.03;

        }else {

            return 0;

        }
    }

    public double bonus() {
        if (this.workHours  > 40) {

            return (this.workHours-40) * 30;

        }else {

            return 0;

        }
    }

    public double raiseSalary() {

        int currentYear =2021;

        // vergi ve bonus eklenmis net maas
        double NetSalary=this.salary+this.bonus()-this.tax();

        if(currentYear-this.hireYear<10){
            return ((NetSalary*5)/100);
        }
        else if (currentYear-this.hireYear>9 && currentYear-this.hireYear<20) {
            return ((NetSalary*10)/100);
        }
        else if (currentYear-this.hireYear>19){
            return (NetSalary*15)/100;
        }
        else {
            return 0;
        }

    }

    public String toString(){

        double total1 = salary + bonus() - tax();
        double totalSalary = salary - tax() + bonus() + raiseSalary();


        System.out.println("Adı - Soyadı : " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + total1);
        System.out.println("Toplam Maaş : " + totalSalary);

        return null;
    }
}
