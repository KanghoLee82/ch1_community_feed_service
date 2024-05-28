package org.fastcampus.community_feed.post.domain.comment;

import org.fastcampus.community_feed.post.domain.common.Content;
import org.fastcampus.community_feed.post.domain.Post;
import org.fastcampus.community_feed.post.domain.common.DatetimeInfo;
import org.fastcampus.community_feed.post.domain.common.LikeCount;
import org.fastcampus.community_feed.user.domain.User;

public class Comment {
  private final Long id;
  private final Post post;
  private final User author;
  private final Content content;
  private final LikeCount likeCount;
  private final DatetimeInfo datetimeInfo;

  public Comment(Long id, Post post, User author, Content content) {
    if (post == null) {
      throw new IllegalArgumentException("post should not be null");
    }
    if (author == null) {
      throw new IllegalArgumentException("author should not be null");
    }
    if (content == null) {
      throw new IllegalArgumentException("content should not be null or empty");
    }

    this.id = id;
    this.post = post;
    this.author = author;
    this.content = content;
    this.likeCount = new LikeCount();
    this.datetimeInfo = new DatetimeInfo();
  }

}
