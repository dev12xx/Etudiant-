
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.Test;
import static org.junit.Assert.*;


public class EtudeServeTest {
    
    public EtudeServeTest() {
    }
    
   
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        EtudeServe instance = new EtudeServe();
        instance.doPost(request, response);
       
        fail("The test case is a prototype.");
    }
    
}
