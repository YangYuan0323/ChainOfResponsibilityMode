package com.chain;
/**
 * 抽象处理者：领导类
 * @author Administrator
 *
 */
public abstract class Leader {
	
	private Leader next;
	
	public Leader getNext() {
		return next;
	}

	public void setNext(Leader next) {
		this.next = next;
	}

	/**
	 * 处理请假天数的抽象方法
	 */
	public abstract void handleRequest(int days);

}
