package com.example.mylinearlayoutfullcode;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //This string will be used in our shared preferences.  You do not have to do anything with this.
    public static final String MYPREFS = "mySharedPreferences";

    //We must put in a match for the three TextViews that we created in our UI.
    //We give them the same name as the ids that we gave in the xml file to make it easier for us.
    private TextView txtFirstQuestion;
    //***TASK***: You must put in TextViews for txtCheckBoxes and txtSecondQuestion
    //They will be same at the txtFirstQuestion example.
    //It will be better for learning if you do not use copy and paste
    //Start: 2 lines
    private TextView txtCheckBoxes;
    private TextView txtSecondQuestion;
    //End

    //Match for toggle button and ordinary button.
    private ToggleButton tbnLikeMovies;
    private Button btnExit;

    //Matches for CheckBoxes in UI.
    private CheckBox cbxAction;
    private CheckBox cbxDrama;
    private CheckBox cbxScienceFiction;
    private CheckBox cbxRomance;
    private CheckBox cbxFantasy;
    private CheckBox cbxBooks;
    private CheckBox cbxMusic;
    //***TASK***: you must add CheckBoxes called cbxArt, cbxSport, and cbxTheater.
    //They will be same at the other examples here.
    //It will be better for learning if you do not use copy and paste
    //Start: 3 lines
    private CheckBox cbxArt;
    private CheckBox cbxSport;
    private CheckBox cbxTheater;
    //End.

    // These Strings are used for persistent storage (shared preferences) which we will not be
    //discussing in this project so you do not have to do anything with them.  There is a separate
    //persistent storage project on the Coursera platform.
    private String likeMovies;
    private String likeAction;
    private String likeDrama;
    private String likeScienceFiction;
    private String likeRomance;
    private String likeFantasy;
    private String likeBooks;
    private String likeMusic;
    private String likeArt;
    private String likeSport;
    private String likeTheater;
    //End



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //We are connecting the widgets we made in the xml file for our UI with
        //their equivalents that we created above.
        txtFirstQuestion = findViewById(R.id.txtFirstQuestion);
        tbnLikeMovies = findViewById(R.id.tbnLikeMovies);

        txtCheckBoxes = findViewById(R.id.txtCheckBoxes);
        cbxAction = findViewById(R.id.cbxAction);
        cbxDrama = findViewById(R.id.cbxDrama);
        cbxScienceFiction = findViewById(R.id.cbxScienceFiction);
        cbxRomance = findViewById(R.id.cbxRomance);
        cbxFantasy = findViewById(R.id.cbxFantasy);


        txtSecondQuestion = findViewById(R.id.txtSecondQuestion);
        cbxBooks = findViewById(R.id.cbxBooks);
        cbxMusic = findViewById(R.id.cbxMusic);
        //***TASK***: you must connect cbxArt, cbxSport, and cbxTheater using the appropriate id.
        //They will be the same as the other examples here.
        //It will be better for learning if you do not use copy and paste.
        //Start: 3 lines
        cbxArt = findViewById(R.id.cbxArt);
        cbxSport = findViewById(R.id.cbxSport);
        cbxTheater = findViewById(R.id.cbxTheater);
        //End:

        btnExit = findViewById(R.id.btnExit);

        //The toggle button
        tbnLikeMovies.setOnClickListener(this);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        cbxAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbxAction.isChecked()){
                    likeAction = "yes";
                }
                else {
                    likeAction = "no";
                }
            }
        });
        cbxDrama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbxDrama.isChecked()){
                    likeDrama = "yes";
                }
                else {
                    likeDrama = "no";
                }
            }
        });
        cbxScienceFiction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbxScienceFiction.isChecked()){
                    likeScienceFiction = "yes";
                }
                else {
                    likeScienceFiction = "no";
                }
            }
        });
        cbxRomance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbxRomance.isChecked()){
                    likeRomance = "yes";
                }
                else {
                    likeRomance = "no";
                }
            }
        });
        cbxFantasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbxFantasy.isChecked()){
                    likeFantasy = "yes";
                }
                else {
                    likeFantasy = "no";
                }
            }
        });
        cbxBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbxBooks.isChecked()){
                    likeBooks = "yes";
                }
                else {
                    likeBooks = "no";
                }
            }
        });
        cbxMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbxMusic.isChecked()){
                    likeMusic = "yes";
                }
                else {
                    likeMusic = "no";
                }
            }
        });
        //***TASK***: you must create onClickListeners for cbxArt, cbxSport, and cbxTheater.
        //They will be the same as the other examples here.
        //It will be better for learning if you do not use copy and paste.
        //Start: ~ 15 - 20 lines
        cbxArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbxArt.isChecked()){
                    likeArt = "yes";
                }
                else {
                    likeArt = "no";
                }
            }
        });
        cbxSport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbxSport.isChecked()){
                    likeSport = "yes";
                }
                else {
                    likeSport = "no";
                }
            }
        });
        cbxTheater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbxTheater.isChecked()){
                    likeTheater = "yes";
                }
                else {
                    likeTheater = "no";
                }
            }
        });
        //End.

        loadPreferences();

    }

    // onClick is activated when we press the toggle button.
    public void onClick(View view){
        //If we have toggle on Yes then the String likeMovies is updated to "yes" and the text on
        //the TextView txtSecondQuestion is set to "What other activities do you like?"
        if (tbnLikeMovies.isChecked()){
            likeMovies = "yes";
            txtSecondQuestion.setText("What other activities do you like?");
        }
        //If we have toggle on No then the String likeMovies is updated to "no" and the text on
        //the TextView txtSecondQuestion is set to "What do you like more than movies?"
        else{
            //set the value of likeMovies to "no"
            likeMovies = "no";
            //set the text in txtSecondQuestion to "What do you like more than movies?"
            txtSecondQuestion.setText("What do you like more than movies?");
        }

    }

    //You do not have to change any code below here.  The code below here is related to Persistent
    //Storage (Shared Preferences) and Menus. We have adjusted the the values of the
    //Strings beginning with like (likeMovies, likeAction, etc) to "yes" or "no" above depending on
    //if the toggle button is set on yes or no and if the boxes are checked.  We are using key value
    //pairs below to remember if each value is "yes" or "no".  What we close and reload our app we
    //we then use the information saved in the key value pairs to set the toggle button and the
    //check boxes to the selections we made when we previously used the app.
    public void loadPreferences() {
        // Get the stored preferences
        int mode = Activity.MODE_PRIVATE;
        android.content.SharedPreferences mySharedPreferences = getSharedPreferences(MYPREFS, mode);
        // Retrieve the saved values

        likeMovies = mySharedPreferences.getString("movies", "");
        likeAction = mySharedPreferences.getString("action", "");
        likeDrama = mySharedPreferences.getString("drama", "");
        likeScienceFiction = mySharedPreferences.getString("science fiction", "");
        likeRomance = mySharedPreferences.getString("romance", "");
        likeFantasy = mySharedPreferences.getString("fantasy", "");
        likeBooks = mySharedPreferences.getString("books", "");
        likeMusic = mySharedPreferences.getString("music", "");
        likeArt = mySharedPreferences.getString("art", "");
        likeSport = mySharedPreferences.getString("sport", "");
        likeTheater = mySharedPreferences.getString("theater", "");

        likeMoviesOrOtherActivities();
    }

    public void likeMoviesOrOtherActivities(){
        if (likeMovies.equals("yes")){
            tbnLikeMovies.setChecked(true);
            txtSecondQuestion.setText("What other activities do you like?");
        }
        else{
            tbnLikeMovies.setChecked(false);
            txtSecondQuestion.setText("What do you prefer?");
        }
        loadCheckBoxPreference();
    }

    public void loadCheckBoxPreference(){
        if (likeAction.equals("yes")){
            cbxAction.setChecked(true);
        }
        if (likeDrama.equals("yes")){
            cbxDrama.setChecked(true);
        }
        if (likeScienceFiction.equals("yes")){
            cbxScienceFiction.setChecked(true);
        }
        if (likeRomance.equals("yes")){
            cbxRomance.setChecked(true);
        }
        if (likeFantasy.equals("yes")){
            cbxFantasy.setChecked(true);
        }
        if (likeBooks.equals("yes")){
            cbxBooks.setChecked(true);
        }
        if (likeMusic.equals("yes")){
            cbxMusic.setChecked(true);
        }
        if (likeArt.equals("yes")){
            cbxArt.setChecked(true);
        }
        if (likeSport.equals("yes")){
            cbxSport.setChecked(true);
        }
        if (likeTheater.equals("yes")){
            cbxTheater.setChecked(true);
        }

    }

    protected void savePreferences() {
        // Create or retrieve the shared preference object.
        int mode = Activity.MODE_PRIVATE;
        android.content.SharedPreferences mySharedPreferences = getSharedPreferences(MYPREFS, mode);
        // Retrieve an editor to modify the shared preferences.
        android.content.SharedPreferences.Editor editor = mySharedPreferences.edit();
        // Store data in the shared preferences object.
        editor.putString("movies", likeMovies);
        editor.putString("action", likeAction);
        editor.putString("drama", likeDrama);
        editor.putString("science fiction", likeScienceFiction);
        editor.putString("romance", likeRomance);
        editor.putString("fantasy", likeFantasy);
        editor.putString("books", likeBooks);
        editor.putString("music", likeMusic);
        editor.putString("art", likeArt);
        editor.putString("sport", likeSport);
        editor.putString("theater", likeTheater);
        // Commit the changes.
        editor.commit();
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.savePreferences();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_shared_preferences_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}

