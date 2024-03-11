package o;

import android.os.Build;
import android.os.Bundle;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_MediaResourceConstraints;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.ui.player.PlayerExtras;
import com.netflix.mediaclient.util.PlayContext;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.Map;
import o.AbstractC5100bsQ;
import o.C4355bcu;
import o.C5208buS;
import o.C5273bve;
import o.C5296bwA;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC4360bcz;
import o.InterfaceC5085bsB;
import org.chromium.net.NetError;

/* renamed from: o.bwA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5296bwA extends C1045Mp {
    private AbstractC5100bsQ e;

    public C5296bwA() {
        super("PlaybackSession2Helper");
    }

    /* renamed from: o.bwA$d */
    /* loaded from: classes4.dex */
    public static abstract class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        /* renamed from: o.bwA$d$b */
        /* loaded from: classes4.dex */
        public static final class b extends d {
            private final InterfaceC5085bsB b;
            private final AbstractC5100bsQ e;

            public final InterfaceC5085bsB a() {
                return this.b;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC5085bsB interfaceC5085bsB, AbstractC5100bsQ abstractC5100bsQ) {
                super(null);
                C8632dsu.c((Object) interfaceC5085bsB, "");
                C8632dsu.c((Object) abstractC5100bsQ, "");
                this.b = interfaceC5085bsB;
                this.e = abstractC5100bsQ;
            }
        }

        private d() {
        }

        /* renamed from: o.bwA$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends d {
            public static final a d = new a();

            private a() {
                super(null);
            }
        }
    }

    public final Single<AbstractC5100bsQ> c() {
        C8166dfJ.e("getNetflixVideoGroup", false);
        AbstractC5100bsQ abstractC5100bsQ = this.e;
        if (abstractC5100bsQ != null && abstractC5100bsQ.d()) {
            Single<AbstractC5100bsQ> just = Single.just(this.e);
            C8632dsu.a(just, "");
            return just;
        }
        Single<AbstractC5100bsQ> b = InterfaceC4360bcz.b.a().b();
        final drM<AbstractC5100bsQ, AbstractC5100bsQ> drm = new drM<AbstractC5100bsQ, AbstractC5100bsQ>() { // from class: com.netflix.mediaclient.ui.PlaybackSession2Helper$getNetflixVideoGroup$2
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: c */
            public final AbstractC5100bsQ invoke(AbstractC5100bsQ abstractC5100bsQ2) {
                C8632dsu.c((Object) abstractC5100bsQ2, "");
                C5296bwA.this.e = abstractC5100bsQ2;
                return abstractC5100bsQ2;
            }
        };
        Single map = b.map(new Function() { // from class: o.bwG
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                AbstractC5100bsQ c;
                c = C5296bwA.c(drM.this, obj);
                return c;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC5100bsQ c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (AbstractC5100bsQ) drm.invoke(obj);
    }

    public final Single<d> d(final Bundle bundle) {
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) bundle, "");
        C8166dfJ.e("launchPlaybackSession", false);
        final PlayerExtras b = b(bundle);
        if (b == null) {
            Single<d> just = Single.just(d.a.d);
            C8632dsu.a(just, "");
            return just;
        }
        final C7445cwO b2 = b(b);
        if (b2 == null) {
            Single<d> just2 = Single.just(d.a.d);
            C8632dsu.a(just2, "");
            return just2;
        }
        final String e = e(bundle);
        if (e == null) {
            Single<d> just3 = Single.just(d.a.d);
            C8632dsu.a(just3, "");
            return just3;
        }
        final C5208buS c = c(e);
        if (c == null) {
            Single<d> just4 = Single.just(d.a.d);
            C8632dsu.a(just4, "");
            return just4;
        } else if (!d(b)) {
            Single<d> just5 = Single.just(d.a.d);
            C8632dsu.a(just5, "");
            return just5;
        } else {
            AbstractC5100bsQ abstractC5100bsQ = this.e;
            if (abstractC5100bsQ != null && abstractC5100bsQ.d()) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("launchPlaybackSession previous instance is valid", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b3 = c1596aHd.b();
                    if (b3 != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b3);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
                AbstractC5100bsQ abstractC5100bsQ2 = this.e;
                if (abstractC5100bsQ2 != null) {
                    abstractC5100bsQ2.e();
                }
                this.e = null;
            }
            Single<AbstractC5100bsQ> b4 = InterfaceC4360bcz.b.a().b();
            final drM<AbstractC5100bsQ, d> drm = new drM<AbstractC5100bsQ, d>() { // from class: com.netflix.mediaclient.ui.PlaybackSession2Helper$launchPlaybackSession$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                /* renamed from: c */
                public final C5296bwA.d invoke(AbstractC5100bsQ abstractC5100bsQ3) {
                    PlayContext c3;
                    PlaylistTimestamp a2;
                    C8632dsu.c((Object) abstractC5100bsQ3, "");
                    C5296bwA.this.e = abstractC5100bsQ3;
                    InterfaceC4360bcz a3 = InterfaceC4360bcz.b.a();
                    long h = b.h();
                    PlaybackExperience playbackExperience = PlaybackExperience.a;
                    C8632dsu.a(playbackExperience, "");
                    C5208buS c5208buS = c;
                    c3 = C5296bwA.this.c(bundle);
                    a2 = C5296bwA.this.a(e, b, b2);
                    InterfaceC5085bsB c4 = a3.c(new C4355bcu(h, abstractC5100bsQ3, playbackExperience, c5208buS, c3, a2, false, null, null));
                    c4.c(false);
                    return new C5296bwA.d.b(c4, abstractC5100bsQ3);
                }
            };
            Single map = b4.map(new Function() { // from class: o.bwz
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    C5296bwA.d a2;
                    a2 = C5296bwA.a(drM.this, obj);
                    return a2;
                }
            });
            C8632dsu.a(map, "");
            return map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (d) drm.invoke(obj);
    }

    public final void e() {
        C8166dfJ.e("releaseVideoGroup", false);
        getLogTag();
        AbstractC5100bsQ abstractC5100bsQ = this.e;
        if (abstractC5100bsQ != null) {
            InterfaceC4360bcz.b.a().a(abstractC5100bsQ);
            this.e = null;
        }
    }

    private final boolean d(PlayerExtras playerExtras) {
        return aQZ.e.b().c() && playerExtras.k() && TN.a.d() != null && !Config_FastProperty_MediaResourceConstraints.Companion.b();
    }

    private final C7445cwO b(PlayerExtras playerExtras) {
        if (playerExtras.d() == null) {
            return null;
        }
        return playerExtras.d();
    }

    private final String e(Bundle bundle) {
        String string = bundle.getString(NetflixActivity.EXTRA_VIDEO_ID);
        if (C8168dfL.g(string)) {
            return null;
        }
        return string;
    }

    private final PlayerExtras b(Bundle bundle) {
        Object parcelable;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS, PlayerExtras.class);
            return (PlayerExtras) parcelable;
        }
        return (PlayerExtras) bundle.getParcelable(NetflixActivity.EXTRA_PLAYER_EXTRAS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlayContext c(Bundle bundle) {
        PlayContext playContext = (PlayContext) bundle.getParcelable(NetflixActivity.EXTRA_PLAY_CONTEXT);
        return playContext == null ? new EmptyPlayContext("PlayerFragment", NetError.ERR_INVALID_RESPONSE) : playContext;
    }

    private final C5208buS c(String str) {
        try {
            return new C5208buS.b(str).a(str, new C5273bve.b(Long.parseLong(str)).d()).d(str).a();
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlaylistTimestamp a(String str, PlayerExtras playerExtras, C7445cwO c7445cwO) {
        return new PlaylistTimestamp(str, str, playerExtras.e() != -1 ? playerExtras.e() : c7445cwO.c());
    }
}
