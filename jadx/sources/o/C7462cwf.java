package o;

import android.content.Context;

/* renamed from: o.cwf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7462cwf implements InterfaceC7464cwh {
    private final C5336bwo c;

    public C7462cwf(C5336bwo c5336bwo) {
        this.c = c5336bwo;
    }

    @Override // o.InterfaceC7464cwh
    public String a() {
        return this.c.e;
    }

    @Override // o.InterfaceC7464cwh
    public String d() {
        return this.c.a;
    }

    @Override // o.InterfaceC7464cwh
    public boolean b() {
        return this.c.b;
    }

    @Override // o.InterfaceC7464cwh
    public String a(Context context) {
        C7285ctN a = C7285ctN.a(context);
        if (a.a(this.c.e)) {
            return this.c.d;
        }
        return a.b(this.c.e);
    }
}
