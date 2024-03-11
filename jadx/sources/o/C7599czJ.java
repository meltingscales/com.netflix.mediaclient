package o;

import android.annotation.SuppressLint;
import android.util.Base64;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.ui.player.PlayerFragmentV2;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.functions.Consumer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import o.C1163Rc;
import o.cQQ;

/* renamed from: o.czJ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7599czJ {
    private static int c = 1;
    public static final long d;
    private static int e;
    private static byte e$ss2$82;

    static void d() {
        e$ss2$82 = (byte) 24;
    }

    static {
        d();
        d = TimeUnit.MINUTES.toMillis(5L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if ((r22 instanceof o.C4603bhd) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        return d(r21, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if ((r22 instanceof o.C4614bho) == true) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        r6 = com.netflix.mediaclient.ui.R.o.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if ((r22 instanceof com.netflix.mediaclient.service.player.offlineplayback.ExoPlaybackError) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r22.d() != com.netflix.mediaclient.service.player.offlineplayback.ExoPlaybackError.ExoPlaybackErrorCode.CRYPTO_ERROR.e()) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (o.C8170dfN.c(o.C7599czJ.d) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
        r6 = o.C7599czJ.e + 77;
        o.C7599czJ.c = r6 % 128;
        r6 = r6 % 2;
        r6 = com.netflix.mediaclient.ui.R.o.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        r6 = r21.d(r6, "(" + r22.b() + ")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
        r6 = r22.a();
        r13 = ((o.C4614bho) r22).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
        if (r13 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        r12 = o.C7599czJ.e + 85;
        o.C7599czJ.c = r12 % 128;
        r12 = r12 % 2;
        r12 = r13.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
        if (o.C8168dfL.g(r6) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
        r6 = r21.d(com.netflix.mediaclient.ui.R.o.a, "(" + r22.b() + ")");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c3, code lost:
        r10 = r21.bj_();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
        if ((r22 instanceof o.C4546bgZ) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
        r1 = new o.C1911aSv(r10, r21.bl_().u());
        r11 = o.C7599czJ.c + 105;
        o.C7599czJ.e = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
        r1 = new o.C1908aSs(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ed, code lost:
        if (o.C8168dfL.h(r12) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ef, code lost:
        r0 = r21.bl_().g();
        r0 = "https://help.netflix.com/api/deviceerror?esnPrefix=" + java.net.URLEncoder.encode(r0.w().k(), "UTF-8") + "&errorCode=" + java.net.URLEncoder.encode(r12, "UTF-8") + "&caller=" + java.net.URLEncoder.encode("AndroidMobile", "UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0145, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0146, code lost:
        o.C1044Mm.b("ErrorManager", r0, "Exception generating help Url", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        if ((!r21.bn_()) != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r21.bn_() == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        o.C1044Mm.a("ErrorManager", "Fragment was already detached from the activity - skipping error...");
     */
    @android.annotation.SuppressLint({"CheckResult"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.InterfaceC1905aSp d(com.netflix.mediaclient.ui.player.PlayerFragmentV2 r21, com.netflix.mediaclient.servicemgr.IPlayer.c r22, java.lang.String r23, com.netflix.mediaclient.servicemgr.interface_.VideoType r24, com.netflix.mediaclient.util.PlayContext r25) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7599czJ.d(com.netflix.mediaclient.ui.player.PlayerFragmentV2, com.netflix.mediaclient.servicemgr.IPlayer$c, java.lang.String, com.netflix.mediaclient.servicemgr.interface_.VideoType, com.netflix.mediaclient.util.PlayContext):o.aSp");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(RunnableC8122deS runnableC8122deS, String str, cQQ.d dVar) {
        String b = dVar.b();
        if (b != null) {
            runnableC8122deS.a(C8051ddA.c(str, b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(RunnableC8122deS runnableC8122deS, String str, cQQ.d dVar) {
        String b = dVar.b();
        if (b != null) {
            runnableC8122deS.a(C8051ddA.c(str, b));
        }
    }

    @SuppressLint({"CheckResult"})
    private static InterfaceC1905aSp d(PlayerFragmentV2 playerFragmentV2, IPlayer.c cVar) {
        int i = 2 % 2;
        int i2 = c + 9;
        e = i2 % 128;
        int i3 = i2 % 2;
        String a = cVar.a();
        if (C8168dfL.g(a)) {
            int i4 = com.netflix.mediaclient.ui.R.o.a;
            a = playerFragmentV2.d(i4, "(" + cVar.b() + ")");
        }
        NetflixActivity bj_ = playerFragmentV2.bj_();
        C1908aSs c1908aSs = new C1908aSs(bj_);
        final RunnableC8122deS runnableC8122deS = new RunnableC8122deS(bj_.getApplicationContext(), "https://netflix.com/extramemberupgrade/signup");
        ((SingleSubscribeProxy) new cQQ().a(C8051ddA.e("https://netflix.com/extramemberupgrade/signup")).as(AutoDispose.b(AndroidLifecycleScopeProvider.c(bj_)))).a(new Consumer() { // from class: o.czN
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7599czJ.e(RunnableC8122deS.this, r2, (cQQ.d) obj);
            }
        });
        String string = bj_.getString(com.netflix.mediaclient.ui.R.o.cY);
        if (!(!string.startsWith("'!#+"))) {
            int i5 = e + 3;
            c = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            f(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        String string2 = bj_.getString(com.netflix.mediaclient.ui.R.o.da);
        if (string2.startsWith("'!#+")) {
            Object[] objArr2 = new Object[1];
            f(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
            int i7 = c + 27;
            e = i7 % 128;
            int i8 = i7 % 2;
        }
        C1163Rc.e eVar = new C1163Rc.e("", a, string, c1908aSs, string2, runnableC8122deS, c1908aSs);
        C1044Mm.d("ErrorManager", a);
        return new C7610czU(eVar);
    }

    private static void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$82);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
