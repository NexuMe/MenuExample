package com.example.menuexample;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

   private TextView tvMenuChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMenuChoice = findViewById(R.id.tvMenuChoice);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Идентификация на избора
        int itemId = item.getItemId();
        if (itemId == R.id.action_search) {// изпълнение на действие при избор на бутона search;
            String searchStr = "Изпълнение на действие при избор на бутона search";
            Toast.makeText(this, searchStr,
                    Toast.LENGTH_SHORT)
                    .show();
            tvMenuChoice.setText(searchStr);
            return true;
        } else if (itemId == R.id.action_share) {// изпълнение на действие при избор на бутона share;
            String shareStr = "Изпълнение на действие при избор на бутона share";
            Toast.makeText(this, shareStr,
                    Toast.LENGTH_SHORT)
                    .show();
            tvMenuChoice.setText(shareStr);
            return true;
        } else if (itemId == R.id.action_settings) {// изпълнение на действие при избор на бутона settings;
            String settingsStr = "Изпълнение на действие при избор на бутона settings";
            Toast.makeText(this, settingsStr,
                    Toast.LENGTH_SHORT)
                    .show();
            tvMenuChoice.setText(settingsStr);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}