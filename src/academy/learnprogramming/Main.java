package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561602);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value.");
        }
        else{
            long years = minutes / 525600;
            long remainderYears = minutes % 525600;
            long days = remainderYears / 1440;
            long remainderDays = days % 1440;

            if(years > 1)
                System.out.println(minutes + " minutes = " + years + " years, " + days + " days");
            else
                System.out.println(minutes + " minutes = " + years + " year, " + days + " days");
        }
    }
}
