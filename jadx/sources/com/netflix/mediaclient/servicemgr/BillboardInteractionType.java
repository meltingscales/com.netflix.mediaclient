package com.netflix.mediaclient.servicemgr;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;

/* loaded from: classes4.dex */
public enum BillboardInteractionType {
    IMPRESSION("impression"),
    ACTION(SignupConstants.Error.DEBUG_INFO_ACTION);
    
    private final String c;

    public String c() {
        return this.c;
    }

    BillboardInteractionType(String str) {
        this.c = str;
    }
}
