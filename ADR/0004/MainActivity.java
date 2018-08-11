/**
 * DATE: 11/08/2018
 * DESC: Basic sharedpreferences use case
 */

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import app.sqweeks.smellslikebakin.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        putData("name", "JEEVA");
        Toast.makeText(this, getData("name"), Toast.LENGTH_SHORT).show();
    }

    private void putData(String key, String value) {
        SharedPreferences preferences = getSharedPreferences("settings", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    private String getData(String key) {
        SharedPreferences preferences = getSharedPreferences("settings", MODE_PRIVATE);
        return preferences.getString(key, "");
    }
}
