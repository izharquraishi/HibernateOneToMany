package com.oneto.manymapping.annotation;

import java.io.Serializable;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cgf.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Question question = new Question();
		question.setName("what is a java");

		Answer answer1 = new Answer();
		answer1.setAnsweName("java is a programming language");

		Answer answer2 = new Answer();
		answer2.setAnsweName("java is platform independent");

		ArrayList<Answer> list = new ArrayList<Answer>();
		list.add(answer1);
		list.add(answer2);
		question.setAnswers(list);
		Serializable save = session.save(question);
		System.out.println(save);

		transaction.commit();

		System.out.println("Hello World!");

		session.close();
		factory.close();
	}
}
