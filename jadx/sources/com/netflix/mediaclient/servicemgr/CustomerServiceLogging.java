package com.netflix.mediaclient.servicemgr;

/* loaded from: classes4.dex */
public interface CustomerServiceLogging {

    /* loaded from: classes4.dex */
    public enum Action {
        url,
        dial,
        chat,
        back,
        home,
        up
    }

    /* loaded from: classes.dex */
    public enum EntryPoint {
        nonMemberLanding,
        login,
        appMenu,
        returnTo,
        notification,
        errorDialog,
        profileGate
    }

    /* loaded from: classes4.dex */
    public enum ReturnToDialScreenFrom {
        fab,
        notification,
        login,
        nml,
        menu
    }

    /* loaded from: classes4.dex */
    public enum TerminationReason {
        canceledByUserBeforeConnected,
        canceledByUserAfterConnected,
        canceledByNetflix,
        failedBeforeConnected,
        failedAfterConnected
    }
}
