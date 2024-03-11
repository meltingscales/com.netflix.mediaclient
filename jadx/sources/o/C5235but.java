package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.details.LiveState;
import j$.time.Instant;

/* renamed from: o.but  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5235but {

    /* renamed from: o.but$c */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[VideoType.values().length];
            try {
                iArr[VideoType.MOVIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoType.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoType.EPISODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr;
        }
    }

    public static final LiveState a(InterfaceC5198buI interfaceC5198buI, Instant instant) {
        InterfaceC5231bup bT_;
        InterfaceC5231bup bW_;
        C8632dsu.c((Object) interfaceC5198buI, "");
        C8632dsu.c((Object) instant, "");
        VideoType type = interfaceC5198buI.getType();
        int i = type == null ? -1 : c.b[type.ordinal()];
        LiveState liveState = null;
        if (i == 1) {
            InterfaceC5238buw Q = interfaceC5198buI.Q();
            if (Q != null && (bT_ = Q.bT_()) != null) {
                liveState = bT_.d(instant);
            }
        } else if (i == 2) {
            InterfaceC5194buE P = interfaceC5198buI.P();
            if (P != null && (bW_ = P.bW_()) != null) {
                liveState = bW_.d(instant);
            }
        } else if (i == 3) {
            InterfaceC5227bul interfaceC5227bul = interfaceC5198buI instanceof InterfaceC5227bul ? (InterfaceC5227bul) interfaceC5198buI : null;
            if (interfaceC5227bul != null) {
                liveState = a(interfaceC5227bul, instant);
            }
        } else {
            liveState = LiveState.e;
        }
        return liveState == null ? LiveState.e : liveState;
    }
}
