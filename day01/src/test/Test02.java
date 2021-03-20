package test;

public class Test02 {

	public static void main(String[] args) {
		//escape문자 : 문자열 처리할때 특수한 기능을해준다
		/*
		 \n : 엔터값과 비슷하다
		 \t : tab크기만큼 오른쪽을 이동
		 \" : "(큰따옴표)표현
		 \\ : \(역슬러시)표현
		 */
		System.out.println("안\n녕\n하\n세\n요");
		System.out.println("1\t1234567\t12345678\t12");
		System.out.println("안\"녕하\"세요");
		System.out.println("안녕\\");
		System.out.println( "안녕" + 100 + 100);
		System.out.println( 123.123 + 100 + "안녕");
		
		
		
		System.out.println("========================================");
		System.out.println("이름\t나이\t전화번호\t\t회비");
		System.out.println("========================================");
		System.out.println("홍길동\t\"15\"\t3672-1234\t\\20000");
		System.out.println("고길동\t\"15\"\t2238-1234\t\\30000");
		System.out.println("김말이\t\"15\"\t1234-1234\t\\50000");
		System.out.println("----------------------------------------");
		System.out.println("총합계\t\t\t\t\\100000");
		System.out.println("----------------------------------------");
		
		
		
		
		
		
		
	}	
}
