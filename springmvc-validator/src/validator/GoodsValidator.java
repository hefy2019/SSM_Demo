package validator;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pojo.Goods;

@Component
public class GoodsValidator implements Validator {

	@Override
	public boolean supports(Class<?> klass) {
		// TODO Auto-generated method stub
		// 要验证的model，返回值为false则不验证
		return Goods.class.isAssignableFrom(klass);
	}

	@Override
	public void validate(Object object, Errors errors) {
		// TODO Auto-generated method stub
		Goods goods = (Goods) object; // object要验证的对象
		// goods.gname.required是错误消息属性文件中的编码(国际化后对应的是国际化的信息)
		ValidationUtils.rejectIfEmpty(errors, "gname", "goods.gname.required");
		ValidationUtils.rejectIfEmpty(errors, "gdescription", "goods.gdescription.required");
		if (goods.getGprice() > 100 || goods.getGprice() < 0) {
			errors.rejectValue("gprice", "gprice.invalid");
		}
		Date goodsDate = goods.getGdate();
		// 在系统时间之后
		if (goodsDate != null && goodsDate.after(new Date())) {
			errors.rejectValue("gdate", "gdate.invalid");
		}
	}
}
