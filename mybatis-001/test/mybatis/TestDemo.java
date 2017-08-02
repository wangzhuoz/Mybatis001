package mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.xinniuren.entity.User;
import com.xinniuren.utils.MyhabisUtils;

public class TestDemo {

	@Test
	public void aaa() throws Exception{
		SqlSession session = MyhabisUtils.getSession();
		User user = session.selectOne("getUserById", 10);
		System.out.println(user);
		session.close();
	}
}
