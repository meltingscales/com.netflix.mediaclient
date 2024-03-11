package o;

import com.netflix.mediaclient.NetflixApplication;

/* renamed from: o.cuu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7371cuu {
    InterfaceC7464cwh a(String str);

    /* renamed from: o.cuu$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC7371cuu {
        @Override // o.InterfaceC7371cuu
        public InterfaceC7464cwh a(String str) {
            C8632dsu.c((Object) str, "");
            InterfaceC5298bwC u = NetflixApplication.getInstance().u();
            C8632dsu.d(u);
            return ((C7359cui) u).b(str);
        }
    }
}
