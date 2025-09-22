public class Introduction {
    public static void main(String[] args) {
        String name = "Trần Bảo Long" ;
        String maSvien = "24020211" ;
        String myClass = "QH-2024-I/CQ-I-IT4";
        String userNameGit = "24020211-TranBaoLong";
        String gMail = "24020211@vnu.edu.vn";
        System.out.println(name + '\t' + maSvien + '\t' + myClass+'\t' + userNameGit + '\t' + gMail);
        String s1 = " bottles of beer on the wall, " ;
        String s2 = " bottles of beer. " ;
        String s3 = "Take one down, pass it around," ;
        for(int i = 9 ; i >= 0 ; i--){
            if(i==1){
                System.out.println(i +" bottle of beer on the wall, " + i + " bottle of beer. " );
                System.out.println(s3);
            }
            else if(i==0){
                System.out.println(i+s1+i+s2);
                System.out.println("Take one down, pass it around.");
            }
            else {
                System.out.println(i + s1 + i + s2);
                System.out.println(s3);
            }
        }
    }
}