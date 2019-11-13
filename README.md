计182 2018310785 彭亦斌
一.实验目的
1.掌握字符串String及其方法的使用
2.掌握异常处理结构
二.实验要求：
内容：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：
1.	每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.	允许提供输入参数，统计古诗中某个字或词出现的次数
3.	考虑操作中可能出现的异常，在程序中设计异常处理程序
调试过程：
1.建立静态主函数，获取用户输入内容：
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入古诗：");
 2.定义相关变量
 		String line = sc.nextLine();
    String result = "";
    char[] chs = line.toCharArray();
    int k=0;
 3.异常处理，利用while函数对所输入的内容进行判断，若输入的字符不是7个汉字的整数倍，重新输入古诗，并再次进行判断：
 		while(k<1) {
			if(chs.length%7==0) {
				k=1;
			}
			else {
				System.out.println("对不起，您输入的信息不符合格式");
				sc = new Scanner(System.in);
				System.out.println("请重新输入古诗");
				line = sc.nextLine();
				result = "";
				chs = line.toCharArray();
				k=0;
			}
      			for (int x = 0; x<= chs.length - 1; x++) {
				result += chs[x];
			}
4.利用循环进行判断，只满足7的倍数添加逗号，既满足7又满足2的倍数添加句号：
		for (int i = 0; i<= chs.length - 1; i++) {
			int j=(i+1)/7;
			System.out.print(chs[i]);
			if((i+1)%7==0) {
				if(j % 2==1)
					System.out.print("，");
				if(j % 2==0)
					System.out.println("。");
			}
		}
5.获取用户输入查找的字符，并定义变量：
		System.out.println("输入要查找的字符");
		String in=sc.next();
    int count=0;
6.遍历字符串，并进行判定，输出：
		for(int a=0;a<line.length();a++) {
			char c=in.charAt(0);
			if (c==chs[a]) {
			    count++;
			   }
		}
		 System.out.println("古诗中出现"+count+"次");
		 System.out.println("本次程序结束");
三、实验运行结果截图：

![e]（https://github.com/S8208819/-4/blob/master/31cb697ca954d62d08758d5011e1733.png）

四、总结
  本次的java实验整体上还是比较简单地，整节实验课让我了解到字符串的相关知识，让我获益匪浅，在程序中，我学习到了很多新的内容，同时也复习到了之前学习的很多内容，在对字符串中的字符进行查找时，先输入查找内容，再进行遍历，并输出遍历结果，这个内容让我复习到了之前学习的其他相关知识，在对整首古诗的进行分隔的操作，我利用循环进行判断，看他是否满足7个字符和2个字符分别进行判断来达到进行分隔的效果，总之，整个实验还是让我收获了许多内容。
    
