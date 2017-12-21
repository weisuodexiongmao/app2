package bwe.com.bawei.lianxi2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.greenrobot.eventbus.EventBus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void but(View v){
        EventBus.getDefault().postSticky(new User("好吧"));
        startActivity(new Intent(MainActivity.this,Main2Activity.class));
    }
}
