package com.netflix.mediaclient.ui.cfouracquisition.impl;

import android.text.Spanned;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Inject;
import o.C5422byU;
import o.C8168dfL;
import o.C8632dsu;
import o.InterfaceC5417byP;

/* loaded from: classes4.dex */
public final class CfourAcquisitionImpl implements InterfaceC5417byP {
    private final String a;
    private final String b;
    private final String c;
    private final CharSequence d;
    private final String e;
    private final CharSequence h;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface CfourAcquisitionModule {
        @Binds
        InterfaceC5417byP c(CfourAcquisitionImpl cfourAcquisitionImpl);
    }

    @Override // o.InterfaceC5417byP
    public String c() {
        return this.e;
    }

    @Override // o.InterfaceC5417byP
    public String d() {
        return this.a;
    }

    @Override // o.InterfaceC5417byP
    public CharSequence e() {
        return this.d;
    }

    @Override // o.InterfaceC5417byP
    public CharSequence g() {
        return this.h;
    }

    @Override // o.InterfaceC5417byP
    /* renamed from: i */
    public String a() {
        return this.c;
    }

    @Override // o.InterfaceC5417byP
    /* renamed from: j */
    public String b() {
        return this.b;
    }

    @Inject
    public CfourAcquisitionImpl() {
        String d = C8168dfL.d(C5422byU.e.a);
        C8632dsu.a(d, "");
        this.b = d;
        String d2 = C8168dfL.d(C5422byU.e.b);
        C8632dsu.a(d2, "");
        this.c = d2;
        Spanned c = C8168dfL.c(C8168dfL.d(C5422byU.e.d));
        C8632dsu.a(c, "");
        this.d = c;
        Spanned c2 = C8168dfL.c(C8168dfL.d(C5422byU.e.e));
        C8632dsu.a(c2, "");
        this.h = c2;
        this.a = "isAdsPlanAvailable";
        this.e = "adsPlanSupportDownload";
    }
}
