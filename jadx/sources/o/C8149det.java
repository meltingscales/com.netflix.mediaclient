package o;

import android.content.Context;

/* renamed from: o.det  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8149det {
    public static final a e = new a(null);

    /* renamed from: o.det$a */
    /* loaded from: classes5.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("DeviceCapabilitiesUtils");
        }

        public final boolean d() {
            return !C8141del.a() && C8189dfg.b();
        }

        public final boolean b() {
            aOV d;
            Context d2 = AbstractApplicationC1040Mh.d();
            return d2 != null && C8054ddD.f(d2) && (d = AbstractApplicationC1040Mh.getInstance().i().d()) != null && d.ar() && C4369bdH.e();
        }

        public final boolean e() {
            aOV d;
            Context d2 = AbstractApplicationC1040Mh.d();
            return d2 != null && C8054ddD.h(d2) && (d = AbstractApplicationC1040Mh.getInstance().i().d()) != null && d.ap() && C4369bdH.d();
        }
    }
}
