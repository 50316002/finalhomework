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
        	  System.out.println("名前:"+name);
        	  System.out.println("得点:"+score);
        	  System.out.println("学生"+students);
        	  System.out.println("成績"+achievement);
        	  System.out.println("得点"+point);
          }
         }  catch(SQLException e){
        	e.printStackTrace();
            }

	}
}	
	
	
        	
      	
  
