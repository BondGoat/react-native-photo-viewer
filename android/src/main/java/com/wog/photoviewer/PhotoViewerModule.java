package com.wog.photoviewer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by Bond Nguyen on 9/21/16.
 */
public class PhotoViewerModule extends ReactContextBaseJavaModule implements ActivityEventListener {

    public final int PHOTO_CODE = 1;

    public PhotoViewerModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void showPhotoViewer(String url) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            Intent videoIntent = new Intent(Intent.ACTION_VIEW);
            videoIntent.setDataAndType(Uri.parse(url), "images/*");
            currentActivity.startActivityForResult(videoIntent, PHOTO_CODE);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PHOTO_CODE) {
            getCurrentActivity().finish();
        }
    }

    @Override
    public String getName() {
        return "PhotoViewerManager";
    }

    @Override
    public void onNewIntent(Intent intent) {

    }
}
