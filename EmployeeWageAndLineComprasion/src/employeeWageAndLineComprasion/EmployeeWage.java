package employeeWageAndLineComprasion;

public class EmployeeWage {
    public static final int IS_FULL_TIME=2;
    public static  int TOTAL_EMPLOYEE_WAGE=0;
    public static  int FULL_DAY_HOUR=0;
    public static final int IS_PART_TIME=1;
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");
        int daily_Employee_Wage=20;
        int total_Working_Days=20;
        int total_Working_Hour=100;
        int empCheck=(int)Math.floor(Math.random()*10)%3;
        if (total_Working_Days>=20 || total_Working_Hour >=100) {
            for (int i = 1; i<=total_Working_Days;i++){

                switch (empCheck) {
                    case 1:
                        IS_PART_TIME:
                        FULL_DAY_HOUR = 4;
                        break;
                    case 2:
                        IS_FULL_TIME:
                        FULL_DAY_HOUR = 8;
                        break;
                    default:
                        FULL_DAY_HOUR = 0;
                }
                TOTAL_EMPLOYEE_WAGE = FULL_DAY_HOUR * daily_Employee_Wage;
                TOTAL_EMPLOYEE_WAGE *= total_Working_Days;
            }
        }

        System.out.println(TOTAL_EMPLOYEE_WAGE);


    }
}
