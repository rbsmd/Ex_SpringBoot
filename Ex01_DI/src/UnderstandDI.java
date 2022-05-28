import java.util.Date;

class Member{
    String name;
    String nickName;
    public Member(){}
}
public class UnderstandDI {
    public static void main(String[] args){
        //날짜를 구하기 위해서는 Date 클래스에 의존해야한다.
        Date date = new Date();
        System.out.println(date);
    }

    public  static  void getDate(Date d){
    Date date = d;
    System.out.println(date);
    }

    public static void memberUse1(){
        //강한 결합 : 직접 생성
        Member member1 = new Member();
    }

    public static void memberUser2(Member member){
        //약한 결합 : 생성된 것을 주입 받음 - 의존주입(DI)
        Member member2 = member;
    }
}
