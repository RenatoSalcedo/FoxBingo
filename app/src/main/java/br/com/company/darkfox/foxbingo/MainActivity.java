package br.com.company.darkfox.foxbingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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
        for(int i = 1; i <= 15; i++) {
            TableRow tRow = new TableRow(this);
            tRow.setVisibility(View.VISIBLE);
            TableLayout.LayoutParams tableRowParams=
                    new TableLayout.LayoutParams
                            (TableLayout.LayoutParams.WRAP_CONTENT,TableLayout.LayoutParams.WRAP_CONTENT);

            tableRowParams.setMargins(170, 0, 0, 0);
            tRow.setLayoutParams(tableRowParams);
            int aux = i;

            TextView tView = new TextView(this);
            tView.setText(Integer.toString(aux));
            tView.setGravity(Gravity.CENTER);
            tView.setTextSize(26);
            tView.setPadding(3, 3, 3, 3);
            tView.setVisibility(View.VISIBLE);

            TextView tView1 = new TextView(this);
            tView1.setText(Integer.toString(aux += 15));
            tView1.setGravity(Gravity.CENTER);
            tView1.setPadding(3, 3, 3, 3);
            tView1.setTextSize(26);
            tView1.setVisibility(View.VISIBLE);

            TextView tView2 = new TextView(this);
            tView2.setText(Integer.toString(aux += 15));
            tView2.setGravity(Gravity.CENTER);
            tView2.setPadding(3, 3, 3, 3);
            tView2.setTextSize(26);
            tView2.setVisibility(View.VISIBLE);

            TextView tView3 = new TextView(this);
            tView3.setText(Integer.toString(aux += 15));
            tView3.setGravity(Gravity.CENTER);
            tView3.setPadding(3, 3, 3, 3);
            tView3.setTextSize(26);
            tView3.setVisibility(View.VISIBLE);

            TextView tView4 = new TextView(this);
            tView4.setText(Integer.toString(aux += 15));
            tView4.setGravity(Gravity.CENTER);
            tView4.setPadding(3, 3, 3, 3);
            tView4.setTextSize(26);
            tView4.setVisibility(View.VISIBLE);

            tRow.addView(tView);
            tRow.addView(tView1);
            tRow.addView(tView2);
            tRow.addView(tView3);
            tRow.addView(tView4);

            tbBingo.addView(tRow);
        }
    }
}
