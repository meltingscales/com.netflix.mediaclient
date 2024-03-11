package o;

import android.content.Context;
import javax.inject.Singleton;
import o.XH;

@Singleton
/* renamed from: o.csD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7222csD implements InterfaceC7221csC {
    public static final a b = new a(null);

    /* renamed from: o.csD$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("DownloadsFeaturesImpl");
        }
    }

    @Override // o.InterfaceC7221csC
    public boolean d() {
        XH.a aVar = XH.c;
        Context d = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d, "");
        return aVar.d(d).i().a();
    }

    @Override // o.InterfaceC7221csC
    public boolean b() {
        XH.a aVar = XH.c;
        Context d = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d, "");
        return aVar.d(d).f().a();
    }

    @Override // o.InterfaceC7221csC
    public boolean a() {
        XH.a aVar = XH.c;
        Context d = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d, "");
        boolean a2 = aVar.d(d).b().a();
        return a2 ? C4289bbh.d.e() : a2;
    }
}
