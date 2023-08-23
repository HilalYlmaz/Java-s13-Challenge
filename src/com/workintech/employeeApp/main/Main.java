package com.workintech.employeeApp.main;

import com.workintech.employeeApp.enums.Plan;
import com.workintech.employeeApp.model.Company;
import com.workintech.employeeApp.model.Employee;
import com.workintech.employeeApp.model.Healthplan;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Healthplan plan1 = new Healthplan(1, "A Sigorta", Plan.BASIC);
        Healthplan plan2 = new Healthplan(2, "B Sigorta", Plan.ADVANCE);

        String[] healthPlans = new String[2];
        healthPlans[0]= plan1.getName();
        healthPlans[1]= plan2.getName();

        Employee developer= new Employee(1, "Hilal Yılmaz", "hilal@yilmaz.com", "abc", healthPlans);

        System.out.println(developer);

        String[] developerNames = new String[3];
        developerNames[1]= developer.getFullName();
        Company company = new Company(1, "trendyol", 300000, developerNames);
        System.out.println(company);

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
