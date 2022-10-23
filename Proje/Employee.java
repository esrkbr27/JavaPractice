package Proje;

public class Employee {
    public static final String ANSI_YEŞİL = "\u001B[32m";
    public static final String ANSI_KIRMIZI = "\u001B[31m";
    public static final String ANSI_MAVI = "\u001B[34m";
    public static final String ANSI_MOR = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_SIYAH = "\u001B[30m";

    String name;
    double salary;
    int workHours;
    int hireYear;


    public Employee() {
    }

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }


    public static double tax (double salary){
    double tax = 0;
    if(salary>1000){
        tax=(salary*3)/100;
    }
    else{
        tax=0;

    }
    return tax;
    }

    public static double bonus(int workHours){
        double bonusTl = 0;

        if(workHours>40){
            bonusTl =(workHours-40)*30;
        }
        else {
            bonusTl =0;
        }
        return bonusTl;
    }

    public static double raiseSalary(int hireYear,double salary){
        double maasartısı=0;
        if((2021-hireYear)<10){
            maasartısı=salary*0.05;
        } else if (2021-hireYear<20) {
            maasartısı=salary*0.10;
        }
        else{
            maasartısı=salary*0.15;
        }
        return maasartısı;
    }

    public static double vergivebonusilemaas(double salary,int workHours){

       double vergivebonusilemaas= (salary-tax(salary))+ bonus(workHours);
        return vergivebonusilemaas;
    }

    public static double toplammaas(double salary,int hireYear,int workHours) {

      double toplammaas=(salary+raiseSalary(hireYear,salary));
      return toplammaas;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "Adı:" + name + '\n' +
                ", Maaşı:" + salary +'\n'+
                ", Çalışma Saati :" + workHours +'\n'+
                ", Başlangıç Yılı :" + hireYear +'\n'+
                '}';
    }

    public static void main(String[] args) {
        Employee employee=new Employee("Esra Demirci",2000,45,1985);
        System.out.println(ANSI_SIYAH+employee.toString());

        double vergi= tax(employee.salary);
        System.out.println(ANSI_CYAN+"Vergi : "+vergi);

        double bonus= bonus(employee.workHours);
        System.out.println(ANSI_MAVI+"Bonus : "+bonus);

        double maasartısı=raiseSalary(employee.hireYear,employee.salary);
        System.out.println(ANSI_MOR+"Maaş Artışı : "+maasartısı);

        double vergivebonusilemaas=vergivebonusilemaas(employee.salary, employee.workHours);
        System.out.println(ANSI_KIRMIZI+"Vergi ve Bonuslar ile birlikte maaş : "+vergivebonusilemaas);

        double toplammaas=toplammaas(employee.salary, employee.workHours,employee.hireYear);
        System.out.println(ANSI_YEŞİL+"Toplam maaş : "+toplammaas);
    }
}
