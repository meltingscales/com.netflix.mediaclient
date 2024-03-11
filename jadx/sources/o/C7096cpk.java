package o;

import android.app.Activity;
import o.AbstractC4140bXs;

/* renamed from: o.cpk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7096cpk extends AbstractC4140bXs {
    public static final d c = new d(null);
    public static final int e = 8;
    private final InterfaceC7089cpd d;

    /* renamed from: o.cpk$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("NotificationPermissionDialogManageable");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7096cpk(AbstractC4140bXs.d dVar, InterfaceC7089cpd interfaceC7089cpd) {
        super(dVar);
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) interfaceC7089cpd, "");
        this.d = interfaceC7089cpd;
    }

    @Override // o.AbstractC4140bXs
    public boolean a() {
        return this.d.c();
    }

    @Override // o.AbstractC4140bXs
    public boolean b() {
        Activity e2 = e();
        if (e2 != null) {
            InterfaceC7090cpe.b.e(e2).d();
            this.d.a();
            return true;
        }
        return false;
    }
}
