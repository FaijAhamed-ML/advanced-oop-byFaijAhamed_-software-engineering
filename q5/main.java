package lab09.q5;

import java.io.PipedWriter;

public class main {
    public static void main(String[] args) {
        ContractEmployee C1=new ContractEmployee("Em11223344","Faij",50000,10);
        PermanentEmployee P1=new PermanentEmployee("Emp223344","Sneha",1000000);

        C1.generatePayslip();
        System.out.println(" ");
        P1.generatePayslip();
    }
}
