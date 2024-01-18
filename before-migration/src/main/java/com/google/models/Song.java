package com.google.models;

import java.util.Objects;

public class Song {

  private final int singerId;
  private final int albumId;
  private final int songId;
  private final String songName;
  private final String songData;

  public Song(String songName, String songData) {
    this(-1, -1, -1, songName, songData);
  }

  public Song(int singerId, int albumId, int songId, String songName, String songData) {
    this.singerId = singerId;
    this.albumId = albumId;
    this.songId = songId;
    this.songName = songName;
    this.songData = songData;
  }

  public int getSingerId() {
    return singerId;
  }

  public int getAlbumId() {
    return albumId;
  }

  public int getSongId() {
    return songId;
  }

  public String getSongName() {
    return songName;
  }

  public String getSongData() {
    return songData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Song)) {
      return false;
    }
    Song song = (Song) o;
    return singerId == song.singerId && albumId == song.albumId && songId == song.songId
        && Objects.equals(songName, song.songName) && Objects.equals(songData,
        song.songData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(singerId, albumId, songId, songName, songData);
  }

  @Override
  public String toString() {
    return "Song{" +
        "singerId=" + singerId +
        ", albumId=" + albumId +
        ", songId=" + songId +
        ", songName='" + songName + '\'' +
        ", songData='" + songData + '\'' +
        '}';
  }
}