'use-strict'

import React, {
  PropTypes,
  Component
} from 'react';

import {
  View,
  Text,
  StyleSheet,
  NativeModules,
  TouchableHighlight,
} from 'react-native';

const { PhotoViewerManager } = NativeModules;

module.exports = {
  ...PhotoViewerManager,

  showVideoPlayer(url, callback) {
    return PhotoViewerManager.showPhotoViewer(url);
  }
}
