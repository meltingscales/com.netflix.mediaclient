package com.netflix.mediaclient.netflixactivity.impl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.util.Base64;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase;
import com.netflix.mediaclient.netflixactivity.impl.NetflixActivityErrorHandlerImpl;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.inject.Inject;
import javax.inject.Provider;
import o.C1045Mp;
import o.C1163Rc;
import o.C1907aSr;
import o.C8054ddD;
import o.C8187dfe;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1593aHa;
import o.InterfaceC1640aIu;
import o.SY;
import o.cNT;
import o.dpR;
import o.dsE;

/* loaded from: classes3.dex */
public final class NetflixActivityErrorHandlerImpl implements InterfaceC1640aIu {
    public static final d a;
    private static byte e$ss2$145 = 0;
    private static int g = 0;
    private static int j = 1;
    private final Activity b;
    private final Provider<cNT> c;
    private final Provider<LoginApi> e;

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes6.dex */
    public interface ErrorModule {
        @Binds
        InterfaceC1640aIu d(NetflixActivityErrorHandlerImpl netflixActivityErrorHandlerImpl);
    }

    /* loaded from: classes3.dex */
    public final /* synthetic */ class b {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[StatusCode.values().length];
            try {
                iArr[StatusCode.NRD_LOGIN_ACTIONID_3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusCode.NRD_LOGIN_ACTIONID_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusCode.NRD_LOGIN_ACTIONID_8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StatusCode.NRD_LOGIN_ACTIONID_9.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StatusCode.NRD_LOGIN_ACTIONID_1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StatusCode.NRD_LOGIN_ACTIONID_2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StatusCode.NRD_LOGIN_ACTIONID_5.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StatusCode.NRD_LOGIN_ACTIONID_6.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StatusCode.NRD_LOGIN_ACTIONID_7.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StatusCode.NRD_LOGIN_ACTIONID_10.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StatusCode.NRD_LOGIN_ACTIONID_11.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StatusCode.NRD_LOGIN_ACTIONID_12.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StatusCode.HTTP_SSL_DATE_TIME_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[StatusCode.HTTP_SSL_ERROR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[StatusCode.HTTP_SSL_NO_VALID_CERT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[StatusCode.USER_SIGNIN_FAILURE_TRY_SIGNUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[StatusCode.SWITCH_PROFILE_UNKNOWN_ID.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[StatusCode.MSL_SWITCH_PROFILE_BIND_FAIL.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[StatusCode.MSL_SWITCH_PROFILE_NO_AUTH_DATA.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[StatusCode.MSL_SWITCH_PROFILE_FAILED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[StatusCode.MSL_REFRESH_PROFILE_LIST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[StatusCode.PROFILE_OPERATION_ERROR.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[StatusCode.INVALID_COUNRTY.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[StatusCode.INSUFFICIENT_CONTENT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            c = iArr;
        }
    }

    static {
        c();
        a = new d(null);
    }

    static void c() {
        e$ss2$145 = (byte) 24;
    }

    @Inject
    public NetflixActivityErrorHandlerImpl(Activity activity, Provider<LoginApi> provider, Provider<cNT> provider2) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) provider, "");
        C8632dsu.c((Object) provider2, "");
        this.b = activity;
        this.e = provider;
        this.c = provider2;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("NetflixActivityErrorHandlerImpl");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(NetflixActivityErrorHandlerImpl netflixActivityErrorHandlerImpl) {
        C8632dsu.c((Object) netflixActivityErrorHandlerImpl, "");
        System.nanoTime();
        a.getLogTag();
        netflixActivityErrorHandlerImpl.b.finish();
        netflixActivityErrorHandlerImpl.b.startActivity(netflixActivityErrorHandlerImpl.e.get().e(netflixActivityErrorHandlerImpl.b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0146, code lost:
        if (r12.startsWith("'!#+") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0157, code lost:
        if (r12.startsWith("'!#+") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0159, code lost:
        r1 = new java.lang.Object[1];
        f(r12.substring(4), r1);
        r12 = ((java.lang.String) r1[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x016a, code lost:
        r1 = java.lang.String.format("%s ( %d )", java.util.Arrays.copyOf(new java.lang.Object[]{r12, java.lang.Integer.valueOf(r11.c().getValue())}, 2));
        o.C8632dsu.a(r1, "");
        r11 = com.netflix.mediaclient.netflixactivity.impl.NetflixActivityErrorHandlerImpl.j + 107;
        com.netflix.mediaclient.netflixactivity.impl.NetflixActivityErrorHandlerImpl.g = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        r1 = "";
     */
    @Override // o.InterfaceC1640aIu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(com.netflix.mediaclient.android.app.Status r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.netflixactivity.impl.NetflixActivityErrorHandlerImpl.d(com.netflix.mediaclient.android.app.Status, boolean):void");
    }

    @Override // o.InterfaceC1640aIu
    public void d(Status status) {
        int i = 2 % 2;
        int i2 = j + 111;
        g = i2 % 128;
        int i3 = i2 % 2;
        C8632dsu.c((Object) status, "");
        int i4 = b.c[status.c().ordinal()];
        if (i4 == 23) {
            a.getLogTag();
            e(R.o.f13255o, status, true);
        } else if (i4 != 24) {
        } else {
            a.getLogTag();
            String string = this.b.getString(R.o.cl);
            if (string.startsWith("'!#+")) {
                int i5 = g + 41;
                j = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    f(string.substring(4), objArr);
                    ((String) objArr[0]).intern();
                    throw null;
                }
                Object[] objArr2 = new Object[1];
                f(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
                int i6 = g + 39;
                j = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 % 2;
                }
            }
            C8632dsu.a(string, "");
            a(string, new Runnable() { // from class: o.aIF
                @Override // java.lang.Runnable
                public final void run() {
                    NetflixActivityErrorHandlerImpl.c(NetflixActivityErrorHandlerImpl.this);
                }
            }, false);
            int i8 = j + 75;
            g = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(NetflixActivityErrorHandlerImpl netflixActivityErrorHandlerImpl) {
        C8632dsu.c((Object) netflixActivityErrorHandlerImpl, "");
        Activity activity = netflixActivityErrorHandlerImpl.b;
        C8632dsu.d(activity);
        NetflixActivity netflixActivity = (NetflixActivity) activity;
        AppView uiScreen = ((NetflixActivity) netflixActivityErrorHandlerImpl.b).getUiScreen();
        if (uiScreen == null) {
            uiScreen = AppView.UNKNOWN;
        }
        C8632dsu.d(uiScreen);
        Intent d2 = netflixActivityErrorHandlerImpl.c.get().d((NetflixActivityBase) netflixActivityErrorHandlerImpl.b, uiScreen);
        netflixActivityErrorHandlerImpl.c.get().d(d2);
        netflixActivityErrorHandlerImpl.b.startActivity(d2);
        netflixActivityErrorHandlerImpl.b.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r6.startsWith("'!#+") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        if ((!r6.startsWith("'!#+")) != true) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
        r1 = new java.lang.Object[1];
        f(r6.substring(4), r1);
        r6 = ((java.lang.String) r1[0]).intern();
        r1 = com.netflix.mediaclient.netflixactivity.impl.NetflixActivityErrorHandlerImpl.j + 67;
        com.netflix.mediaclient.netflixactivity.impl.NetflixActivityErrorHandlerImpl.g = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(int r6, com.netflix.mediaclient.android.app.Status r7, boolean r8) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.netflix.mediaclient.netflixactivity.impl.NetflixActivityErrorHandlerImpl.g
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.netflix.mediaclient.netflixactivity.impl.NetflixActivityErrorHandlerImpl.j = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "'!#+"
            r4 = 1
            if (r1 != 0) goto L22
            android.app.Activity r1 = r5.b
            java.lang.String r6 = r1.getString(r6)
            boolean r1 = r6.startsWith(r3)
            r3 = 28
            int r3 = r3 / r2
            if (r1 == 0) goto L4a
            goto L2f
        L22:
            android.app.Activity r1 = r5.b
            java.lang.String r6 = r1.getString(r6)
            boolean r1 = r6.startsWith(r3)
            r1 = r1 ^ r4
            if (r1 == r4) goto L4a
        L2f:
            r1 = 4
            java.lang.String r6 = r6.substring(r1)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r5.f(r6, r1)
            r6 = r1[r2]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            int r1 = com.netflix.mediaclient.netflixactivity.impl.NetflixActivityErrorHandlerImpl.j
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.netflix.mediaclient.netflixactivity.impl.NetflixActivityErrorHandlerImpl.g = r2
            int r1 = r1 % r0
        L4a:
            java.lang.String r0 = ""
            o.C8632dsu.a(r6, r0)
            com.netflix.mediaclient.StatusCode r7 = r7.c()
            int r7 = r7.getValue()
            r5.b(r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.netflixactivity.impl.NetflixActivityErrorHandlerImpl.e(int, com.netflix.mediaclient.android.app.Status, boolean):void");
    }

    private final void b(String str, int i, boolean z) {
        dsE dse = dsE.b;
        String format = String.format("%s ( %d )", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
        C8632dsu.a(format, "");
        InterfaceC1593aHa.a aVar = InterfaceC1593aHa.c;
        String name = Thread.currentThread().getName();
        Activity activity = this.b;
        aVar.a("displayErrorDialog: " + format + " Thread: " + name + " Activity: " + activity);
        a(format, z ? new Runnable() { // from class: o.aIC
            @Override // java.lang.Runnable
            public final void run() {
                NetflixActivityErrorHandlerImpl.b(NetflixActivityErrorHandlerImpl.this);
            }
        } : null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(NetflixActivityErrorHandlerImpl netflixActivityErrorHandlerImpl) {
        C8632dsu.c((Object) netflixActivityErrorHandlerImpl, "");
        netflixActivityErrorHandlerImpl.b.finish();
    }

    @Override // o.InterfaceC1640aIu
    public void a(String str, Runnable runnable, boolean z) {
        C8632dsu.c((Object) str, "");
        Activity activity = this.b;
        C8632dsu.d(activity);
        NetflixActivity netflixActivity = (NetflixActivity) activity;
        if (C8054ddD.l(this.b)) {
            return;
        }
        SY.e e = C1163Rc.e(this.b, C8187dfe.e.a(), new C1907aSr(null, str, this.b.getString(R.o.f13253fi), runnable));
        Object obj = ((NetflixActivity) this.b).visibleDialogLock;
        C8632dsu.a(obj, "");
        synchronized (obj) {
            Dialog visibleDialog = ((NetflixActivity) this.b).getVisibleDialog();
            if (!z) {
                if (visibleDialog != null && !visibleDialog.isShowing()) {
                    a.getLogTag();
                    ((NetflixActivity) this.b).displayDialog(e);
                } else if (visibleDialog == null) {
                    a.getLogTag();
                    ((NetflixActivity) this.b).displayDialog(e);
                } else {
                    dpR dpr = dpR.c;
                }
            } else {
                a.getLogTag();
                ((NetflixActivity) this.b).displayDialog(e);
            }
        }
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$145);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
