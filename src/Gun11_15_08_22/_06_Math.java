package Gun11_15_08_22;

public class _06_Math {
    public static void main(String[] args) {
        int a=-12;
        int b=4;
        System.out.println("a'nın mutlak değeri = "+Math.abs(a));// 12 absolute mutlak
        System.out.println("a ve b'den büyük olanı = "+Math.max(a,b));// 4
        System.out.println("a ve b'den küçük olanı = "+Math.min(a,b));// -12
        System.out.println("b'nin karekökü = "+Math.sqrt(b));// 2
        System.out.println("2'nin 3.kuvveti (2 üzeri 3) = "+Math.pow(2,3));// 8
        System.out.println("round 3.1 = "+Math.round(3.1));// 3 yuvarlama
        System.out.println("round 3.5 = "+Math.round(3.5));// 4 yuvarlama

        System.out.println("ceil 3.1 = "+Math.ceil(3.1));// bu rakamdan büyük en yakın tam sayı 4
        System.out.println("ceil 3.5 = "+Math.ceil(3.5));//bu rakamdan büyük en yakın tam sayı 4
        System.out.println("floor 3.1 = "+Math.floor(3.1));//bu rakamdan küçük en yakın tam sayı 3
        System.out.println("floor 3.5 = "+Math.floor(3.5));//bu rakamdan küçük en yakın tam sayı 3

    }
}
