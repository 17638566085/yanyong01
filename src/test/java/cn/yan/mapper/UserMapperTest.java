package cn.yan.mapper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

public class UserMapperTest {

	private Logger logger=Logger.getLogger(UserMapperTest.class);
	
	@Test
	public void test() {
		String resource ="mybatis-config.xml";
		
		int count=0;
		
		SqlSession sqlSession= null;
		
		
		try {
			//1.获取mybatis的输入流
			InputStream is= Resources.getResourceAsStream(resource);
			
			//2.创建SqlSessionFactory
			
			SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
			
			//3.创建SqlSession
			sqlSession=factory.openSession();
			
			//4.调用mapper文件对文件数据进行操作
			count =sqlSession.selectOne("cn.yan.mapper.UserMapper.count");
			
			logger.debug("count----->>>>>>>>>>>>"+count);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}

}
