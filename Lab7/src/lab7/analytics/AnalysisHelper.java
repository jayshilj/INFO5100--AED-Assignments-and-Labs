/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author OPTIMIZEPRIME
 */
public class AnalysisHelper {

   public void userWithMostLikes() {
        Map<Integer, Integer> userLikecount = new HashMap<Integer, Integer>();

        Map<Integer, User> users = DataStore.getInstance().getUsers();
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikecount.containsKey(user.getId())) {
                    likes = userLikecount.get(user.getId());
                }
                likes += c.getLikes();
                userLikecount.put(user.getId(), likes);
            }
        }
//        int max = 0;
//        int maxId = 0;
//        for (int id : userLikecount.keySet()) {
//            if (userLikecount.get(id) > max) {
//                max = userLikecount.get(id);
//                maxId = id;
//            }

        LinkedHashMap<Integer, Integer> sortedMap
                = userLikecount.entrySet().stream().
                        sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(1).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("-------------------EXTRA-----------------------------");
        System.out.println("USER WITH MOST LIKES:");
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("User " + key + " Likes: " + value);
            break;
        }
    }
	
	 public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();

        List<Comment> commentList = new ArrayList<>(comments.values());

        Collections.sort(commentList, new Comparator<Comment>() {
            @Override
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        System.out.println("-----------------EXTRA-------------------------------");
        System.out.println("MOST LIKED COMMENTS: ");

        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }

	
	
	
	
	
	public void avgComment() {
       /* Map<Integer, Comment> comments = DataStore.getInstance().getComments();

        List<Comment> commentList = new ArrayList<>(comments.values());
        int total = 0, i = 0;
        for (Comment c : commentList) {
            i++;
            total = total + c.getLikes();
        }
        System.out.println("------------------------------------------------");
        System.out.println("1.-------AVERAGE LIKES---------");
        System.out.println("AVERAGE OF ALL LIKES ON ALL COMMENTS");

        System.out.println((int) total / i);*/
        
        
         Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        System.out.println("------------------------------------------------");
        System.out.println("1. AVERAGE OF ALL LIKES ON ALL COMMENTS:" + comments.values().stream()
                .mapToInt(item -> item.getLikes())
                .average()
                .getAsDouble());

    }

    public void postWithMostLikedComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();

        List<Comment> commentList = new ArrayList<>(comments.values());

        Collections.sort(commentList, new Comparator<Comment>() {
            @Override
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        System.out.println("------------------------------------------------");
        System.out.println("2. POST WITH MOST LIKED COMMENTS : ");

        for (int i = 0; i < commentList.size() && i < 1; i++) {

            System.out.println(commentList.get(i));
        }

        System.out.println("---");
        //System.out.println("POST ID ALL COMMENTS");

        for (Comment c : commentList) {
            int postid = c.getPostId();
            System.out.println("POST ID " + postid + " ALL COMMENTS");
            for (Comment c1 : commentList) {
                if (c1.getPostId() == postid) {
                    System.out.println(c1);
                }
            }
            break;

        }

    }
	
	public void postWithMostComments() {
        Map<Integer, Integer> postCommentcount = new HashMap<Integer, Integer>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        Map<Integer, Comment> comments = DataStore.getInstance().getComments();

        List<Comment> commentList = new ArrayList<>(comments.values());

        for (Post post : posts.values()) {
            for (Comment c : post.getComments()) {
                int commenPost = 0;
                if (postCommentcount.containsKey(post.getPostId())) {
                    commenPost = postCommentcount.get(post.getPostId());
                }
                commenPost++;
                postCommentcount.put(post.getPostId(), commenPost);
            }
        }

//        int max = 0;
//        int maxId = 0;
//        for (int id : postCommentcount.keySet()) {
//            if (postCommentcount.get(id) > max) {
//                max = postCommentcount.get(id);
//                maxId = id;
//            }
//        }
//         System.out.println("----------------------------------");
//        System.out.println("3. Post with Most Comments");
//        System.out.println(posts.get(maxId) + " Comments : " + max);
        LinkedHashMap<Integer, Integer> sortedMap
                = postCommentcount.entrySet().stream().
                        sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(1).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        //System.out.println(sortedMap);
        System.out.println("------------------------------------------------");
        System.out.println("3. POST WITH MOST COMMENTS :");

        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("PostId " + key + " Comments: " + value);
            for (Comment c : commentList) {
                if (c.getPostId() == key) {
                    //System.out.println("true");
                    System.out.println(c);
                }
            }
        }

    }

    public void userfiveInactivePosts() {
        Map<Integer, Integer> postCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        //   Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int count = 0, temp = 0;
        for (Post p : posts.values()) {
            //System.out.println(p.getUserId()+"   "+ p.getPostId());
            count++;
            if (postCount.containsKey(p.getUserId())) {
                temp = postCount.get(p.getUserId());
                count += temp;
            }

            postCount.put(p.getUserId(), count);
            count = 0;
        }

        LinkedHashMap<Integer, Integer> sortedMap
                = postCount.entrySet().stream().
                        sorted(Map.Entry.comparingByValue()).
                        limit(5).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));

        // System.out.println(sortedMap);
        System.out.println("------------------------------------------------");
        System.out.println("4.FIVE INACTIVE USERS BASED ON POSTS!");

        for (Map.Entry<Integer, Integer> entry
                : sortedMap.entrySet()) {

            Integer key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("UserId " + key + " Posts: " + value);

        }
    }
	
    public void userfiveInactiveComments() {
        Map<Integer, Integer> comments = new HashMap<Integer, Integer>();

        Map<Integer, User> users = DataStore.getInstance().getUsers();
        for (User user : users.values()) {

            comments.put(user.getId(), user.getComments().size());
            // System.out.println(comments);

        }

        LinkedHashMap<Integer, Integer> sortedMap
                = comments.entrySet().stream().
                        sorted(Map.Entry.comparingByValue()).
                        limit(5).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));

        //System.out.println(sortedMap);
        System.out.println("------------------------------------------------");
        System.out.println("5. FIVE INACTIVE USERS BASED ON COMMENTS!");

        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {

            Integer key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("UserId " + key + " Comments: " + value);

        }
    }

    public void topFiveInactiveUsersOverall() {
        System.out.println("------------------------------------------------");
        System.out.println("6. Five most Inactive Users Overall ");

        Map<Integer, User> userMap = DataStore.getInstance().getUsers();
        List<Map.Entry<Integer, User>> userList = new ArrayList<>(userMap.entrySet());

        Collections.sort(userList, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> u1, Map.Entry<Integer, User> u2) {
                return getOverAllScore(u1.getValue()) - getOverAllScore(u2.getValue());
            }
        });
        // System.out.println(userList);
        for (int i = 0; i < 5; i++) {
            System.out.println(userList.get(i).getValue()
                    + " Likes:" + getNumberOfLikesForUser(userList.get(i).getValue())
                    + " Posts:" + getNumberOfPostsForUser(userList.get(i).getValue())
                    + " Comments:" + getNumberOfCommentsForUser(userList.get(i).getValue())
                    + " Total:" + getOverAllScore(userList.get(i).getValue()));
        }

    }

    public void topFiveActiveUsersOverall() {
        System.out.println("------------------------------------------------");
        System.out.println("7. Five most Active Users Overall");

        Map<Integer, User> userMap = DataStore.getInstance().getUsers();
        List<Map.Entry<Integer, User>> userList = new ArrayList<>(userMap.entrySet());

        Collections.sort(userList, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> u1, Map.Entry<Integer, User> u2) {
                return getOverAllScore(u2.getValue()) - getOverAllScore(u1.getValue());
            }
        });

        // System.out.println(userList+"\n");
        //for (int i = 0; i<userList.size(); i++)
        for (int i = 0; i < userList.size() && i < 5; i++) {
            System.out.println(userList.get(i).getValue()
                    + " Likes:" + getNumberOfLikesForUser(userList.get(i).getValue())
                    + " Posts:" + getNumberOfPostsForUser(userList.get(i).getValue())
                    + " Comments:" + getNumberOfCommentsForUser(userList.get(i).getValue())
                    + " Total:" + getOverAllScore(userList.get(i).getValue()));
        }
    }

    public static int getOverAllScore(User user) {
        return getNumberOfPostsForUser(user)
                + getNumberOfCommentsForUser(user) + getNumberOfLikesForUser(user);

    }

    public static int getNumberOfCommentsForUser(User user) {
        return user.getComments().size();
    }

    public static int getNumberOfLikesForUser(User user) {
        Map<Integer, Comment> cmnt = DataStore.getInstance().getComments();

        int count = 0;
        for (Comment c : cmnt.values()) {
            if (c.getUserId() == user.getId()) {
                count = c.getLikes();
            }
        }

        return count;
    }

    public static int getNumberOfPostsForUser(User user) {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        int count = 0;
        for (Post p : posts.values()) {
            if (p.getUserId() == user.getId()) {
                count++;
            }
        }

        return count;
    }

}
