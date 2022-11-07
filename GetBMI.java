     

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
        
@WebServlet("/outputBmi")
public class GetBMI extends HttpServlet{
	
	
public String calculateBMI(int weight, int height){
		
		int result = weight/((height * height) * 10000);
		
		if(result < 18.5){
			
			return "You are underweight";
		}
		else if(result >=18.5 && result <=25){
			
			return "You are normal weight";
			
		}
		else if(result >=26 && result <=30){
			return "You are over weight";
		}
		else{
			
			return "You are obese";
		}
	}
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
int weight = Integer.parseInt(req.getParameter("weight")); 
			
		int height = Integer.parseInt(req.getParameter("height"));
		
		String bmiResult = calculateBMI(weight,height);
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.println(bmiResult);
	}
	
}
    
    
   
