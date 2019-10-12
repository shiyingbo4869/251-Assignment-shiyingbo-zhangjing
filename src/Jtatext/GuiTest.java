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
 * ≤‚ ‘
 * @author Shi Yingbo  Zhang Jing
 *
 */
public class GuiTest {
	
	//Open the file read test
	@Test
	public void open(){
		File file = new File("src/Jtatext/Print.java"); 
		//try resource,Automatic release program is executed
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
	
	//File search and replace
	@Test
	public void searchReplace(){
		File file = new File("src/Jtatext/test.txt"); 
		//try resource,Automatic release program is executed
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
	
	//File string replacement save
	@Test
	public void replaceSave(){
		File file = new File("src/Jtatext/test.txt"); 
		
		BufferedWriter bw = null;
		//try resource,Automatic release program is executed
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

