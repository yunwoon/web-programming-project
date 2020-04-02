package baby.diary.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import baby.diary.domain.BabyVO;
import baby.diary.domain.MemberVO;
import baby.diary.persistence.BabyDAO;
import baby.diary.persistence.MemberDAO;

@WebServlet("/BabyServlet")
public class BabyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BabyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String cmd = "";
		cmd = request.getParameter("key");

		if (cmd.equals("login")) {
			response.sendRedirect("login.jsp");
		} else if (cmd.equals("join")) {
			response.sendRedirect("register.jsp");
		} else if (cmd.equals("list")) {
			MemberDAO dao = new MemberDAO();
			ArrayList<MemberVO> memberList = dao.getMemberList();
			request.setAttribute("memberList", memberList);
			RequestDispatcher view = request.getRequestDispatcher("member_list.jsp");
			view.forward(request, response);
		} else if (cmd.equals("update")) {
			MemberDAO dao = new MemberDAO();
			MemberVO member = dao.read(request.getParameter("id"));
			request.setAttribute("member", member);
			RequestDispatcher view = request.getRequestDispatcher("member_update.jsp");
			view.forward(request, response);
		} else if (cmd.equals("write")) {
			response.sendRedirect("diary_write.jsp");
		} else if (cmd.equals("diary")) {
			BabyDAO dao = new BabyDAO();
			ArrayList<BabyVO> babyList = dao.getBabyList();
			request.setAttribute("babyList", babyList);
			RequestDispatcher view = request.getRequestDispatcher("diary.jsp");
			view.forward(request, response);
		} else if (cmd.equals("read")) {
			BabyDAO dao = new BabyDAO();
			BabyVO baby = dao.read(request.getParameter("date"));
			request.setAttribute("baby", baby);
			RequestDispatcher view = request.getRequestDispatcher("diary_read.jsp");
			view.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession httpSession = request.getSession(true); // 세션에 아디, 비번 저장

		String cmd = "";
		cmd = request.getParameter("key");

		if (cmd.equals("login")) {
			MemberDAO dao = new MemberDAO();
			String errmsg = "";
			String id = request.getParameter("id");
			String pwd = request.getParameter("password");

			if (dao.login_check(id, pwd)) {

				httpSession.setAttribute("id", id);
				httpSession.setAttribute("pwd", pwd);

				RequestDispatcher view = request.getRequestDispatcher("main.jsp");
				view.forward(request, response);
			} else {
				errmsg = "one more check, plz";
				request.setAttribute("errmsg", errmsg);

				RequestDispatcher view = request.getRequestDispatcher("login.jsp");
				view.forward(request, response);
			}
		} else if (cmd.equals("logout")) {
			httpSession.invalidate();
			RequestDispatcher view = request.getRequestDispatcher("index.html");
			view.forward(request, response);
		} else if (cmd.equals("join")) {
			MemberVO memberVO = new MemberVO();
			String errmsg = "";

			memberVO.setUsername(request.getParameter("username"));
			memberVO.setMobile(request.getParameter("mobile"));
			memberVO.setId(request.getParameter("id"));
			memberVO.setPassword(request.getParameter("password"));

			MemberDAO memberDAO = new MemberDAO();
			if (memberDAO.add(memberVO)) {
				// String succ = "회원가입 성공!";
				RequestDispatcher view = request.getRequestDispatcher("index.html");
				// request.setAttribute("success", succ);
				view.forward(request, response);
			} else {
				errmsg = "sorry, fail to join";
				request.setAttribute("errmsg", errmsg);

				RequestDispatcher view = request.getRequestDispatcher("register.jsp");
				view.forward(request, response);
			}
		} else if (cmd.equals("update")) {
			MemberVO memberVO = new MemberVO();
			String message="";

			memberVO.setId(request.getParameter("id"));
			memberVO.setPassword(request.getParameter("password"));
			memberVO.setUsername(request.getParameter("username"));
			memberVO.setMobile(request.getParameter("mobile"));

			MemberDAO dao = new MemberDAO();

			if (dao.update(memberVO))
				message = "수정 완료";
			else
				message = "수정 실패";
			
			memberVO = dao.read(request.getParameter("id"));
					
			request.setAttribute("message", message);
			request.setAttribute("member", memberVO);

			RequestDispatcher view = request.getRequestDispatcher("member_update.jsp");
			view.forward(request, response);
		} else if(cmd.equals("delete")) {
			MemberVO memberVO = new MemberVO();
			String message="";

			memberVO.setId(request.getParameter("id"));
			memberVO.setPassword(request.getParameter("password"));
			memberVO.setUsername(request.getParameter("username"));
			memberVO.setMobile(request.getParameter("mobile"));
			
			MemberDAO dao = new MemberDAO();
			
			if (dao.delete(memberVO)) {
				message = "삭제 완료";
				ArrayList<MemberVO> memberList = dao.getMemberList();
				request.setAttribute("message", message);
				request.setAttribute("memberList", memberList);
				
				RequestDispatcher view = request.getRequestDispatcher("member_list.jsp");
				view.forward(request, response);
			}
			else {
				message = "삭제 실패";
				memberVO = dao.read(request.getParameter("id"));
				
				request.setAttribute("message", message);
				request.setAttribute("member", memberVO);

				RequestDispatcher view = request.getRequestDispatcher("member_update.jsp");
				view.forward(request, response);
			}
		} else if(cmd.equals("write")) {
			BabyVO babyVO = new BabyVO();

			babyVO.setTitle(request.getParameter("title"));
			babyVO.setWeather(request.getParameter("weather"));
			babyVO.setState(request.getParameter("state"));
			babyVO.setContent(request.getParameter("content"));
			babyVO.setSelf(request.getParameter("self"));

			BabyDAO babyDAO = new BabyDAO();
			if (babyDAO.add(babyVO)) {
				BabyDAO dao = new BabyDAO();
				ArrayList<BabyVO> babyList = dao.getBabyList();
				request.setAttribute("babyList", babyList);
				RequestDispatcher view = request.getRequestDispatcher("diary.jsp");
				view.forward(request, response);
			} else {
				RequestDispatcher view = request.getRequestDispatcher("diary_write.jsp");
				view.forward(request, response);
			}
		} else if(cmd.equals("delete2")) {
			BabyVO babyVO = new BabyVO();
			
			babyVO.setTitle(request.getParameter("title"));
			babyVO.setWeather(request.getParameter("weather"));
			babyVO.setState(request.getParameter("state"));
			babyVO.setContent(request.getParameter("content"));
			babyVO.setSelf(request.getParameter("self"));
			
			BabyDAO dao = new BabyDAO();
			
			if (dao.delete(babyVO)) {
				ArrayList<BabyVO> babyList = dao.getBabyList();
				request.setAttribute("babyList", babyList);
				
				RequestDispatcher view = request.getRequestDispatcher("diary.jsp");
				view.forward(request, response);
			}
		}
	}
}
