package o;

import android.content.Context;
import android.text.Spanned;
import android.util.Base64;
import androidx.lifecycle.Lifecycle;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.service.user.UserAgent;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Single;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import o.C7403cvZ;
import o.C8632dsu;
import o.cQQ;
import o.dpR;

/* renamed from: o.cvZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7403cvZ {
    public static final int a;
    public static final c d;
    private static final String e;
    private static byte e$ss2$129 = 0;
    private static int h = 1;
    private static int j;
    private d b;
    private final boolean c;
    private final InterfaceC8554dpx f;
    private String g;
    private final Map<String, e> i;

    static {
        a();
        d = new c(null);
        a = 8;
        e = "https://help.netflix.com/support/%s";
    }

    static void a() {
        e$ss2$129 = (byte) 24;
    }

    /* renamed from: o.cvZ$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final String d() {
            return C7403cvZ.e;
        }
    }

    public C7403cvZ(Context context) {
        InterfaceC8554dpx b2;
        e eVar;
        Map<String, e> c2;
        C8632dsu.c((Object) context, "");
        this.g = "<a href='%s'>help.netflix.com</a>";
        this.b = new d(null, 0L);
        b2 = dpB.b(new drO<e>() { // from class: com.netflix.mediaclient.ui.offline.errors.DownloadsErrorHelper$defaultErrorData$2
            @Override // o.drO
            /* renamed from: c */
            public final C7403cvZ.e invoke() {
                return new C7403cvZ.e(0, 0, 0, 7, null);
            }
        });
        this.f = b2;
        Pair[] pairArr = new Pair[26];
        pairArr[0] = dpD.a("DLST.N61", new e(66916, 0, 0, 6, null));
        pairArr[1] = dpD.a("DLST.N373", new e(64188, 0, 0, 6, null));
        pairArr[2] = dpD.a("DLST.N3", new e(62521, 0, 0, 6, null));
        pairArr[3] = dpD.a("DLST.N103", new e(66602, 0, 0, 6, null));
        pairArr[4] = dpD.a("DLST.N1009", new e(100600, 0, 0, 6, null));
        pairArr[5] = dpD.a("DLST.N1008", new e(100405, 0, 0, 6, null));
        pairArr[6] = dpD.a("DLS.2", new e(66425, 0, 0, 6, null));
        pairArr[7] = dpD.a("DLS.103", new e(62026, com.netflix.mediaclient.ui.R.o.aV, com.netflix.mediaclient.ui.R.o.aH));
        pairArr[8] = dpD.a("OF.NA.1", new e(0, 0, com.netflix.mediaclient.ui.R.o.jm, 3, null));
        pairArr[9] = dpD.a("OF.NA.2", new e(100224, com.netflix.mediaclient.ui.R.o.aT, com.netflix.mediaclient.ui.R.o.aF));
        pairArr[10] = dpD.a("OF.NA.3", new e(0, com.netflix.mediaclient.ui.R.o.aU, com.netflix.mediaclient.ui.R.o.aC, 1, null));
        pairArr[11] = dpD.a("OF.NA.4", new e(67850, com.netflix.mediaclient.ui.R.o.aZ, com.netflix.mediaclient.ui.R.o.aL));
        pairArr[12] = dpD.a("OF.NA.5", new e(0, 0, com.netflix.mediaclient.ui.R.o.ib, 3, null));
        pairArr[13] = dpD.a("OF.NA.6", new e(64765, com.netflix.mediaclient.ui.R.o.aZ, com.netflix.mediaclient.ui.R.o.aL));
        pairArr[14] = dpD.a("OF.NA.7", new e(64915, com.netflix.mediaclient.ui.R.o.aZ, com.netflix.mediaclient.ui.R.o.aL));
        pairArr[15] = dpD.a("OF.NA.8", e());
        pairArr[16] = dpD.a("NQL.22006", new e(56115, com.netflix.mediaclient.ui.R.o.ba, com.netflix.mediaclient.ui.R.o.aP));
        pairArr[17] = dpD.a("NQL.22007", new e(56116, com.netflix.mediaclient.ui.R.o.ba, com.netflix.mediaclient.ui.R.o.aP));
        if (C8153dex.a(context)) {
            eVar = new e(56116, com.netflix.mediaclient.ui.R.o.aS, com.netflix.mediaclient.ui.R.o.aG);
        } else {
            eVar = new e(56116, com.netflix.mediaclient.ui.R.o.aQ, com.netflix.mediaclient.ui.R.o.aD);
        }
        pairArr[18] = dpD.a("NQL.22010", eVar);
        pairArr[19] = dpD.a("NQL.22005", new e(60635, com.netflix.mediaclient.ui.R.o.aX, com.netflix.mediaclient.ui.R.o.aN));
        pairArr[20] = dpD.a("NQL.23000", new e(64922, com.netflix.mediaclient.ui.R.o.aY, com.netflix.mediaclient.ui.R.o.aJ));
        pairArr[21] = dpD.a("NQL.2303", new e(100068, com.netflix.mediaclient.ui.R.o.aU, com.netflix.mediaclient.ui.R.o.aC));
        pairArr[22] = dpD.a("NQM.508", new e(61983, 0, 0, 6, null));
        pairArr[23] = dpD.a("NQM.407", new e(100363, com.netflix.mediaclient.ui.R.o.aM, com.netflix.mediaclient.ui.R.o.az));
        pairArr[24] = dpD.a("NQM.434", new e(100571, com.netflix.mediaclient.ui.R.o.aV, com.netflix.mediaclient.ui.R.o.aH));
        pairArr[25] = dpD.a("NQM.105", new e(64437, com.netflix.mediaclient.ui.R.o.aW, com.netflix.mediaclient.ui.R.o.aK));
        c2 = dqE.c(pairArr);
        this.i = c2;
    }

    private final e e() {
        return (e) this.f.getValue();
    }

    /* renamed from: o.cvZ$e */
    /* loaded from: classes4.dex */
    public static final class e {
        private final int b;
        private final int d;
        private final int e;

        public e() {
            this(0, 0, 0, 7, null);
        }

        public final int a() {
            return this.b;
        }

        public final int d() {
            return this.d;
        }

        public final int e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.b == eVar.b && this.e == eVar.e && this.d == eVar.d;
            }
            return false;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.b) * 31) + Integer.hashCode(this.e)) * 31) + Integer.hashCode(this.d);
        }

        public String toString() {
            int i = this.b;
            int i2 = this.e;
            int i3 = this.d;
            return "ErrorData(supportId=" + i + ", titleId=" + i2 + ", messageId=" + i3 + ")";
        }

        public e(int i, int i2, int i3) {
            this.b = i;
            this.e = i2;
            this.d = i3;
        }

        public /* synthetic */ e(int i, int i2, int i3, int i4, C8627dsp c8627dsp) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? com.netflix.mediaclient.ui.R.o.ie : i2, (i4 & 4) != 0 ? com.netflix.mediaclient.ui.R.o.f31if : i3);
        }
    }

    /* renamed from: o.cvZ$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private final String a;
        private final Spanned e;

        public final String a() {
            return this.a;
        }

        public final Spanned e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return C8632dsu.c((Object) this.a, (Object) bVar.a) && C8632dsu.c(this.e, bVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            String str = this.a;
            Spanned spanned = this.e;
            return "DownloadErrorUIData(title=" + str + ", message=" + ((Object) spanned) + ")";
        }

        public b(String str, Spanned spanned) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) spanned, "");
            this.a = str;
            this.e = spanned;
        }
    }

    /* renamed from: o.cvZ$d */
    /* loaded from: classes4.dex */
    public static final class d {
        private final long a;
        private final long b;
        private final String d;

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c((Object) this.d, (Object) dVar.d) && this.b == dVar.b;
            }
            return false;
        }

        public int hashCode() {
            String str = this.d;
            return ((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.b);
        }

        public String toString() {
            String str = this.d;
            long j = this.b;
            return "AuthToken(token=" + str + ", expireDuration=" + j + ")";
        }

        public d(String str, long j) {
            this.d = str;
            this.b = j;
            this.a = (System.currentTimeMillis() + j) - 300000;
        }

        public final boolean a() {
            String str = this.d;
            return str != null && str.length() > 0 && System.currentTimeMillis() < this.a;
        }
    }

    public final Observable<b> c(final NetflixActivity netflixActivity, final String str) {
        C8632dsu.c((Object) netflixActivity, "");
        Observable<b> create = Observable.create(new ObservableOnSubscribe() { // from class: o.cwc
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C7403cvZ.a(NetflixActivity.this, this, str, observableEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final NetflixActivity netflixActivity, final C7403cvZ c7403cvZ, final String str, final ObservableEmitter observableEmitter) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) c7403cvZ, "");
        C8632dsu.c((Object) observableEmitter, "");
        UserAgent c2 = C8126deW.c(netflixActivity);
        if (c7403cvZ.c && !c7403cvZ.b.a() && c2 != null) {
            Single<cQQ.d> a2 = new cQQ().a(C8051ddA.e(e));
            AndroidLifecycleScopeProvider a3 = AndroidLifecycleScopeProvider.a(netflixActivity, Lifecycle.Event.ON_DESTROY);
            C8632dsu.a(a3, "");
            Object as = a2.as(AutoDispose.b(a3));
            C8632dsu.b(as, "");
            C9725vn.c((SingleSubscribeProxy) as, null, new drM<cQQ.d, dpR>() { // from class: com.netflix.mediaclient.ui.offline.errors.DownloadsErrorHelper$getErrorByCode$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(cQQ.d dVar) {
                    c(dVar);
                    return dpR.c;
                }

                public final void c(cQQ.d dVar) {
                    C7403cvZ.d dVar2;
                    C8632dsu.c((Object) dVar, "");
                    C7403cvZ.this.b = new C7403cvZ.d(dVar.b(), r2);
                    ObservableEmitter<C7403cvZ.b> observableEmitter2 = observableEmitter;
                    C7403cvZ c7403cvZ2 = C7403cvZ.this;
                    NetflixActivity netflixActivity2 = netflixActivity;
                    String str2 = str;
                    dVar2 = c7403cvZ2.b;
                    observableEmitter2.onNext(c7403cvZ2.b(netflixActivity2, str2, dVar2.e()));
                    observableEmitter.onComplete();
                }
            }, 1, null);
            return;
        }
        observableEmitter.onNext(c7403cvZ.b(netflixActivity, str, c7403cvZ.b.e()));
        observableEmitter.onComplete();
    }

    public final boolean b(String str) {
        return str != null && this.i.containsKey(str);
    }

    public final b b(Context context, String str, String str2) {
        e e2;
        String string;
        int i = 2 % 2;
        C8632dsu.c((Object) context, "");
        if (b(str)) {
            int i2 = j + 115;
            h = i2 % 128;
            int i3 = i2 % 2;
            e eVar = this.i.get(str);
            C8632dsu.d(eVar);
            e2 = eVar;
        } else {
            e2 = e();
        }
        if (this.c) {
            dsE dse = dsE.b;
            String format = String.format(e, Arrays.copyOf(new Object[]{String.valueOf(e2.a())}, 1));
            C8632dsu.a(format, "");
            if (str2 != null) {
                int i4 = h + 77;
                j = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    if (str2.length() > 0) {
                        int i5 = j + 117;
                        h = i5 % 128;
                        if (i5 % 2 == 0) {
                            C8051ddA.c(format, str2);
                            obj.hashCode();
                            throw null;
                        }
                        format = C8051ddA.c(format, str2);
                    }
                } else {
                    str2.length();
                    throw null;
                }
            }
            C1333Xq d2 = C1333Xq.d(com.netflix.mediaclient.ui.R.o.aO);
            String format2 = String.format(this.g, Arrays.copyOf(new Object[]{format}, 1));
            C8632dsu.a(format2, "");
            string = context.getString(e2.d(), d2.d("supportLink", format2).d("errorCode", C8181dfY.e(str)).c());
            C8632dsu.a(string, "");
        } else {
            string = context.getString(e2.d(), C8181dfY.e(str));
            C8632dsu.a(string, "");
        }
        String string2 = context.getString(e2.e());
        if (string2.startsWith("'!#+")) {
            int i6 = j + NetflixImageView.DEFAULT_LAYER_GRAVITY;
            h = i6 % 128;
            int i7 = i6 % 2;
            String substring = string2.substring(4);
            if (i7 == 0) {
                Object[] objArr = new Object[1];
                k(substring, objArr);
                string2 = ((String) objArr[0]).intern();
                int i8 = 64 / 0;
            } else {
                Object[] objArr2 = new Object[1];
                k(substring, objArr2);
                string2 = ((String) objArr2[0]).intern();
            }
        }
        C8632dsu.a(string2, "");
        Spanned c2 = C8168dfL.c(string);
        C8632dsu.a(c2, "");
        return new b(string2, c2);
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$129);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
