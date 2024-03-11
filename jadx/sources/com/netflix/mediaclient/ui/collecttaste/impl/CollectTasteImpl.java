package com.netflix.mediaclient.ui.collecttaste.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTaste;
import com.netflix.mediaclient.ui.collecttaste.api.CollectTasteData;
import com.netflix.mediaclient.ui.collecttaste.impl.CollectTasteImpl;
import com.netflix.mediaclient.ui.collecttaste.impl.rating.CollectTasteDialogFrag;
import dagger.Binds;
import dagger.Lazy;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import o.AbstractC3073as;
import o.C1045Mp;
import o.C1332Xp;
import o.C1596aHd;
import o.C3775bKe;
import o.C3814bLq;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1593aHa;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC2023aX;
import o.InterfaceC3993bSg;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.InterfaceC8812dzl;
import o.aDF;
import o.bAB;
import o.bAG;
import o.bAN;
import o.bAR;
import o.bAS;
import o.bAV;
import o.dqE;
import o.dzB;

/* loaded from: classes4.dex */
public final class CollectTasteImpl implements CollectTaste {
    private static int c = 0;
    public static final b e;
    private static byte e$ss2$175 = 0;
    private static int i = 1;
    private final Activity a;
    private final InterfaceC8812dzl<bAB> b;
    private final Lazy<InterfaceC3993bSg> d;

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes6.dex */
    public interface CollectTasteModule {
        @ActivityScoped
        @Binds
        CollectTaste d(CollectTasteImpl collectTasteImpl);
    }

