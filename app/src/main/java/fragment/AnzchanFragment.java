package fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.R;

/**
 * あんずちゃんをつんつんするFragment
 */
public class AnzchanFragment extends Fragment {


    /**
     * コンストラクタ
     */
    public AnzchanFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        //Viewを生成する
        View view = inflater.inflate(R.layout.anzuchan_fragment,container,false);
        return view;

        //return super.onCreateView(inflater, container, savedInstanceState);
    }



}
