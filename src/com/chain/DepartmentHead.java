package com.chain;

/**
 * ���崦����2��ϵ������
 * @author Administrator
 *
 */
public class DepartmentHead extends Leader {

	public void handleRequest(int days) {
		if(days < 7){
			System.out.println("ϵ������׼�����" + days + "�졣");    
		}else{
			if(getNext() != null){
				getNext().handleRequest(days);
			}else{
				 System.out.println("�������̫�࣬û������׼�ü�����");
			}
		}
	}
}
