package fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity.GridAdapter.VoiceAdapter.OnVoiceItemSelectedListnere;
import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity.GridAdapter.VoiceAdapter.VoiceAdapterItem;
import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity.GridAdapter.VoiceAdapter.VoiceButtonAdapter;
import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.R;

/**
 * 音声選択用Fragment
 */
public class VoiceSelectorFragment extends Fragment {

    //音声選択用のgridview
    private GridView voiceGridView;

    private VoiceButtonAdapter gridViewAdapter;

    /**
     * コンストラクタ
     */
    public VoiceSelectorFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.voice_gridview_fragment,container,false);
        this.voiceGridView = (GridView)view.findViewById(R.id.voice_grid_view);
        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //TODO Viewが生成されたあとの処理を記載
        super.onViewCreated(view, savedInstanceState);

        //gridview
        //this.voiceGridView = (GridView) this.voiceSelectorFragment.getView().findViewById(R.id.voice_grid_view);
        this.voiceGridView.setOnItemClickListener(new OnVoiceItemSelectedListnere());

        this.gridViewAdapter = new VoiceButtonAdapter(getActivity());
        this.voiceGridView.setAdapter(gridViewAdapter);


        //テスト用コード
        //TODO あとでテスト用コード消すこと
        for (int i = 0; i < 100; i++) {
            VoiceAdapterItem sampleVoiceAdapterItem = new VoiceAdapterItem();
            sampleVoiceAdapterItem.setTitile("いーも" + i);
            sampleVoiceAdapterItem.setVoiceImage(ResourcesCompat.getDrawable(getResources(), R.drawable.anz_icon_defult, null));
            sampleVoiceAdapterItem.setVoiceFileId(R.raw.decide);
            this.gridViewAdapter.addVoiceItem(sampleVoiceAdapterItem);
        }
        this.gridViewAdapter.notifyDataSetChanged();
    }



}
