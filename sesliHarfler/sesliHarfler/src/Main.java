public class Main {
    public static void main(String[] args) {
        char harf ='B';
        if (harf=='A' || harf=='I' || harf=='O' || harf=='U'){
            System.out.println(harf+" Harfi Kalın Seslidir.");
        } else if (harf=='E' || harf=='İ' || harf=='Ö' || harf=='Ü') {
            System.out.println(harf+" Harfi İnce Seslidir.");

        }else {
            System.out.println("Sadece " + harf+" harfi giridiniz.");
        }

    }
}
