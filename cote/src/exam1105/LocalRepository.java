package exam1105;

public class LocalRepository implements MemoRepository{
	
	@Override
	public void addMemo(String id, String body) {
		// TODO Auto-generated method stub
		System.out.println("pc에 메모를 저장했습니다.");
	}
	@Override
	public void getMemo() {
		System.out.println("pc에 메모를 추가합니다.");
	}
	@Override
	public void deletePost(String id) {
		System.out.println("pc의 메모를 삭제합니다.");
		
	}
	@Override
	public void updatePost(String id, String body) {
		System.out.println("pc의 메모를 수집합니다.");
		
	}

}
