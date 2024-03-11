package com.netflix.mediaclient.acquisition.util;

import android.content.Context;
import o.C1815aPg;
import o.C8632dsu;

/* loaded from: classes6.dex */
public final class EndpointUtilities {
    public static final int $stable = 0;
    public static final EndpointUtilities INSTANCE = new EndpointUtilities();

    private EndpointUtilities() {
    }

    public static final boolean isTestStack(Context context) {
        C8632dsu.c((Object) context, "");
        return C1815aPg.d(context).a();
    }
}
