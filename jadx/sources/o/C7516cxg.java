package o;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.util.Rational;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_EnableExtremePipRatio;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_forceAllowPip;
import com.netflix.mediaclient.ui.player.PipAction;
import com.netflix.mediaclient.ui.player.PlayerPictureInPictureManager;
import java.util.ArrayList;
import java.util.List;
import o.C9834xU;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.cxg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7516cxg implements PlayerPictureInPictureManager {
    public static final b a = new b(null);
    private static final Rational e = new Rational(4, 3);
    private final drO<dpR> b;
    private final drO<dpR> c;
    private final drO<dpR> d;
    private Rational f;
    private boolean g;
    private final Activity h;
    private final drO<dpR> i;
    private boolean j;
    private PlayerPictureInPictureManager.PlayerLiveStatus k;
    private final PictureInPictureParams.Builder l;
    private BroadcastReceiver m;
    private final boolean n;

    /* renamed from: o  reason: collision with root package name */
    private final drM<Boolean, dpR> f13785o;
    private Rect p;
    private PlayerPictureInPictureManager.PlaybackPipStatus q;
    private final List<RemoteAction> r;
    private boolean s;

    /* renamed from: o.cxg$d */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[PlayerPictureInPictureManager.PlayerLiveStatus.values().length];
            try {
                iArr[PlayerPictureInPictureManager.PlayerLiveStatus.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerPictureInPictureManager.PlayerLiveStatus.j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerPictureInPictureManager.PlayerLiveStatus.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayerPictureInPictureManager.PlayerLiveStatus.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlayerPictureInPictureManager.PlayerLiveStatus.a.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr;
            int[] iArr2 = new int[PlayerPictureInPictureManager.PlaybackPipStatus.values().length];
            try {
                iArr2[PlayerPictureInPictureManager.PlaybackPipStatus.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PlayerPictureInPictureManager.PlaybackPipStatus.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            e = iArr2;
            int[] iArr3 = new int[PipAction.values().length];
            try {
                iArr3[PipAction.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[PipAction.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[PipAction.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[PipAction.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            d = iArr3;
        }
    }

    public Rational a() {
        return this.f;
    }

    @Override // com.netflix.mediaclient.ui.player.PlayerPictureInPictureManager
    public PlayerPictureInPictureManager.PlaybackPipStatus c() {
        return this.q;
    }

    public Rect d() {
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7516cxg(Activity activity, boolean z, boolean z2, drM<? super Boolean, dpR> drm, drO<dpR> dro, drO<dpR> dro2, drO<dpR> dro3, drO<dpR> dro4) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) drm, "");
        C8632dsu.c((Object) dro, "");
        C8632dsu.c((Object) dro2, "");
        C8632dsu.c((Object) dro3, "");
        C8632dsu.c((Object) dro4, "");
        this.h = activity;
        this.n = z2;
        this.f13785o = drm;
        this.b = dro;
        this.d = dro2;
        this.c = dro3;
        this.i = dro4;
        this.l = C7519cxj.e();
        this.s = true;
        this.r = new ArrayList();
        e();
        if (z) {
            d(activity);
        }
        this.f = e;
        this.k = PlayerPictureInPictureManager.PlayerLiveStatus.d;
        this.q = PlayerPictureInPictureManager.PlaybackPipStatus.c;
        this.p = new Rect();
    }

    @Override // com.netflix.mediaclient.ui.player.PlayerPictureInPictureManager
    public boolean b(boolean z, Context context) {
        C8632dsu.c((Object) context, "");
        return z && (Config_FastProperty_forceAllowPip.Companion.c() || (C8159dfC.f(context) && !(C8159dfC.h() && this.n)));
    }

    @Override // com.netflix.mediaclient.ui.player.PlayerPictureInPictureManager
    public boolean b() {
        PictureInPictureParams build;
        Throwable th;
        PictureInPictureParams build2;
        boolean enterPictureInPictureMode;
        if (c() != PlayerPictureInPictureManager.PlaybackPipStatus.d) {
            try {
                this.l.setAspectRatio(a());
                Activity activity = this.h;
                build2 = this.l.build();
                enterPictureInPictureMode = activity.enterPictureInPictureMode(build2);
                return enterPictureInPictureMode;
            } catch (Exception e2) {
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                build = this.l.build();
                String message = e2.getMessage();
                C1596aHd b2 = new C1596aHd("Unable to enter Picture in picture with params " + build + " because of %e" + message, null, null, false, null, false, false, 126, null).b(false);
                ErrorType errorType = b2.a;
                if (errorType != null) {
                    b2.e.put("errorType", errorType.c());
                    String b3 = b2.b();
                    if (b3 != null) {
                        String c = errorType.c();
                        b2.a(c + " " + b3);
                    }
                }
                if (b2.b() != null && b2.i != null) {
                    th = new Throwable(b2.b(), b2.i);
                } else if (b2.b() != null) {
                    th = new Throwable(b2.b());
                } else {
                    th = b2.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(b2, th);
                } else {
                    dVar.e().b(b2, th);
                }
                b(PlayerPictureInPictureManager.PlaybackPipStatus.d);
            }
        }
        return false;
    }

    @Override // com.netflix.mediaclient.ui.player.PlayerPictureInPictureManager
    public void e(boolean z) {
        if (z) {
            d(this.h);
        } else {
            i();
        }
        this.f13785o.invoke(Boolean.valueOf(z));
    }

    public void e() {
        if (f()) {
            this.r.add(a(PipAction.b));
            this.r.add(a(PipAction.d));
            this.r.add(a(PipAction.c));
            return;
        }
        this.r.add(a(PipAction.d));
    }

    /* renamed from: o.cxg$e */
    /* loaded from: classes4.dex */
    public static final class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            if (C8632dsu.c((Object) "media_control", (Object) intent.getAction())) {
                int intExtra = intent.getIntExtra("control_type", 0);
                if (intExtra == 1) {
                    C7516cxg.this.b.invoke();
                } else if (intExtra == 2) {
                    C7516cxg.this.d.invoke();
                } else if (intExtra == 5) {
                    C7516cxg.this.c.invoke();
                } else if (intExtra != 6) {
                } else {
                    C7516cxg.this.i.invoke();
                }
            }
        }
    }

    public void d(Context context) {
        C8632dsu.c((Object) context, "");
        i();
        e eVar = new e();
        this.m = eVar;
        ContextCompat.registerReceiver(context, eVar, new IntentFilter("media_control"), 2);
    }

    @Override // com.netflix.mediaclient.ui.player.PlayerPictureInPictureManager
    public void i() {
        BroadcastReceiver broadcastReceiver;
        if (!C8054ddD.f() || (broadcastReceiver = this.m) == null) {
            return;
        }
        this.h.unregisterReceiver(broadcastReceiver);
        this.m = null;
    }

    @Override // com.netflix.mediaclient.ui.player.PlayerPictureInPictureManager
    public void a(Rational rational) {
        C8632dsu.c((Object) rational, "");
        if (!d(rational) && (rational.floatValue() < 0.41841003f || rational.floatValue() > 2.39f)) {
            b(PlayerPictureInPictureManager.PlaybackPipStatus.d);
        }
        this.f = rational;
        if (rational.floatValue() < 0.41841003f) {
            this.f = new Rational(0, 1000);
        } else if (rational.floatValue() > 2.39f) {
            this.f = new Rational(2000, 1000);
        }
    }

    @Override // com.netflix.mediaclient.ui.player.PlayerPictureInPictureManager
    public void a(PlayerPictureInPictureManager.PlayerLiveStatus playerLiveStatus) {
        C8632dsu.c((Object) playerLiveStatus, "");
        this.k = playerLiveStatus;
        int i = d.b[playerLiveStatus.ordinal()];
        if (i == 1) {
            d(true);
            a(true);
        } else if (i == 2) {
            a(false);
        } else if (i == 3) {
            a(false);
        } else if (i == 4) {
            d(false);
            a(true);
        } else if (i == 5) {
            d(true);
            a(true);
        } else {
            d(false);
            a(true);
        }
    }

    @Override // com.netflix.mediaclient.ui.player.PlayerPictureInPictureManager
    public void b(boolean z) {
        this.j = z;
        a(z);
    }

    @Override // com.netflix.mediaclient.ui.player.PlayerPictureInPictureManager
    public void b(PlayerPictureInPictureManager.PlaybackPipStatus playbackPipStatus) {
        C8632dsu.c((Object) playbackPipStatus, "");
        this.q = playbackPipStatus;
        int i = d.e[playbackPipStatus.ordinal()];
        if (i == 1) {
            c(false);
        } else if (i != 2) {
        } else {
            c(true);
        }
    }

    @Override // com.netflix.mediaclient.ui.player.PlayerPictureInPictureManager
    public void a(Rect rect) {
        C8632dsu.c((Object) rect, "");
        this.p = rect;
        h();
    }

    private final void c(boolean z) {
        boolean z2;
        CharSequence title;
        CharSequence title2;
        if (z) {
            NetflixApplication netflixApplication = NetflixApplication.getInstance();
            C8632dsu.a(netflixApplication, "");
            z2 = b(z, netflixApplication);
        } else {
            z2 = false;
        }
        this.g = z2;
        boolean f = f();
        RemoteAction b2 = C7517cxh.b(this.r.get(f ? 1 : 0));
        if (b2 != null) {
            if (z) {
                title2 = b2.getTitle();
                if (C8632dsu.c((Object) title2, (Object) "Play")) {
                    this.r.remove(b2);
                    this.r.add(f ? 1 : 0, a(PipAction.d));
                }
            } else {
                title = b2.getTitle();
                if (C8632dsu.c((Object) title, (Object) "Pause")) {
                    this.r.remove(b2);
                    this.r.add(f ? 1 : 0, a(PipAction.e));
                }
            }
        }
        h();
    }

    private final boolean j() {
        return C8054ddD.j();
    }

    private final boolean f() {
        return j() && this.s;
    }

    private final RemoteAction a(PipAction pipAction) {
        int i;
        String str;
        int i2 = d.d[pipAction.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 == 2) {
                i = com.netflix.mediaclient.ui.R.e.T;
                str = "Pause";
            } else if (i2 == 3) {
                i = C9834xU.j.i;
                i3 = 6;
                str = "Rewind 10s";
            } else if (i2 != 4) {
                return null;
            } else {
                i = C9834xU.j.h;
                i3 = 5;
                str = "Fast Forward 10s";
            }
        } else {
            i = com.netflix.mediaclient.ui.R.e.U;
            str = "Play";
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.h, i3, new Intent("media_control").putExtra("control_type", i3), 67108864);
        Icon createWithResource = Icon.createWithResource(this.h, i);
        C8632dsu.a(createWithResource, "");
        C7522cxm.c();
        return C7523cxn.b(createWithResource, str, str, broadcast);
    }

    private final void a(boolean z) {
        RemoteAction b2;
        CharSequence title;
        RemoteAction b3;
        CharSequence title2;
        CharSequence title3;
        if (j()) {
            this.s = z;
            if (z) {
                RemoteAction b4 = C7517cxh.b(this.r.get(0));
                if (b4 != null) {
                    title3 = b4.getTitle();
                    if (!C8632dsu.c((Object) title3, (Object) "Rewind 10s")) {
                        this.r.add(0, a(PipAction.b));
                    }
                }
                if (this.r.size() <= 2) {
                    this.r.add(a(PipAction.c));
                } else {
                    RemoteAction b5 = C7517cxh.b(this.r.get(2));
                    if (!C8632dsu.c((Object) (b5 != null ? b5.getTitle() : null), (Object) "Fast Forward 10s")) {
                        this.r.add(2, a(PipAction.c));
                    }
                }
            } else {
                if (2 < this.r.size() && (b3 = C7517cxh.b(this.r.get(2))) != null) {
                    title2 = b3.getTitle();
                    if (C8632dsu.c((Object) title2, (Object) "Fast Forward 10s")) {
                        this.r.remove(b3);
                    }
                }
                if (this.r.size() > 0 && (b2 = C7517cxh.b(this.r.get(0))) != null) {
                    title = b2.getTitle();
                    if (C8632dsu.c((Object) title, (Object) "Rewind 10s")) {
                        this.r.remove(b2);
                    }
                }
            }
            h();
        }
    }

    private final void d(boolean z) {
        RemoteAction b2;
        CharSequence title;
        if (!f() || 2 >= this.r.size() || (b2 = C7517cxh.b(this.r.get(2))) == null) {
            return;
        }
        title = b2.getTitle();
        if (C8632dsu.c((Object) title, (Object) "Fast Forward 10s")) {
            b2.setEnabled(!z);
        }
    }

    private final void h() {
        Throwable th;
        PictureInPictureParams.Builder aspectRatio;
        PictureInPictureParams.Builder actions;
        PictureInPictureParams.Builder sourceRectHint;
        PictureInPictureParams build;
        Throwable th2;
        if (!C8054ddD.l(this.h)) {
            try {
                if (C8054ddD.j()) {
                    this.l.setAutoEnterEnabled(this.g);
                    this.l.setSeamlessResizeEnabled(true);
                }
                Activity activity = this.h;
                aspectRatio = this.l.setAspectRatio(a());
                actions = aspectRatio.setActions(this.r);
                sourceRectHint = actions.setSourceRectHint(d());
                build = sourceRectHint.build();
                activity.setPictureInPictureParams(build);
                return;
            } catch (Exception e2) {
                b(PlayerPictureInPictureManager.PlaybackPipStatus.d);
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                String message = e2.getMessage();
                Rational a2 = a();
                C1596aHd b2 = new C1596aHd("Failed to update action because %s, with aspect ratio value " + message + a2, null, null, false, null, false, false, 126, null).b(false);
                ErrorType errorType = b2.a;
                if (errorType != null) {
                    b2.e.put("errorType", errorType.c());
                    String b3 = b2.b();
                    if (b3 != null) {
                        String c = errorType.c();
                        b2.a(c + " " + b3);
                    }
                }
                if (b2.b() != null && b2.i != null) {
                    th = new Throwable(b2.b(), b2.i);
                } else if (b2.b() != null) {
                    th = new Throwable(b2.b());
                } else {
                    Throwable th3 = b2.i;
                    if (th3 == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th3 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else {
                        th = th3;
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a3 = dVar.a();
                if (a3 != null) {
                    a3.e(b2, th);
                    return;
                } else {
                    dVar.e().b(b2, th);
                    return;
                }
            }
        }
        InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
        C1596aHd b4 = new C1596aHd("Fragment not attached to an activity, cannot update actions", null, null, false, null, false, false, 126, null).b(false);
        ErrorType errorType2 = b4.a;
        if (errorType2 != null) {
            b4.e.put("errorType", errorType2.c());
            String b5 = b4.b();
            if (b5 != null) {
                String c2 = errorType2.c();
                b4.a(c2 + " " + b5);
            }
        }
        if (b4.b() != null && b4.i != null) {
            th2 = new Throwable(b4.b(), b4.i);
        } else if (b4.b() != null) {
            th2 = new Throwable(b4.b());
        } else {
            Throwable th4 = b4.i;
            if (th4 == null) {
                th2 = new Throwable("Handled exception with no message");
            } else if (th4 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else {
                th2 = th4;
            }
        }
        InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
        InterfaceC1598aHf a4 = dVar2.a();
        if (a4 != null) {
            a4.e(b4, th2);
        } else {
            dVar2.e().b(b4, th2);
        }
    }

    private final boolean d(Rational rational) {
        if (Config_FastProperty_EnableExtremePipRatio.Companion.c()) {
            return true;
        }
        if (rational.floatValue() < 0.41841003f || rational.floatValue() > 2.39f) {
            float floatValue = rational.floatValue();
            C1044Mm.d("PictureInPictureManagerImpl", "Enter PIP with aspect ratio not within range: " + floatValue);
            return false;
        }
        return true;
    }

    /* renamed from: o.cxg$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("PictureInPictureManagerImpl");
        }
    }
}
