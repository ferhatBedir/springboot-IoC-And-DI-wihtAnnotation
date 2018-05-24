package ferhats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeImpl implements Employee {

    /**
     * Eğer Employer sınıfını implement eden 1'den fazla sınıf var ise bunu annotation ile belirtmek zorundayız.
     * @Qualifier annotation'ı kullanarak bunu çöözebiliriz.
     * Bu annotation'a parametre olarak kullanmak istediğimiz sınıfın conponent ismini vermemeniz gerekir.
     * Defaultta bu isim sınıf isminin baş harfı küçük harf yapılarak kullanılır.
     * örnek  default isimli @Component -->  @Qualifier("employerImpl")
     * örnek  isim set edilmiş @Component("implSınıfı") -->  @Qualifier("implSınıfı")
     */

    @Autowired
    @Qualifier("employerImpl")
    Employer employer;

    /**
     * Üç tane Injection yöntemi var.
     * 1.) Constructors ile (metot üzerine @Autowired annotation koyulması zorunlu değil spring 4.3 versiondan sonra zorunlulugu ortadan kalktı)
     * 2.) setter metodu ile (metot üzerine @Autowired annotation koyulması zorunlu)
     * 3.) değişken üzerine @Autowired koyulması ile
     * <p>
     * Bu uygulamada biz değişken üzerine @Autowired koyarak injection yaptık.
     * (Constructors injection ve setter injection'ın yorumu kaldırıldığında onlarda kullanılabılır durumda olacaktır.)
     */

   /* @Autowired
    public EmployeeImpl(Employer employer) {
        this.employer = employer;
    }

    @Autowired
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }*/
    @Override
    public void employeename() {
        System.out.println("==========================================");
        System.out.println("Çalışan adı --> Ferhat");
        System.out.println("==========================================");
        System.out.println("Çalışan soyadı --> Bedir");
        System.out.println("==========================================");
        System.out.println("Çalışan görevi --> Software Developer");
        System.out.println("==========================================");
    }

    @Override
    public void paySalary(int i) {
        employeename();
        int totalSalary = employer.paySalary(i);
        System.out.println("Maas hesaplanıyor..");
        System.out.println("==========================================");
        System.out.println("Çalışanın maaşı --> " + totalSalary);
        System.out.println("==========================================");
    }
}
