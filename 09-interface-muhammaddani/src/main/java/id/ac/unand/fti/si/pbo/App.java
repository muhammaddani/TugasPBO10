package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {
        Member member1 = new Member();
        Member member2 = new MemberPlatinum(); //di sini
        MemberPlatinum member3 = new MemberPlatinum();

        System.out.println("Total bayar member 1 : " + member1.hitungTotalBayar(10000000));
        System.out.println("Total bayar member 2 : " + member2.hitungTotalBayar(10000000));
        System.out.println("Total bayar member 3 : " + member3.hitungTotalBayar(10000000));

        //polimorfisme run time/dinamis terjadi saat subclass/MemberPlatinum melakukan override atas method dalam superclass/Member
        //method hitungTotalBayar() dipanggil pada objek Member, tetapi hasil kalkulasi bergantung pada objek sebenarnya yang dibuat pada saat runtime, yaitu MemberPlatinum
    }   
    
}
