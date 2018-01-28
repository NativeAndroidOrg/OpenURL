package com.bankapalli.openurl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class OpenURL extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_url);
    }

    public void openURL(View view) {
        EditText txtURL = (EditText) findViewById(R.id.txtURL);
        String url = String.valueOf(txtURL.getText());

        Intent openURL = new Intent(Intent.ACTION_VIEW);
        openURL.setData(Uri.parse(url));

        Intent chooseOpenURL = Intent.createChooser(openURL, getString(R.string.titleForIntentChooser));
        startActivity(chooseOpenURL);
    }
}
