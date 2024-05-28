package org.fastcampus.community_feed.user.domain;

public class User {
  private final Long id;
  private final UserInfo userInfo;
  private final UserRelationCount followingCount;
  private final UserRelationCount followerCount;

  public User(Long id, UserInfo userInfo) {
    if (userInfo == null) {
      throw new IllegalArgumentException("UserInfo cannot be null");
    }

    this.id = id;
    this.userInfo = userInfo;
    this.followingCount = new UserRelationCount();
    this.followerCount = new UserRelationCount();
  }

  public void follow(User followee) {
    followingCount.increaseCount();
    followee.increaseFollowerCount();
  }

  public void unfollow(User followee) {
    followingCount.decreaseCount();
    followee.decreaseFollowerCount();
  }

  private void increaseFollowerCount() {
    followerCount.increaseCount();
  }

  private void decreaseFollowerCount() {
    followerCount.decreaseCount();
  }
}
