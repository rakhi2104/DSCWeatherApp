package com.example.crackjack.weatherapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    // Coordinates of Visakhapatnam
    double latt = 17.6868;
    double longg = 83.2185;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Implement Location selection
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO: Inflate Menu
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO: Do what happens on selecting option

        return true;
    }

    public void showDialogBox() {
        // TODO: Implement Dialog box functionality
    }

    public class GetWeatherData extends AsyncTask<Void, Void, JSONObject> {

        @Override
        protected void onPreExecute() {
            // TODO: What happens before execution starts
            // TODO: Show ProgressDialog
            super.onPreExecute();
        }

        @Override
        protected JSONObject doInBackground(Void... voids) {
            // TODO: What happens in background
            // TODO: Fetch Weather data
            return null;
        }

        @Override
        protected void onPostExecute(JSONObject jsonObject) {
            // TODO: What happens after execution is completed
            // TODO: Update UI

            // Icons JSON object
            JSONObject icons = new JSONObject();
            try {
                icons.put("clear-day", "&#xf00d;");
                icons.put("clear-night", "&#xf02e;");
                icons.put("rain", "&#xf019;");
                icons.put("snow", "&#xf01b;");
                icons.put("sleet", "&#xf0b5;");
                icons.put("wind", "&#xf021;");
                icons.put("fog", "&#xf014;");
                icons.put("cloudy", "&#xf013;");
                icons.put("partly-cloudy-day", "&#xf002;");
                icons.put("partly-cloudy-night", "&#xf031;");
            } catch (JSONException e) {
                e.printStackTrace();
            }

            super.onPostExecute(jsonObject);
        }
    }
}
