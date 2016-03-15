package member;

public interface MemberService {
	public void join(MemberBean member);
	public String login(String id, String password);
	public MemberBean detail(String id);
	public String update(MemberBean member);
	public String remove(String id);
}
