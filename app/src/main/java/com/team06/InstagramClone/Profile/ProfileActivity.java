package com.team06.InstagramClone.Profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.team06.InstagramClone.R;
import com.team06.InstagramClone.Utils.BottomNavigationViewHelper;
import com.team06.InstagramClone.Utils.GridImageAdapter;
import com.team06.InstagramClone.Utils.UniversalImageLoader;

import java.util.ArrayList;

/**
 * Created by isabellepotvin on 2018-02-20.
 */

public class ProfileActivity extends AppCompatActivity{
    private static final String TAG = "ProfileActivity";
    private static final int ACTIVITY_NUM = 4;
    private static final int NUM_GRID_COLUMNS = 3;

    private Context mContext = ProfileActivity.this;

    private ProgressBar mProgressBar;
    private ImageView profilePhoto;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG, "onCreate: started.");


        setupBottomNavigationView();
        setupToolbar();
        setupActivityWidgets();
        setProfileImage();

        tempGridSetup();

    }

    private void tempGridSetup(){
        ArrayList<String> imgURLs = new ArrayList<>();
        imgURLs.add("https://mumspantry.com.au/wp-content/uploads/2016/04/how-to-take-great-instagram-photos.jpg");
        imgURLs.add("https://i.pinimg.com/736x/6b/85/e7/6b85e762d16fb83ca0dfb12408810c1b--fog-photography-popular-photography.jpg");
        imgURLs.add("https://images.fineartamerica.com/images/artworkimages/mediumlarge/1/pile-of-stones-on-beach-dhmig-photography.jpg");
        imgURLs.add("http://coveteur.com/content/uploads/2017/03/best-food-instagram-accounts-1.jpg");
        imgURLs.add("http://www.slrphotographyguide.com/tips/images/beach-horizon.jpg");
        imgURLs.add("https://www.artinnaturephotography.com/images/xl/prusik-peak-enchantments-larches-20111013_0735.jpg");
        imgURLs.add("https://blog.hubspot.com/hubfs/food-on-instagram.jpeg?t=1519288838433");
        imgURLs.add("https://www.thesun.co.uk/wp-content/uploads/2017/06/nintchdbpict000332915143.jpg?strip=all&w=661");
        imgURLs.add("http://s6.weddbook.com/t4/8/1/8/818870/professional-wedding-photography-unique-creative-wedding-photography-profesyonel-dugun-fotograflari.jpg");
        imgURLs.add("https://spoonuniversity.com/wp-content/uploads/sites/25/2016/02/Screen-Shot-2016-02-19-at-3.55.52-PM.png");
        imgURLs.add("http://allthatsinteresting.com/wordpress/wp-content/uploads/2014/12/nature-photography-2014-red-fox.jpg");
        imgURLs.add("https://blogmedia.evbstatic.com/wp-content/uploads/wpmulti/sites/3/2016/11/10120355/iStock_81484743_MEDIUM.jpg");

        setupImageGrid(imgURLs);
    }

    private void setupImageGrid(ArrayList<String> imgURLs){
        GridView gridView = findViewById(R.id.gridView);

        int gridWidth = getResources().getDisplayMetrics().widthPixels;
        int imageWidth = gridWidth/NUM_GRID_COLUMNS;
        gridView.setColumnWidth(imageWidth);

        GridImageAdapter adapter = new GridImageAdapter(mContext, R.layout.layout_grid_imageview, "", imgURLs);
        gridView.setAdapter(adapter);
    }

    private void setProfileImage(){
        Log.d(TAG, "setProfileImage: setting profile photo.");
        String imgURL = "www.androidcentral.com/sites/androidcentral.com/files/styles/xlarge/public/article_images/2016/08/ac-lloyd.jpg?itok=bb72IeLf";
        UniversalImageLoader.setImage(imgURL, profilePhoto, null, "https://");
    }

    private void setupActivityWidgets(){
        //hides progress bar
        mProgressBar = (ProgressBar) findViewById(R.id.profileProgressBar);
        mProgressBar.setVisibility(View.GONE);
        profilePhoto = (ImageView) findViewById(R.id.profile_photo);
    }

    /**
     * method that sets up toolbar
     */
    private void setupToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.profileToolbar);
        setSupportActionBar(toolbar);

        //Account settings button
        ImageView profileMenu = (ImageView) findViewById(R.id.profileMenu);
        profileMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: navigation to account settings.");
                Intent intent = new Intent(mContext, AccountSettingsActivity.class);
                startActivity(intent);
            }
        });

    }


    // ***************************
    // BottomNavigationView setup
    // ***************************

    private void setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }

}
