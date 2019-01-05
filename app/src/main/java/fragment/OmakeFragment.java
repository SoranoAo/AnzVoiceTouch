package fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.R;

/**
 * オマケ機能のFragment
 */
public class OmakeFragment extends Fragment {

    /**
     * コンストラクタ
     */
    public OmakeFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        //Viewを生成する
        View view = inflater.inflate(R.layout.omake_fragment,container,false);
        return view;

        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
