package Shipbuilder;

import java.io.*;
import java.util.*;
public class ComponentLoader {

		public ComponentLoader(){
			
			
		}
		public ArrayList<String> read(File f){
			String line;
			String temp = "" ;
			ArrayList<String> list = new ArrayList<String>();
			try {
				BufferedReader reader = new BufferedReader(new FileReader(f));
				
				while((line = reader.readLine()) != null){
					if(line.contains("$")){
						list.add(temp);
						temp = "";
					}else{
						temp += line;
						temp += "\n";
					}
				}
			} catch (Exception e) {
				
				System.out.println("It borked: " + "\n" +  e.getMessage());
			}
			return list; 
		}
		
		public ArrayList<String> split(String s){
			ArrayList<String> list = new ArrayList<String>();
//			int index = s.indexOf('=');
//			if(index>-1){
//				System.out.println(s.substring(index));
//			}
//			else{
//				System.out.println(s);
//			}
			for(String line : s.split("\n")){
				int index=line.indexOf('=');
				if(index >=0){
					line = line.substring(index+1);
					list.add(line);
				}
			}
			return list;
		}
		public ArrayList<Integer> process(ArrayList<String> S){
			int value=0;
			ArrayList<Integer> values=new ArrayList<Integer>();
			for(String s:S){
				if(s.equalsIgnoreCase("true")){
					value = 1;
				}else if(s.equalsIgnoreCase("false")){
					value = 0;
				}else{
					try{
						value = Integer.parseInt(s);
					}catch(Exception e){
						e.getMessage();
					}
				}
				values.add(value);
			}
			return values;
		}
		
		public static void main(String args[]){
			ComponentLoader c = new ComponentLoader();
			File f = new File(System.getProperty("user.dir"),"test.txt");
			ArrayList<String> list = c.read(f);
			ArrayList<ArrayList<Integer>> data=new ArrayList<ArrayList<Integer>>();
			for(String s : list){
				ArrayList<Integer> subdata= new ArrayList<Integer>();
//				System.out.println("This is the string:");
//				System.out.println(s);
//				System.out.println("This is the processing:");
//				for(String t:c.split(s)){
//					System.out.println(t);
//				}
				subdata=c.process(c.split(s));
				data.add(subdata);
				
			}
			for(Integer iter : data.get(1)){
				System.out.println(iter);
			}
		}
}
