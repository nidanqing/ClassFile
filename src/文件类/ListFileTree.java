package 文件类;

import java.io.File;


public class ListFileTree {
	
	static void listTree(String pathString,int level) {  //加一个level表示每几层目录，递归调用时加1，
		
		File f=new File(pathString);
		File[] fs=f.listFiles();
		
		for(int i=0;i<level;i++) {
			System.out.print("-");
		}
		
		if(fs!=null) {
		for(File tmp : fs) {    //需要一个数组才能使用这样的循环
			System.out.println(tmp.getName());
			
			if (tmp.isDirectory()){
				
				listTree(tmp.getPath(),level+1);}
				
			
		}
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pathString="C:\\Users\\ndqwm\\git";
		listTree(pathString,1);
	}

}
