package collectdesigns.musical_structure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        // Find the View that shows the numbers category
        TextView homeButton = (TextView) findViewById(R.id.home);

        // Set a click listener on that View
        homeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent homeIntent = new Intent(SuccessActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });
    }
}
