package capstone.sejong.imgupload;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImgService {

	@Autowired
	ImgDAO imgDao;

	public String getProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getProductList() {
		return imgDao.getProductList();
	}

	public List<String> getIngradient() {
		// TODO Auto-generated method stub
		return imgDao.getIngradient();
	}

	public List<String> getIngradientkorean() {
		// TODO Auto-generated method stub
		return imgDao.getIngradientKorean();
	}

}
