package anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;

import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.app.FragmentTransaction;

import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity.GridAdapter.VoiceAdapter.OnVoiceItemSelectedListnere;
import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity.GridAdapter.VoiceAdapter.VoiceAdapterItem;
import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity.GridAdapter.VoiceAdapter.VoiceButtonAdapter;
import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.R;
import fragment.VoiceSelectorFragment;

public class MainActivity extends AppCompatActivity {

    //Fragment表示用のFrameLayout
    private FrameLayout frameLayout;

    //音声選択用Fragment
    private VoiceSelectorFragment voiceSelectorFragment;


    //ナビゲーションView
    private BottomNavigationView navigationView;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //ホームボタン押したときの挙動
                    //TODO ホームボタンを押したときの挙動実装
                    return true;
                case R.id.navigation_dashboard:
                    //TODO 実装して
                    return true;
                case R.id.navigation_notifications:
                    //TODO 実装して
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Fragment表示用のFrameLayout
        this.frameLayout = (FrameLayout) findViewById(R.id.voice_selecter_framelayour);

        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            // BackStackを設定
            fragmentTransaction.addToBackStack(null);

            this.voiceSelectorFragment = new VoiceSelectorFragment();
            fragmentTransaction.replace(R.id.voice_selecter_framelayour, this.voiceSelectorFragment);

            fragmentTransaction.commit();

        }


        //ナビゲーションビュー
        this.navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        this.navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }


    /**
     * アクションバーのメニュー作成
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar, menu);
        return super.onCreateOptionsMenu(menu);

    }

    /**
     * アクションバーのメニューアイテムが選ばれたときの挙動
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about_app_menu:
                //TODO アクションバーのこのアプリについてメニュー選択時の挙動実装して
                return true;

            case R.id.about_anz_menu:
                //TODO アクションバーのあんずちゃんについてメニュー選択時の挙動実装して


                return true;


            default:
                return super.onOptionsItemSelected(item);

        }
    }


}
