package tw.org.iii.activitylifecycle;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private long last = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void exit(View view) {
        finish();
        Log.v("brad", "Main2:exit");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void finish() {
        long now = System.currentTimeMillis();

        if (now - last <= 3*1000){
            super.finish();
        }else{
            last = now;
            Toast.makeText(this,
                    "Click Back one more to exit", Toast.LENGTH_SHORT)
                    .show();
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("brad", "Main2:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("brad", "Main2:onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("brad", "Main2:onDestroy");
    }

    public void gotoPage3(View view) {
        Intent intent = new Intent(this, Page3Activity.class);
        startActivity(intent);
    }
}
