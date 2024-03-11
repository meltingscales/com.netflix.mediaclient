package o;

import android.content.Context;
import android.util.Base64;
import com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen;
import java.nio.charset.StandardCharsets;
import o.C8028dce;
import o.C8029dcf;
import o.C9834xU;
import o.dpR;
import o.drO;

/* renamed from: o.dce  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8028dce extends MessagingTooltipScreen {
    public static final e a;
    public static final int e;
    private static byte e$ss2$1412 = 0;
    private static int l = 1;

    /* renamed from: o  reason: collision with root package name */
    private static int f13829o;
    private final boolean c;
    private final drO<dpR> g;
    private final String b = "CreateUserMarks";
    private final MessagingTooltipScreen.ScreenType m = MessagingTooltipScreen.ScreenType.b;
    private final int k = C9834xU.a.ak;
    private final MessagingTooltipScreen.Tooltip_Location f = MessagingTooltipScreen.Tooltip_Location.e;
    private final int n = C9834xU.a.af;
    private final MessagingTooltipScreen.e i = MessagingTooltipScreen.e.b.e;
    private final drO<dpR> h = new drO<dpR>() { // from class: com.netflix.mediaclient.ui.usermarks.impl.CreateUserMarksTutorialDialog$onAutoDismissed$1
        {
            super(0);
        }

        @Override // o.drO
        public /* synthetic */ dpR invoke() {
            a();
            return dpR.c;
        }

        public final void a() {
            drO dro;
            dro = C8028dce.this.g;
            if (dro != null) {
                dro.invoke();
            }
        }
    };

    static {
        w();
        a = new e(null);
        e = 8;
    }

    static void w() {
        e$ss2$1412 = (byte) 24;
    }

    @Override // o.AbstractC6677chn
    public String c() {
        return this.b;
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
    public boolean j() {
        return this.c;
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
    public MessagingTooltipScreen.e k() {
        return this.i;
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
    public MessagingTooltipScreen.Tooltip_Location l() {
        return this.f;
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
    public drO<dpR> p() {
        return this.h;
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
    public MessagingTooltipScreen.ScreenType r() {
        return this.m;
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
    public int s() {
        return this.n;
    }

    @Override // com.netflix.mediaclient.ui.messaging.api.MessagingTooltipScreen
    public int t() {
        return this.k;
    }

    /* renamed from: o.dce$e */
    /* loaded from: classes5.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }
    }

    public C8028dce(drO<dpR> dro) {
        this.g = dro;
    }

    @Override // o.bJF
    /* renamed from: a */
    public void d(InterfaceC2023aX interfaceC2023aX, Context context, dpR dpr) {
        int i = 2 % 2;
        C8632dsu.c((Object) interfaceC2023aX, "");
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) dpr, "");
        C3814bLq c3814bLq = new C3814bLq();
        c3814bLq.b((CharSequence) "create-user-mark-tooltip");
        c3814bLq.d(C8029dcf.c.d);
        String string = context.getString(C8029dcf.j.h);
        if (string.startsWith("'!#+")) {
            int i2 = l + 67;
            f13829o = i2 % 128;
            if (i2 % 2 != 0) {
                String substring = string.substring(4);
                Object[] objArr = new Object[1];
                u(substring, objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            u(string.substring(4), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        c3814bLq.d((CharSequence) string);
        interfaceC2023aX.add(c3814bLq);
    }

    private void u(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$1412);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
