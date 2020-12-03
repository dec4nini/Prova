package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.prova.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if(id == R.id.mitm1)
        {
            Toast.makeText(
                    getApplicationContext(),
                    "A ajuda não está disponível, tente novamente.",
                    Toast.LENGTH_LONG).show();
            return true;
        }
        if(id == R.id.mitm2)
        {
            finish();
            System.exit(0);
        }


        return super.onOptionsItemSelected(item);
    }
}