package collectdesigns.musical_structure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class TrendingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending);
        ImageView play = (ImageView) findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent numbersIntent = new Intent(TrendingActivity.this, PlayActivity.class);


                startActivity(numbersIntent);
            }
        });


        // Find the View that shows the numbers category
        TextView purchaseButton = (TextView) findViewById(R.id.songPurchase);

        // Set a click listener on that View
        purchaseButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent purchaseIntent = new Intent(TrendingActivity.this, PurchaseActivity.class);

                // Start the new activity
                startActivity(purchaseIntent);
            }
        });
    }
}
