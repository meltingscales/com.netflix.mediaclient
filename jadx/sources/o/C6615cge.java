package o;

import android.app.Notification;
import android.graphics.Bitmap;
import android.util.Pair;

/* renamed from: o.cge  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6615cge implements aWY {
    private boolean a;
    private aWY b;
    private InterfaceC1820aPl e;

    public C6615cge(aWY awy, InterfaceC1820aPl interfaceC1820aPl, boolean z) {
        this.e = interfaceC1820aPl;
        this.b = awy;
        this.a = z;
    }

    @Override // o.aWY
    public boolean e() {
        return this.b.e();
    }

    @Override // o.aWY
    public void a(Notification notification, InterfaceC5098bsO interfaceC5098bsO, boolean z) {
        if (a()) {
            this.b.a(notification, interfaceC5098bsO, z);
        }
    }

    @Override // o.aWY
    public void c(InterfaceC5098bsO interfaceC5098bsO) {
        if (a()) {
            this.b.c(interfaceC5098bsO);
        }
    }

    @Override // o.aWY
    public void a(InterfaceC5098bsO interfaceC5098bsO) {
        if (a()) {
            this.b.a(interfaceC5098bsO);
        }
    }

    @Override // o.aWY
    public Pair<Integer, Notification> e(boolean z) {
        if (a()) {
            return this.b.e(z);
        }
        return new Pair<>(null, null);
    }

    @Override // o.aWY
    public void d(boolean z, String str, String str2) {
        if (a()) {
            this.b.d(z, str, str2);
        }
    }

    @Override // o.aWY
    public void a(Bitmap bitmap) {
        if (a()) {
            this.b.a(bitmap);
        }
    }

    @Override // o.aWY
    public void e(Bitmap bitmap) {
        if (a()) {
            this.b.e(bitmap);
        }
    }

    @Override // o.aWY
    public void c(boolean z, boolean z2, boolean z3, String str) {
        if (a()) {
            this.b.c(z, z2, z3, str);
        }
    }

    @Override // o.aWY
    public void d(boolean z, boolean z2, boolean z3) {
        if (a()) {
            this.b.d(z, z2, z3);
        }
    }

    @Override // o.aWY
    public void c() {
        if (a()) {
            this.b.c();
        }
    }

    private boolean a() {
        return this.e.d();
    }
}
