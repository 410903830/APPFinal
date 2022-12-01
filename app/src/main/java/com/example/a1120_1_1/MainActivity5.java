package com.example.a1120_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import java.lang.ref.WeakReference;

public class MainActivity5 extends AppCompatActivity {

    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        ProgressBar progressBar;
        Button Returnbtn=findViewById(R.id.returnbtn);
        Button Login=findViewById(R.id.login);
        EditText address =findViewById(R.id.EmailAddress);
        EditText password=findViewById(R.id.Password);
        progressBar = findViewById(R.id.progress_bar);


        //////////////////////////////////////////////////////////////////////
        Returnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity5.this,MainActivity.class);
                startActivity(intent);
            }
        });

        //////////////////////////////////////////////////////////////////////

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* ExampleAsyncTask task =new ExampleAsyncTask(this);
                task.execute(10);

                */

                if(address.getText().toString().equals("admin@gm.pu.edu.tw")||address.getText().toString().equals("admin")&&password.getText().toString().equals("0000000000")){
                    Intent it=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(it);
                    Toast.makeText(getApplicationContext(), "成功",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "登入失敗",Toast.LENGTH_LONG).show();
                }
            }
        });


    }

/*
    private  class ExampleAsyncTask extends AsyncTask<Integer,Integer,String> {

        private WeakReference<MainActivity5> activityWeakReference;

        ExampleAsyncTask(View.OnClickListener activity){
            activityWeakReference =new WeakReference<MainActivity5>(activity);

        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            MainActivity activity=activityWeakReference.get();
            if (activity==null || activity.isFinishing()){

                return;
            }
            activity.progressBar.setVisibility(View.VISIBLE);

        }
        @Override
        protected String doInBackground(Integer... integers) {

            for(int i=0; i< integers[0]; i++){
                publishProgress((i*100)/integers[0]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "Finish!";

        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);

            MainActivity activity=activityWeakReference.get();
            if (activity==null || activity.isFinishing()){
                return;
            }
            activity.progressBar.setProgress(values[0]);
        }
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            MainActivity activity=activityWeakReference.get();
            if (activity==null || activity.isFinishing()){
                return;
            }

            Toast.makeText(activity, s, Toast.LENGTH_SHORT).show();
            activity.progressBar.setProgress(0);
            activity.progressBar.setVisibility(View.INVISIBLE);

        }


    }

 */

}