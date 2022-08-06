package session6.Inherit;

public class Run {
    public static void main(String[] args) {
        Employee employee = new Employee("HV","123 binh chanh",
                "12345678","adnovum");
       // employee.getVariableType();

       // employee.publicMethod(); // k thay duoc private method

       // employee.printEmployee();
        ColleagueStudent colleagueStudent = new ColleagueStudent("Huu vinh",
                "123 Cong hoa","1234567",
                "Tran van on");

        colleagueStudent.publicMethod(); // call from person
        colleagueStudent.randomText(); // call function form student
    }
}
