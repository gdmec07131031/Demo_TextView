package cn.edu.gdmec.s07131031.demo_textview;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1=(TextView) findViewById(R.id.textView1);
        
        TextView textView2=(TextView) findViewById(R.id.textView2);
        
        String text = textView1.getText().toString();
       
        Log.i("info", "textView1显示内容:"+text);
        
        textView2.setText("拨打电话:7654321");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
