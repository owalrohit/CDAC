package com.cdac.tester;

import java.sql.Date;
import java.util.Scanner;

import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;

public class TestLayeredApplication {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 1. create DAO instance
			UserDao userDao = new UserDaoImpl();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options - 1. Fetch Users By Role\n" + "2.User register \n" + "3.Update password \n"
						+ "4.delete voter\n"+"5. Sign in \n" + "0. Exit");
				System.out.println("Choose Option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter role name");
						userDao.fetchUserDetailsByRole(sc.next()).forEach(System.out::println);
						break;
					case 2:
						System.out.println("enter voter details - firstname,lastname,email,password,dob");
						User voter = new User(sc.next(), sc.next(), sc.next(), sc.next(), Date.valueOf(sc.next()));
						// invoke dao's method
						System.out.println(userDao.registerVoter(voter));
						break;

					case 3:
						System.out.println("enter email, new password, old password");
						userDao.changePassword(sc.next(), sc.next(), sc.next());
						break;

					case 4:
						System.out.println("enter id to delete : ");
						userDao.deleteVoter(sc.nextInt());
						break;

					case 5:
						System.out.println("enter email and password : ");
						System.out.println(userDao.signIn(sc.next(), sc.next()));
						break;

					case 0:
						exit = true;
						userDao.cleanUp();
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
