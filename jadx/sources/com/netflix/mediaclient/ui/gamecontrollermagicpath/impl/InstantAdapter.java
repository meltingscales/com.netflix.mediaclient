package com.netflix.mediaclient.ui.gamecontrollermagicpath.impl;

import j$.time.Instant;
import j$.time.OffsetDateTime;
import o.C8632dsu;
import o.dnB;
import o.dnQ;

/* loaded from: classes4.dex */
public final class InstantAdapter {
    @dnQ
    public final String toJson(Instant instant) {
        C8632dsu.c((Object) instant, "");
        String instant2 = instant.toString();
        C8632dsu.a(instant2, "");
        return instant2;
    }

    @dnB
    public final Instant fromJson(String str) {
        C8632dsu.c((Object) str, "");
        Instant d = OffsetDateTime.c(str).d();
        C8632dsu.a(d, "");
        return d;
    }
}
