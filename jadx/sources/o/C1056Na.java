package o;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Base64;
import androidx.appcompat.app.AlertDialog;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.error.crypto.ErrorSource;
import com.netflix.mediaclient.ui.diagnosis.DiagnosisActivity;
import com.netflix.mediaclient.ui.error.CryptoErrorManager;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import o.C9834xU;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.Na  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1056Na {
    public static final C1056Na a;
    private static int b = 0;
    private static int d = 1;
    private static byte e$ss2$352;

    /* renamed from: o.Na$c */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[StatusCode.values().length];
            try {
                iArr[StatusCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusCode.NON_RECOMMENDED_APP_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusCode.OBSOLETE_APP_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StatusCode.NET_CRONET_HOSTNAME_NOT_RESOLVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StatusCode.NET_CRONET_INTERNET_DISCONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StatusCode.NET_CRONET_TIMED_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StatusCode.NET_CRONET_CONNECTION_RESET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StatusCode.NET_CRONET_ADDRESS_UNREACHABLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StatusCode.NET_CRONET_ERROR_OTHER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StatusCode.NO_CONNECTIVITY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StatusCode.ESN_MIGRATION_NO_CONNECTIVITY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StatusCode.DRM_FAILURE_CDM_GENERIC_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StatusCode.DRM_FAILURE_GOOGLE_CDM_PROVISIONING_DENIED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[StatusCode.DRM_FAILURE_CDM_FAILED_TO_PROVIDE_PROVISION_RESPONSE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[StatusCode.DRM_FAILURE_GOOGLE_DECLINED_PROVISIONING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[StatusCode.HTTP_SSL_DATE_TIME_ERROR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[StatusCode.HTTP_SSL_ERROR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[StatusCode.HTTP_SSL_NO_VALID_CERT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[StatusCode.INIT_SERVICE_TIMEOUT_CONFIG_FETCH.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[StatusCode.FATAL_CONFIG_DOWNLOAD_FAILED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[StatusCode.FATAL_ESN_BASED_CONFIG_DOWNLOAD_FAILED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[StatusCode.FATAL_CONFIG_BLACKLISTED.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[StatusCode.MSL_LEGACY_CRYPTO.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[StatusCode.MSL_BLACKLISTED_DEVICE_FATAL.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[StatusCode.MSL_BLACKLISTED_DEVICE_FAILBACK.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[StatusCode.MSL_FAILED_TO_CREATE_CLIENT.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[StatusCode.MSL_GENERIC_EXCEPTION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[StatusCode.MSL_FAILED_TO_CREATE_CLIENT_ON_APPBOOT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[StatusCode.INIT_SERVICE_TIMEOUT.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[StatusCode.MSL_LEGACY_CRYPTO_BUT_USED_WIDEVINE_BEFORE.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[StatusCode.DEVICE_NOT_SUPPORTED.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[StatusCode.INIT_SERVICE_TIMEOUT_CONFIG_CREATE_CRYPTO.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[StatusCode.INIT_SERVICE_TIMEOUT_CONFIG_INIT_CRYPTO.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[StatusCode.NETWORK_ERROR.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            b = iArr;
        }
    }

    static {
        c();
        a = new C1056Na();
    }

    static void c() {
        e$ss2$352 = (byte) 24;
    }

    private C1056Na() {
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(com.netflix.mediaclient.android.activity.NetflixActivity r23, com.netflix.mediaclient.android.app.Status r24) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1056Na.a(com.netflix.mediaclient.android.activity.NetflixActivity, com.netflix.mediaclient.android.app.Status):boolean");
    }

    private final void e(StatusCode statusCode) {
        C1044Mm.j("ServiceErrorsHandler", "Reporting problem with DRM recovery.");
        CryptoErrorManager cryptoErrorManager = (CryptoErrorManager) C1332Xp.b(CryptoErrorManager.class);
        if (cryptoErrorManager != null) {
            cryptoErrorManager.a(ErrorSource.msl, statusCode, null);
        }
    }

    private final void b(Activity activity, StatusCode statusCode) {
        Map i;
        Throwable th;
        boolean z = activity instanceof NetflixActivity;
        if (z && ((NetflixActivity) activity).displayErrorDialogIfExist()) {
            C1044Mm.j("ServiceErrorsHandler", "Pending error found and already handled...");
            return;
        }
        String uiScreen = z ? ((NetflixActivity) activity).getUiScreen() : "android";
        String c2 = c(activity, statusCode);
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        i = dqE.i(dpD.a("status", String.valueOf(statusCode)), dpD.a("activity", String.valueOf(uiScreen)));
        C1596aHd c1596aHd = new C1596aHd("defaultErrorHandling", null, null, false, i, true, false, 70, null);
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
        a(activity, c2);
    }

    private final String e(Activity activity, StatusCode statusCode) {
        Throwable th;
        if (C8239dgd.b(90000L)) {
            C1044Mm.j("ServiceErrorsHandler", "Widevine plugin is blocked");
            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
            C1596aHd b2 = new C1596aHd("Widevine plugin is blocked", null, null, false, null, false, false, 126, null).b(false);
            ErrorType errorType = b2.a;
            if (errorType != null) {
                b2.e.put("errorType", errorType.c());
                String b3 = b2.b();
                if (b3 != null) {
                    String c2 = errorType.c();
                    b2.a(c2 + " " + b3);
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
            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c3 = dVar2.c();
            if (c3 != null) {
                c3.d(b2, th);
            } else {
                dVar2.e().b(b2, th);
            }
            String string = activity.getString(com.netflix.mediaclient.ui.R.o.dp, Integer.valueOf(StatusCode.DRM_FAILURE_MEDIADRM_WIDEVINE_PLUGIN_BLOCKED.getValue()));
            C8632dsu.d((Object) string);
            return string;
        }
        C1044Mm.j("ServiceErrorsHandler", "Widevine plugin is NOT blocked");
        return c(activity, statusCode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r5.startsWith("'!#+") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r5.startsWith("'!#+") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        r1 = new java.lang.Object[1];
        k(r5.substring(4), r1);
        r5 = ((java.lang.String) r1[0]).intern();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String c(android.app.Activity r5, com.netflix.mediaclient.StatusCode r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C1056Na.d
            int r1 = r1 + 105
            int r2 = r1 % 128
            o.C1056Na.b = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "'!#+"
            if (r1 == 0) goto L20
            int r1 = com.netflix.mediaclient.ui.R.o.hz
            java.lang.String r5 = r5.getString(r1)
            boolean r1 = r5.startsWith(r3)
            r3 = 4
            int r3 = r3 / r2
            if (r1 == 0) goto L3f
            goto L2c
        L20:
            int r1 = com.netflix.mediaclient.ui.R.o.hz
            java.lang.String r5 = r5.getString(r1)
            boolean r1 = r5.startsWith(r3)
            if (r1 == 0) goto L3f
        L2c:
            r1 = 4
            java.lang.String r5 = r5.substring(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            k(r5, r1)
            r5 = r1[r2]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
        L3f:
            int r6 = r6.getValue()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = " ("
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = ")"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            int r6 = o.C1056Na.d
            int r6 = r6 + 103
            int r1 = r6 % 128
            o.C1056Na.b = r1
            int r6 = r6 % r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1056Na.c(android.app.Activity, com.netflix.mediaclient.StatusCode):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r5.startsWith("'!#+") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r5.startsWith("'!#+") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        r1 = new java.lang.Object[1];
        k(r5.substring(4), r1);
        r5 = ((java.lang.String) r1[0]).intern();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String d(android.app.Activity r5, com.netflix.mediaclient.StatusCode r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C1056Na.d
            int r1 = r1 + 63
            int r2 = r1 % 128
            o.C1056Na.b = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "'!#+"
            if (r1 == 0) goto L21
            int r1 = com.netflix.mediaclient.ui.R.o.at
            java.lang.String r5 = r5.getString(r1)
            boolean r1 = r5.startsWith(r3)
            r3 = 59
            int r3 = r3 / r2
            if (r1 == 0) goto L40
            goto L2d
        L21:
            int r1 = com.netflix.mediaclient.ui.R.o.at
            java.lang.String r5 = r5.getString(r1)
            boolean r1 = r5.startsWith(r3)
            if (r1 == 0) goto L40
        L2d:
            r1 = 4
            java.lang.String r5 = r5.substring(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            k(r5, r1)
            r5 = r1[r2]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
        L40:
            int r6 = r6.getValue()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = " ("
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = ")"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            int r6 = o.C1056Na.b
            int r6 = r6 + 105
            int r1 = r6 % 128
            o.C1056Na.d = r1
            int r6 = r6 % r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1056Na.d(android.app.Activity, com.netflix.mediaclient.StatusCode):java.lang.String");
    }

    private final String e(Activity activity, int i, StatusCode statusCode) {
        int i2 = 2 % 2;
        int i3 = b + 25;
        d = i3 % 128;
        int i4 = i3 % 2;
        String string = activity.getString(i);
        if (!(!string.startsWith("'!#+"))) {
            int i5 = d + 53;
            b = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr = new Object[1];
                k(string.substring(4), objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            k(string.substring(4), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        int value = statusCode.getValue();
        return string + " (" + value + ")";
    }

    private final boolean c(NetflixActivity netflixActivity, boolean z) {
        return netflixActivity.handleAppUpdateNeed(z);
    }

    private final void e(final Activity activity, String str) {
        if (C8054ddD.l(activity)) {
            return;
        }
        new AlertDialog.Builder(activity, C9834xU.o.c).setCancelable(false).setMessage(str).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.Nj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1056Na.l(activity, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Activity activity, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) activity, "");
        C1044Mm.a("ServiceErrorsHandler", "launching settings");
        activity.startActivity(new Intent("android.settings.SETTINGS"));
        C8054ddD.e((Context) activity);
    }

    private final void d(final Activity activity, String str) {
        if (C8054ddD.l(activity)) {
            return;
        }
        new AlertDialog.Builder(activity, C9834xU.o.c).setCancelable(false).setMessage(str).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.Nf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1056Na.i(activity, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Activity activity, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) activity, "");
        activity.finish();
    }

    private final void a(final Activity activity, String str) {
        if (C8054ddD.l(activity)) {
            return;
        }
        new AlertDialog.Builder(activity, C9834xU.o.c).setCancelable(false).setMessage(str).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.Nh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1056Na.f(activity, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Activity activity, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) activity, "");
        C8054ddD.e((Context) activity);
    }

    private final void c(final Activity activity, String str) {
        if (C8054ddD.l(activity)) {
            return;
        }
        AlertDialog.Builder positiveButton = new AlertDialog.Builder(activity, C9834xU.o.c).setCancelable(false).setMessage(str).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.Ng
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1056Na.g(activity, dialogInterface, i);
            }
        });
        positiveButton.setNegativeButton(com.netflix.mediaclient.ui.R.o.cR, new DialogInterface.OnClickListener() { // from class: o.Ni
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1056Na.o(activity, dialogInterface, i);
            }
        });
        positiveButton.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Activity activity, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) activity, "");
        C8054ddD.e((Context) activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Activity activity, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) activity, "");
        Intent addFlags = DiagnosisActivity.b(activity).addFlags(268435456);
        C8632dsu.a(addFlags, "");
        activity.startActivity(addFlags);
        dialogInterface.dismiss();
        activity.finish();
    }

    private final void d(final NetflixActivity netflixActivity, String str, final boolean z) {
        if (C8054ddD.l(netflixActivity)) {
            return;
        }
        new AlertDialog.Builder(netflixActivity, C9834xU.o.c).setCancelable(false).setMessage(str).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.Nk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1056Na.d(z, netflixActivity, dialogInterface, i);
            }
        }).setNegativeButton(com.netflix.mediaclient.ui.R.o.dO, new DialogInterface.OnClickListener() { // from class: o.Nl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1056Na.e(NetflixActivity.this, dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(boolean z, NetflixActivity netflixActivity, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) netflixActivity, "");
        if (z) {
            C1044Mm.e("ServiceErrorsHandler", "killing service");
            C8054ddD.e((Context) netflixActivity);
            return;
        }
        netflixActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(NetflixActivity netflixActivity, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) netflixActivity, "");
        Intent d2 = InterfaceC8098ddv.a.e(netflixActivity).d((Context) netflixActivity);
        AppView uiScreen = netflixActivity.getUiScreen();
        if (uiScreen != null) {
            d2.putExtra(NetflixActivity.EXTRA_SOURCE, uiScreen.name());
        }
        d2.putExtra(NetflixActivity.EXTRA_ENTRY, "errorDialog");
        netflixActivity.startActivity(d2);
    }

    private final void b(final Activity activity) {
        if (C8054ddD.l(activity)) {
            return;
        }
        new AlertDialog.Builder(activity, C9834xU.o.c).setMessage(com.netflix.mediaclient.ui.R.o.gW).setPositiveButton(com.netflix.mediaclient.ui.R.o.gX, new DialogInterface.OnClickListener() { // from class: o.Nn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1056Na.h(activity, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o.No
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C1056Na.c(activity, dialogInterface);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Activity activity, DialogInterface dialogInterface, int i) {
        Throwable th;
        C8632dsu.c((Object) activity, "");
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW").setData(C8139dej.b.a(activity, "https://help.netflix.com/en/node/57688")));
        } catch (ActivityNotFoundException e) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            C1596aHd d2 = new C1596aHd(null, null, null, false, null, false, false, 127, null).d(e);
            ErrorType errorType = d2.a;
            if (errorType != null) {
                d2.e.put("errorType", errorType.c());
                String b2 = d2.b();
                if (b2 != null) {
                    String c2 = errorType.c();
                    d2.a(c2 + " " + b2);
                }
            }
            if (d2.b() != null && d2.i != null) {
                th = new Throwable(d2.b(), d2.i);
            } else if (d2.b() != null) {
                th = new Throwable(d2.b());
            } else {
                th = d2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(d2, th);
            } else {
                dVar.e().b(d2, th);
            }
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Activity activity, DialogInterface dialogInterface) {
        C8632dsu.c((Object) activity, "");
        activity.finish();
    }

    private static void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$352);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
