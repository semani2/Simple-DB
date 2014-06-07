import simpledb.file.*;
import simpledb.server.SimpleDB;

public class tester {
	
	public static void main(String[] args)
	{
		
		SimpleDB.initFileMgr("simpledb");
		Page p1=new Page();
		byte[] by1= new byte[4];
		System.out.println("Set bytes :  "+by1);
		p1.setBytes(350, by1);
		
		
		//
		Block b1=p1.append("student.tbl");
		System.out.print(b1);
		
		int buf_num=b1.number();
		System.out.print(buf_num);
		if (buf_num>0){
			Block b2 = new Block("student.tbl",buf_num);
			Page p2 = new Page();
			 p2.read(b2);
			 byte[] by2=p2.getBytes(350);
			 System.out.println("Get bytes : "+by2.toString());

		}	 
		}

}
