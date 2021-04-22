package com.example.test;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener
                (new View.OnSystemUiVisibilityChangeListener() {
                    @Override
                    public void onSystemUiVisibilityChange(int visibility) {
                        // Note that system bars will only be "visible" if none of the
                        // LOW_PROFILE, HIDE_NAVIGATION, or FULLSCREEN flags are set.
                        if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
                            final Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {


                            decorView.setSystemUiVisibility(
                                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                                            | View.SYSTEM_UI_FLAG_IMMERSIVE
                            );
                                }
                            }, 1000);
                        }
                    }
                });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        //This is used to hide/show 'Status Bar' & 'System Bar'. Swipe bar to get it as visible.
        View decorView = getWindow().getDecorView();
        if (hasFocus) {
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE
            );
        }
    }

    public void createLocation(View view) {
        TextView txtOutput = findViewById(R.id.output);
        EditText txtName = findViewById(R.id.name);
        EditText txtDescription = findViewById(R.id.description);
        EditText txtClimate = findViewById(R.id.climate);
        EditText txtBiome = findViewById(R.id.biome);
        EditText txtFeatures = findViewById(R.id.features);
        EditText txtNatives = findViewById(R.id.natives);
        EditText txtLife = findViewById(R.id.life);
        EditText txtThreats = findViewById(R.id.threats);
        EditText txtNorthwest = findViewById(R.id.northwest);
        EditText txtNorth = findViewById(R.id.north);
        EditText txtNortheast = findViewById(R.id.northeast);
        EditText txtEast = findViewById(R.id.east);
        EditText txtSoutheast = findViewById(R.id.southeast);
        EditText txtSouth = findViewById(R.id.south);
        EditText txtSouthwest = findViewById(R.id.southwest);
        EditText txtWest = findViewById(R.id.west);

        String tempData;
        tempData=txtName.getText()+":[";
        if (txtDescription.getText().length() !=0) {
            tempData+=" DESC: " + txtDescription.getText();
        }
        if (txtClimate.getText().length() !=0) {
            tempData+="; CLIM<"+txtName.getText()+">: "+txtClimate.getText();
        }
        if (txtBiome.getText().length() !=0) {
            tempData+="; BIOME: "+txtBiome.getText();
        }
        if (txtNorth.getText().length() !=0 || txtNortheast.getText().length() !=0 ||
            txtEast.getText().length() !=0 || txtSoutheast.getText().length() !=0 ||
            txtSouth.getText().length() !=0 || txtSouthwest.getText().length() !=0 ||
            txtWest.getText().length() !=0 || txtNorthwest.getText().length() !=0) {
            tempData+="; EXIT:";
        }

        if (txtNorth.getText().length() !=0) {
            tempData+=" <N⇒"+txtNorth.getText()+">";
        }
        if (txtNortheast.getText().length() !=0) {
            tempData+=" <NE⇒"+txtNortheast.getText()+">";
        }
        if (txtEast.getText().length() !=0) {
            tempData+=" <E⇒"+txtEast.getText()+">";
        }
        if (txtSoutheast.getText().length() !=0) {
            tempData+=" <S⇒"+txtSoutheast.getText()+">";
        }
        if (txtSouth.getText().length() !=0) {
            tempData+=" <S⇒"+txtSouth.getText()+">";
        }
        if (txtSouthwest.getText().length() !=0) {
            tempData+=" <SW⇒"+txtSouthwest.getText()+">";
        }
        if (txtWest.getText().length() !=0) {
            tempData+=" <W⇒"+txtWest.getText()+">";
        }
        if (txtNorthwest.getText().length() !=0) {
            tempData+=" <NW⇒"+txtNorthwest.getText()+">";
        }
        if (txtFeatures.getText().length() !=0) {
            tempData+="; FEATURES<"+txtName.getText()+">: "+txtFeatures.getText();
        }
        if (txtNatives.getText().length() !=0) {
            tempData+="; NATIVE: "+txtNatives.getText();
        }
        if (txtLife.getText().length() !=0) {
            tempData+="; LIFE: "+txtLife.getText();
        }
        if (txtThreats.getText().length() !=0) {
            tempData+="; THRE: "+txtThreats.getText();
        }
        tempData+=".]";
        txtOutput.setText(tempData);
    }

    public void openBrowser(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/valahraban/AID-World-Info-research-sheet/blob/main/AID%20WI%20Research%20Sheet.md#zaltys-locations"));
        startActivity(browserIntent);
    }
}