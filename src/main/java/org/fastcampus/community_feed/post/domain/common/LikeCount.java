package org.fastcampus.community_feed.post.domain.common;

public class LikeCount {
  private int count;

  public LikeCount() {
    this.count = 0;
  }

  public int getCount() {
    return count;
  }

  public void like() {
    count++;
  }

  public void unlike() {
    if (count > 0) {
      count--;
    }
  }
}
