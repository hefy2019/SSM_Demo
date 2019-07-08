package controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.FileDomain;

@Controller
public class FileUploadController {
	// �õ�һ��������¼��־�Ķ��������ڴ�ӡ��Ϣʱ�ܹ���Ǵ�ӡ�����ĸ������Ϣ
	private static final Log logger = LogFactory.getLog(FileUploadController.class);

	/**
	 * ���ļ��ϴ�
	 */
	@RequestMapping("/onefile")
	public String oneFileUpload(@ModelAttribute FileDomain fileDomain, HttpServletRequest request) {
		/*
		 * �ļ��ϴ�����������λ��"/uploadfiles",��λ����ָ
		 * workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps,
		 * ������ʹ��
		 */
		String realpath = request.getServletContext().getRealPath("uploadfiles");
		String fileName = fileDomain.getMyfile().getOriginalFilename();
		File targetFile = new File(realpath, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		// �ϴ�
		try {
			fileDomain.getMyfile().transferTo(targetFile);
			logger.info("�ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "showOne";
	}
}
