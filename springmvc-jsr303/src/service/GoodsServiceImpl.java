package service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import pojo.Goods;

@Service
public class GoodsServiceImpl implements GoodsService {
	// ʹ�þ�̬���ϱ���goodsģ�����ݿ�
	private static ArrayList<Goods> goods = new ArrayList<Goods>();

	@Override
	public boolean save(Goods g) {
		// TODO Auto-generated method stub
		goods.add(g);
		return true;
	}

	@Override
	public ArrayList<Goods> getGoods() {
		// TODO Auto-generated method stub
		return goods;
	}

}
