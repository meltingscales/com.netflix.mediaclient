package o;

import android.app.Activity;

/* renamed from: o.bXs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4140bXs {
    private d b;

    /* renamed from: o.bXs$d */
    /* loaded from: classes4.dex */
    public interface d {
        Activity c();
    }

    public abstract boolean a();

    public abstract boolean b();

    public AbstractC4140bXs(d dVar) {
        this.b = dVar;
    }

    public Activity e() {
        return this.b.c();
    }
}
