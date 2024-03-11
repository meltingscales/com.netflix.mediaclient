package o;

import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.PlaybackContext;
import com.netflix.model.leafs.PostPlayExperience;
import io.reactivex.Observable;
import o.AbstractC5595cBf;
import o.cBA;

/* renamed from: o.cEk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5681cEk extends AbstractC9940zU<cBA, cBO> {
    public static final e d = new e(null);
    private boolean a;
    private PlaybackContext b;
    private boolean c;
    private boolean e;
    private InterfaceC7450cwT f;
    private boolean h;
    private final cFS i;

    /* renamed from: o.cEk$c */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[IPlayer.PlaybackType.values().length];
            try {
                iArr[IPlayer.PlaybackType.LivePlayback.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            b = iArr;
        }
    }

    /* renamed from: o.cEk$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final void e(cFS cfs, Observable<cBA> observable) {
            C8632dsu.c((Object) cfs, "");
            C8632dsu.c((Object) observable, "");
            new C5681cEk(cfs, observable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5681cEk(cFS cfs, Observable<cBA> observable) {
        super(observable, cfs);
        C8632dsu.c((Object) cfs, "");
        C8632dsu.c((Object) observable, "");
        this.i = cfs;
        this.b = PlaybackContext.d;
    }

    @Override // o.AbstractC9940zU
    public void onEvent(cBA cba) {
        PlaybackContext playbackContext;
        InterfaceC7450cwT interfaceC7450cwT;
        InterfaceC7450cwT interfaceC7450cwT2;
        C8632dsu.c((Object) cba, "");
        if (cba instanceof cBA.ai) {
            InterfaceC7450cwT interfaceC7450cwT3 = this.f;
            if (interfaceC7450cwT3 != null) {
                interfaceC7450cwT3.m();
            }
        } else if (cba instanceof cBA.W) {
            InterfaceC7450cwT interfaceC7450cwT4 = this.f;
            if (interfaceC7450cwT4 != null) {
                interfaceC7450cwT4.b(((cBA.W) cba).a());
            }
        } else if (cba instanceof cBA.G) {
            InterfaceC7450cwT interfaceC7450cwT5 = this.f;
            if (interfaceC7450cwT5 != null) {
                interfaceC7450cwT5.f();
            }
        } else if (C8632dsu.c(cba, cBA.K.a)) {
            this.e = true;
            InterfaceC7450cwT interfaceC7450cwT6 = this.f;
            if (interfaceC7450cwT6 != null) {
                interfaceC7450cwT6.e();
            }
        } else if (C8632dsu.c(cba, cBA.C5564z.e)) {
            this.e = false;
        } else if (C8632dsu.c(cba, cBA.ak.b)) {
            InterfaceC7450cwT interfaceC7450cwT7 = this.f;
            if (interfaceC7450cwT7 != null) {
                interfaceC7450cwT7.c();
            }
            InterfaceC7450cwT interfaceC7450cwT8 = this.f;
            if (interfaceC7450cwT8 != null) {
                interfaceC7450cwT8.d();
            }
        } else if (cba instanceof cBA.ac) {
            InterfaceC7450cwT interfaceC7450cwT9 = this.f;
            if (interfaceC7450cwT9 != null) {
                interfaceC7450cwT9.b(PlayLocationType.POST_PLAY, ((cBA.ac) cba).d());
            }
        } else if (cba instanceof cBA.C5538ab) {
            InterfaceC7450cwT interfaceC7450cwT10 = this.f;
            if (interfaceC7450cwT10 != null) {
                cBA.C5538ab c5538ab = (cBA.C5538ab) cba;
                interfaceC7450cwT10.c(PlayLocationType.POST_PLAY, c5538ab.a(), c5538ab.c());
            }
        } else if (cba instanceof cBA.C5539af) {
            InterfaceC7450cwT interfaceC7450cwT11 = this.f;
            if (interfaceC7450cwT11 != null) {
                cBA.C5539af c5539af = (cBA.C5539af) cba;
                interfaceC7450cwT11.b(PlayLocationType.POST_PLAY, c5539af.a(), c5539af.d());
            }
        } else if (cba instanceof cBA.am) {
            this.c = true;
            InterfaceC7450cwT interfaceC7450cwT12 = this.f;
            if (interfaceC7450cwT12 != null) {
                interfaceC7450cwT12.d(this.e);
            }
        } else if (cba instanceof cBA.C5548j) {
            InterfaceC7450cwT interfaceC7450cwT13 = this.f;
            if (interfaceC7450cwT13 != null) {
                interfaceC7450cwT13.g();
            }
        } else if (cba instanceof cBA.C5541c) {
            if (!this.a) {
                this.a = true;
                InterfaceC7450cwT interfaceC7450cwT14 = this.f;
                if (interfaceC7450cwT14 != null) {
                    interfaceC7450cwT14.g();
                }
            }
            if (!this.c || (interfaceC7450cwT2 = this.f) == null || interfaceC7450cwT2.j()) {
                InterfaceC7450cwT interfaceC7450cwT15 = this.f;
                if (interfaceC7450cwT15 == null || !interfaceC7450cwT15.n()) {
                    return;
                }
                InterfaceC7450cwT interfaceC7450cwT16 = this.f;
                if (interfaceC7450cwT16 != null && interfaceC7450cwT16.b()) {
                    return;
                }
            }
            InterfaceC7450cwT interfaceC7450cwT17 = this.f;
            if (interfaceC7450cwT17 != null) {
                interfaceC7450cwT17.e(false);
            }
            this.c = false;
        } else if (cba instanceof cBA.C5556r) {
            if (this.c && (interfaceC7450cwT = this.f) != null) {
                interfaceC7450cwT.i();
            }
            InterfaceC7450cwT interfaceC7450cwT18 = this.f;
            if (interfaceC7450cwT18 != null) {
                interfaceC7450cwT18.h();
            }
            InterfaceC7450cwT interfaceC7450cwT19 = this.f;
            if (interfaceC7450cwT19 != null) {
                interfaceC7450cwT19.c();
            }
            this.h = false;
        } else if (C8632dsu.c(cba, cBA.C5559u.b)) {
            InterfaceC7450cwT interfaceC7450cwT20 = this.f;
            if (interfaceC7450cwT20 != null) {
                interfaceC7450cwT20.a();
            }
        } else if (cba instanceof cBA.C5549k) {
            InterfaceC7450cwT interfaceC7450cwT21 = this.f;
            if (interfaceC7450cwT21 != null) {
                interfaceC7450cwT21.b(((cBA.C5549k) cba).e());
            }
        } else if (cba instanceof cBA.aF) {
            this.i.e(((cBA.aF) cba).b());
        } else if (cba instanceof cBA.ad) {
            if (this.h) {
                return;
            }
            this.h = true;
            this.i.j();
            this.f = ((cBA.ad) cba).e().c();
        } else if (cba instanceof cBA.Z) {
            PostPlayExperience d2 = ((cBA.Z) cba).d();
            InterfaceC7450cwT interfaceC7450cwT22 = this.f;
            if (interfaceC7450cwT22 != null) {
                interfaceC7450cwT22.b(d2);
            }
            if (C8632dsu.c((Object) d2.getType(), (Object) "preview3")) {
                this.i.i();
            }
        } else if ((cba instanceof AbstractC5595cBf.b) || (cba instanceof AbstractC5595cBf.d)) {
            this.b = PlaybackContext.a;
        } else if (cba instanceof AbstractC5595cBf.e) {
            this.b = PlaybackContext.b;
        } else if (cba instanceof cBA.ah) {
            if (c.b[((cBA.ah) cba).d().ordinal()] == 1) {
                playbackContext = PlaybackContext.a;
            } else {
                playbackContext = PlaybackContext.d;
            }
            this.b = playbackContext;
        }
    }

    @Override // o.AbstractC9940zU
    public void h() {
        super.h();
        this.i.c();
        InterfaceC7450cwT interfaceC7450cwT = this.f;
        if (interfaceC7450cwT != null) {
            interfaceC7450cwT.d();
        }
    }
}
