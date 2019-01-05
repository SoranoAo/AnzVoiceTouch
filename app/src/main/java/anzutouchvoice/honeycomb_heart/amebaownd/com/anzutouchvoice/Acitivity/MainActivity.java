package anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.R;
import fragment.AnzchanFragment;
import fragment.OmakeFragment;
import fragment.VoiceSelectorFragment;

public class MainActivity extends AppCompatActivity {

    //Fragment表示用のFrameLayout
    private FrameLayout frameLayout;

    //音声選択用Fragment
    private VoiceSelectorFragment voiceSelectorFragment;

    //あんずちゃんfragment
    private AnzchanFragment anzchanFragment;

    //おまけfragment
    private OmakeFragment omakeFragment;

    //ナビゲーションView
    private BottomNavigationView navigationView;

    //ナビゲーションぼたんで現在設定されているモード
    private int nowSelectedMode = -1;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_voice:
                    //ホームボタン押したときの挙動

                    //ボイスボタン以外からボイスボタンが選択された場合
                    //画面遷移する
                    if(nowSelectedMode != item.getItemId()) {
                        voiceFragmentReplace();
                    }else{

                        //一番上までGridViewをscrollする
                        voiceSelectorFragment.scrollToTop();

                    }

                    nowSelectedMode = item.getItemId();

                    return true;

                case R.id.navigation_anzchan:
                    //あんずちゃんボタン以外からあんずちゃんボタンが選択された場合
                    //画面遷移する
                    if(nowSelectedMode != item.getItemId()) {
                        anzchanFragmentReplace();
                    }

                    nowSelectedMode = item.getItemId();

                    return true;

                case R.id.navigation_omake:
                    if(nowSelectedMode != item.getItemId()) {
                        omakeFragmentReplace();
                    }

                    nowSelectedMode = item.getItemId();

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
        this.frameLayout = (FrameLayout) findViewById(R.id.main_content_selecter_framelayour);

        if (savedInstanceState == null) {

            this.voiceFragmentReplace();

        }


        //ナビゲーションビュー
        this.navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        this.navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }


    /**
     * 音声Fragmentへ遷移
     */
    private void voiceFragmentReplace(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // BackStackを設定
        fragmentTransaction.addToBackStack(null);

        this.voiceSelectorFragment = new VoiceSelectorFragment();
        fragmentTransaction.replace(R.id.main_content_selecter_framelayour, this.voiceSelectorFragment);

        fragmentTransaction.commit();

    }

    /**
     * あんずちゃんFragmentへ遷移
     */
    private void anzchanFragmentReplace(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // BackStackを設定
        fragmentTransaction.addToBackStack(null);

        this.anzchanFragment = new AnzchanFragment();
        fragmentTransaction.replace(R.id.main_content_selecter_framelayour, this.anzchanFragment);

        fragmentTransaction.commit();

    }

    /**
     * おまけFragmentへ遷移
     */
    private void omakeFragmentReplace(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // BackStackを設定
        fragmentTransaction.addToBackStack(null);

        this.omakeFragment = new OmakeFragment();
        fragmentTransaction.replace(R.id.main_content_selecter_framelayour, this.omakeFragment);

        fragmentTransaction.commit();

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
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.about_app_menu:
                intent = new Intent(MainActivity.this,AboutAppActivity.class);
                startActivity(intent);

                return true;

            case R.id.about_anz_menu:
                intent = new Intent(MainActivity.this,AboutAnzchanActivity.class);
                startActivity(intent);

                return true;


            default:
                return super.onOptionsItemSelected(item);

        }
    }


}
