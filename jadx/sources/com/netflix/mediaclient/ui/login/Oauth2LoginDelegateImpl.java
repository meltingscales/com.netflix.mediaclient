package com.netflix.mediaclient.ui.login;

import android.util.Base64;
import androidx.activity.ComponentActivity;
import com.netflix.mediaclient.service.user.UserAgent;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.nio.charset.StandardCharsets;
import javax.inject.Inject;
import o.C8632dsu;
import o.C8737dwr;
import o.InterfaceC6282caP;
import o.aCI;
import o.aIJ;
import o.dpR;
import o.drM;
import o.dwQ;
import o.dwU;

/* loaded from: classes4.dex */
public final class Oauth2LoginDelegateImpl implements InterfaceC6282caP {
    private static int a = 1;
    private static int c = 0;
    private static byte e$ss2$94 = 24;
    private final dwQ b;
    private final dwQ d;
    private final aCI e;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface Oauth2LoginDelegateModule {
        @Binds
        InterfaceC6282caP b(Oauth2LoginDelegateImpl oauth2LoginDelegateImpl);
    }

    @Inject
    public Oauth2LoginDelegateImpl(aCI aci, dwQ dwq, dwQ dwq2) {
        C8632dsu.c((Object) aci, "");
        C8632dsu.c((Object) dwq, "");
        C8632dsu.c((Object) dwq2, "");
        this.e = aci;
        this.d = dwq;
        this.b = dwq2;
    }

    @Override // o.InterfaceC6282caP
    public void b(ComponentActivity componentActivity, dwU dwu, drM<? super String, dpR> drm) {
        C8632dsu.c((Object) componentActivity, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) drm, "");
        C8737dwr.c(dwu, this.d, null, new Oauth2LoginDelegateImpl$initiateBrowserLogin$1(this, componentActivity, drm, null), 2, null);
    }

    @Override // o.InterfaceC6282caP
    public void d(ComponentActivity componentActivity, dwU dwu, UserAgent userAgent, String str, String str2, drM<? super Boolean, dpR> drm) {
        C8632dsu.c((Object) componentActivity, "");
        C8632dsu.c((Object) dwu, "");
        C8632dsu.c((Object) drm, "");
        if (userAgent != null && str != null && str2 != null) {
            C8737dwr.c(dwu, this.d, null, new Oauth2LoginDelegateImpl$concludeBrowserLogin$1(this, str, str2, userAgent, drm, null), 2, null);
        } else {
            drm.invoke(Boolean.FALSE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
        if (r8.startsWith("'!#+") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
        if (r8.startsWith("'!#+") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
        r9 = new java.lang.Object[1];
        f(r8.substring(4), r9);
        r8 = ((java.lang.String) r9[0]).intern();
     */
    @Override // o.InterfaceC6282caP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(androidx.activity.ComponentActivity r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = 2
            int r3 = r2 % r2
            int r3 = com.netflix.mediaclient.ui.login.Oauth2LoginDelegateImpl.a
            int r3 = r3 + 81
            int r4 = r3 % 128
            com.netflix.mediaclient.ui.login.Oauth2LoginDelegateImpl.c = r4
            int r3 = r3 % r2
            r4 = 1
            r5 = 4
            r6 = 0
            java.lang.String r7 = "'!#+"
            java.lang.String r8 = ""
            if (r3 == 0) goto L33
            o.C8632dsu.c(r1, r8)
            com.netflix.mediaclient.android.activity.NetflixActivity r1 = (com.netflix.mediaclient.android.activity.NetflixActivity) r1
            o.yF r3 = r1.composeViewOverlayManager
            o.C8632dsu.a(r3, r8)
            int r8 = o.C6361cbp.b.e
            java.lang.String r8 = r1.getString(r8)
            boolean r9 = r8.startsWith(r7)
            r10 = 87
            int r10 = r10 / r6
            if (r9 == 0) goto L5a
            goto L49
        L33:
            o.C8632dsu.c(r1, r8)
            com.netflix.mediaclient.android.activity.NetflixActivity r1 = (com.netflix.mediaclient.android.activity.NetflixActivity) r1
            o.yF r3 = r1.composeViewOverlayManager
            o.C8632dsu.a(r3, r8)
            int r8 = o.C6361cbp.b.e
            java.lang.String r8 = r1.getString(r8)
            boolean r9 = r8.startsWith(r7)
            if (r9 == 0) goto L5a
        L49:
            java.lang.String r8 = r8.substring(r5)
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r0.f(r8, r9)
            r8 = r9[r6]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
        L5a:
            r20 = r8
            r8 = r3
            r3 = r20
            int r9 = o.C6361cbp.b.a
            java.lang.String r1 = r1.getString(r9)
            boolean r7 = r1.startsWith(r7)
            if (r7 == 0) goto L85
            java.lang.String r1 = r1.substring(r5)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0.f(r1, r4)
            r1 = r4[r6]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            int r4 = com.netflix.mediaclient.ui.login.Oauth2LoginDelegateImpl.c
            int r4 = r4 + 95
            int r5 = r4 % 128
            com.netflix.mediaclient.ui.login.Oauth2LoginDelegateImpl.a = r5
            int r4 = r4 % r2
        L85:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = "\n"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r10 = r2.toString()
            com.netflix.hawkins.consumer.icons.HawkinsIcon$bc r11 = com.netflix.hawkins.consumer.icons.HawkinsIcon.C0158bc.b
            com.netflix.hawkins.consumer.tokens.Theme r14 = com.netflix.hawkins.consumer.tokens.Theme.b
            r9 = 0
            r12 = 0
            r13 = 0
            r15 = 5000(0x1388, float:7.006E-42)
            r16 = 0
            r17 = 0
            r18 = 409(0x199, float:5.73E-43)
            r19 = 0
            o.C9878yL.e(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.login.Oauth2LoginDelegateImpl.b(androidx.activity.ComponentActivity):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(String str, String str2, ComponentActivity componentActivity) {
        String str3 = aIJ.a(componentActivity) + "/oAuth2Authorize?codeChallenge=" + str + "&state=" + str2;
        C8632dsu.a(str3, "");
        return str3;
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$94);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
