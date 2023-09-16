public class StudentMarksheet {

 static StudentMarksheet studentMarksheet = new StudentMarksheet();
 int total;

 public static void main(String[] args)
 {
     studentMarksheet.marks(67);
     studentMarksheet.marks01(56);
     studentMarksheet.marks02(89);
     studentMarksheet.totalMarks(67,56,89);

 }
 void totalMarks(int maths, int sci, int eng){

      System.out.println("total marks" + " = "+(maths+sci+eng));
 }
 void marks(int maths)
 {
     System.out.println("maths" + " = " +maths);
  // maths = answer
 }

void marks01(int sci) {

    System.out.println("sci" + " = " +sci);
  //sci = answer
}
void marks02(int eng){

     System.out.println("eng" + " = " +eng);
 //eng = answer
 }
}
