package o;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import com.netflix.android.imageloader.api.GetImageRequest;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.commanderinfra.api.util.TargetDeviceUiState;
import com.netflix.mediaclient.commanderinfra.impl.mediacontrols.notification.NotificationIntentRetriever;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import java.util.Map;
import kotlin.Pair;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC9638uF;
import o.WS;
import o.dpR;

/* loaded from: classes3.dex */
public final class WS extends C1045Mp implements WT {
    private final WW a;
    private WY c;
    private WZ d;
    private final NotificationIntentRetriever e;

    public WS() {
        super("MediaControlsManagerImpl");
        this.a = new WV();
        this.e = new C1319Xc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    @Override // o.WT
    public void e(VU vu) {
        C8632dsu.c((Object) vu, "");
        getLogTag();
        WZ wz = this.d;
        if (wz != null) {
            wz.d(vu);
        }
        WZ wz2 = this.d;
        if (wz2 != null) {
            wz2.c(vu.e());
        }
        WY wy = this.c;
        if (wy != null) {
            wy.a(!vu.g(), false, vu.a(), vu.c());
        }
    }

    @Override // o.WT
    public void e(InterfaceC5098bsO interfaceC5098bsO, C1295We c1295We, VZ vz, TargetDeviceUiState targetDeviceUiState) {
        C8632dsu.c((Object) targetDeviceUiState, "");
        getLogTag();
        boolean c = c1295We != null ? C8632dsu.c(c1295We.j(), Boolean.FALSE) : false;
        WX wx = new WX(c, this.a);
        this.d = wx;
        wx.e();
        C1318Xb c1318Xb = new C1318Xb(c, this.e, this.d);
        this.c = c1318Xb;
        Pair<Integer, Notification> d = d();
        c1318Xb.a(d != null ? d.a() : null, interfaceC5098bsO);
        if (c1295We != null) {
            c(c1295We, vz);
        }
    }

    @Override // o.WT
    public void c(C1295We c1295We, VZ vz) {
        getLogTag();
        WZ wz = this.d;
        if (wz != null) {
            wz.c(c1295We, vz);
        }
        if (c1295We != null) {
            WY wy = this.c;
            if (wy != null) {
                boolean c = C8632dsu.c(c1295We.j(), Boolean.FALSE);
                String c2 = c1295We.c();
                if (c2 == null) {
                    c2 = "";
                }
                String e = c1295We.e();
                wy.e(c, c2, e != null ? e : "");
            }
            d(c1295We.b());
        }
    }

    @Override // o.WT
    public void b(InterfaceC5098bsO interfaceC5098bsO) {
        getLogTag();
        WZ wz = this.d;
        if (wz != null) {
            wz.b();
        }
        WY wy = this.c;
        if (wy != null) {
            wy.b(interfaceC5098bsO);
        }
    }

    @Override // o.WT
    public void e(InterfaceC5098bsO interfaceC5098bsO) {
        getLogTag();
        WZ wz = this.d;
        if (wz != null) {
            wz.b();
        }
        WZ wz2 = this.d;
        if (wz2 != null) {
            wz2.d();
        }
        WY wy = this.c;
        if (wy != null) {
            wy.b(interfaceC5098bsO);
        }
        this.d = null;
        this.c = null;
    }

    private final Pair<Integer, Notification> d() {
        getLogTag();
        WY wy = this.c;
        if (wy != null) {
            return wy.c();
        }
        return null;
    }

    @SuppressLint({"CheckResult"})
    private final void d(String str) {
        Map d;
        Map k;
        Throwable th;
        boolean g;
        getLogTag();
        if (str != null) {
            g = C8691duz.g(str);
            if (!g) {
                GetImageRequest.e a = GetImageRequest.c.b().a(str).a();
                InterfaceC9638uF.e eVar = InterfaceC9638uF.a;
                Context d2 = AbstractApplicationC1040Mh.d();
                C8632dsu.a(d2, "");
                Single<GetImageRequest.a> b = eVar.d(d2).b(a);
                final drM<GetImageRequest.a, dpR> drm = new drM<GetImageRequest.a, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.mediacontrols.MediaControlsManagerImpl$loadBitmap$2
                    {
                        super(1);
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(GetImageRequest.a aVar) {
                        e(aVar);
                        return dpR.c;
                    }

                    public final void e(GetImageRequest.a aVar) {
                        Bitmap b2 = aVar != null ? aVar.b() : null;
                        WS.this.b(b2 != null ? b2.copy(b2.getConfig(), b2.isMutable()) : null);
                    }
                };
                Consumer<? super GetImageRequest.a> consumer = new Consumer() { // from class: o.WR
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        WS.d(drM.this, obj);
                    }
                };
                final drM<Throwable, dpR> drm2 = new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.commanderinfra.impl.mediacontrols.MediaControlsManagerImpl$loadBitmap$3
                    {
                        super(1);
                    }

                    public final void a(Throwable th2) {
                    }

                    @Override // o.drM
                    public /* synthetic */ dpR invoke(Throwable th2) {
                        a(th2);
                        return dpR.c;
                    }
                };
                b.subscribe(consumer, new Consumer() { // from class: o.WU
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        WS.c(drM.this, obj);
                    }
                });
                return;
            }
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("SPY-38442: media control asset url is null or blank", null, null, false, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b2 = c1596aHd.b();
            if (b2 != null) {
                String c = errorType.c();
                c1596aHd.a(c + " " + b2);
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
        InterfaceC1598aHf a2 = dVar.a();
        if (a2 != null) {
            a2.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Bitmap bitmap) {
        getLogTag();
        WZ wz = this.d;
        if (wz != null) {
            wz.c(bitmap);
        }
        WY wy = this.c;
        if (wy != null) {
            wy.e(bitmap);
        }
    }
}
