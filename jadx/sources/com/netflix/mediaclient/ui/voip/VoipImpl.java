package com.netflix.mediaclient.ui.voip;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.IVoip;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.voip.VoipImpl;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.nio.charset.StandardCharsets;
import o.ActivityC8087ddk;
import o.C1163Rc;
import o.C8084ddh;
import o.C8094ddr;
import o.C8100ddx;
import o.C8627dsp;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC1905aSp;
import o.InterfaceC5074brr;
import o.InterfaceC5107bsX;
import o.InterfaceC8098ddv;

/* loaded from: classes5.dex */
public final class VoipImpl implements InterfaceC8098ddv {
    private static int b = 1;
    public static final e c;
    private static int e;
    private static byte e$ss2$132;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface VoipModule {
        @Binds
        InterfaceC8098ddv a(VoipImpl voipImpl);
    }

    static {
        a();
        c = new e(null);
    }

    static void a() {
        e$ss2$132 = (byte) 24;
    }

    /* loaded from: classes5.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    @Override // o.InterfaceC8098ddv
    public Intent d(Context context) {
        C8632dsu.c((Object) context, "");
        Intent a = ActivityC8087ddk.a(context);
        C8632dsu.a(a, "");
        return a;
    }

    private final Intent b(Context context) {
        Intent putExtra = ActivityC8087ddk.c(context).putExtra(NetflixActivity.EXTRA_SOURCE, "contactUs");
        C8632dsu.a(putExtra, "");
        return putExtra;
    }

    @Override // o.InterfaceC8098ddv
    public boolean a(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return activity instanceof ActivityC8087ddk;
    }

    @Override // o.InterfaceC8098ddv
    public boolean d(Activity activity) {
        IVoip y;
        C8632dsu.c((Object) activity, "");
        InterfaceC5107bsX interfaceC5107bsX = (InterfaceC5107bsX) activity;
        return interfaceC5107bsX.isServiceManagerReady() && (y = interfaceC5107bsX.getServiceManager().y()) != null && y.g() && !a(activity);
    }

    @Override // o.InterfaceC8098ddv
    public InterfaceC5074brr a(Context context) {
        C8632dsu.c((Object) context, "");
        return new C8084ddh(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(VoipImpl voipImpl, Context context) {
        C8632dsu.c((Object) voipImpl, "");
        C8632dsu.c((Object) context, "");
        context.startActivity(voipImpl.b(context));
    }

    @Override // o.InterfaceC8098ddv
    public InterfaceC1905aSp a(final Context context, Runnable runnable) {
        int i = 2 % 2;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) runnable, "");
        String string = context.getString(C8094ddr.i.h);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            f(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        String str = string;
        C8632dsu.a(str, "");
        String string2 = context.getString(C8094ddr.i.i);
        if (!(!string2.startsWith("'!#+"))) {
            Object[] objArr2 = new Object[1];
            f(string2.substring(4), objArr2);
            string2 = ((String) objArr2[0]).intern();
            int i2 = e + 3;
            b = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 2;
            }
        }
        String str2 = string2;
        C8632dsu.a(str2, "");
        Runnable runnable2 = new Runnable() { // from class: o.ddu
            @Override // java.lang.Runnable
            public final void run() {
                VoipImpl.a(VoipImpl.this, context);
            }
        };
        String string3 = context.getString(C9834xU.h.f);
        if (string3.startsWith("'!#+")) {
            int i4 = b + 91;
            e = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr3 = new Object[1];
            f(string3.substring(4), objArr3);
            string3 = ((String) objArr3[0]).intern();
        }
        String str3 = string3;
        String string4 = context.getString(R.o.cL);
        if (string4.startsWith("'!#+")) {
            int i6 = e + 25;
            b = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr4 = new Object[1];
            f(string4.substring(4), objArr4);
            string4 = ((String) objArr4[0]).intern();
        }
        return new C8100ddx(new C1163Rc.e(str2, str, str3, runnable2, string4, runnable));
    }

    @Override // o.InterfaceC8098ddv
    public View a(Activity activity, ViewGroup viewGroup) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) viewGroup, "");
        LayoutInflater.from(activity).inflate(C8094ddr.a.b, viewGroup, true);
        return viewGroup.findViewById(C8094ddr.b.a);
    }

    @Override // o.InterfaceC8098ddv
    public int e(Context context) {
        C8632dsu.c((Object) context, "");
        return context.getResources().getDimensionPixelSize(C8094ddr.d.d);
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$132);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
