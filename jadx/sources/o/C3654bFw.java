package o;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.util.Base64;
import com.netflix.hawkins.consumer.icons.HawkinsIcon;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.ContextualText;
import com.netflix.mediaclient.servicemgr.interface_.SupplementalMessageType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.details.WatchStatus;
import com.netflix.mediaclient.ui.details.DetailsUtilImpl$createCapToStrMap$1;
import com.netflix.mediaclient.ui.details.SupportedCapabilities;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.model.leafs.TaglineMessage;
import com.netflix.model.leafs.TrackableListSummary;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import o.AbstractC3636bFe;
import o.C3669bGg;
import o.C5398bxx;
import o.bFT;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.bFw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3654bFw implements InterfaceC3656bFy {
    private static final int a;
    private static final int b;
    public static final C3654bFw c;
    private static final int e;
    private static byte e$ss2$3810 = 0;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static int k = 1;
    private static int m;

    /* renamed from: o.bFw$e */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SupplementalMessageType.values().length];
            try {
                iArr[SupplementalMessageType.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SupplementalMessageType.j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SupplementalMessageType.s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SupplementalMessageType.a.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SupplementalMessageType.d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    static {
        i();
        c = new C3654bFw();
        g = bFT.c.d;
        i = bFT.c.c;
        h = bFT.c.b;
        b = bFT.c.a;
        e = bFT.c.e;
        f = bFT.c.g;
        a = bFT.c.h;
        j = bFT.c.f;
    }

    static void i() {
        e$ss2$3810 = (byte) 24;
    }

    private C3654bFw() {
    }

    @Override // o.InterfaceC3656bFy
    public CharSequence e(InterfaceC5227bul interfaceC5227bul, Context context) {
        C8632dsu.c((Object) interfaceC5227bul, "");
        C8632dsu.c((Object) context, "");
        if (interfaceC5227bul.aU_()) {
            return interfaceC5227bul.getTitle();
        }
        int i2 = com.netflix.mediaclient.ui.R.o.dA;
        int aw_ = interfaceC5227bul.aw_();
        return context.getString(i2, Integer.valueOf(aw_), interfaceC5227bul.getTitle());
    }

    public final String c(InterfaceC5227bul interfaceC5227bul, Context context) {
        boolean g2;
        boolean g3;
        C8632dsu.c((Object) interfaceC5227bul, "");
        C8632dsu.c((Object) context, "");
        String d = (!interfaceC5227bul.isAvailableToPlay() || interfaceC5227bul.aE_().g() <= 0) ? null : C8178dfV.d(interfaceC5227bul.aE_().g(), context);
        String bY_ = interfaceC5227bul.bY_();
        if (bY_ != null) {
            g2 = C8691duz.g(bY_);
            if (g2) {
                return d;
            }
            if (d != null) {
                g3 = C8691duz.g(d);
                if (!g3) {
                    dsE dse = dsE.b;
                    String format = String.format("%s %10s", Arrays.copyOf(new Object[]{bY_, d}, 2));
                    C8632dsu.a(format, "");
                    return format;
                }
            }
            return bY_;
        }
        return d;
    }

    public final String b(InterfaceC5227bul interfaceC5227bul, Context context) {
        C8632dsu.c((Object) interfaceC5227bul, "");
        C8632dsu.c((Object) context, "");
        dsE dse = dsE.b;
        String string = context.getResources().getString(com.netflix.mediaclient.ui.R.o.h);
        C8632dsu.a(string, "");
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(interfaceC5227bul.aw_());
        objArr[1] = interfaceC5227bul.getTitle();
        objArr[2] = interfaceC5227bul.isAvailableToPlay() ? interfaceC5227bul.ab() : interfaceC5227bul.bY_();
        objArr[3] = Integer.valueOf(C8175dfS.c(interfaceC5227bul.g()));
        String format = String.format(string, Arrays.copyOf(objArr, 4));
        C8632dsu.a(format, "");
        return format;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r10 == 1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r10 == 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r10 == 3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        r7 = r7 + 93;
        o.C3654bFw.m = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        if ((r7 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        r9 = r11.getString(o.bFT.c.n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r9.startsWith("'!#+") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        r10 = new java.lang.Object[1];
        l(r9.substring(4), r10);
        r9 = ((java.lang.String) r10[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        o.C8632dsu.a(r9, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        r9 = r11.getString(o.bFT.c.f13501o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
        if (r9.startsWith("'!#+") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        r10 = new java.lang.Object[1];
        l(r9.substring(4), r10);
        r9 = ((java.lang.String) r10[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
        o.C8632dsu.a(r9, "");
        r10 = o.C3654bFw.m + 7;
        o.C3654bFw.k = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
        if ((r10 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
        r2 = 4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
        if (o.C8632dsu.c((java.lang.Object) r9, (java.lang.Object) "RYAN_MURPHY") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
        r9 = o.C3654bFw.m + 85;
        o.C3654bFw.k = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
        if ((r9 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
        r9 = r11.getString(o.bFT.c.i);
        r11 = 56 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
        if (r9.startsWith("'!#+") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
        r9 = r11.getString(o.bFT.c.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
        if (r9.startsWith("'!#+") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
        r10 = new java.lang.Object[1];
        l(r9.substring(4), r10);
        r9 = ((java.lang.String) r10[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
        r10 = o.C3654bFw.m + 33;
        o.C3654bFw.k = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
        if ((!o.C8632dsu.c((java.lang.Object) r9, (java.lang.Object) "SHONDALAND")) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
        r9 = r11.getString(o.bFT.c.m);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fb, code lost:
        if (r9.startsWith("'!#+") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
        r10 = new java.lang.Object[1];
        l(r9.substring(4), r10);
        r9 = r10[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0109, code lost:
        r9 = r11.getString(o.bFT.c.l);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0113, code lost:
        if (r9.startsWith("'!#+") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
        r10 = new java.lang.Object[1];
        l(r9.substring(4), r10);
        r9 = r10[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
        r9 = ((java.lang.String) r9).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0126, code lost:
        r5 = r9;
        o.C8632dsu.d((java.lang.Object) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012b, code lost:
        r9 = r11.getString(o.bFT.c.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0135, code lost:
        if (r9.startsWith("'!#+") == true) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:
        r10 = new java.lang.Object[1];
        l(r9.substring(4), r10);
        r9 = ((java.lang.String) r10[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
        o.C8632dsu.a(r9, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (r10 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r10 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        r1 = o.C3654bFw.m + 29;
        r7 = r1 % 128;
        o.C3654bFw.k = r7;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e(java.lang.String r9, o.bFL r10, android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3654bFw.e(java.lang.String, o.bFL, android.content.Context):java.lang.String");
    }

    public final List<bFL> a(InterfaceC5198buI interfaceC5198buI) {
        C8632dsu.c((Object) interfaceC5198buI, "");
        VideoType type = interfaceC5198buI.getType();
        C8632dsu.a(type, "");
        boolean isAvailableToPlay = interfaceC5198buI.isAvailableToPlay();
        boolean g2 = g(interfaceC5198buI);
        boolean f2 = f(interfaceC5198buI);
        boolean j2 = j(interfaceC5198buI);
        ArrayList arrayList = new ArrayList();
        if (VideoType.MOVIE == type) {
            if (g2) {
                arrayList.add(new bFL(3));
            }
            if (f2) {
                arrayList.add(new bFL(1));
            }
            if (j2) {
                arrayList.add(new bFL(2));
            }
        } else {
            if (isAvailableToPlay) {
                arrayList.add(new bFL(0));
            }
            if (g2) {
                arrayList.add(new bFL(3));
            }
            if (j2) {
                arrayList.add(new bFL(2));
            }
            if (f2) {
                arrayList.add(new bFL(1));
            }
        }
        return arrayList;
    }

    public final List<TaglineMessage> d(InterfaceC5198buI interfaceC5198buI) {
        C8632dsu.c((Object) interfaceC5198buI, "");
        List<TaglineMessage> aa = interfaceC5198buI.aa();
        if (aa != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : aa) {
                TaglineMessage taglineMessage = (TaglineMessage) obj;
                String tagline = taglineMessage.getTagline();
                if (tagline != null && tagline.length() != 0) {
                    SupplementalMessageType classification = taglineMessage.getClassification();
                    SupplementalMessageType supplementalMessageType = SupplementalMessageType.h;
                    if (classification != supplementalMessageType || (taglineMessage.getClassification() == supplementalMessageType && C8153dex.O())) {
                        arrayList.add(obj);
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // o.InterfaceC3656bFy
    public Integer b(SupplementalMessageType supplementalMessageType) {
        int i2 = supplementalMessageType == null ? -1 : e.a[supplementalMessageType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return Integer.valueOf(com.netflix.mediaclient.ui.R.e.m);
                    }
                    return Integer.valueOf(com.netflix.mediaclient.ui.R.e.n);
                }
                return Integer.valueOf(com.netflix.mediaclient.ui.R.e.ap);
            }
            return Integer.valueOf(C5398bxx.e.d);
        }
        return Integer.valueOf(com.netflix.mediaclient.ui.R.e.S);
    }

    public String e(InterfaceC5194buE interfaceC5194buE, InterfaceC5195buF interfaceC5195buF, InterfaceC5227bul interfaceC5227bul, Context context) {
        String string;
        boolean g2;
        C8632dsu.c((Object) interfaceC5194buE, "");
        C8632dsu.c((Object) interfaceC5195buF, "");
        C8632dsu.c((Object) interfaceC5227bul, "");
        C8632dsu.c((Object) context, "");
        String ch_ = interfaceC5195buF.ch_();
        if (ch_ != null) {
            g2 = C8691duz.g(ch_);
            if (!g2) {
                String ch_2 = interfaceC5195buF.ch_();
                C8632dsu.d((Object) ch_2);
                return ch_2;
            }
        }
        if (interfaceC5194buE.V() == 1) {
            string = interfaceC5194buE.W();
        } else {
            string = context.getResources().getString(com.netflix.mediaclient.ui.R.o.ak, String.valueOf(interfaceC5195buF.x()));
        }
        C8632dsu.d((Object) string);
        return string;
    }

    @Override // o.InterfaceC3656bFy
    public Pair<String, String> a(InterfaceC5187bty interfaceC5187bty, Context context) {
        Pair<String, String> a2;
        C8632dsu.c((Object) interfaceC5187bty, "");
        C8632dsu.c((Object) context, "");
        NetflixActivity netflixActivity = (NetflixActivity) C8141del.d(context, NetflixActivity.class);
        return (netflixActivity == null || (a2 = c.a(interfaceC5187bty, netflixActivity)) == null) ? new Pair<>("", "") : a2;
    }

    public final String a(int i2, Context context) {
        int i3;
        int i4 = 2 % 2;
        int i5 = m + 9;
        k = i5 % 128;
        int i6 = i5 % 2;
        C8632dsu.c((Object) context, "");
        if (i2 > 0) {
            int i7 = k + 21;
            m = i7 % 128;
            int i8 = i7 % 2;
            i3 = com.netflix.mediaclient.ui.R.o.fY;
            int i9 = m + 93;
            k = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i3 = com.netflix.mediaclient.ui.R.o.fL;
        }
        String string = context.getString(i3);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            l(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        C8632dsu.a(string, "");
        return string;
    }

    public final CharSequence d(InterfaceC5223buh interfaceC5223buh, Context context) {
        int i2 = 2 % 2;
        int i3 = m + 71;
        k = i3 % 128;
        if (i3 % 2 == 0) {
            C8632dsu.c((Object) interfaceC5223buh, "");
            C8632dsu.c((Object) context, "");
            interfaceC5223buh.getTitle();
            throw null;
        }
        C8632dsu.c((Object) interfaceC5223buh, "");
        C8632dsu.c((Object) context, "");
        String title = interfaceC5223buh.getTitle();
        if (title == null || title.length() == 0) {
            String a2 = a(0, context);
            int i4 = k + 23;
            m = i4 % 128;
            int i5 = i4 % 2;
            return a2;
        }
        int i6 = com.netflix.mediaclient.ui.R.o.l;
        dsE dse = dsE.b;
        String string = context.getString(i6);
        if (string.startsWith("'!#+")) {
            int i7 = m + 39;
            k = i7 % 128;
            if (i7 % 2 == 0) {
                Object[] objArr = new Object[1];
                l(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                int i8 = 33 / 0;
            } else {
                Object[] objArr2 = new Object[1];
                l(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
            }
        }
        C8632dsu.a(string, "");
        String format = String.format(string, Arrays.copyOf(new Object[]{title}, 1));
        C8632dsu.a(format, "");
        return format;
    }

    public final CharSequence a(int i2, InterfaceC5198buI interfaceC5198buI, Context context) {
        int i3 = 2 % 2;
        int i4 = k + 9;
        m = i4 % 128;
        String str = null;
        if (i4 % 2 != 0) {
            C8632dsu.c((Object) interfaceC5198buI, "");
            C8632dsu.c((Object) context, "");
            interfaceC5198buI.P();
            str.hashCode();
            throw null;
        }
        C8632dsu.c((Object) interfaceC5198buI, "");
        C8632dsu.c((Object) context, "");
        InterfaceC5194buE P = interfaceC5198buI.P();
        if (P != null) {
            str = P.C_();
        } else {
            int i5 = m + 95;
            k = i5 % 128;
            int i6 = i5 % 2;
        }
        if (str == null) {
            int i7 = m + 19;
            k = i7 % 128;
            int i8 = i7 % 2;
            str = interfaceC5198buI.getTitle();
            int i9 = k + 125;
            m = i9 % 128;
            int i10 = i9 % 2;
        }
        if (str == null || str.length() == 0) {
            return a(i2, context);
        }
        int i11 = i2 > 0 ? com.netflix.mediaclient.ui.R.o.k : com.netflix.mediaclient.ui.R.o.l;
        dsE dse = dsE.b;
        String string = context.getString(i11);
        if (!(!string.startsWith("'!#+"))) {
            Object[] objArr = new Object[1];
            l(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        C8632dsu.a(string, "");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        C8632dsu.a(format, "");
        return format;
    }

    public final CharSequence c(Context context, String str, int i2, int i3) {
        C8632dsu.c((Object) context, "");
        CharSequence a2 = C8176dfT.a(context, C1333Xq.d(i3).a(i2).c(), str);
        C8632dsu.a(a2, "");
        return a2;
    }

    public final CharSequence e(Context context, String str) {
        List d;
        int i2;
        String str2;
        int i3;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) str, "");
        d = duD.d((CharSequence) str, new String[]{", "}, false, 0, 6, (Object) null);
        String[] stringArray = context.getResources().getStringArray(bFT.d.c);
        C8632dsu.a(stringArray, "");
        if (BrowseExperience.e()) {
            i3 = C8657dts.i(d.size() - 1, 2);
            String str3 = stringArray[i3];
            C8632dsu.a(str3, "");
            str2 = C8691duz.b(str3, "E6E6E6", "000000", false, 4, (Object) null);
        } else {
            i2 = C8657dts.i(d.size() - 1, 2);
            str2 = stringArray[i2];
        }
        C1333Xq d2 = C1333Xq.d(str2);
        d2.d("person1", d.get(0));
        if (d.size() > 1) {
            d2.d("person2", d.get(1));
        }
        if (d.size() > 2) {
            d2.d("person3", d.get(2));
        }
        Spanned fromHtml = Html.fromHtml(d2.c());
        C8632dsu.a(fromHtml, "");
        return fromHtml;
    }

    public final boolean b(NetflixActivity netflixActivity, InterfaceC5198buI interfaceC5198buI) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) interfaceC5198buI, "");
        return InterfaceC7303ctf.c.a(netflixActivity).c(netflixActivity, interfaceC5198buI) && !C8126deW.e((Context) netflixActivity);
    }

    public final Pair<String, String> a(InterfaceC5187bty interfaceC5187bty, NetflixActivity netflixActivity) {
        CharSequence r;
        Pair pair;
        int i2 = 2 % 2;
        int i3 = m + 25;
        k = i3 % 128;
        int i4 = i3 % 2;
        C8632dsu.c((Object) interfaceC5187bty, "");
        C8632dsu.c((Object) netflixActivity, "");
        EnumMap<SupportedCapabilities, Boolean> a2 = a(d(netflixActivity.getServiceManager()), interfaceC5187bty);
        DetailsUtilImpl$createCapToStrMap$1 j2 = j();
        String str = "";
        String str2 = str;
        for (Map.Entry<SupportedCapabilities, Boolean> entry : a2.entrySet()) {
            Boolean value = entry.getValue();
            C8632dsu.a(value, "");
            if (value.booleanValue() && (pair = (Pair) j2.get(entry.getKey())) != null) {
                String string = netflixActivity.getResources().getString(((Number) pair.d()).intValue());
                if (string.startsWith("'!#+")) {
                    Object[] objArr = new Object[1];
                    l(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                    int i5 = k + 87;
                    m = i5 % 128;
                    int i6 = i5 % 2;
                }
                String string2 = netflixActivity.getResources().getString(((Number) pair.a()).intValue());
                if (string2.startsWith("'!#+")) {
                    int i7 = m + 111;
                    k = i7 % 128;
                    int i8 = i7 % 2;
                    Object[] objArr2 = new Object[1];
                    l(string2.substring(4), objArr2);
                    string2 = ((String) objArr2[0]).intern();
                    int i9 = m + 9;
                    k = i9 % 128;
                    int i10 = i9 % 2;
                }
                Pair pair2 = new Pair(string, string2);
                str2 = ((Object) str2) + pair2.a() + "  ";
                str = ((Object) str) + pair2.d() + "  ";
            }
        }
        r = duD.r(str);
        return new Pair<>(r.toString(), str2);
    }

    public final List<AbstractC3636bFe> d(InterfaceC5187bty interfaceC5187bty, NetflixActivity netflixActivity) {
        C8632dsu.c((Object) interfaceC5187bty, "");
        C8632dsu.c((Object) netflixActivity, "");
        EnumMap<SupportedCapabilities, Boolean> a2 = a(d(netflixActivity.getServiceManager()), interfaceC5187bty);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f()) {
            if (C8632dsu.c(a2.get(((AbstractC3636bFe) obj).c()), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final InterfaceC5123bsn d(ServiceManager serviceManager) {
        InterfaceC5131bsv q;
        C2005aWi h2 = (!C6539cfH.d(serviceManager) || (q = serviceManager.q()) == null) ? null : q.h();
        return h2 == null ? new c(serviceManager) : h2;
    }

    /* renamed from: o.bFw$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC5123bsn {
        final /* synthetic */ ServiceManager b;

        @Override // o.InterfaceC5123bsn
        public boolean i() {
            return false;
        }

        c(ServiceManager serviceManager) {
            this.b = serviceManager;
        }

        @Override // o.InterfaceC5123bsn
        public boolean c() {
            return C8149det.e.d();
        }

        @Override // o.InterfaceC5123bsn
        public boolean b() {
            aOV g = this.b.g();
            return g != null && g.an();
        }

        @Override // o.InterfaceC5123bsn
        public boolean e() {
            return C8149det.e.b();
        }

        @Override // o.InterfaceC5123bsn
        public boolean d() {
            return C8149det.e.e();
        }
    }

    private final EnumMap<SupportedCapabilities, Boolean> a(InterfaceC5123bsn interfaceC5123bsn, InterfaceC5187bty interfaceC5187bty) {
        EnumMap<SupportedCapabilities, Boolean> enumMap = new EnumMap<>(SupportedCapabilities.class);
        SupportedCapabilities supportedCapabilities = SupportedCapabilities.i;
        enumMap.put((EnumMap<SupportedCapabilities, Boolean>) supportedCapabilities, (SupportedCapabilities) Boolean.valueOf(C8150deu.d(interfaceC5123bsn, interfaceC5187bty)));
        if (C8150deu.b(interfaceC5123bsn, interfaceC5187bty)) {
            enumMap.put((EnumMap<SupportedCapabilities, Boolean>) SupportedCapabilities.a, (SupportedCapabilities) Boolean.TRUE);
        } else if (C8150deu.e(interfaceC5123bsn, interfaceC5187bty)) {
            enumMap.put((EnumMap<SupportedCapabilities, Boolean>) SupportedCapabilities.e, (SupportedCapabilities) Boolean.TRUE);
        } else if (C8150deu.a(interfaceC5123bsn, interfaceC5187bty)) {
            enumMap.put((EnumMap<SupportedCapabilities, Boolean>) SupportedCapabilities.g, (SupportedCapabilities) Boolean.TRUE);
        } else if (C8150deu.c(interfaceC5123bsn, interfaceC5187bty)) {
            enumMap.put((EnumMap<SupportedCapabilities, Boolean>) SupportedCapabilities.d, (SupportedCapabilities) Boolean.TRUE);
        }
        enumMap.put((EnumMap<SupportedCapabilities, Boolean>) SupportedCapabilities.c, (SupportedCapabilities) Boolean.valueOf(ConfigFastPropertyFeatureControlConfig.Companion.H() && C8150deu.e(interfaceC5187bty) && !C8632dsu.c(enumMap.get(supportedCapabilities), Boolean.TRUE)));
        enumMap.put((EnumMap<SupportedCapabilities, Boolean>) SupportedCapabilities.b, (SupportedCapabilities) Boolean.valueOf(interfaceC5187bty.aj()));
        enumMap.put((EnumMap<SupportedCapabilities, Boolean>) SupportedCapabilities.j, (SupportedCapabilities) Boolean.valueOf(interfaceC5187bty.ak()));
        return enumMap;
    }

    private final DetailsUtilImpl$createCapToStrMap$1 j() {
        return new DetailsUtilImpl$createCapToStrMap$1(SupportedCapabilities.class);
    }

    private final Set<AbstractC3636bFe> f() {
        Set<AbstractC3636bFe> b2;
        b2 = dqN.b((Object[]) new AbstractC3636bFe[]{new AbstractC3636bFe.b(HawkinsIcon.C0326hj.b, g, SupportedCapabilities.d), new AbstractC3636bFe.b(HawkinsIcon.C0329hm.d, i, SupportedCapabilities.g), new AbstractC3636bFe.b(HawkinsIcon.iP.c, e, SupportedCapabilities.i), new AbstractC3636bFe.b(HawkinsIcon.C0259ex.e, h, SupportedCapabilities.e), new AbstractC3636bFe.a(C3669bGg.e.b, b, SupportedCapabilities.a), new AbstractC3636bFe.a(C3669bGg.e.c, f, SupportedCapabilities.c), new AbstractC3636bFe.b(HawkinsIcon.S.c, a, SupportedCapabilities.b), new AbstractC3636bFe.b(HawkinsIcon.iI.c, j, SupportedCapabilities.j)});
        return b2;
    }

    public final boolean d(String str, Resources resources) {
        boolean d;
        int i2 = 2 % 2;
        int i3 = k + 89;
        m = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) resources, "");
            resources.getString(com.netflix.mediaclient.ui.R.o.cc).startsWith("'!#+");
            throw null;
        }
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) resources, "");
        String string = resources.getString(com.netflix.mediaclient.ui.R.o.cc);
        if (!(!string.startsWith("'!#+"))) {
            int i4 = k + 45;
            m = i4 % 128;
            if (i4 % 2 != 0) {
                String substring = string.substring(4);
                Object[] objArr = new Object[1];
                l(substring, objArr);
                ((String) objArr[0]).intern();
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            l(string.substring(4), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        C8632dsu.a(string, "");
        d = duD.d((CharSequence) str, (CharSequence) string, false, 2, (Object) null);
        return d;
    }

    public final ContextualText c(InterfaceC5198buI interfaceC5198buI) {
        boolean g2;
        C8632dsu.c((Object) interfaceC5198buI, "");
        ContextualText.TextContext textContext = ContextualText.TextContext.b;
        ContextualText e2 = interfaceC5198buI.e(textContext);
        C8632dsu.a(e2, "");
        InterfaceC5194buE P = interfaceC5198buI.P();
        if (P != null) {
            ContextualText d = P.d(textContext);
            if (interfaceC5198buI.B_() == WatchStatus.e || interfaceC5198buI.B_() == WatchStatus.b) {
                String text = d != null ? d.text() : null;
                if (text != null) {
                    g2 = C8691duz.g(text);
                    if (!g2) {
                        C8632dsu.d(d);
                        e2 = d;
                    }
                }
            }
        }
        return C8168dfL.g(e2.text()) ? new a() : e2;
    }

    /* renamed from: o.bFw$a */
    /* loaded from: classes4.dex */
    public static final class a implements ContextualText {
        @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
        public String evidenceKey() {
            return null;
        }

        @Override // o.InterfaceC8321diF
        public boolean needsRefresh(long j) {
            return false;
        }

        @Override // o.InterfaceC8321diF
        public void setExpires(Long l) {
        }

        @Override // o.InterfaceC8323diH
        public void setTimestamp(long j) {
        }

        @Override // com.netflix.mediaclient.servicemgr.interface_.ContextualText
        public String text() {
            return "";
        }

        a() {
        }

        @Override // o.InterfaceC8323diH
        public long getTimestamp() {
            return System.currentTimeMillis();
        }
    }

    public final boolean e(InterfaceC5198buI interfaceC5198buI) {
        if (interfaceC5198buI == null || !interfaceC5198buI.aE_().H()) {
            return C8161dfE.d.a();
        }
        return false;
    }

    public boolean b(InterfaceC5198buI interfaceC5198buI) {
        return C8153dex.O() && h(interfaceC5198buI);
    }

    public JSONObject e(JSONObject jSONObject, boolean z) {
        List e2 = z ? C8566dqi.e("mostLikedBadge") : null;
        if (e2 != null) {
            if (jSONObject == null) {
                try {
                    jSONObject = new JSONObject();
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
            jSONObject.put("badges", new JSONArray((Collection) e2));
        }
        return jSONObject;
    }

    private final boolean h(InterfaceC5198buI interfaceC5198buI) {
        List<TaglineMessage> d;
        if (interfaceC5198buI != null && (d = c.d(interfaceC5198buI)) != null && !d.isEmpty() && (!(d instanceof Collection) || !d.isEmpty())) {
            for (TaglineMessage taglineMessage : d) {
                if (taglineMessage.getClassification() == SupplementalMessageType.h) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean g(InterfaceC5198buI interfaceC5198buI) {
        TrackableListSummary ck_;
        InterfaceC5202buM L = interfaceC5198buI.L();
        return (L == null || (ck_ = L.ck_()) == null || ck_.getLength() <= 0) ? false : true;
    }

    private final boolean f(InterfaceC5198buI interfaceC5198buI) {
        TrackableListSummary h2;
        InterfaceC5196buG J2 = interfaceC5198buI.J();
        return (J2 == null || (h2 = J2.h()) == null || h2.getLength() <= 0) ? false : true;
    }

    private final boolean j(InterfaceC5198buI interfaceC5198buI) {
        List<InterfaceC5240buy> bS_;
        InterfaceC5199buJ S = interfaceC5198buI.S();
        return (S == null || (bS_ = S.bS_()) == null || bS_.size() <= 0) ? false : true;
    }

    private void l(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$3810);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
