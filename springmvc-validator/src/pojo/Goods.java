package pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Goods {
	private String gname;
	private String gdescription;
	private double gprice;
	//���ڸ�ʽ��(��Ҫ�������ļ�������FormattingConversionServiceFactoryBean)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date gdate;
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGdescription() {
		return gdescription;
	}
	public void setGdescription(String gdescription) {
		this.gdescription = gdescription;
	}
	public double getGprice() {
		return gprice;
	}
	public void setGprice(double gprice) {
		this.gprice = gprice;
	}
	public Date getGdate() {
		return gdate;
	}
	public void setGdate(Date gdate) {
		this.gdate = gdate;
	}
}
