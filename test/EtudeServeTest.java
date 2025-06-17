import static org.mockito.Mockito.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;
import org.junit.Test;

public class EtudeServeTest {

    @Test
    public void testDoPostWith4And5() throws Exception {
        
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);

       
        when(request.getParameter("nom")).thenReturn("Test");
        when(request.getParameter("n1")).thenReturn("4");
        when(request.getParameter("n2")).thenReturn("5");
        when(request.getRequestDispatcher("result.jsp")).thenReturn(dispatcher);
        
      
        new EtudeServe().doPost(request, response);
        
        
        verify(request).setAttribute("nom", "Test");
        verify(request).setAttribute("n1", 4);
        verify(request).setAttribute("n2", 5);
        verify(request).setAttribute("moy", 4.5); 
        
       
        verify(dispatcher).forward(request, response);
    }
}