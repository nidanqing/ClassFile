package �ļ���;

import java.io.File;


public class ListFileTree {
	
	static void listTree(String pathString,int level) {  //��һ��level��ʾÿ����Ŀ¼���ݹ����ʱ��1��
		
		File f=new File(pathString);
		File[] fs=f.listFiles();
		
		for(int i=0;i<level;i++) {
			System.out.print("-");
		}
		
		if(fs!=null) {
		for(File tmp : fs) {    //��Ҫһ���������ʹ��������ѭ��
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
