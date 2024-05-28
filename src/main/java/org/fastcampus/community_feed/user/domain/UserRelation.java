package org.fastcampus.community_feed.user.domain;

public class UserRelation {
  private final Long followingId;
  private final Long followerId;

  public UserRelation(Long followingId, Long followerId) {
    this.followingId = followingId;
    this.followerId = followerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    UserRelation that = (UserRelation) o;

    if (!followingId.equals(that.followingId)) return false;
    return followerId.equals(that.followerId);
  }

  @Override
  public int hashCode() {
    int result = followingId.hashCode();
    result = 31 * result + followerId.hashCode();
    return result;
  }
}
