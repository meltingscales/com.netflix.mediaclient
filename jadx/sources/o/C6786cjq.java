package o;

import javax.inject.Singleton;

@Singleton
/* renamed from: o.cjq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6786cjq implements InterfaceC6713ciW, InterfaceC6779cjj {
    private boolean d;

    @Override // o.InterfaceC6713ciW
    public boolean a() {
        return this.d;
    }

    @Override // o.InterfaceC6779cjj
    public void b() {
        this.d = false;
    }

    @Override // o.InterfaceC6779cjj
    public void c() {
        this.d = true;
    }
}
