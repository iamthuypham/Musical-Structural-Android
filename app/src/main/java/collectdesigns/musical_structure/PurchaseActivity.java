package collectdesigns.musical_structure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PurchaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);

        // Find the View that shows the numbers category
        TextView submitButton = (TextView) findViewById(R.id.submit);

        // Set a click listener on that View
        submitButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent successIntent = new Intent(PurchaseActivity.this, SuccessActivity.class);
                startActivity(successIntent);
            }
        });
    }
}
