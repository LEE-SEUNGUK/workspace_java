package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class JdbcMain {
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String DB_ID = "java";
	private static final String DB_PW = "oracle";

	public static void main(String[] args) throws SQLException {
		// db와 연결
		Connection conn = null;
		// sql 명령
		PreparedStatement ps = null;
		// 쿼리 실행 결과
		ResultSet rs = null;
		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("등록 실패");
			e.printStackTrace();
			System.exit(0); // 프로그램 종료
		}
		try {
			conn = DriverManager.getConnection(URL, DB_ID, DB_PW);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("접속 성공");

		while (true) {
			Scanner scan = new Scanner(System.in);
			StringBuffer query = new StringBuffer();
			System.out.println("학사 정보 시스템입니다.");
			System.out.println("1. 조회 | 2. 수정(q:종료)");
			String msg = scan.nextLine();
			if (msg.equals("q")) {
				System.out.println("삭사 정보 시스템 종료");
				break;
			}
			int sel = Integer.parseInt(msg);
			if (sel == 1) {
				System.out.println("조회할 학번을 입력하세요: ");
				// 학생의 정보 출력
				String num = scan.nextLine();

				query.append("SELECT 이름, 전공, 평점 ");
				query.append(" FROM 학생 ");
				query.append(" WHERE 학번 = ?");

				ps = conn.prepareStatement(query.toString());
				ps.setString(1, num);
				rs = ps.executeQuery();

				rs.next();
				String name = rs.getString("이름");
				String major = rs.getString("전공");
				float grade = rs.getFloat("평점");
				System.out.println("이름: " + name + ", 전공: " + major + ", 평점: " + grade);

			} else if (sel == 2) {
				System.out.println("수정할 학번을 입력하세요: ");
				String num = scan.nextLine();
				System.out.println("새로운 이름을 입력하세요: ");
				String nm = scan.nextLine();

				query.append("update 학생 ");
				query.append("set 이름 = ? ");
				query.append("where 학번 = ?");

				ps = conn.prepareStatement(query.toString());
				ps.setString(1, nm);
				ps.setString(2, num);
				int cnt = ps.executeUpdate();
				if (cnt > 0) {
					System.out.println("성공적으로 업데이트됨");
				} else {
					System.out.println("실패");
				}
			} else {
				System.out.println("다시 입력!");
			}
		}

		// connetion 객체를 꼭 닫아야함
		// 안닫으면 계속 쌓여서 에러 발생
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
