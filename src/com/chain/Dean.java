package com.chain;

/**
 * ���崦����3��Ժ��
 * @author Administrator
 *
 */
public class Dean extends Leader {

	public void handleRequest(int days) {
		if(days < 10){
			System.out.println("Ժ����׼�����" + days + "�졣");    
		}else{
			if(getNext() != null){
				getNext().handleRequest(days);
			}else{
				 System.out.println("�������̫�࣬û������׼�ü�����");
			}
		}
		
	}

	
}
