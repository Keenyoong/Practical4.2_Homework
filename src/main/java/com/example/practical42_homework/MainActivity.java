package com.example.practical42_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String tag = "Toppings: ";

    //KEEP REFERENCE TO SELECTIONS
    boolean isCboxChocolateSyrupChecked = false;
    boolean isCboxSprinklesChecked = false;
    boolean isCboxCrushedNutsChecked = false;
    boolean isCboxCherriesChecked = false;
    boolean isCboxOrioCookieCrumblesChecked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {

        // is the view now checked.
        boolean checked = ((CheckBox) view).isChecked();

        // check which checkbox is checked?
        switch (view.getId()){

            case R.id.cbox_choclate_syrup:
                if (checked){
                    isCboxChocolateSyrupChecked = true;
                }
                else{
                    isCboxChocolateSyrupChecked = false;
                }
                break;

            case R.id.cbox_sprinkles:
                if (checked){
                    isCboxSprinklesChecked = true;
                }
                else{
                    isCboxSprinklesChecked = false;
                }
                break;

            case R.id.cbox_crushed_nuts:
                if (checked){
                    isCboxCrushedNutsChecked = true;
                }
                else{
                    isCboxCrushedNutsChecked = false;
                }
                break;

            case R.id.cbox_cherries:
                if (checked){
                    isCboxCherriesChecked = true;
                }
                else{
                    isCboxCherriesChecked = false;
                }
                break;

            case R.id.cbox_orio_cookie_crumbles:
                if (checked){
                    isCboxOrioCookieCrumblesChecked = true;
                }
                else{
                    isCboxOrioCookieCrumblesChecked = false;
                }
                break;
        }
    }

    public void tosMessage(String messageTag){
        String getAllSelected = "";
        if (isCboxChocolateSyrupChecked){
            getAllSelected = getAllSelected + "Chocolate Syrup ";
        }
        if
  (isCboxSprinklesChecked){
            getAllSelected = getAllSelected + "Sprinkles ";
        }
        if (isCboxCrushedNutsChecked){
            getAllSelected = getAllSelected + "Crushed nuts";
        }
        if (isCboxCherriesChecked){
            getAllSelected = getAllSelected + "Cherries ";
        }
        if (isCboxOrioCookieCrumblesChecked){
            getAllSelected = getAllSelected + "Orio cookie crumbles ";

        }

        Toast toast = Toast.makeText(getApplicationContext(), messageTag+" "+getAllSelected, Toast.LENGTH_SHORT);
        toast.show();

    }

    public void showMsg(View view) {
        tosMessage(tag);
    }
}