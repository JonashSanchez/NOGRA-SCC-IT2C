import java.util.Scanner;






public class Grade {
    public void genGrade(){
          Scanner input = new Scanner(System.in);
          Grades[] gr= new Grades[100];
          System.out.println("Enter no. of Students: ");
        int nums = input.nextInt();  // 

        for (int i = 0; i < nums; i++) {

            System.out.println("Enter details of Student " + (i + 1) + ":");

            System.out.println("ID: ");
            int id = input.nextInt();  

            System.out.println("Name: ");
            String name = input.next();  

            System.out.println("Prelim: ");
            double pr = input.nextDouble();  

            System.out.println("Midterm: ");
            double md = input.nextDouble();  

            System.out.println("PreFinal: ");
            double pf = input.nextDouble(); 

            System.out.println("Finals: ");
            double fn = input.nextDouble(); 
            
             gr[i] = new Grades ();
             gr[i].addGrades(id, name, pr, md, pf, fn);
        }
        for(int i=0; i < nums; i++){
            gr[i].viewGrades();
        }
        
        
        
        
    }
    
}
