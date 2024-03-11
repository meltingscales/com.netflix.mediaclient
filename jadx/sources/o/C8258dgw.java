package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import com.netflix.mediaclient.servicemgr.interface_.offline.WatchState;
import com.netflix.model.leafs.originals.interactive.Prefetch;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C1030Lx;
import o.C4293bbl;
import o.C7350cuZ;
import o.C8258dgw;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

@Singleton
/* renamed from: o.dgw  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8258dgw {
    public static final a a;
    public static final int c;
    private static int d = 0;
    private static byte e$ss2$355 = 0;
    private static int i = 1;
    private final InterfaceC8554dpx b;
    private int e;

    /* renamed from: o.dgw$b */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[WatchState.Simplified.values().length];
            try {
                iArr[WatchState.Simplified.EXPIRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WatchState.Simplified.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WatchState.Simplified.NOT_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr;
            int[] iArr2 = new int[DownloadState.values().length];
            try {
                iArr2[DownloadState.InProgress.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DownloadState.Stopped.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DownloadState.Complete.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DownloadState.Creating.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DownloadState.CreateFailed.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DownloadState.Unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DownloadState.Deleted.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DownloadState.DeleteComplete.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            e = iArr2;
        }
    }

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.dgw$c */
    /* loaded from: classes5.dex */
    public interface c {
        C8258dgw N();
    }

    static {
        f();
        a = new a(null);
        c = 8;
    }

    public static final C8258dgw b() {
        return a.e();
    }

    static void f() {
        e$ss2$355 = (byte) 24;
    }

    @Inject
    public C8258dgw() {
        InterfaceC8554dpx b2;
        b2 = dpB.b(new drO<C4293bbl>() { // from class: com.netflix.mediaclient.util.downloadedforyou.DownloadedForYouHelper$data$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final C4293bbl invoke() {
                C4293bbl l;
                l = C8258dgw.this.l();
                return l;
            }
        });
        this.b = b2;
    }

    /* renamed from: o.dgw$a */
    /* loaded from: classes5.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C8258dgw e() {
            AbstractApplicationC1040Mh abstractApplicationC1040Mh = AbstractApplicationC1040Mh.getInstance();
            C8632dsu.a(abstractApplicationC1040Mh, "");
            return ((c) EntryPointAccessors.fromApplication(abstractApplicationC1040Mh, c.class)).N();
        }

        public final boolean a() {
            return new C8258dgw().j();
        }
    }

    private final C4293bbl i() {
        return (C4293bbl) this.b.getValue();
    }

    public final boolean g() {
        return i().d() > System.currentTimeMillis();
    }

    public final boolean j() {
        return i().i();
    }

    public final float e() {
        float Q;
        Collection<Float> values = i().a().values();
        C8632dsu.a(values, "");
        Q = C8576dqs.Q(values);
        return Q;
    }

    private final void n() {
        synchronized (i()) {
            try {
                C8157dfA.a(AbstractApplicationC1040Mh.d(), "preference_downloadedforyou", i().h());
                dpR dpr = dpR.c;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4293bbl l() {
        String e = C8157dfA.e(AbstractApplicationC1040Mh.d(), "preference_downloadedforyou", (String) null);
        if (e == null) {
            return new C4293bbl();
        }
        C4293bbl e2 = C4293bbl.b.e(e);
        if (e2 == null) {
            e2 = new C4293bbl();
            InterfaceC5298bwC u = NetflixApplication.getInstance().u();
            C8632dsu.d(u);
            Collection<InterfaceC5206buQ> d2 = ((C7359cui) u).d().d();
            C8632dsu.a(d2, "");
            ArrayList<InterfaceC5206buQ> arrayList = new ArrayList();
            for (Object obj : d2) {
                if (((InterfaceC5206buQ) obj).s() == CreateRequest.DownloadRequestType.DownloadForYou) {
                    arrayList.add(obj);
                }
            }
            for (InterfaceC5206buQ interfaceC5206buQ : arrayList) {
                LinkedHashMap<String, Integer> e3 = e2.e();
                String aH_ = interfaceC5206buQ.aH_();
                C8632dsu.a(aH_, "");
                e3.put(aH_, Integer.valueOf(Calendar.getInstance().get(6)));
            }
            n();
        }
        d(e2.i());
        return e2;
    }

    public final float d(String str) {
        C8632dsu.c((Object) str, "");
        Float f = i().a().get(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public final int c(float f) {
        return (int) Math.floor(f * 4);
    }

    public final float a(InterfaceC5184btv interfaceC5184btv) {
        boolean e;
        C8632dsu.c((Object) interfaceC5184btv, "");
        e = C8691duz.e(interfaceC5184btv.getVideoId(), interfaceC5184btv.getParentVideoId(), false, 2, null);
        return (e ? 2.0f : 1.0f) / 4;
    }

    public final int f(String str) {
        C8632dsu.c((Object) str, "");
        Integer num = i().j().get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int h() {
        return (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - i().b());
    }

    public final void e(String str, int i2) {
        C8632dsu.c((Object) str, "");
        synchronized (i()) {
            if (i2 > 0) {
                i().j().put(str, Integer.valueOf(i2));
                dpR dpr = dpR.c;
            } else {
                i().j().remove(str);
            }
        }
        n();
    }

    public final void a() {
        synchronized (i()) {
            i().j().clear();
            i().a(System.currentTimeMillis());
            dpR dpr = dpR.c;
        }
        n();
    }

    public final void a(boolean z, Context context) {
        C8632dsu.c((Object) context, "");
        i().b(z);
        d(z);
        n();
        c(context);
    }

    public final void a(String str, float f) {
        C8632dsu.c((Object) str, "");
        synchronized (i()) {
            i().b(true);
            d(true);
            i().a().put(str, Float.valueOf(f));
            if (f <= 0.0f) {
                i().a().remove(str);
            }
            dpR dpr = dpR.c;
        }
        n();
    }

    public final void a(Context context, String str, float f, InterfaceC4208baF interfaceC4208baF) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) interfaceC4208baF, "");
        a(str, f);
        c(context);
        InterfaceC4245baq k = interfaceC4208baF.k();
        if (k != null) {
            k.a();
        }
    }

    public final boolean g(String str) {
        C8632dsu.c((Object) str, "");
        return i().c().contains(str);
    }

    public final void c(String str) {
        Object E;
        Map d2;
        Map k;
        Throwable th;
        C8632dsu.c((Object) str, "");
        synchronized (i()) {
            if (i().c().size() > 1000) {
                HashSet<String> c2 = i().c();
                E = C8576dqs.E(i().c());
                c2.remove(E);
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("DownloadedForYouHelper: Reached manual deletion cap.", null, null, false, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        String c3 = errorType.c();
                        c1596aHd.a(c3 + " " + b2);
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
            i().c().add(str);
            i().e().remove(str);
            int i2 = this.e + 1;
            this.e = i2;
            if (i2 == 3) {
                i().d(System.currentTimeMillis() + 3600000);
            }
            dpR dpr = dpR.c;
        }
        n();
    }

    public final void d() {
        synchronized (i()) {
            i().e().clear();
            dpR dpr = dpR.c;
        }
        n();
    }

    public final void e(String str) {
        C8632dsu.c((Object) str, "");
        synchronized (i()) {
            i().e().remove(str);
            i().e().put(str, Integer.valueOf(Calendar.getInstance().get(6)));
            dpR dpr = dpR.c;
        }
        n();
    }

    public final boolean j(String str) {
        C8632dsu.c((Object) str, "");
        return i().e().containsKey(str);
    }

    public final void b(String str) {
        C8632dsu.c((Object) str, "");
        synchronized (i()) {
            i().e().remove(str);
        }
        n();
    }

    public final Map.Entry<String, Integer> c() {
        if (i().e().isEmpty()) {
            return null;
        }
        return (Map.Entry) i().e().entrySet().iterator().next();
    }

    public final float e(InterfaceC4208baF interfaceC4208baF) {
        InterfaceC5204buO l;
        int b2;
        InterfaceC5203buN c2;
        return (interfaceC4208baF == null || (l = interfaceC4208baF.l()) == null || (b2 = l.b()) < 0 || (c2 = l.c(b2)) == null || c2.c() / ((long) Prefetch.NANOSECONDS_PER_SECOND) < 5) ? 1.0f : 3.0f;
    }

    public final float d(InterfaceC4208baF interfaceC4208baF) {
        C8632dsu.c((Object) interfaceC4208baF, "");
        interfaceC4208baF.t();
        InterfaceC5204buO l = interfaceC4208baF.l();
        C8632dsu.a(l, "");
        InterfaceC5203buN c2 = l.c(l.b());
        return (float) ((c2 != null ? c2.c() : 0L) / ((long) Prefetch.NANOSECONDS_PER_SECOND));
    }

    public final void e(BroadcastReceiver broadcastReceiver) {
        C8632dsu.c((Object) broadcastReceiver, "");
        C8116deM.c(AbstractApplicationC1040Mh.d(), broadcastReceiver, "com.netflix.mediaclient.intent.category.DOWNLOADEDFORYOU", "com.netflix.mediaclient.intent.action.DOWNLOADEDFORYOU_OPT_IN");
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        C8632dsu.c((Object) broadcastReceiver, "");
        C8116deM.a(AbstractApplicationC1040Mh.d(), broadcastReceiver);
    }

    public final CharSequence e(Context context, DownloadState downloadState, WatchState watchState, long j, StopReason stopReason, int i2) {
        String string;
        String c2;
        Map d2;
        Map k;
        Throwable th;
        int i3 = 2 % 2;
        String str = "";
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) downloadState, "");
        C8632dsu.c((Object) watchState, "");
        int i4 = com.netflix.mediaclient.ui.R.c.e;
        switch (b.e[downloadState.ordinal()]) {
            case 1:
                string = context.getString(C7350cuZ.a.s);
                if (string.startsWith("'!#+")) {
                    int i5 = i + 121;
                    d = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr = new Object[1];
                    k(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                }
                str = string;
                break;
            case 2:
                if (stopReason == null || !stopReason.a()) {
                    if (i2 > 0) {
                        string = context.getString(C7350cuZ.a.t);
                        if (string.startsWith("'!#+")) {
                            Object[] objArr2 = new Object[1];
                            k(string.substring(4), objArr2);
                            string = ((String) objArr2[0]).intern();
                        }
                    } else {
                        string = C7353cuc.e(context);
                    }
                    str = string;
                    break;
                }
                break;
            case 3:
                WatchState.Simplified d3 = watchState.d();
                int i7 = d3 == null ? -1 : b.b[d3.ordinal()];
                if (i7 == 1) {
                    if (j > 0) {
                        int i8 = d + 87;
                        i = i8 % 128;
                        int i9 = i8 % 2;
                        if (j > TimeUnit.DAYS.toMillis(1L)) {
                            c2 = C1333Xq.d(com.netflix.mediaclient.ui.R.o.ja).a((int) TimeUnit.MILLISECONDS.toDays(j)).c();
                        } else if (j > TimeUnit.HOURS.toMillis(1L)) {
                            c2 = C1333Xq.d(com.netflix.mediaclient.ui.R.o.ji).a((int) TimeUnit.MILLISECONDS.toHours(j)).c();
                        } else {
                            c2 = C1333Xq.d(com.netflix.mediaclient.ui.R.o.jj).a((int) TimeUnit.MILLISECONDS.toMinutes(j)).c();
                        }
                        str = c2;
                        int i10 = d + 75;
                        i = i10 % 128;
                        if (i10 % 2 == 0) {
                            i4 = C1030Lx.d.f;
                            int i11 = 2 / 0;
                            break;
                        } else {
                            i4 = C1030Lx.d.f;
                            break;
                        }
                    }
                } else if (i7 != 2) {
                    int i12 = d + 69;
                    i = i12 % 128;
                    int i13 = i12 % 2;
                    if (i7 == 3) {
                        i4 = C1030Lx.d.f;
                        string = context.getString(com.netflix.mediaclient.ui.R.o.jf);
                        if (string.startsWith("'!#+")) {
                            int i14 = i + 79;
                            d = i14 % 128;
                            int i15 = i14 % 2;
                            Object[] objArr3 = new Object[1];
                            k(string.substring(4), objArr3);
                            string = ((String) objArr3[0]).intern();
                        }
                        str = string;
                        break;
                    }
                } else {
                    String string2 = context.getString(com.netflix.mediaclient.ui.R.o.jb);
                    if (string2.startsWith("'!#+")) {
                        Object[] objArr4 = new Object[1];
                        k(string2.substring(4), objArr4);
                        string2 = ((String) objArr4[0]).intern();
                    }
                    str = string2;
                    i4 = C1030Lx.d.f;
                    break;
                }
                break;
            case 4:
                str = C7353cuc.e(context);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d2 = dqE.d();
                k = dqE.k(d2);
                C1596aHd c1596aHd = new C1596aHd("Wrong DownloadState (=" + downloadState + ")", null, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b2 = c1596aHd.b();
                    if (b2 != null) {
                        c1596aHd.a(errorType.c() + " " + b2);
                        int i16 = i + 35;
                        d = i16 % 128;
                        int i17 = i16 % 2;
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() == null) {
                    th = c1596aHd.i;
                    if (th != null) {
                        int i18 = i + 31;
                        d = i18 % 128;
                        int i19 = i18 % 2;
                        if (th == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        th = new Throwable("Handled exception with no message");
                    }
                } else {
                    th = new Throwable(c1596aHd.b());
                    int i20 = i + 93;
                    d = i20 % 128;
                    int i21 = i20 % 2;
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th);
                } else {
                    dVar.e().b(c1596aHd, th);
                }
                return null;
        }
        if (str != null) {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, i4)), 0, str.length(), 33);
            return spannableString;
        }
        return null;
    }

    private final void c(Context context) {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.DOWNLOADEDFORYOU_OPT_IN");
        intent.addCategory("com.netflix.mediaclient.intent.category.DOWNLOADEDFORYOU");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    private final void d(boolean z) {
        C4289bbh.d.e(z);
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$355);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
