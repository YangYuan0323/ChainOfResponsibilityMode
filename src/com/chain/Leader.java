package com.chain;
/**
 * �������ߣ��쵼��
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
	 * ������������ĳ��󷽷�
	 */
	public abstract void handleRequest(int days);

}
