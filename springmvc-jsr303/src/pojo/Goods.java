package pojo;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class Goods {
	// goods.gname.required ������Ϣkey(���ʻ����Ӧ�ľ��ǹ��ʻ�����Ϣ)
	@NotBlank(message = "{goods.gname.required}")
	private String gname;
	@NotBlank(message = "{goods.gdescription.required}")
	private String gdescription;
	@Range(min = 0, max = 100, message = "{gprice.invalid}")
	private double gprice;
	// ���ڸ�ʽ��(��Ҫ�������ļ�������FormattingConversionServiceFactoryBean)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Past(message = "{gdate.invalid}")
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
