package com.netflix.mediaclient.ui.voip;

import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentSender;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.widget.ViewFlipper;
import androidx.appcompat.app.AlertDialog;
import com.netflix.android.widgetry.widget.tabs.BadgeView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.event.discrete.DebugEvent;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.service.api.core.ModuleInstallState;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.voip.VoIpModuleInstallScreen;
import java.nio.charset.StandardCharsets;
import o.AbstractApplicationC1040Mh;
import o.ActivityC8087ddk;
import o.C1044Mm;
import o.C1204Sr;
import o.C1332Xp;
import o.C1333Xq;
import o.C7350cuZ;
import o.C8054ddD;
import o.C8094ddr;
import o.C8157dfA;
import o.C8168dfL;
import o.C8187dfe;
import o.C9834xU;
import o.InterfaceC5090bsG;
import o.MP;
import o.aMN;
import o.aSV;
import o.bXA;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class VoIpModuleInstallScreen extends bXA {
    private static byte e$ss2$228 = 24;
    private static int f = 0;
    private static int h = 1;
    private BadgeView a;
    private AlertDialog b;
    private C1204Sr c;
    private C1204Sr e;
    private final ActivityC8087ddk g;
    private final ViewFlipper i;
    private ButtonState j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum ButtonState {
        START_DOWNLOAD,
        PROGRESS,
        ERROR
    }

    public void d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "screenDestroy");
            Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
        } catch (JSONException unused) {
        }
    }

    public VoIpModuleInstallScreen(ActivityC8087ddk activityC8087ddk) {
        super((aMN) C1332Xp.b(aMN.class));
        this.j = ButtonState.START_DOWNLOAD;
        this.g = activityC8087ddk;
        ViewFlipper viewFlipper = (ViewFlipper) activityC8087ddk.findViewById(C8094ddr.b.U);
        this.i = viewFlipper;
        this.a = (BadgeView) activityC8087ddk.findViewById(C8094ddr.b.X);
        this.c = (C1204Sr) activityC8087ddk.findViewById(C8094ddr.b.R);
        this.e = (C1204Sr) activityC8087ddk.findViewById(C8094ddr.b.H);
        if (this.d.c(aMN.d.c)) {
            C1044Mm.a("VoIpModuleInstall", "module is already installed");
            viewFlipper.showNext();
            return;
        }
        b();
        this.a.setOnClickListener(new View.OnClickListener() { // from class: o.ddo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoIpModuleInstallScreen.this.a(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.ui.voip.VoIpModuleInstallScreen$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ButtonState.values().length];
            c = iArr;
            try {
                iArr[ButtonState.START_DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[ButtonState.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[ButtonState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void b() {
        e();
        int i = AnonymousClass1.c[this.j.ordinal()];
        if (i == 1) {
            d(this.g.getActivityDestroy(), aMN.d.c);
        } else if (i != 3) {
        } else {
            String e = C8157dfA.e(this.g, "module_install_error", "");
            if (C8168dfL.h(e)) {
                b(e);
            } else {
                this.j = ButtonState.START_DOWNLOAD;
            }
        }
    }

    private void e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "downloadVoipModule");
            Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
        } catch (JSONException unused) {
        }
    }

    private void j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "voipModuleInstalled");
            Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
        } catch (JSONException unused) {
        }
    }

    private void c(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "voipModuleInstallError");
            jSONObject.put("errorCode", str);
            Logger.INSTANCE.logEvent(new DebugEvent(jSONObject));
        } catch (JSONException unused) {
        }
    }

    private void c() {
        j();
        this.a.setProgress(100);
        C8187dfe.a(new Runnable() { // from class: o.ddq
            @Override // java.lang.Runnable
            public final void run() {
                VoIpModuleInstallScreen.this.a();
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        if (C8054ddD.l(this.g)) {
            return;
        }
        this.i.showNext();
    }

    private void b(String str) {
        int i = 2 % 2;
        C8157dfA.a(this.g, "module_install_error", str);
        this.j = ButtonState.ERROR;
        c(str);
        this.c.setVisibility(4);
        this.a.setDisplayType(BadgeView.DisplayType.DRAWABLE);
        this.a.setDrawable(this.g.getDrawable(C7350cuZ.d.c));
        C1204Sr c1204Sr = this.e;
        int i2 = R.o.eL;
        Context context = c1204Sr.getContext();
        String string = context.getString(i2);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            k(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i2);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                string = spannableString;
            } else {
                int i3 = h + 121;
                f = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        c1204Sr.setText(string);
        AlertDialog alertDialog = this.b;
        if (alertDialog != null) {
            int i5 = f + 89;
            h = i5 % 128;
            int i6 = i5 % 2;
            alertDialog.dismiss();
            this.b = null;
            if (i6 == 0) {
                throw null;
            }
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.g, C9834xU.o.c);
        String string2 = this.g.getString(R.o.eL);
        if (!(!string2.startsWith("'!#+"))) {
            int i7 = f + NetflixImageView.DEFAULT_LAYER_GRAVITY;
            h = i7 % 128;
            int i8 = i7 % 2;
            String substring = string2.substring(4);
            Object[] objArr2 = new Object[1];
            k(substring, objArr2);
            string2 = ((String) objArr2[0]).intern();
            int i9 = h + 59;
            f = i9 % 128;
            int i10 = i9 % 2;
        }
        builder.setTitle(string2);
        builder.setMessage(C1333Xq.d(C8094ddr.i.p).d("errorCode", str).c());
        builder.setPositiveButton(R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.dds
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                dialogInterface.dismiss();
            }
        });
        builder.setNegativeButton(R.o.gE, new DialogInterface.OnClickListener() { // from class: o.ddp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                VoIpModuleInstallScreen.this.c(dialogInterface, i11);
            }
        });
        AlertDialog create = builder.create();
        this.b = create;
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        f();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d4, code lost:
        if ((r4 instanceof android.text.Spanned) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ee, code lost:
        if ((r4 instanceof android.text.Spanned) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f0, code lost:
        r7 = new android.text.SpannableString(r5);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r4, 0, r5.length(), java.lang.Object.class, r7, 0);
        r4 = com.netflix.mediaclient.ui.voip.VoIpModuleInstallScreen.f + 31;
        com.netflix.mediaclient.ui.voip.VoIpModuleInstallScreen.h = r4 % 128;
        r4 = r4 % 2;
        r11 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0112, code lost:
        r11 = r5;
     */
    @Override // o.bXA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(o.aMN.e r19) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.ui.voip.VoIpModuleInstallScreen.c(o.aMN$e):void");
    }

    private void d(ActivityC8087ddk activityC8087ddk, aMN.e eVar) {
        try {
            this.d.b(eVar, activityC8087ddk, MP.g);
        } catch (IntentSender.SendIntentException e) {
            b(b(e));
        }
    }

    @Override // o.bXA
    public void c(Throwable th) {
        c(ModuleInstallState.STATE_ON_ERROR.d(), b(th));
        b(b(th));
    }

    private void f() {
        this.j = ButtonState.START_DOWNLOAD;
        b();
    }

    private final void c(String str, String str2) {
        InterfaceC5090bsG e;
        IClientLogging f2 = AbstractApplicationC1040Mh.getInstance().i().f();
        if (f2 == null || (e = f2.e()) == null) {
            return;
        }
        e.a(new aSV(aMN.d.c, str).d(str2));
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$228);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
