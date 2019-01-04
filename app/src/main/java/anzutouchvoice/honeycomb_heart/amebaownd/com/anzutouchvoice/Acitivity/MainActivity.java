package anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.TextView;

import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity.GridAdapter.VoiceAdapter.VoiceAdapterItem;
import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.Acitivity.GridAdapter.VoiceAdapter.VoiceButtonAdapter;
import anzutouchvoice.honeycomb_heart.amebaownd.com.anzutouchvoice.R;

public class MainActivity extends AppCompatActivity {


    //ボイス一覧のGridView
    private GridView voiceGridView;

    private VoiceButtonAdapter gridViewAdapter;

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

        //ナビゲーションビュー
        this.navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        this.navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //gridview
        this.voiceGridView = (GridView)findViewById(R.id.voice_grid_view);

        this.gridViewAdapter = new VoiceButtonAdapter(this.getApplicationContext());
        this.voiceGridView.setAdapter(gridViewAdapter);


        //テスト用コード
        //TODO あとでテスト用コード消すこと
        for(int i = 0 ; i < 10; i++) {
            VoiceAdapterItem sampleVoiceAdapterItem = new VoiceAdapterItem();
            sampleVoiceAdapterItem.setTitile("いーも"+ i);
            sampleVoiceAdapterItem.setVoiceImage(ResourcesCompat.getDrawable(getResources(), R.drawable.anz_icon_defult, null));
            this.gridViewAdapter.addVoiceItem(sampleVoiceAdapterItem);
        }
        this.gridViewAdapter.notifyDataSetChanged();

    }

}
