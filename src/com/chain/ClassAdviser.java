package com.chain;

/**
 * ���崦����1����������
 * @author Administrator
 *
 */
public class ClassAdviser extends Leader {

	public void handleRequest(int days) {
		if(days < 2){
			System.out.println("��������׼�����" + days + "�졣");    
		}else{
			if(getNext() != null){
				getNext().handleRequest(days);
			}else{
				 System.out.println("�������̫�࣬û������׼�ü�����");
			}
		}
		
	}

	
}
