package com.netflix.mediaclient.ui.gamecontrollermagicpath.impl;

import com.google.android.material.ripple.RippleUtils;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.api.SourceMethod;
import j$.time.Instant;
import o.C8632dsu;
import o.dnF;

@dnF(c = RippleUtils.USE_FRAMEWORK_RIPPLE)
/* loaded from: classes4.dex */
public final class CloudGameSSIDBeaconJson {
    private final int a;
    private final String b;
    private final Instant c;
    private final SourceMethod d;
    private final String e;

    public final Instant a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.e;
    }

    public final SourceMethod e() {
        return this.d;
    }

    public CloudGameSSIDBeaconJson(String str, SourceMethod sourceMethod, String str2, Instant instant, int i) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) sourceMethod, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) instant, "");
        this.b = str;
        this.d = sourceMethod;
        this.e = str2;
        this.c = instant;
        this.a = i;
    }
}
