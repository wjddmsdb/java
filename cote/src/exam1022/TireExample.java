package exam1022;

public class TireExample {

	public static void main(String[] args) {
		 Tire normal = new Tire("일반타이어", 5);

	        WideTire wide = new WideTire("광폭타이어", 3, 275);

	        ColorTire color = new ColorTire("색상타이어", 4, "빨강");

	        System.out.println("=== 일반 타이어 테스트 ===");
	        for (int i = 0; i < 6; i++) {
	            boolean result = normal.roll();
	            if (!result) {
	                System.out.println("일반타이어 펑크!");
	                break;
	            } else {
	                System.out.println("일반타이어 회전수: " + (i + 1));
	            }
	        }

	        System.out.println("\n=== 광폭 타이어 테스트 ===");
	        for (int i = 0; i < 6; i++) {
	            boolean result = wide.roll();
	            if (!result) {
	                System.out.println("광폭타이어 펑크! (너비: " + wide.width + ")");
	                break;
	            } else {
	                System.out.println("광폭타이어 회전수: " + (i + 1) + " (너비: " + wide.width + ")");
	            }
	        }

	        System.out.println("\n=== 색상 타이어 테스트 ===");
	        for (int i = 0; i < 6; i++) {
	            boolean result = color.roll();
	            if (!result) {
	                System.out.println("색상타이어 펑크! (색상: " + color.color + ")");
	                break;
	            } else {
	                System.out.println("색상타이어 회전수: " + (i + 1) + " (색상: " + color.color + ")");
	            }
	        }
	    }
	}