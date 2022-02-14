package com.example.board;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class PostBean {

	Post post = new Post();
	
	static List<Post> results = new ArrayList<Post>();
	
//スレッド追加メソッド
	public List<Post> addPost(Post post){
		post.createdDate=new Date();
		results.add(post);
		return results;
	}
	
	
	
	
}

