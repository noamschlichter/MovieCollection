package noam.moviecollection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EditScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_screen);

    }

    public void cancelButton_onClick(View view) {
        Intent i = new Intent(EditScreen.this, MainActivity.class);
        startActivity(i);
    }
}
