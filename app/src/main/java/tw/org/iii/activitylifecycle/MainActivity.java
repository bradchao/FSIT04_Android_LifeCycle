package tw.org.iii.activitylifecycle;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int rand = (int)(Math.random()*49+1);
    private TextView tv;
    public MainActivity() {

        Log.v("brad", "MainActivity:" + rand);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);

//        if (savedInstanceState != null){
//            tv.setText(savedInstanceState.getString("rand"));
//        }else{
//            Log.v("brad", "save null");
//        }

        Log.v("brad", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("brad", "onStart");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.v("brad", "onSaveInstanceState");

        outState.putString("rand", tv.getText().toString());

    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.v("brad", "onRestoreInstanceState");
        tv.setText(savedInstanceState.getString("rand"));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("brad", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("brad", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("brad", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("brad", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("brad", "onRestart");
    }

    public void changeTest1(View view) {
        //setContentView(R.layout.test1);

        tv.setText("" + (int)(Math.random()*49+1));
    }

    public void gotoMain2(View view) {
        Intent intent =
                new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
