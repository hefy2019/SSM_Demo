package com.po;

import java.util.List;

public class Orders {
	private Integer id;
	private String ordersn;
	// ��Զ��е���һ�� һ�Զ�
	private List<Product> products;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrdersn() {
		return ordersn;
	}

	public void setOrdersn(String ordersn) {
		this.ordersn = ordersn;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ",ordersn=" + ordersn + ",products=" + products + "]";
	}
}
