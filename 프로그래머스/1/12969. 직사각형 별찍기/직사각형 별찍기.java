import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=0; i<b; i++){
            System.out.println(("*").repeat(a));
        }
    }
}

/*
String line = "*".repeat(a);
StringBuilder sb = new StringBuilder();
for (int i = 0; i < b; i++) {
    sb.append(line).append("\n");
}
System.out.print(sb);
*/