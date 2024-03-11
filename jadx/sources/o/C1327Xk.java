package o;

import com.netflix.mediaclient.cdx.api.event.type.PlaybackStateType;
import com.netflix.mediaclient.cdx.api.event.type.PlaybackSubStateType;

/* renamed from: o.Xk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1327Xk extends C1045Mp {
    public static final C1327Xk b = new C1327Xk();

    /* renamed from: o.Xk$a */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[PlaybackStateType.values().length];
            try {
                iArr[PlaybackStateType.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaybackStateType.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            d = iArr;
            int[] iArr2 = new int[PlaybackSubStateType.values().length];
            try {
                iArr2[PlaybackSubStateType.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PlaybackSubStateType.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PlaybackSubStateType.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PlaybackSubStateType.g.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PlaybackSubStateType.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PlaybackSubStateType.c.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr2;
        }
    }

    private C1327Xk() {
        super("PlaybackInfraUtil");
    }

    private final String e() {
        VU c;
        String c2;
        VX b2 = C1317Xa.e.d().b();
        return (b2 == null || (c = b2.c()) == null || (c2 = c.c()) == null) ? "" : c2;
    }

    private final boolean d() {
        VU c;
        VX b2 = C1317Xa.e.d().b();
        return (b2 == null || (c = b2.c()) == null || !c.a()) ? false : true;
    }

    public final void b(PlaybackStateType playbackStateType, PlaybackSubStateType playbackSubStateType, String str, String str2, String str3) {
        C8632dsu.c((Object) playbackStateType, "");
        C8632dsu.c((Object) playbackSubStateType, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        getLogTag();
        int i = a.d[playbackStateType.ordinal()];
        if (i == 1) {
            a(str, str2, str3, playbackSubStateType);
        } else if (i != 2) {
        } else {
            a(playbackSubStateType, str, str2, str3);
        }
    }

    private final void a(String str, String str2, String str3, PlaybackSubStateType playbackSubStateType) {
        getLogTag();
        float parseFloat = Float.parseFloat(str2);
        float parseFloat2 = Float.parseFloat(str3);
        PlaybackSubStateType playbackSubStateType2 = PlaybackSubStateType.j;
        a(new VU(str, parseFloat, parseFloat2, playbackSubStateType != playbackSubStateType2, d(), e(), playbackSubStateType == playbackSubStateType2));
    }

    private final void a(PlaybackSubStateType playbackSubStateType, String str, String str2, String str3) {
        getLogTag();
        switch (a.a[playbackSubStateType.ordinal()]) {
            case 1:
            case 2:
                a(new VU(str, Float.parseFloat(str2), Float.parseFloat(str3), true, d(), e(), false));
                return;
            case 3:
                C1320Xd.c.b().d(str);
                b(str, str2, str3, true);
                return;
            case 4:
                b(str, str2, str3, true);
                return;
            case 5:
                b(str, str2, str3, false);
                return;
            case 6:
                b(str, str2, str3, false);
                return;
            default:
                return;
        }
    }

    private final void b(String str, String str2, String str3, boolean z) {
        getLogTag();
        a(new VU(str, Float.parseFloat(str2), Float.parseFloat(str3), z, d(), e(), false));
        C1331Xo.b.h();
    }

    public final void a(VU vu) {
        C8632dsu.c((Object) vu, "");
        getLogTag();
        C1317Xa c1317Xa = C1317Xa.e;
        InterfaceC8812dzl<VX> d = c1317Xa.d();
        VX b2 = c1317Xa.d().b();
        d.d(b2 != null ? VX.e(b2, null, null, vu, null, null, null, null, 123, null) : null);
    }
}
