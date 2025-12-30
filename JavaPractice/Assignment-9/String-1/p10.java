// WAP to find word of maximum length in given String.
// // 	Sample Input: Dear Student ,You have need to work hard
// // `	Output: Student

class Main{
    public static void main(String[] args) {
        String str = "Dear Student, You have need to word hard";
        int length = str.length();
        int max_length = 0;
        int start = 0;
        String res = "";
        
        for (int i = 0; i <=length; i++) {
            if(str.charAt(i)==' '|| i ==length){
             if(i-start >max_length){
                res="";
                max_length = i-start;
                for (int j = start; j <i; j++) {
                 res +=str.charAt(j);
                    
                }
             }
             start =i+1;
             
            }
            
        }
        System.out.println(res);
    }
}