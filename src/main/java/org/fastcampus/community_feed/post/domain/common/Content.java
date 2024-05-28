package org.fastcampus.community_feed.post.domain.common;

public class Content {
  private String content;

  public Content(String content) {
    if (content == null || content.isEmpty()) {
      throw new IllegalArgumentException("content should not be null or empty");
    }

    this.content = content;
  }
}
