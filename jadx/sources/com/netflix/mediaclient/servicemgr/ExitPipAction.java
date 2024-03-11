package com.netflix.mediaclient.servicemgr;

/* loaded from: classes4.dex */
public enum ExitPipAction {
    CONTINUEPLAY("continueplay"),
    STOP("endsession");
    
    String c;

    ExitPipAction(String str) {
        this.c = str;
    }
}
