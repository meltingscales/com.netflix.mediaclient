package o;

import com.netflix.mediaclient.cdx.api.event.type.PlaybackStateType;
import com.netflix.mediaclient.cdx.api.event.type.PlaybackSubStateType;
import java.util.List;

/* loaded from: classes3.dex */
public final class WI implements UN {
    public static final c a = new c(null);

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("PlayerSubscriptionResponseCallbackImpl");
        }
    }

    @Override // o.UN
    public void b(UW uw) {
        List i;
        C8632dsu.c((Object) uw, "");
        String j = uw.j();
        PlaybackStateType i2 = uw.i();
        PlaybackSubStateType f = uw.f();
        uw.d();
        String e = uw.e();
        uw.h();
        String a2 = uw.a();
        uw.i();
        PlaybackStateType playbackStateType = PlaybackStateType.d;
        boolean g = uw.g();
        boolean c2 = C8632dsu.c((Object) uw.c(), (Object) uw.b());
        c cVar = a;
        cVar.getLogTag();
        if (j.length() > 0) {
            C1320Xd.c.b().d(j);
            C1331Xo c1331Xo = C1331Xo.b;
            i = C8569dql.i();
            c1331Xo.b(new VO(c2, g, "", "", i));
            C1327Xk.b.b(i2, f, j, e, a2);
            return;
        }
        cVar.getLogTag();
    }
}
