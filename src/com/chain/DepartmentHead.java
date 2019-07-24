package com.chain;

/**
 * 具体处理者2：系主任类
 * @author Administrator
 *
 */
public class DepartmentHead extends Leader {

	public void handleRequest(int days) {
		if(days < 7){
			System.out.println("系主任批准您请假" + days + "天。");    
		}else{
			if(getNext() != null){
				getNext().handleRequest(days);
			}else{
				 System.out.println("请假天数太多，没有人批准该假条！");
			}
		}
	}
}
