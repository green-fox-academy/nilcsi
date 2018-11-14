package com.Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {


        /*Reuse your BlogPost class
        Create a Blog class which can
                store a list of BlogPosts
                add BlogPosts to the list
                delete(int) one item at given index
        update(int, BlogPost) one item at the given index and update it with another BlogPost*/

    List<BlogPost> blogs;

    public Blog() {
        this.blogs = new ArrayList<>();
    }

    public void add(String authorName, String title, String text, String publicationDate) {
        blogs.add(new BlogPost(authorName, title, text, publicationDate));
    }

    public void deleteItem(int deleteIndex){
                blogs.remove(deleteIndex);
    }

    public void updatePost(int ind, BlogPost blogPosts) {
        blogs.set(ind, blogPosts);
    }
}