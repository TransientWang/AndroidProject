package android;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EduLogin
 */
@WebServlet("/EduLogin")
public class EduLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EduLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 request.setCharacterEncoding("UTF-8");
	        String username = request.getParameter("username");
	        String password = request.getParameter("password");
	        if ("8157".equals(username)&&"1234".equals(password)) {
	            System.out.println("��¼�ɹ�");
	            response.getOutputStream().write("��¼�ɹ�".getBytes("utf-8"));
	            System.out.println("���ص����ݣ�" + "��¼�ɹ�".getBytes("utf-8"));

	        }else {
	            System.out.println("��¼ʧ��");
	            response.getOutputStream().write("��¼ʧ��".getBytes("utf-8"));

	        }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setCharacterEncoding("UTF-8");
	        response.setHeader("content-type", "text/html;charset=UTF-8");
		doGet(request, response);
	}

}
