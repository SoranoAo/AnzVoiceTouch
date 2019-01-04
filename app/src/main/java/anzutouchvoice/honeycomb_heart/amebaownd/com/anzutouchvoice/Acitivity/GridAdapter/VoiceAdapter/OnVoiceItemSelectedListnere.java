package anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity.GridAdapter.VoiceAdapter;

import android.media.MediaPlayer;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.R;

/**
 * girdviewでItemが押されたときの動作を示すリスナー
 */
public class OnVoiceItemSelectedListnere implements AdapterView.OnItemClickListener {


    private static final String TAG = "OnVoiceItemSelectedListnere";

    private MediaPlayer mediaPlayer = null;

    /**
     * コンストラクタ
     */
    public OnVoiceItemSelectedListnere(){

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d(TAG,"onItemSelected called");

        //選択されたアイテムを取得
        VoiceButtonAdapter gridViewitemAdapter = (VoiceButtonAdapter) parent.getAdapter();
        VoiceAdapterItem voiceAdapterItem = (VoiceAdapterItem) gridViewitemAdapter.getItem(position);


        //画面表示
        //Snackbar.make(view,voiceAdapterItem.getTitile(),Snackbar.LENGTH_LONG).show();

        Toast.makeText(view.getContext(),voiceAdapterItem.getTitile(),Toast.LENGTH_LONG).show();


        //ボイス再生
        this.mediaPlayer = MediaPlayer.create(view.getContext(), voiceAdapterItem.getVoiceFileId());

        //再生終了時のリスナー設定
        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.stop();
                mediaPlayer.reset();
                mediaPlayer.release();
            }
        });


        this.mediaPlayer.start();

    }
}
