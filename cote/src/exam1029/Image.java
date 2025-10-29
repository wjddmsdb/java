package exam1029;

public class Image implements Clickable ,Drawable{
	
	String url;
	//기본생성자 
	public Image() {}
	public Image(String url) {
		this.url = url;
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("그림이 클릭되었습니다.");
	}
	@Override
	public void draw() {
		if(url != null)
			System.out.println(url +"파일을 그립니다.");
		
	}

}
