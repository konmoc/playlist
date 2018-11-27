package implementation;

import api.Multimedia;
import api.PlayStyle;
import api.Playlist;

import java.util.List;

public class StandardPlaylist implements Playlist {

    List<Object> multimediaList;
    PlayStyle playStyle;

    public void addToPlaylist(Multimedia multimedia) {
        this.multimediaList.add(multimedia);
    }

    public void addAnotherPlaylist(Playlist playlist) {
        this.multimediaList.add(playlist);
    }

    public List<Object> getMultimediaList() {
        return multimediaList;
    }

    public void setMultimediaList(List<Object> multimediaList) {
        this.multimediaList = multimediaList;
    }

    public PlayStyle getPlayStyle() {
        return playStyle;
    }

    public void setPlayStyle(PlayStyle playStyle) {
        this.playStyle = playStyle;
    }
}
