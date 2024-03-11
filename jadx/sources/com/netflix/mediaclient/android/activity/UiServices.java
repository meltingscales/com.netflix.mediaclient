package com.netflix.mediaclient.android.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.Base64;
import android.widget.ImageView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.UiServices;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.login.api.LoginApi;
import com.netflix.mediaclient.ui.mdx2.MdxEventProducer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import javax.inject.Inject;
import o.AbstractApplicationC1040Mh;
import o.ActivityC4183bZh;
import o.C1044Mm;
import o.C1332Xp;
import o.C4000bSn;
import o.C5015bql;
import o.C8051ddA;
import o.C8082ddf;
import o.C8126deW;
import o.C8150deu;
import o.C8254dgs;
import o.InterfaceC1738aMk;
import o.InterfaceC1903aSn;
import o.InterfaceC5283bvo;
import o.InterfaceC5844cKl;
import o.ML;
import o.MN;
import o.RunnableC8122deS;
import o.aOZ;
import o.bMQ;
import o.bXE;
import o.cVB;

/* loaded from: classes3.dex */
public class UiServices implements InterfaceC1738aMk {
    private static int a = 1;
    private static int b = 0;
    private static byte e$ss2$254 = 24;
    @Inject
    public bMQ errorHandlerApi;
    @Inject
    public LoginApi loginApi;
    @Inject
    public InterfaceC5844cKl profile;

    @Override // o.InterfaceC1738aMk
    public Class c() {
        return NetflixService.class;
    }

    @Override // o.InterfaceC1738aMk
    public void a(Context context) {
        NetflixActivity.finishAllActivities(context);
    }

    @Override // o.InterfaceC1738aMk
    public void a(Context context, Intent intent) {
        ML.c(context, intent);
    }

    @Override // o.InterfaceC1738aMk
    public void d(Context context) {
        Intent e = this.loginApi.e(context);
        e.addFlags(268435456);
        context.startActivity(e);
    }

    @Override // o.InterfaceC1738aMk
    public Intent b(Context context) {
        return NetflixApplication.d(context).addFlags(268435456).putExtra(NetflixActivity.EXTRA_EXPAND_MDX_PLAYER, true);
    }

    @Override // o.InterfaceC1738aMk
    public Intent c(Context context) {
        return NetflixApplication.d(context).addFlags(268435456);
    }

    @Override // o.InterfaceC1738aMk
    public boolean b() {
        return C8082ddf.b();
    }

    @Override // o.InterfaceC1738aMk
    public aOZ d() {
        return MN.b;
    }

    @Override // o.InterfaceC1738aMk
    public void b(boolean z, boolean z2) {
        C8082ddf.a().b(z, z2);
    }

    @Override // o.InterfaceC1738aMk
    public int a(Context context, LoMoType loMoType) {
        return C4000bSn.b(context, loMoType);
    }

    @Override // o.InterfaceC1738aMk
    public Locale e(Context context) {
        return cVB.b(context);
    }

    @Override // o.InterfaceC1738aMk
    public void a(InterfaceC5283bvo interfaceC5283bvo) {
        BrowseExperience.e(interfaceC5283bvo);
    }

    @Override // o.InterfaceC1738aMk
    public InterfaceC1903aSn a() {
        return this.errorHandlerApi.a();
    }

    @Override // o.InterfaceC1738aMk
    public String c(UserAgent userAgent) {
        return userAgent.d();
    }

    @Override // o.InterfaceC1738aMk
    public Intent b(Context context, String str) {
        return ActivityC4183bZh.d(context, (AppView) null);
    }

    @Override // o.InterfaceC1738aMk
    public void c(ImageView imageView, Drawable drawable, Bitmap bitmap) {
        C8254dgs.a(imageView, drawable, bitmap);
    }

    @Override // o.InterfaceC1738aMk
    public void a(final Context context, final Handler handler, UserAgent userAgent, final Runnable runnable) {
        final Runnable runnable2 = new Runnable() { // from class: o.Nm
            @Override // java.lang.Runnable
            public final void run() {
                UiServices.a(context, runnable);
            }
        };
        handler.postDelayed(runnable2, 10000L);
        C5015bql c5015bql = new C5015bql() { // from class: com.netflix.mediaclient.android.activity.UiServices.3
            @Override // o.C5015bql, o.InterfaceC5018bqo
            public void b(String str, Status status) {
                RunnableC8122deS runnableC8122deS;
                handler.removeCallbacks(runnable2);
                if (status.j()) {
                    C1044Mm.e("nf_uiservices", "launchSeePlanOptions::created autologin token was success. Start URL with token");
                    runnableC8122deS = new RunnableC8122deS(context, C8051ddA.c("https://www.netflix.com/changeplan", str));
                } else {
                    C1044Mm.j("nf_uiservices", "launchSeePlanOptions::created autologin token was failure. Start URL without token");
                    runnableC8122deS = new RunnableC8122deS(context, "https://www.netflix.com/changeplan");
                }
                handler.post(runnableC8122deS);
                Runnable runnable3 = runnable;
                if (runnable3 != null) {
                    handler.postDelayed(runnable3, 5000L);
                }
            }
        };
        C1044Mm.e("nf_uiservices", "launchSeePlanOptions::create autologin token...");
        userAgent.c(3600000L, c5015bql);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, Runnable runnable) {
        C1044Mm.e("nf_uiservices", "launchSeePlanOptions::timeout");
        context.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("https://www.netflix.com/changeplan")));
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // o.InterfaceC1738aMk
    public String e() {
        int i = 2 % 2;
        int i2 = a + 69;
        b = i2 % 128;
        int i3 = i2 % 2;
        Context d = AbstractApplicationC1040Mh.d();
        String string = d.getString(R.o.ay);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            f(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i4 = b + 81;
            a = i4 % 128;
            int i5 = i4 % 2;
        }
        if (C8150deu.h()) {
            String string2 = d.getString(R.o.ax);
            if (string2.startsWith("'!#+")) {
                Object[] objArr2 = new Object[1];
                f(string2.substring(4), objArr2);
                string2 = ((String) objArr2[0]).intern();
            }
            return string2;
        }
        return string;
    }

    @Override // o.InterfaceC1738aMk
    public void b(String str) {
        MdxEventProducer.d(str);
    }

    @Override // o.InterfaceC1738aMk
    public void e(String str) {
        MdxEventProducer.b(str);
    }

    @Override // o.InterfaceC1738aMk
    public void h() {
        Context context = (Context) C1332Xp.b(Context.class);
        ((bXE) C1332Xp.b(bXE.class)).a(C8126deW.e(context) ? cVB.b(context) : null);
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$254);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
