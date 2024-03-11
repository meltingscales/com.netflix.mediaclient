package com.netflix.model.leafs;

/* loaded from: classes5.dex */
public interface PostPlayAsset {

    /* loaded from: classes5.dex */
    public enum Type {
        BACKGROUND,
        LOGO,
        DISPLAY_ART
    }

    String getAssetType();

    int getHeight();

    String getTone();

    Type getType();

    String getUrl();

    int getWidth();

    boolean isBadged();
}
