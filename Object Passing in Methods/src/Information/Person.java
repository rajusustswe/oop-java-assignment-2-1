package Information;

public class Person {
     String name;
     String gender;
     int phone;
     int id;
     
     ///Constructor with 4 parameter
    Person(String n, String g, int i, int p){
        name = n;
        gender = g;
        phone = p;
        id = i;
     }
    
    ///Constructor with 3 parameter
     Person(String n, String g, int i){
        name = n;
        gender = g;
        id = i;
     }
     
     ///Constructor of no parameteer
     Person(){
         System.out.println("NO Parameter in constructor");
     }
     
     ///Constructor with an object
     Person(Person p){
         this.name = p.name;
         this.gender = p.gender;
         this.phone = p.phone;
         this.id = p.id;
     }
   
     void setInfo(String n, String g, int phn, int i){
         name = n;
         gender = g;
         phone = phn;
         id = i;
     }
     
     //Displays the personal information
     void displayInfo(){
         System.out.println("Name : "+name);
         System.out.println("Gender : "+gender);
         System.out.println("Phone number : 0"+phone);
         System.out.println("ID : "+id);
         System.out.println("\n");
     }
     
    ///Checks if Id of two object same or not
     boolean isSameId(Person x){
         if(this.id == x.id)
             return true;
         else
             return false;
     }
     
     ///Static method to check two object are same or not
     static boolean isSameId(Person one, Person two){
         return one.equals(two);
     }
    
}

