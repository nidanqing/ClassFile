package �ļ���;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.NEW;


public class TestFile {

	public static void main(String[] args) throws IOException {
		//·������б�ܷ�б�ܶ����ԣ��÷�б��ʱ��Ҫ��ת���
		//File f = new File("c:\\MySite\\index.html");
		File f=new File("c:/MySite/index.html");
		//��ӡ�ļ�·��
		System.out.println(f);
		//�ļ�����
		f.renameTo(new File("c:/MySite/index.htm"));
		//C:\Users\ndqwm\Workspaces\MyEclipse Professional 2014\�ļ���
		//��ʾ��Ŀ��������λ��
		System.out.println(System.getProperty("user.dir"));
		//�������ļ�
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
