package com.google.models;

import java.util.Objects;

public class Album {
  public static class Id {
    private final int singerId;
    private final long albumId;

    public Id(int singerId, long albumId) {
      this.singerId = singerId;
      this.albumId = albumId;
    }

    public int getSingerId() {
      return singerId;
    }

    public long getAlbumId() {
      return albumId;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Id)) {
        return false;
      }
      Id id = (Id) o;
      return singerId == id.singerId && albumId == id.albumId;
    }

    @Override
    public int hashCode() {
      return Objects.hash(singerId, albumId);
    }

    @Override
    public String toString() {
      return "Id{" +
          "singerId=" + singerId +
          ", albumId=" + albumId +
          '}';
    }
  }

  private final Id id;
  private final String albumTitle;

  public Album(int singerId, long albumId, String albumTitle) {
    this.id = new Id(singerId, albumId);
    this.albumTitle = albumTitle;
  }

  public Id getId() {
    return id;
  }

  public String getAlbumTitle() {
    return albumTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Album)) {
      return false;
    }
    Album album = (Album) o;
    return Objects.equals(id, album.id) && Objects.equals(albumTitle,
        album.albumTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, albumTitle);
  }

  @Override
  public String toString() {
    return "Album{" +
        "id=" + id +
        ", albumTitle='" + albumTitle + '\'' +
        '}';
  }
}