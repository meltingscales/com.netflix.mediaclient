package com.netflix.mediaclient.media;

/* loaded from: classes.dex */
public final class VideoResolutionRange {
    private int mMaxHeight;
    private int mMaxWidth;
    private int mMinHeight;
    private int mMinWidth;

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    private VideoResolutionRange(int i, int i2, int i3, int i4) {
        this.mMinWidth = i;
        this.mMinHeight = i3;
        this.mMaxWidth = i2;
        this.mMaxHeight = i4;
    }

    private VideoResolutionRange(int i, int i2) {
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = i;
        this.mMaxHeight = i2;
    }

    public static VideoResolutionRange getVideoResolutionRangeFromMaxHeight(int i) {
        if (i < 480) {
            return new VideoResolutionRange(512, 384);
        }
        if (i < 720) {
            return new VideoResolutionRange(720, 480);
        }
        if (i < 1080) {
            return new VideoResolutionRange(1280, 720);
        }
        if (i < 1440) {
            return new VideoResolutionRange(1920, 1080);
        }
        if (i < 2160) {
            return new VideoResolutionRange(2560, 1440);
        }
        return new VideoResolutionRange(3840, 2160);
    }

    public String toString() {
        return "VideoResolutionRange {width = [ " + this.mMinWidth + ", " + this.mMaxWidth + " ], height = [ " + this.mMinHeight + ", " + this.mMaxHeight + " ] }";
    }
}
