package com.git.tutorial;

public class GitMain {
	public static void main(String[] args) {
		GitSample data = new GitSample();
		greetings();
		data.display();
		
	}
	static void greetings()
	{
		System.out.println("Welcome to git tutorials");
		System.out.println("Its great to learn git");
	}
}
