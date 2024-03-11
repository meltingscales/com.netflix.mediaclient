package com.netflix.mediaclient.servicemgr;

/* loaded from: classes.dex */
public interface IMdxSharedState {

    /* loaded from: classes4.dex */
    public enum MdxPlaybackState {
        Stopped,
        Loading,
        Transitioning,
        Playing,
        Paused
    }

    MdxPlaybackState c();

    String e();
}
