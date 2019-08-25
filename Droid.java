public class Droid{
  int battery;
  String name;
  
  public Droid(int batteryLevel, String droidName){
    name = droidName;
    battery = batteryLevel;
  }
   public void chargeBattery(int charge){
     battery = battery + charge;
     if (battery > 100){ 
       battery = 100; //limits charge to 100 
       System.out.println("I got some energy back! My charge is now at " + battery);
     }
     else {
       System.out.println("I got some energy back! My charge is now at " + battery);
     }
   }
  public String toString(){
    return "Hello, my name is " + name + "!";
  }
  
  public static void main(String[] args){
    Droid codey = new Droid (100, "Codey");
    System.out.println(codey);
    codey.performTask("Dancing");
    codey.performTask("Cooking dinner");
    codey.chargeBattery(30);
  }
  
  public void performTask(String task){
    System.out.println("Codey is performing task: " + task);
    battery = battery -10;
    System.out.println("My charge is at " + battery);
    
  }
}
