package dynamic.jdk;

import org.springframework.stereotype.Repository;

@Repository(value="testDao")
public class TestDaoImpl implements TestDao{
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("±£´æ");
	}
	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.println("ÐÞ¸Ä");
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("É¾³ý");
	}
}
