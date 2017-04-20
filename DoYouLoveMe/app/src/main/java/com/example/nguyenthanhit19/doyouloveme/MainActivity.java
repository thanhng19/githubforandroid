package com.example.nguyenthanhit19.doyouloveme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.string.no;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnYes,btnNo;
    boolean k=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnYes=(Button)findViewById(R.id.btnYes);
        btnNo=(Button)findViewById(R.id.btnNo);
        btnYes.setOnClickListener(this);
        btnNo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btnYes:
                    clickYes();
                    break;
            case R.id.btnNo:
                    clickNo();
                    break;
        }
    }

    private void clickNo() {
        if(k==true) {
            btnNo.setText("Có chứ anh");
            btnYes.setText("Không đâu");
            Toast.makeText(this, "Anh cũng yêu em", Toast.LENGTH_SHORT).show();
            k=false;
        }
    }

    private void clickYes() {
        if(k==false) {
            btnYes.setText("Có chứ anh");
            btnNo.setText("Không đâu");
            Toast.makeText(this, "Anh cũng yêu em", Toast.LENGTH_SHORT).show();
            k=true;
        }
    }
}
