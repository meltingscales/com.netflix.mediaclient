package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector;

/* loaded from: classes3.dex */
public abstract class StreamSelection {
    public abstract Object adaptationPlan$29f49be3();

    public abstract int index();

    public abstract int paceRate();

    public static StreamSelection create$62c47d43(int i, int i2, Object obj) {
        return new AutoValue_StreamSelection(i, i2, obj);
    }

    public static StreamSelection create(int i, int i2) {
        return new AutoValue_StreamSelection(i, i2, null);
    }

    public static StreamSelection create(int i) {
        return new AutoValue_StreamSelection(i, 0, null);
    }
}
