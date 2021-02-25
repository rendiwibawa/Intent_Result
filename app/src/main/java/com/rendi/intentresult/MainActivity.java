package com.rendi.intentresult;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final int RC_EDIT_NAME = 100;
    @BindView(R.id.textview_result)
    TextView textviewResult;
    @BindView(R.id.btn_edit)
    Button btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick (R.id.btn_edit)
    public void onViewClicked() {
        Intent intent= new Intent(this, EditNameActifity.class);
        startActivityForResult(intent, RC_EDIT_NAME);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == RC_EDIT_NAME && resultCode == RESULT_OK) {
            String name = data.getExtras().getString(EditNameActifity.EXTRA_NAME);
            textviewResult.setText(name);
        }  super.onActivityResult(requestCode, resultCode, data);
    }
}
