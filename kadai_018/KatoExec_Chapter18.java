package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		KatoTaro_Chapter18 tarou = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		tarou.setGivenName("太郎");
		tarou.execIntroduce();
		System.out.println();
		
		ichiro.setGivenName("一郎");
		ichiro.execIntroduce();
		System.out.println();

		
		hanako.setGivenName("花子");
		hanako.execIntroduce();
	}
}