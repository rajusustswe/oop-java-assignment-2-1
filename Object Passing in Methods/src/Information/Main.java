package Information;


public class Main {
    public static void main(String args[]){
      
      ///Passing in a constructor with 4 parameter
      Person p1 = new Person("John", "Male", 100, 166666678);
      p1.displayInfo();
      
      ///Passing in a Method
      Person p2 = new Person();
      p2.setInfo("Raju","Male", 200, 1636234235);
      p2.displayInfo();
      
      ///Passing in a constructor with 3 parameter
      Person p3 = new Person("Mina", "Female", 101);
      p3.displayInfo();
      
      ///Passing an entire p1 object in Constructor so p4 will contain same values of p1
      Person p4 = new Person(p1);
      p4.displayInfo();
      
      ///Passing object p2 in a method isSameId() of p1
      if(p1.isSameId(p2)){
          System.out.println("Both ID of p1 and p2 are same");
      }
      else{
          System.out.println("ID of p1 and p2 are diferent");
      }
      
      ///Passing p1 and p2 object in a static method to check if the two object are same or not
      if(Person.isSameId(p1, p4)){
          System.out.println("P1 object and P4 is same");
      }
      else{
          System.out.println("P1 object and P4 are not same");
      }
    }
}
