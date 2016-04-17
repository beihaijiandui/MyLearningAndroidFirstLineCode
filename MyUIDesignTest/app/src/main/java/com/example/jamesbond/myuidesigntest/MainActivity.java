package com.example.jamesbond.myuidesigntest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button button;
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.buttonTest);
        editText=(EditText)findViewById(R.id.edit_text);
//        imageView=(ImageView)findViewById(R.id.imageview);
        progressBar= (ProgressBar) findViewById(R.id.progress_bar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputString=editText.getText().toString();
                Toast.makeText(MainActivity.this, inputString, Toast.LENGTH_SHORT).show();
//                imageView.setImageResource(R.drawable.fb46e53619b8c0);
//                if(progressBar.getVisibility()==View.GONE)
//                    progressBar.setVisibility(View.VISIBLE);
//                else
//                    progressBar.setVisibility(View.GONE);
                int progress=progressBar.getProgress();
                progress=progress+10;
                progressBar.setProgress(progress);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
