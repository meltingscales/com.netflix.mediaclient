package o;

import com.netflix.mediaclient.cdx.api.event.type.PlaybackStateType;
import com.netflix.mediaclient.cdx.api.event.type.PlaybackSubStateType;

/* loaded from: classes3.dex */
public final class WH implements UO {
    public static final e e = new e(null);

    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PlaybackEventCallbackImpl");
        }
    }

    @Override // o.UO
    public void d(UU uu) {
        C8632dsu.c((Object) uu, "");
        String i = uu.i();
        PlaybackStateType f = uu.f();
        PlaybackSubStateType j = uu.j();
        uu.e();
        String d = uu.d();
        uu.g();
        String a = uu.a();
        uu.f();
        PlaybackStateType playbackStateType = PlaybackStateType.d;
        uu.h();
        C8632dsu.c((Object) uu.b(), (Object) uu.c());
        e.getLogTag();
        C1327Xk.b.b(f, j, i, d, a);
    }
}
