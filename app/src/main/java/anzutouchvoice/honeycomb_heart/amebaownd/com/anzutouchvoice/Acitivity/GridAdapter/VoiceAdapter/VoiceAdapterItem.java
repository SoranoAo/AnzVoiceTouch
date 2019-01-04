package anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity.GridAdapter.VoiceAdapter;

import android.graphics.drawable.Drawable;

/**
 * 一つのボイスボタンのアイテムを示すクラス
 */
public class VoiceAdapterItem {

    //ボイスの名前
    private String Titile;

    //ボイスの説明
    private String description;

    //ボイスのイメージ画像
    private Drawable voiceImage;

    //ボイスファイルリソースID
    private String voiceFileId;


    public String getTitile() {
        return Titile;
    }

    public void setTitile(String titile) {
        Titile = titile;
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

    public String getVoiceFileId() {
        return voiceFileId;
    }

    public void setVoiceFileId(String voiceFileId) {
        this.voiceFileId = voiceFileId;
    }
}
