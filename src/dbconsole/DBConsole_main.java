package dbconsole;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id,score,point;
		String  name,achievement,students;
		ResultSet rs;
		
		MySQL mysql = new MySQL();
		
        rs=mysql.selectAll();
        try{
          while(rs.next()){
        	  id=rs.getInt("id");
        	  name=rs.getString("name");
        	  score=rs.getInt("score");
        	  point=rs.getInt("point");
        	  achievement=rs.getString("achievement");
        	  students=rs.getString("students");
        	  System.out.println("ID:"+id);
        	  System.out.println("���O:"+name);
        	  System.out.println("���_:"+score);
        	  System.out.println("�w��"+students);
        	  System.out.println("����"+achievement);
        	  System.out.println("���_"+point);
          }
         }  catch(SQLException e){
        	e.printStackTrace();
            }

	}
}	
	
	
        	
      	
  
