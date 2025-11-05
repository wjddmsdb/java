package exam1105;

public interface MemoRepository {
	void addMemo(String id, String body);
	void getMemo();
	void deletePost(String id);
	void updatePost(String id, String body);

}