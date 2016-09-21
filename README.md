# react-native-photo-videwer
React native photo viewer component for Android, iOS

## Table of contents
- [Install](#install)
  - [Android](#android)
- [Usage](#usage)
  - [Android](#android)
  - [iOS](#ios)

## Install

`npm install react-native-photo-viewer --save`

Use [rnpm](https://github.com/rnpm/rnpm) to automatically complete the installation:  
`rnpm link react-native-photo-viewer`

or link manually like so:

### Android
```gradle
// file: android/settings.gradle
...

include ':react-native-photo-viewer'
project(':react-native-photo-viewer').projectDir = new File(settingsDir, '../node_modules/react-native-photo-viewer/android')
```
```gradle
// file: android/app/build.gradle
...

dependencies {
    ...
    compile project(':react-native-photo-viewer')
}
```
```java
// file: android/app/src/main/java/com/<...>/MainApplication.java
...

import com.wog.photoviewer.PhotoViewerPackage;; // <-- add this import

public class MainApplication extends Application implements ReactApplication {
    @Override
    protected List<ReactPackage> getPackages() {
        return Arrays.<ReactPackage>asList(
            new MainReactPackage(),
            new PhotoViewerPackage() // <-- add this line
        );
    }
...
}

```
## Usage

### Android

```javascript
var PhotoViewerManager = require('react-native-photo-viewer');

/**
 * The method will launch native module
 * @param {String} url Video link
 */
PhotoViewerManager.showPhotoViewer(url);
```

### iOS
```javascript
var PhotoViewer = require('react-native-photo-viewer');

/**
 * This component will be used as Control, embeded inside a Viewer
 */
 <PhotoView
 source={{uri: [URL]}}
 minimumZoomScale={1} // min scale
 maximumZoomScale={4} // max scale
 .../>
```
