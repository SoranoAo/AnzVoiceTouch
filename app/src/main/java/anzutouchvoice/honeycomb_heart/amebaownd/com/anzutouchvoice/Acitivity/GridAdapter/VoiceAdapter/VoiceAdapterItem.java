package anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity.GridAdapter.VoiceAdapter;

import android.graphics.drawable.Drawable;

/**
 * 一つのボイスボタンのアイテムを示すクラス
 */
public class VoiceAdapterItem {

    //ボイスの名前
    private String title;

    //ボイスの説明
    private String description;

    //ボイスのイメージ画像
    private Drawable voiceImage;

    //ボイスファイルリソースID
    private int voiceFileId;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Drawable getVoiceImage() {
        return voiceImage;
    }

    public void setVoiceImage(Drawable voiceImage) {
        this.voiceImage = voiceImage;
    }

    public int getVoiceFileId() {
        return voiceFileId;
    }

    public void setVoiceFileId(int voiceFileId) {
        this.voiceFileId = voiceFileId;
    }
}
