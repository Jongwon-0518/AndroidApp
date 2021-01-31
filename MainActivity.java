package com.example.tutorial1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exitbutton = (Button) findViewById(R.id.exitbutton);
        exitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("정말로 종료하시겠습니까?");
                builder.setTitle("종료 알림창")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("종료 알림창");
                alert.show();
            }
        });
    }

    public void addbutton (View v) {
        EditText Number1 = (EditText) findViewById(R.id.Number1);
        EditText Number2 = (EditText) findViewById(R.id.Number2);
        TextView Result = (EditText) findViewById(R.id.Result);
        int n1 = Integer.parseInt(Number1.getText().toString());
        int n2 = Integer.parseInt(Number2.getText().toString());
        Result.setText(Integer.toString(n1 + n2));
    }

    public void subtractbutton (View v) {
        EditText Number1 = (EditText) findViewById(R.id.Number1);
        EditText Number2 = (EditText) findViewById(R.id.Number2);
        TextView Result = (EditText) findViewById(R.id.Result);
        int n1 = Integer.parseInt(Number1.getText().toString());
        int n2 = Integer.parseInt(Number2.getText().toString());
        Result.setText(Integer.toString(n1 - n2));
    }

    public void multiplebutton (View v) {
        EditText Number1 = (EditText) findViewById(R.id.Number1);
        EditText Number2 = (EditText) findViewById(R.id.Number2);
        TextView Result = (EditText) findViewById(R.id.Result);
        int n1 = Integer.parseInt(Number1.getText().toString());
        int n2 = Integer.parseInt(Number2.getText().toString());
        Result.setText(Integer.toString(n1 * n2));
    }

    public void dividebutton (View v) {
        EditText Number1 = (EditText) findViewById(R.id.Number1);
        EditText Number2 = (EditText) findViewById(R.id.Number2);
        TextView Result = (EditText) findViewById(R.id.Result);
        int n1 = Integer.parseInt(Number1.getText().toString());
        int n2 = Integer.parseInt(Number2.getText().toString());
        Result.setText(Integer.toString(n1 / n2));
    }


}