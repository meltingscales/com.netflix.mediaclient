package com.netflix.mediaclient.clutils;

import com.netflix.mediaclient.servicemgr.PlayLocationType;
import o.C8168dfL;

/* loaded from: classes3.dex */
public class EmptyPlayContext extends PlayContextImp {
    public EmptyPlayContext(String str, int i) {
        super("", i, -1, -1, PlayLocationType.UNKNOWN, false, str, null, null, null, null);
        if (C8168dfL.g(str)) {
            throw new IllegalStateException("Empty play Context tag passed in");
        }
    }
}
