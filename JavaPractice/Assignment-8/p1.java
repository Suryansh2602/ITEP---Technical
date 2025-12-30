/**Add Two Time Class Object */

class Time {
    private int hours;
    private int minutes;
    private int seconds;

   //constructor
   public Time(int hours, int minutes, int seconds) {
       this.hours = hours;
       this.minutes = minutes;
       this.seconds = seconds;
   }

   public Time() {
       hours = minutes = seconds = 00;
   }
    
   //getter hours
   public int getHours() {
       return hours;
   }
    
   //getter min
   public int getMin() {
       return minutes;
   }

   //getter seconds
   public int getSeconds() {
       return seconds;
   }

   public Time add(Time T) {
       Time temp = new Time();
       temp.hours = this.hours + T.hours;
       temp.minutes = this.minutes + T.minutes;
       temp.seconds = this.seconds + T.seconds;
       if (temp.minutes >= 60) {
           temp.hours++;
           temp.minutes = temp.minutes % 60;
       }
       if (temp.seconds >= 60) {
           temp.minutes++;
           temp.seconds = temp.seconds % 60;
       }
       return temp;
   }

}

class Main {
    public static void main(String[] args) {
        Time t1 = new Time(12, 58, 87);
        Time t2 = new Time(14, 55, 8);
        Time result = t1.add(t2);
        System.out.println("Total working Time of Two person is : "+ result.getHours() + "  : "+result.getMin() + "  : " + result.getSeconds() + " ");
    }
}