package org.fastcampus.community_feed.post.domain;

import org.fastcampus.community_feed.post.domain.common.Content;
import org.fastcampus.community_feed.post.domain.common.DatetimeInfo;
import org.fastcampus.community_feed.post.domain.common.LikeCount;
import org.fastcampus.community_feed.user.domain.User;

public class Post {
  private final Long id;
  private final User author;
  private final Content content;
  private final LikeCount likeCount;
  private final DatetimeInfo datetimeInfo;

  public Post(Long id, User author, Content content) {
    if (author == null) {
      throw new IllegalArgumentException("author should not be null");
    }
    if (content == null) {
      throw new IllegalArgumentException("content should not be null or empty");
    }

    this.id = id;
    this.author = author;
    this.content = content;
    this.likeCount = new LikeCount();
    this.datetimeInfo = new DatetimeInfo();
  }
}
