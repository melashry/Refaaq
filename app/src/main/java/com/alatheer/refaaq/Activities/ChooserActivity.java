package com.alatheer.refaaq.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alatheer.refaaq.R;

public class ChooserActivity extends AppCompatActivity implements View.OnClickListener {

    Button donor, sponser, poor, family;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooser);

        initView();
    }

    private void initView() {
        donor = findViewById(R.id.btn_Rigster_Donor);
        sponser = findViewById(R.id.btn_Rigster_Sponser);
        poor = findViewById(R.id.btn_Rigster_Poor);
        family = findViewById(R.id.btn_Rigster_Family);

        donor.setOnClickListener(this);
        sponser.setOnClickListener(this);
        poor.setOnClickListener(this);
        family.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_Rigster_Donor:
                Intent intent = new Intent(ChooserActivity.this, LoginActivity.class);
                intent.putExtra("type","donor");
                startActivity(intent);
                finish();
                break;

            case R.id.btn_Rigster_Sponser:
                Intent intent1 = new Intent(ChooserActivity.this, LoginActivity.class);
                intent1.putExtra("type","sponsor");

                startActivity(intent1);
                finish();

                break;

            case R.id.btn_Rigster_Poor:
                Intent intent2 = new Intent(ChooserActivity.this, LoginActivity.class);
                intent2.putExtra("type","poor");

                startActivity(intent2);
                finish();

                break;

            case R.id.btn_Rigster_Family:
                Intent intent3 = new Intent(ChooserActivity.this, LoginActivity.class);
                intent3.putExtra("type","family");

                startActivity(intent3);
                finish();

                break;
        }

    }
}
