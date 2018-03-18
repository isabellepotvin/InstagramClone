package com.team06.InstagramClone.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import com.team06.InstagramClone.R;

/**
 * Created by isabellepotvin on 2018-02-25.
 */

public class UniversalImageLoader {

    private static final String TAG = "UniversalImageLoader"; //I added this for testing purposes

    private static final int defaultImage = R.drawable.ic_android;
    private Context mContext;

    //constructor
    public UniversalImageLoader(Context context) {
        mContext = context;
    }

    //this is where I set all the settings for the Universal image loader
    public ImageLoaderConfiguration getConfig(){
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .showImageOnLoading(defaultImage)
                .showImageForEmptyUri(defaultImage)
                .showImageOnFail(defaultImage)
                .cacheOnDisk(true).cacheInMemory(true)
                .cacheOnDisk(true).resetViewBeforeLoading(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300))
                .bitmapConfig(Bitmap.Config.RGB_565) //added this to deal with out of memory an error
                .build();

        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(mContext)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .diskCacheSize(100 * 1024 * 1024)
                .diskCacheExtraOptions(480, 320, null) //added this to deal with out of memory an error
                .build();

        return configuration;
    }

    /**
     * this methdd can be used to set images that are static. It can't be used if the images are
     * being changed in the Fragment/Activity - OR if they are being set in a list or a grid
     * @param imgURL
     * @param image
     * @param mProgressBar
     * @param append
     */
    public static void setImage(String imgURL, ImageView image, final ProgressBar mProgressBar, String append){

        Log.d(TAG, "setImage: Setting Image");  //I added this for testing purposes

        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.displayImage(append + imgURL, image, new ImageLoadingListener() {
            @Override
            public void onLoadingStarted(String imageUri, View view) {
                if(mProgressBar != null){
                    mProgressBar.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
                if(mProgressBar != null){
                    mProgressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                if(mProgressBar != null){
                    mProgressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onLoadingCancelled(String imageUri, View view) {
                if(mProgressBar != null){
                    mProgressBar.setVisibility(View.GONE);
                }
            }
        });
    }
}
