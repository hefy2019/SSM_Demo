package formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class MyFormatter implements Formatter<Date> {
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	@Override
	public String print(Date object, Locale arg1) {
		// TODO Auto-generated method stub
		return dateFormat.format(object);
	}

	@Override
	public Date parse(String source, Locale arg1) throws ParseException {
		// TODO Auto-generated method stub
		return dateFormat.parse(source);	//Formatterֻ�ܶ��ַ���ת��
	}
}
