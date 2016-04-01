package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice1 {
	
	public static void main(String[] args){
		try {
			new linked().create();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//		int[] c=new in().read();
//		int a0=c[0];
//		int a1=c[1];
//		int a2=c[2];
//		if(a1 > a0){
//			c[0]=a0;
//			c[1]=a1;
//			
//			if(a2 > a1){
//				c[2]=a2;
//			}else{
//				if(a2 > a0){
//					c[2]=a1;
//					c[1]=a2;
//				}else{
//					c[1]=a0;
//					c[2]=a1;
//					c[0]=a2;
//				}
//			}
//		}else{
//			c[0]=a1;
//			c[1]=a0;
//			
//			if(a2 > a1){
//				if(a2 < a0){
//					c[1]=a2;
//					c[2]=a0;
//				}else{
//					c[2]=a2;
//				}
//				
//			}else{
//				// a2 < a1
//				c[0]=a2;
//				c[1]=a1;
//				c[2]=a0;
//			}
//		}
//		
//		for(int ii=0; ii<3;ii++){
//			System.out.println("第"+ii+"个数为："+c[ii]);
//		}
//	}
	
	
}

class in{
	
	public int[] read(){
		
		
		int[] x =new int[3];
		int a;
		BufferedReader bur=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<3; i++){
			System.out.println("输入第"+i+"个数");
			try {
				a = Integer.parseInt(bur.readLine());
				x[i]=a;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return x;
//		for(int i=0; i<3; i++){
//			System.out.println("第"+i+"个数为"+x[i]);
//		}
		
	
	}
}

//用单链表算法会更加好一些
class linked{
	
	
	node p;
	//先创建链表，再赋值
	//采用头插法
	public void create() throws NumberFormatException, IOException{
		node h=new node();
		//这是头结点
		h.next=null;
		h.data=0;
		BufferedReader bur=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i < 3;  i++){
			p=new node();
			System.out.println("输入第"+i+"个数为：");
			p.data=Integer.parseInt(bur.readLine());
			p.next=h.next;
			h.next=p;
		}
		p=h.next;
		for(int i=0; i<3; i++){
			System.out.println(p.data);
			p=p.next;
		}	
		p=h.next;
		if(p.data> p.next.data){
			//if()
		}else{
			//第二个大于第三个
		}
	}
}

class node{
	int data;
	node next;
}
