import java.lang.String;
  class p1{
        public static void toLowerCase(String a){

            for (int i = 0; i< a.length(); i++){

                char aChar = a.charAt(i);
                if (aChar >='A' && aChar<='Z'){
                    aChar = (char)( (aChar + 32) ); 
                }
                // else
                //    aChar = (char)(aChar);

            System.out.print(aChar);
            }
        }

        public static void main(String[] args){

            toLowerCase("RDFGHJ");
        }   
    }

/** to low * 
 * 
 */

