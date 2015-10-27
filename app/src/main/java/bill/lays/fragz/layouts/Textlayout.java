package bill.lays.fragz.layouts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by bill on 10/26/15.
 */
public class Textlayout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_one);

        final TextView txt = (TextView)findViewById(R.id.txt);
        Button btn =(Button)findViewById(R.id.click_me);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Hello!!!");

            }
        });
    }
}
