package o;

import android.net.Uri;
import android.webkit.WebResourceError;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.cl.model.secondscreen.ConnectionSource;
import com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation;
import com.netflix.mediaclient.graphql.models.type.NGPRedeemBeaconFailureReason;
import com.netflix.mediaclient.ui.mssi.impl.GameControllerLoadingState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import o.C1390Zo;
import o.C8632dsu;

/* renamed from: o.cjn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6783cjn implements InterfaceC8888fH {
    private final AbstractC8918fl<C1390Zo.e> a;
    private final boolean b;
    private final String c;
    private final ConnectionSource d;
    private final String e;
    private final String f;
    private final List<NGPBeaconControllerOrientation> g;
    private final Long h;
    private final Long i;
    private final Long j;
    private final boolean k;
    private final boolean l;
    private final Long n;

    /* renamed from: o  reason: collision with root package name */
    private final WebResourceError f13741o;

    /* renamed from: o.cjn$d */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[NGPRedeemBeaconFailureReason.values().length];
            try {
                iArr[NGPRedeemBeaconFailureReason.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NGPRedeemBeaconFailureReason.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NGPRedeemBeaconFailureReason.b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NGPRedeemBeaconFailureReason.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NGPRedeemBeaconFailureReason.c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NGPRedeemBeaconFailureReason.f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr;
        }
    }

    public final C6783cjn a(String str, ConnectionSource connectionSource, String str2, AbstractC8918fl<C1390Zo.e> abstractC8918fl, boolean z, boolean z2, WebResourceError webResourceError, String str3, List<? extends NGPBeaconControllerOrientation> list, boolean z3, Long l, Long l2, Long l3, Long l4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) connectionSource, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        return new C6783cjn(str, connectionSource, str2, abstractC8918fl, z, z2, webResourceError, str3, list, z3, l, l2, l3, l4);
    }

    public final String component1() {
        return this.c;
    }

    public final boolean component10() {
        return this.b;
    }

    public final Long component11() {
        return this.i;
    }

    public final Long component12() {
        return this.h;
    }

    public final Long component13() {
        return this.n;
    }

    public final Long component14() {
        return this.j;
    }

    public final ConnectionSource component2() {
        return this.d;
    }

    public final String component3() {
        return this.e;
    }

    public final AbstractC8918fl<C1390Zo.e> component4() {
        return this.a;
    }

    public final boolean component5() {
        return this.l;
    }

    public final boolean component6() {
        return this.k;
    }

    public final WebResourceError component7() {
        return this.f13741o;
    }

    public final String component8() {
        return this.f;
    }

    public final List<NGPBeaconControllerOrientation> component9() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6783cjn) {
            C6783cjn c6783cjn = (C6783cjn) obj;
            return C8632dsu.c((Object) this.c, (Object) c6783cjn.c) && this.d == c6783cjn.d && C8632dsu.c((Object) this.e, (Object) c6783cjn.e) && C8632dsu.c(this.a, c6783cjn.a) && this.l == c6783cjn.l && this.k == c6783cjn.k && C8632dsu.c(this.f13741o, c6783cjn.f13741o) && C8632dsu.c((Object) this.f, (Object) c6783cjn.f) && C8632dsu.c(this.g, c6783cjn.g) && this.b == c6783cjn.b && C8632dsu.c(this.i, c6783cjn.i) && C8632dsu.c(this.h, c6783cjn.h) && C8632dsu.c(this.n, c6783cjn.n) && C8632dsu.c(this.j, c6783cjn.j);
        }
        return false;
    }

    public final boolean f() {
        return this.b;
    }

    public final ConnectionSource g() {
        return this.d;
    }

    public final String h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = this.d.hashCode();
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        int hashCode4 = this.a.hashCode();
        int hashCode5 = Boolean.hashCode(this.l);
        int hashCode6 = Boolean.hashCode(this.k);
        WebResourceError webResourceError = this.f13741o;
        int hashCode7 = webResourceError == null ? 0 : webResourceError.hashCode();
        String str2 = this.f;
        int hashCode8 = str2 == null ? 0 : str2.hashCode();
        List<NGPBeaconControllerOrientation> list = this.g;
        int hashCode9 = list == null ? 0 : list.hashCode();
        int hashCode10 = Boolean.hashCode(this.b);
        Long l = this.i;
        int hashCode11 = l == null ? 0 : l.hashCode();
        Long l2 = this.h;
        int hashCode12 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.n;
        int hashCode13 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.j;
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + (l4 != null ? l4.hashCode() : 0);
    }

    public final AbstractC8918fl<C1390Zo.e> i() {
        return this.a;
    }

    public final String j() {
        return this.c;
    }

    public String toString() {
        String str = this.c;
        ConnectionSource connectionSource = this.d;
        String str2 = this.e;
        AbstractC8918fl<C1390Zo.e> abstractC8918fl = this.a;
        boolean z = this.l;
        boolean z2 = this.k;
        WebResourceError webResourceError = this.f13741o;
        String str3 = this.f;
        List<NGPBeaconControllerOrientation> list = this.g;
        boolean z3 = this.b;
        Long l = this.i;
        Long l2 = this.h;
        Long l3 = this.n;
        Long l4 = this.j;
        return "GameControllerState(beaconCode=" + str + ", connectionSource=" + connectionSource + ", esn=" + str2 + ", beaconData=" + abstractC8918fl + ", webviewStarted=" + z + ", webviewLoaded=" + z2 + ", webviewPageError=" + webResourceError + ", webviewLoadError=" + str3 + ", overrideOrientations=" + list + ", allowSleep=" + z3 + ", redeemBeaconStartedTime=" + l + ", redeemBeaconFinishedTime=" + l2 + ", webviewLoadStartedTime=" + l3 + ", webviewLoadFinishedTime=" + l4 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6783cjn(String str, ConnectionSource connectionSource, String str2, AbstractC8918fl<C1390Zo.e> abstractC8918fl, boolean z, boolean z2, WebResourceError webResourceError, String str3, List<? extends NGPBeaconControllerOrientation> list, boolean z3, Long l, Long l2, Long l3, Long l4) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) connectionSource, "");
        C8632dsu.c((Object) abstractC8918fl, "");
        this.c = str;
        this.d = connectionSource;
        this.e = str2;
        this.a = abstractC8918fl;
        this.l = z;
        this.k = z2;
        this.f13741o = webResourceError;
        this.f = str3;
        this.g = list;
        this.b = z3;
        this.i = l;
        this.h = l2;
        this.n = l3;
        this.j = l4;
    }

    public /* synthetic */ C6783cjn(String str, ConnectionSource connectionSource, String str2, AbstractC8918fl abstractC8918fl, boolean z, boolean z2, WebResourceError webResourceError, String str3, List list, boolean z3, Long l, Long l2, Long l3, Long l4, int i, C8627dsp c8627dsp) {
        this(str, connectionSource, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? C8974go.e : abstractC8918fl, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : webResourceError, (i & 128) != 0 ? null : str3, (i & JSONzip.end) != 0 ? null : list, (i & 512) != 0 ? false : z3, (i & 1024) != 0 ? null : l, (i & 2048) != 0 ? null : l2, (i & 4096) != 0 ? null : l3, (i & 8192) != 0 ? null : l4);
    }

    public final GameControllerLoadingState o() {
        if (this.f13741o != null) {
            return GameControllerLoadingState.a;
        }
        if (!(this.a instanceof C8927fu) && !l()) {
            if (this.f != null) {
                return GameControllerLoadingState.a;
            }
            if (this.k) {
                return GameControllerLoadingState.e;
            }
            return GameControllerLoadingState.b;
        }
        return GameControllerLoadingState.a;
    }

    public final int e() {
        Integer num;
        C1390Zo.b c;
        NGPRedeemBeaconFailureReason a;
        int i;
        C1390Zo.e c2 = this.a.c();
        if (c2 == null || (c = c2.c()) == null || (a = c.a()) == null) {
            num = null;
        } else {
            switch (d.b[a.ordinal()]) {
                case 1:
                    i = -3000;
                    break;
                case 2:
                    i = -3001;
                    break;
                case 3:
                    i = -3002;
                    break;
                case 4:
                    i = -3003;
                    break;
                case 5:
                    i = -3004;
                    break;
                case 6:
                    i = -3029;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            num = Integer.valueOf(i);
        }
        if (num != null) {
            return num.intValue();
        }
        if (this.a instanceof C8927fu) {
            return -1009;
        }
        if (this.f != null) {
            return -3050;
        }
        if (this.f13741o != null) {
            return -3031;
        }
        return l() ? -3030 : -3099;
    }

    public final String b() {
        C1390Zo.b c;
        NGPRedeemBeaconFailureReason a;
        String c2;
        C1390Zo.e c3 = this.a.c();
        return (c3 == null || (c = c3.c()) == null || (a = c.a()) == null || (c2 = a.c()) == null) ? NGPRedeemBeaconFailureReason.f.c() : c2;
    }

    public final boolean m() {
        if (!this.l) {
            AbstractC8918fl<C1390Zo.e> abstractC8918fl = this.a;
            if (abstractC8918fl instanceof C8971gl) {
                C1390Zo.e c = abstractC8918fl.c();
                if ((c != null ? c.d() : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String a(String str) {
        Collection i;
        List j;
        List<Pair> g;
        int d2;
        String d3;
        List<C1390Zo.a> e;
        int d4;
        C8632dsu.c((Object) str, "");
        C1390Zo.e c = this.a.c();
        C1390Zo.h d5 = c != null ? c.d() : null;
        if (d5 == null || (e = d5.e()) == null) {
            i = C8569dql.i();
        } else {
            d4 = C8572dqo.d(e, 10);
            i = new ArrayList(d4);
            for (C1390Zo.a aVar : e) {
                i.add(dpD.a(aVar.b(), aVar.c()));
            }
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = dpD.a("connectionUrl", d5 != null ? d5.a() : null);
        pairArr[1] = dpD.a("connectionSecret", d5 != null ? d5.d() : null);
        pairArr[2] = dpD.a("gameplaySessionId", d5 != null ? d5.f() : null);
        String str2 = this.e;
        if (str2 != null) {
            pairArr[3] = dpD.a("clientId", str2);
            j = C8569dql.j(pairArr);
            g = C8576dqs.g(i, (Iterable) j);
            d2 = C8572dqo.d(g, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (Pair pair : g) {
                arrayList.add(dpD.a(pair.d(), Uri.encode((String) pair.a())));
            }
            d3 = C8576dqs.d(arrayList, "&", null, null, 0, null, new drM<Pair<? extends String, ? extends String>, CharSequence>() { // from class: com.netflix.mediaclient.ui.mssi.impl.GameControllerState$getWebviewUrl$fragment$3
                @Override // o.drM
                /* renamed from: e */
                public final CharSequence invoke(Pair<String, String> pair2) {
                    C8632dsu.c((Object) pair2, "");
                    String d6 = pair2.d();
                    String a = pair2.a();
                    return ((Object) d6) + "=" + ((Object) a);
                }
            }, 30, null);
            Uri build = Uri.parse(d5 != null ? d5.i() : null).buildUpon().appendQueryParameter("gameId", String.valueOf(d5 != null ? Integer.valueOf(d5.g()) : null)).appendQueryParameter("locale", str).encodedFragment(d3).build();
            C5343bwv.d.getLogTag();
            String uri = build.toString();
            C8632dsu.a(uri, "");
            return uri;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final boolean l() {
        C1390Zo.h d2;
        AbstractC8918fl<C1390Zo.e> abstractC8918fl = this.a;
        if (abstractC8918fl instanceof C8971gl) {
            C1390Zo.e c = abstractC8918fl.c();
            String str = null;
            if ((c != null ? c.c() : null) == null) {
                C1390Zo.e c2 = this.a.c();
                if (c2 != null && (d2 = c2.d()) != null) {
                    str = d2.i();
                }
                if (str == null) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean n() {
        return o() == GameControllerLoadingState.a;
    }

    public final int a() {
        List<NGPBeaconControllerOrientation> i;
        C1390Zo.h d2;
        C1390Zo.h d3;
        List<NGPBeaconControllerOrientation> list = this.g;
        if (list == null) {
            C1390Zo.e c = this.a.c();
            list = (c == null || (d3 = c.d()) == null) ? null : d3.b();
            if (list == null) {
                list = C8569dql.i();
            }
        }
        int c2 = c(list);
        if (c2 == -1) {
            C1390Zo.e c3 = this.a.c();
            if (c3 == null || (d2 = c3.d()) == null || (i = d2.b()) == null) {
                i = C8569dql.i();
            }
            return c(i);
        }
        return c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
        if (r7.containsAll(r0) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int c(java.util.List<? extends com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation> r7) {
        /*
            r6 = this;
            int r0 = r7.size()
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 4
            if (r0 != r5) goto L2b
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation[] r0 = new com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation[r5]
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r5 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.d
            r0[r2] = r5
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r5 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.e
            r0[r4] = r5
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r5 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.c
            r0[r3] = r5
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r5 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.b
            r0[r1] = r5
            java.util.List r0 = o.C8570dqm.b(r0)
            boolean r0 = r7.containsAll(r0)
            if (r0 == 0) goto L2b
            r2 = 13
            goto Lca
        L2b:
            int r0 = r7.size()
            if (r0 != r1) goto L4c
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation[] r0 = new com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation[r1]
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r1 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.d
            r0[r2] = r1
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r1 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.e
            r0[r4] = r1
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r1 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.c
            r0[r3] = r1
            java.util.List r0 = o.C8570dqm.b(r0)
            boolean r0 = r7.containsAll(r0)
            if (r0 == 0) goto L4c
            r2 = r3
            goto Lca
        L4c:
            int r0 = r7.size()
            if (r0 != r3) goto L69
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation[] r0 = new com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation[r3]
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r1 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.c
            r0[r2] = r1
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r1 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.b
            r0[r4] = r1
            java.util.List r0 = o.C8570dqm.b(r0)
            boolean r0 = r7.containsAll(r0)
            if (r0 == 0) goto L69
            r2 = 12
            goto Lca
        L69:
            int r0 = r7.size()
            if (r0 != r3) goto L84
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation[] r0 = new com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation[r3]
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r1 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.d
            r0[r2] = r1
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r1 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.e
            r0[r4] = r1
            java.util.List r0 = o.C8570dqm.b(r0)
            boolean r0 = r7.containsAll(r0)
            if (r0 == 0) goto L84
            goto Lc8
        L84:
            int r0 = r7.size()
            if (r0 != r4) goto L94
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r0 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.c
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L94
            r2 = r4
            goto Lca
        L94:
            int r0 = r7.size()
            if (r0 != r4) goto La5
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r0 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.b
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto La5
            r2 = 9
            goto Lca
        La5:
            int r0 = r7.size()
            if (r0 != r4) goto Lb4
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r0 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.d
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto Lb4
            goto Lca
        Lb4:
            int r0 = r7.size()
            if (r0 != r4) goto Lc5
            com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation r0 = com.netflix.mediaclient.graphql.models.type.NGPBeaconControllerOrientation.e
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto Lc5
            r2 = 8
            goto Lca
        Lc5:
            r7.isEmpty()
        Lc8:
            r2 = 11
        Lca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C6783cjn.c(java.util.List):int");
    }

    public final Long c() {
        if (this.n == null) {
            return null;
        }
        Long l = this.j;
        if (l != null) {
            return Long.valueOf(l.longValue() - this.n.longValue());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final Long d() {
        Long l;
        if (this.i == null || (l = this.h) == null) {
            return null;
        }
        return Long.valueOf(l.longValue() - this.i.longValue());
    }
}