    static {
        d();
        e = new b(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i2, int i3, int i4) {
        return i2;
    }

    static void d() {
        e$ss2$175 = (byte) 24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i2, int i3, int i4) {
        return i2;
    }

    @Override // com.netflix.mediaclient.ui.collecttaste.api.CollectTaste
    public InterfaceC8812dzl<bAB> a() {
        return this.b;
    }

    @Inject
    public CollectTasteImpl(Activity activity, Lazy<InterfaceC3993bSg> lazy) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) lazy, "");
        this.a = activity;
        this.d = lazy;
        this.b = dzB.d(bAB.b.d);
    }

    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("CollectTasteImpl");
        }
    }

    @Override // com.netflix.mediaclient.ui.collecttaste.api.CollectTaste
    public void b(InterfaceC2023aX interfaceC2023aX, View.OnClickListener onClickListener, CollectTaste.MessageType messageType) {
        int i2 = 2 % 2;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) onClickListener, "");
        C8632dsu.c((Object) messageType, "");
        Pair<Integer, Integer> e2 = bAV.e(messageType);
        int intValue = e2.b().intValue();
        int intValue2 = e2.c().intValue();
        bAN ban = new bAN();
        String lowerCase = messageType.name().toLowerCase(Locale.ROOT);
        C8632dsu.a(lowerCase, "");
        ban.b((CharSequence) ("collect-taste-message-" + lowerCase));
        String string = this.a.getString(intValue);
        if (string.startsWith("'!#+")) {
            int i3 = c + 23;
            i = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            f(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        ban.e((CharSequence) string);
        String string2 = this.a.getString(intValue2);
        if (string2.startsWith("'!#+")) {
            int i5 = i + 67;
            c = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr2 = new Object[1];
                f(string2.substring(4), objArr2);
                ((String) objArr2[0]).intern();
                throw null;
            }
            Object[] objArr3 = new Object[1];
            f(string2.substring(4), objArr3);
            string2 = ((String) objArr3[0]).intern();
        }
        ban.c((CharSequence) string2);
        ban.d(onClickListener);
        ban.e(new AbstractC3073as.b() { // from class: o.bAE
            @Override // o.AbstractC3073as.b
            public final int b(int i6, int i7, int i8) {
                int e3;
                e3 = CollectTasteImpl.e(i6, i7, i8);
                return e3;
            }
        });
        interfaceC2023aX.add(ban);
        int i6 = i + 45;
        c = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netflix.mediaclient.ui.collecttaste.api.CollectTaste
    public RecyclerView.ItemDecoration e(int i2) {
        String intern;
        int i3 = 2 % 2;
        Activity activity = this.a;
        int i4 = bAG.c.e;
        C1332Xp c1332Xp = C1332Xp.b;
        int applyDimension = (int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        int applyDimension2 = (int) TypedValue.applyDimension(1, 20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        String string = this.a.getString(bAV.c());
        if (!(!string.startsWith("'!#+"))) {
            int i5 = i + 103;
            c = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr = new Object[1];
                f(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                int i6 = 16 / 0;
            } else {
                Object[] objArr2 = new Object[1];
                f(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
            }
        }
        String str = string;
        C8632dsu.a(str, "");
        String string2 = this.a.getString(bAV.a());
        if (!string2.startsWith("'!#+")) {
            intern = string2;
        } else {
            int i7 = c + 51;
            i = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr3 = new Object[1];
            f(string2.substring(4), objArr3);
            intern = ((String) objArr3[0]).intern();
        }
        C8632dsu.a(intern, "");
        return new bAR(activity, i4, applyDimension, i2, applyDimension2, str, intern);
    }

    @Override // com.netflix.mediaclient.ui.collecttaste.api.CollectTaste
    public void d(InterfaceC2023aX interfaceC2023aX, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        aDF adf = video instanceof aDF ? (aDF) video : null;
        Integer c2 = adf != null ? adf.c() : null;
        String d2 = adf != null ? adf.d() : null;
        if (c2 == null || d2 == null || d2.length() == 0) {
            InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
            b bVar = e;
            aVar.a(bVar.getLogTag() + ": ratedVideoId = " + c2 + " ratedTitleLogoArtUrl = " + d2);
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str = bVar.getLogTag() + ": rated videoId/logoArtUrl was null or empty for videoId = " + interfaceC5222bug.getVideo().getId();
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
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
                return;
            } else {
                dVar.e().b(c1596aHd, th);
                return;
            }
        }
        C3775bKe c3775bKe = new C3775bKe();
        c3775bKe.c((CharSequence) ("collect-taste-payoff-logo-" + interfaceC5222bug.getVideo().getId() + "-" + c2));
        c3775bKe.b(bAG.b.c);
        c3775bKe.a(d2);
        interfaceC2023aX.add(c3775bKe);
    }

    @Override // com.netflix.mediaclient.ui.collecttaste.api.CollectTaste
    public String a(InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) interfaceC5222bug, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        aDF adf = video instanceof aDF ? (aDF) video : null;
        String e2 = adf != null ? adf.e() : null;
        if (e2 == null || e2.length() == 0) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String str = "rated title was null or empty for videoId = " + interfaceC5222bug.getVideo().getId();
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
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
            String title = interfaceC5222bug.getVideo().getTitle();
            C8632dsu.d((Object) title);
            return title;
        }
        boolean z = interfaceC5222bug.getVideo().getType() == VideoType.SHOW;
        String title2 = interfaceC5222bug.getVideo().getTitle();
        C8632dsu.a(title2, "");
        return bAV.d(z, title2, e2);
    }

    @Override // com.netflix.mediaclient.ui.collecttaste.api.CollectTaste
    public String d(InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug) {
        Integer c2;
        C8632dsu.c((Object) interfaceC5222bug, "");
        InterfaceC5223buh video = interfaceC5222bug.getVideo();
        aDF adf = video instanceof aDF ? (aDF) video : null;
        if (adf == null || (c2 = adf.c()) == null) {
            return null;
        }
        return c2.toString();
    }

    @Override // com.netflix.mediaclient.ui.collecttaste.api.CollectTaste
    @SuppressLint({"CheckResult"})
    public void e(CollectTasteData collectTasteData) {
        C8632dsu.c((Object) collectTasteData, "");
        NetflixActivity.requireNetflixActivity(this.a).showFullScreenDialog(CollectTasteDialogFrag.b.c(collectTasteData));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    @Override // com.netflix.mediaclient.ui.collecttaste.api.CollectTaste
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(int r12, java.lang.String r13, o.InterfaceC8585dra<? super o.dpR> r14) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.collecttaste.impl.CollectTasteImpl.e(int, java.lang.String, o.dra):java.lang.Object");
    }

    @Override // com.netflix.mediaclient.ui.collecttaste.api.CollectTaste
    public void c(InterfaceC2023aX interfaceC2023aX, String str, String str2, String str3, View.OnClickListener onClickListener) {
        int i2 = 2 % 2;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        C8632dsu.c((Object) str3, "");
        C8632dsu.c((Object) onClickListener, "");
        bAS bas = new bAS();
        bas.e((CharSequence) "collect-taste-row");
        String string = this.a.getString(bAV.e());
        if (!(!string.startsWith("'!#+"))) {
            int i3 = c + 49;
            i = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                f(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                int i4 = 74 / 0;
            } else {
                Object[] objArr2 = new Object[1];
                f(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
            }
        }
        bas.d((CharSequence) string);
        String string2 = this.a.getString(bAV.d());
        if (string2.startsWith("'!#+")) {
            Object[] objArr3 = new Object[1];
            f(string2.substring(4), objArr3);
            string2 = ((String) objArr3[0]).intern();
        }
        bas.b((CharSequence) string2);
        String string3 = this.a.getString(bAG.e.e);
        if (string3.startsWith("'!#+")) {
            Object[] objArr4 = new Object[1];
            f(string3.substring(4), objArr4);
            string3 = ((String) objArr4[0]).intern();
            int i5 = c + 107;
            i = i5 % 128;
            int i6 = i5 % 2;
        }
        bas.c((CharSequence) string3);
        bas.e(str);
        bas.b(str2);
        bas.d(str3);
        bas.a(onClickListener);
        bas.e(new AbstractC3073as.b() { // from class: o.bAD
            @Override // o.AbstractC3073as.b
            public final int b(int i7, int i8, int i9) {
                int c2;
                c2 = CollectTasteImpl.c(i7, i8, i9);
                return c2;
            }
        });
        interfaceC2023aX.add(bas);
    }

    @Override // com.netflix.mediaclient.ui.collecttaste.api.CollectTaste
    public void b(InterfaceC2023aX interfaceC2023aX, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug) {
        boolean z;
        int i2 = 2 % 2;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) interfaceC5222bug, "");
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) ("collect-taste-payoff-caption-" + interfaceC5222bug.getVideo().getId()));
        c3814bLq.d(bAG.b.e);
        Activity activity = this.a;
        if (interfaceC5222bug.getVideo().getType() == VideoType.SHOW) {
            int i3 = i + 117;
            c = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        String string = activity.getString(bAV.e(z));
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            f(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i5 = c + 37;
            i = i5 % 128;
            int i6 = i5 % 2;
        }
        c3814bLq.d((CharSequence) string);
        interfaceC2023aX.add(c3814bLq);
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$175);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
