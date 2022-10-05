public class Employee {
    public String firstName;
    public String lastName;
    public double salary;
    public int workHours;
    public int hireYear;

    public Employee(String firstName, String lastName, double salary, int workHours, int hireYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.workHours = workHours;
        if(hireYear > 0){
            this.hireYear = hireYear;
        }
        else{
            this.hireYear = 0;
        }
    }

    public double tax(){
        if(this.salary < 1000){
            return 0;
        }
        else{
            return (this.salary * 3 / 100);
        }
    }

    public int bonus(){
        if(this.workHours > 40){
            return (this.workHours - 40) * 30;
        }
        else {
            return 0;
        }
    }

    public double raiseSalary(){
        int currentHire = 2021;
        int totalHire = currentHire - hireYear;

        double totalSalary = salary + bonus() - tax();

        if(totalHire < 10){
            return totalSalary + (this.salary * 5 / 100);
        }
        else if(totalHire > 9 && 2021 - this.hireYear < 20){
            return totalSalary +(this.salary * 10 / 100);
        }
        else if(totalHire > 20){
            return totalSalary + (this.salary * 15 / 100);
        }
        return 0;
    }

    public void tooString(){
        System.out.println("----ÇALIŞAN BİLGİLERİ----");
        System.out.println("Adı Soyadı: " + this.firstName + " " + this.lastName);
        System.out.println("Brüt Maaşı : " + this.salary + " TL");
        System.out.println("Haftalık çalışma saati : " + this.workHours + " Saat");
        System.out.println("İşe başlama yılı : " + this.hireYear);
        System.out.println();
        System.out.println("----MAAŞI----");
        System.out.println("Vergi Ücerti : " + tax() + " TL");
        System.out.println("Bonus Ücreti : " + bonus() + " TL");
        System.out.println("Net Maaşı : " + raiseSalary() + " TL");
        System.out.println();
        System.out.println("----MAAŞ HESAPLAMA PROSEDÜRÜ----");
        System.out.println("-Maaşı 1000 tl üzeri olanlara maaşının %3 ü kadar vergi uglulanacak");
        System.out.println("-Haftalık 40 saatin üzerinde çalışanlara saat başına 30 TL fazla ödenecek");
        System.out.println("-Çalışma süresi 10 yıl altındaysa %5 zam 10-20 yıl arasındaysa %10 zam\n" +
                            "20 yıl üzerindeyse %15 zam yapılacaktır.");
    }
}
