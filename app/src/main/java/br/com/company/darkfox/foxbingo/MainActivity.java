package br.com.company.darkfox.foxbingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TableLayout tbBingo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbBingo = (TableLayout) findViewById(R.id.tbBingo);
        populatePainel();
    }

    private void populatePainel()
    {
        for(int i = 0; i <= 15; i++)
        {
            TableRow tRow = new TableRow(this);
            tbBingo.addView(tRow);
        }

        for (int i = 1; 1 <= 15; i++)
        {
            int aux = i;
            for(int j = 1; j < tbBingo.getChildCount(); j++)
            {
                TableRow tr = (TableRow) tbBingo.getChildAt(j);

                TextView tView = new TextView(this);
                tView.setText(aux);
                tView.setGravity(Gravity.CENTER);
                tView.setPadding(3, 3, 3, 3);

                TextView tView1 = new TextView(this);
                tView.setText(aux += 15);
                tView.setGravity(Gravity.CENTER);
                tView.setPadding(3, 3, 3, 3);

                TextView tView2 = new TextView(this);
                tView.setText(aux += 15);
                tView.setGravity(Gravity.CENTER);
                tView.setPadding(3, 3, 3, 3);

                TextView tView3 = new TextView(this);
                tView.setText(aux += 15);
                tView.setGravity(Gravity.CENTER);
                tView.setPadding(3, 3, 3, 3);

                TextView tView4 = new TextView(this);
                tView.setText(aux += 15);
                tView.setGravity(Gravity.CENTER);
                tView.setPadding(3, 3, 3, 3);
            }
        }
    }
}
