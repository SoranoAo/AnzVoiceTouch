package util;

import java.util.List;
import java.util.Map;

import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity.GridAdapter.VoiceAdapter.VoiceAdapterItem;

/**
 * 音声と音声の名前情報のローダ
 */
public interface VoiceItemLoader {


    //画面に表示する音声アイテムのリストを取得する
    public List<VoiceAdapterItem> LoadVoiceAdapterItem();

}
