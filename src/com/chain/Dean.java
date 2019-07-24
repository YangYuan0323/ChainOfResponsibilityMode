package com.chain;

/**
 * 具体处理者3：院长
 * @author Administrator
 *
 */
public class Dean extends Leader {

	public void handleRequest(int days) {
		if(days < 10){
			System.out.println("院长批准您请假" + days + "天。");    
		}else{
			if(getNext() != null){
				getNext().handleRequest(days);
			}else{
				 System.out.println("请假天数太多，没有人批准该假条！");
			}
		}
		
	}

	
}
