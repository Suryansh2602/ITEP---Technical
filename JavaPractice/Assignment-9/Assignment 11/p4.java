//index of
 
 class p1
{
   private String str;


   public p1(String x)
   {
      this.str = x;
   }


   public int findIndexOf(int a){
      int counter = 0;
      for(int i = 0; i < this.str.length(); i++)
      {
         counter++;
      } 

      char[] arr = new char[counter];

      for(int i = 0; i < arr.length; i++)
      {
         arr[i] = this.str.charAt(i);
      }
      return counter;
   }
}
class main{
  public static void main(String[] args) {
      p1 obj = new p1("Hello World");
      int index = obj.findIndexOf('o');
      System.out.println("Index of 'o': " + index);
  }

}


