package de.boe_dev.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    @Override
    public void onClick(View v) {

    }

    public void buttonAction(View v) {
        switch (v.getId()) {

            case R.id.button_spotify_streamer:
                showToast(R.string.spotify_streamer_launch);
                break;

            case R.id.button_scores_app:
                showToast(R.string.scores_app_launch);
                break;

            case R.id.button_library_app:
                showToast(R.string.library_app_launch);
                break;

            case R.id.button_build_it_bigger:
                showToast(R.string.build_it_bigger_launch);
                break;

            case R.id.button_xyz_reader:
                showToast(R.string.xyz_reader_launch);
                break;

            case R.id.button_capstone:
                showToast(R.string.capstone_launch);
                break;

        }
    }

    private void showToast(int messageId) {
        Toast.makeText(getApplicationContext(), messageId, Toast.LENGTH_SHORT).show();
    }
}
