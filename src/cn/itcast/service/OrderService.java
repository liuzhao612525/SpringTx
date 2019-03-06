package cn.itcast.service;

import cn.itcast.dao.OrderDao;

public class OrderService {
	private OrderDao orderDao;

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	
	//调用dao方法
	//业务逻辑层，写转账业务
	public void accountMoney() {
		orderDao.lessMoney();
//		int i = 10/0;
		orderDao.moreMoney();
	}
	
}
