import java.util.Scanner;

public class ex {
public static void main(String[]args) {
 Scanner scanner = new Scanner(System.in);
 /*System.out.print("$1=1467.98 입니다. 달러를 입력하시요:");//1번 문제
 double input = scanner.nextDouble();
 double num;
 num = input*1467.98;
 System.out.println(input+"$는 "+num+"원입니다.");*/
 
/*System.out.print("생년월일을 입력하시오:");
int BornNum = scanner.nextInt();
int Year = BornNum/10000;
int Month = (BornNum/100)%100;
int Day = BornNum%100;
System.out.println(Year+"년 "+Month+"월 "+Day+"일");*/
 
 /*int T_price = 2000;
 int K_price = 1000;
 int J_price = 3000;
 System.out.println("**** 자바 분식입니다. 주문하면 금액을 알려드립니다. ****");
 System.out.print("떡볶이 몇 인분>>");
 int num = scanner.nextInt();
 System.out.print("김말이 몇 인분>>");
 int num1 = scanner.nextInt();
 System.out.print("쫄면 몇 인분>>");
 int num2 = scanner.nextInt();
 
 int sum = (T_price*num)+(K_price*num1)+(J_price*num2);
 System.out.println("전체 금액은 "+sum+"원 입니다."); */
 
 /*System.out.print("여행지>>");
 String place = scanner.nextLine();
 System.out.print("인원수>>");
 int people = scanner.nextInt();
 System.out.print("숙박일>>");
 int days = scanner.nextInt();
 System.out.print("1인당 항공료>>");
 int AirPrice = scanner.nextInt();
 System.out.print("1방 숙박비>>");
 int RoomPrice = scanner.nextInt();
 int Room = (people/2)+(people%2);
 int totalPrice = (people*AirPrice)+(Room*RoomPrice)*days;
 System.out.print(people+"명의 "+place+" "+days+"박 "+(days+1)+"일 여행에는 방이 "+ Room +"개 필요하며 경비는 "+totalPrice+"원입니다.");*/
 
/* System.out.print("학생1>>");
 String name = scanner.next();
 int late = scanner.nextInt();
 int absence = scanner.nextInt();  
 int Score = 100-((late*3)+(absence*8));
 
 System.out.print("학생2>>");
 String name2 = scanner.next();
 int late2 = scanner.nextInt();
 int absence2 = scanner.nextInt(); 
 int Score2 = 100-((late2*3)+(absence2*8));
 
 if(Score>Score2) {
	 System.out.println(name+"의 출석 점수가 더 높음. "+name+" 출석 점수는 "+Score);
 }
 else if(Score<Score2) {
	 System.out.println(name2+"의 출석 점수가 더 높음. "+name2+" 출석 점수는 "+Score2);
 }
 else if(Score==Score2) {
	 System.out.println("\"점수 동일\"");
 }*/
 /*
 System.out.print("나이를 입력하세요>>");
 int old = scanner.nextInt();
 int R_count = 0;
 int B_count = 0;
 int Y_count = 0;
 if(old > 0) {
	 R_count = old/10;
	 old = old%10;
	 
     B_count = old/5;
     old = old % 5;
     
     Y_count = old/1;
     
     int sum = R_count+B_count+Y_count;
     System.out.println("빨간 초 "+R_count+"개, 파란 초 "+B_count+"개, 노란 초 "+Y_count+"개. 총 "+sum+"개가 필요합니다.");
 }
 else if(old<=0) {
	 System.out.println("\"나이는 양수로만 입력하세요.\"");
 }
 */
/* 
 System.out.print("월을 입력하세요(1~12)>>");
 int month = scanner.nextInt();
 if(month>=3 && month <= 5) {
	 System.out.println("따뜻한 봄");
 }
 else if(month>=6 && month<=8) {
	 System.out.println("바다가 즐거운 여름");
 }
 else if(month >= 9 && month <= 11) {
	 System.out.println("낙엽이 지는 아름다운 가을");
 }
 else if(month==12 && month == 1) {
	 System.out.println("눈 내리는 하얀 겨울");
 }
 
 else {
	 System.out.println("1~12만 입력하세요.");
 }*/
 
 System.out.print("연산 입력>>");
 double a=scanner.nextDouble();
 String op = scanner.next();
 double b = scanner.nextDouble();
 double cal = 0;
 
 if(op.equals("더하기")) {
	 cal = a+b;
	 System.out.println(a+" "+op+" "+b+"의 계산 결과는 "+cal);
 }
 else if(op.equals("빼기")) {
	 cal = a-b;
	 System.out.println(a+" "+op+" "+b+"의 계산 결과는 "+cal);
 }
 else if(op.equals("곱하기")) {
	 cal = a*b;
	 System.out.println(a+" "+op+" "+b+"의 계산 결과는 "+cal);
 }
 else if(op.equals("나누기")) {
	 if(a!=0 && b !=0) {
	 cal = a/b;
	 System.out.println(a+" "+op+" "+b+"의 계산 결과는 "+cal);
	 }
	 else if(a==0 || b==0) {
		 System.out.println("0으로 나눌 수 없습니다.");
	 }
	 }
}
}
