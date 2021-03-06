package member;

import java.util.HashMap;

public class MemberServiceImpl implements MemberService {

	HashMap<String, MemberBean> map;
	
	public MemberServiceImpl() {
		map = new HashMap<String, MemberBean>();
	}
	
	@Override
	public void join(MemberBean member) {
		// 회원가입
		map.put(member.getId(), member);
	}

	@Override
	public String login(String id, String password) {
		// 로그인
		// 아이디가 존재하지 않아서 실패한 경우와 비번이 틀려서 실패한 경우에 따라서 메시지를 전달해줘야 함
		MemberBean member = map.get(id);
		String result = "";

		if (member == null) {
			result = "아이디가 존재하지 않습니다.";
		} else {
			if (member.getPassword().equals(password)) {
				result = "로그인 성공";
			} else {
				result = "비밀번호가 일치하지 않습니다.";
			}
		}
		
		return result;
	}
	
	@Override
	public MemberBean detail(String id) {
		return map.get(id);
	}
	
	@Override
	public String update(MemberBean member) {
		// 수정
		String result = "";
		if (member.getId().equals(null)) {
			result = "수정 실패";
		} else {
			map.replace(member.getId(), member);
			result = "수정 성공";
		}
		
		return result;
	}

	@Override
	public String remove(String id) {
		// 삭제
		map.remove(id);
		
		return "삭제 성공";
	}


}
