package o;

import o.InterfaceC4660bih;
import o.InterfaceC4661bii;

/* renamed from: o.bkM  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4736bkM implements InterfaceC4660bih, InterfaceC4661bii {
    InterfaceC4660bih.b a;
    InterfaceC4661bii.e e;

    public InterfaceC4660bih.b a() {
        return this.a;
    }

    @Override // o.InterfaceC4660bih
    public void a(InterfaceC4660bih.b bVar) {
        this.a = bVar;
    }

    public void b(InterfaceC4661bii.e eVar) {
        this.e = eVar;
    }

    @Override // o.InterfaceC4661bii
    public InterfaceC4661bii.e d() {
        return this.e;
    }
}
