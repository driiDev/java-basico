package aluno.entities;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double finalGrade(){
        return n1 + n2 + n3;
    }

    public String passFailed(){
        double missing = (60 - finalGrade());
        if (finalGrade() < 60){
            return "FAILED \nMISSING " + String.format("%.2f",missing) + " POINTS";

        } else{
            return "PASS";
        }
    }

    public String toString(){
        return "FINAL GRADE = "
                + String.format("%.2f", finalGrade())
                + "\n"
                + passFailed();
    }
}
