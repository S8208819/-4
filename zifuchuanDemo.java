package zifuchuan;
import java.util.Scanner;
public class zifuchuanDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ʫ��");
		String line = sc.nextLine();
        String result = "";
		
		char[] chs = line.toCharArray();
		int k=0;
		while(k<1) {
			if(chs.length%7==0) {
				k=1;
			}
			else {
				System.out.println("�Բ������������Ϣ�����ϸ�ʽ");
				sc = new Scanner(System.in);
				System.out.println("�����������ʫ");
				line = sc.nextLine();
				result = "";
				chs = line.toCharArray();
				k=0;
			}
			for (int x = 0; x<= chs.length - 1; x++) {
				result += chs[x];
			}
		for (int i = 0; i<= chs.length - 1; i++) {
			int j=(i+1)/7;
			System.out.print(chs[i]);
			if((i+1)%7==0) {
				if(j % 2==1)
					System.out.print("��");
				if(j % 2==0)
					System.out.println("��");
			}
		}
		System.out.println("����Ҫ���ҵ��ַ�");
		String in=sc.next();
		int count=0;
		
		for(int a=0;a<line.length();a++) {
			char c=in.charAt(0);
			if (c==chs[a]) {
			    count++;
			   }
		}
		 System.out.println("��ʫ�г���"+count+"��");
		 System.out.println("���γ������");
		}

	}

}
