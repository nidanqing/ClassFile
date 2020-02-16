package 文件类;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.NEW;


public class TestFile {

	public static void main(String[] args) throws IOException {
		//路径用正斜杠反斜杠都可以，用反斜杠时需要加转义符
		//File f = new File("c:\\MySite\\index.html");
		File f=new File("c:/MySite/index.html");
		//打印文件路径
		System.out.println(f);
		//文件改名
		f.renameTo(new File("c:/MySite/index.htm"));
		//C:\Users\ndqwm\Workspaces\MyEclipse Professional 2014\文件类
		//显示项目所在物理位置
		System.out.println(System.getProperty("user.dir"));
		//创建新文件
		File f1= new File("ddl.txt");
		//f1.createNewFile();
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getName());
		System.out.println(f1.length());
		System.out.println(new Date(f1.lastModified()));
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		System.out.println(f1.exists());
		File f2=new File("srcc\\folders\\");
		boolean hh=f2.mkdirs();
		System.out.println(hh);
		
		
		
		
	}



}
