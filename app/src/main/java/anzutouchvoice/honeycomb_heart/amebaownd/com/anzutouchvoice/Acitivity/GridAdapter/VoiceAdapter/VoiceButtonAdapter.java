package anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity.GridAdapter.VoiceAdapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.R;

/**
 * ボイスボタンのアダプタ
 */
public class VoiceButtonAdapter extends BaseAdapter {


    private Context context;

    //音声データのリスト
    private List<VoiceAdapterItem> voiceitemList = new ArrayList<>();

    //GiroitemのViewHloder
    private ViewHolder viewHolder;


    public VoiceButtonAdapter(Context context){
        this.context = context;
    }

    /**
     * 音声ファイルを追加する
     * @param voiceAdapterItem 追加する音声ファイル
     */
    public void addVoiceItem(VoiceAdapterItem voiceAdapterItem){

        if(voiceAdapterItem == null){
            throw new NullPointerException("voiceオブジェクトがnullです");
        }

        this.voiceitemList.add(voiceAdapterItem);

    }

    /**
     * 音声リストから音声を削除する
     * @param index
     * @return
     */
    public VoiceAdapterItem removeVoiceItem(int index){

        return this.voiceitemList.remove(index);

    }

    /**
     * 引数で渡したListの音声データを据えてリストに追加する
     * @param voiceAdapterItems
     */
    public void addVoiceItem(List<VoiceAdapterItem> voiceAdapterItems){
        this.voiceitemList.addAll(voiceAdapterItems);
    }

    /**
     * 音声リストをすべてクリアする
     */
    public void voiceItemClear(){

        this.voiceitemList.clear();

    }

    @Override
    public int getCount() {
        return this.voiceitemList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.voiceitemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridVoceiItemView = convertView;

        //viewのキャッシュがない場合はView生成
        if(gridVoceiItemView == null){
            gridVoceiItemView = View.inflate(context, R.layout.voice_item_row, null);
        }

        //ViewHolderに参照を保持する
        if(this.viewHolder == null) {
            this.viewHolder = new ViewHolder();
            this.viewHolder.viceNameTextView = gridVoceiItemView.findViewById(R.id.voiceTitileTextView);
            this.viewHolder.voiceImageView = gridVoceiItemView.findViewById(R.id.voiceImageView);
        }


        //Viewの内容を設定していく(holderが参照をもつためholderへセットすればよい)
        VoiceAdapterItem voiceAdapterItem = ((VoiceAdapterItem)getItem(position));
        this.viewHolder.viceNameTextView.setText(voiceAdapterItem.getTitile());

        this.viewHolder.voiceImageView.setImageDrawable(voiceAdapterItem.getVoiceImage());

        return gridVoceiItemView;
    }


    /**
     * Viewのキャッシュを保持する
     */
     static class ViewHolder{

        //ボイスの名前
        TextView viceNameTextView;

        //イメージ画像ImageView
        ImageView voiceImageView;


    }
}
