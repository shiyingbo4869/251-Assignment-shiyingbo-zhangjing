package Jtatext;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

/**
 * ����
 * @author follow
 *
 */
public class GuiTest {
	
	//�ļ��򿪶�ȡ����
	@Test
	public void open(){
		File file = new File("src/Jtatext/Print.java"); 
		//try resource,ִ�����Զ��ͷų���
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String line = null;
        	
        	while((line = br.readLine()) != null){
        		System.out.println(line);
        	}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//�ļ������滻
	@Test
	public void searchReplace(){
		File file = new File("src/Jtatext/test.txt"); 
		//try resource,ִ�����Զ��ͷų���
		StringBuilder sb = new StringBuilder("");
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String line = null;
        	
        	while((line = br.readLine()) != null){
        		System.out.println(line);
        		sb.append(line);
        	}
        	
        	System.out.println(sb.toString().replaceAll("HI", "HI World"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
	
	//�ļ��ַ����滻����
	@Test
	public void replaceSave(){
		File file = new File("src/Jtatext/test.txt"); 
		
		BufferedWriter bw = null;
		//try resource,ִ�����Զ��ͷų���
		StringBuilder sb = new StringBuilder("");
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String line = null;
        	
        	while((line = br.readLine()) != null){
        		System.out.println(line);
        		sb.append(line);
        	}
        	
        	bw = new BufferedWriter(new FileWriter(file));
        	bw.append(sb.toString().replaceAll("Hello", "HI"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
