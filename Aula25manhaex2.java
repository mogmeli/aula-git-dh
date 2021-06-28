package br.com.mercadolivre;

public class Aula25manhaex2 {
    public static void main(String[] args) {
        double vm1 = 1130000; //crescimento anual de 148%;
        double vm2 = 18400000; // crescimento anual de 32%;
        int anos = 0;
        while(vm2 > vm1){
            vm1 = vm1 + ((vm1 * 148)/100);
            vm2 = vm2 + ((vm2 * 32)/100);
            anos++;
        }

        System.out.println("demoraram " + anos + " anos para a empresa 1 passar a empresa 2");

    }
}