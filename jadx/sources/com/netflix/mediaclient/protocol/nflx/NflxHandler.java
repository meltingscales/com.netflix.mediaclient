package com.netflix.mediaclient.protocol.nflx;

/* loaded from: classes.dex */
public interface NflxHandler {

    /* loaded from: classes.dex */
    public enum Response {
        HANDLING,
        NOT_HANDLING,
        HANDLING_WITH_DELAY
    }

    Response I_();

    boolean j();
}
