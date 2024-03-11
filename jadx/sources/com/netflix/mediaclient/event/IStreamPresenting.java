package com.netflix.mediaclient.event;

/* loaded from: classes3.dex */
public interface IStreamPresenting {

    /* loaded from: classes3.dex */
    public enum StreamType {
        AUDIO,
        VIDEO,
        TIMED_TEXT
    }

    StreamType b();

    String c();
}
