package com.netflix.mediaclient.ui.gamecontrollermagicpath.impl;

import com.netflix.mediaclient.ui.gamecontrollermagicpath.api.SourceMethod;
import o.C8632dsu;
import o.dnB;
import o.dnQ;

/* loaded from: classes4.dex */
public final class SourceMethodAdapter {
    @dnQ
    public final String toJson(SourceMethod sourceMethod) {
        C8632dsu.c((Object) sourceMethod, "");
        return sourceMethod.a();
    }

    @dnB
    public final SourceMethod fromJson(String str) {
        C8632dsu.c((Object) str, "");
        SourceMethod sourceMethod = SourceMethod.a;
        if (!C8632dsu.c((Object) str, (Object) sourceMethod.a())) {
            sourceMethod = SourceMethod.c;
            if (!C8632dsu.c((Object) str, (Object) sourceMethod.a())) {
                sourceMethod = SourceMethod.e;
                if (!C8632dsu.c((Object) str, (Object) sourceMethod.a())) {
                    throw new IllegalStateException(("Invalid sourceMethod: " + str).toString());
                }
            }
        }
        return sourceMethod;
    }
}
