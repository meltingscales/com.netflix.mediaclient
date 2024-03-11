package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.util.Base64;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.ContextCompat;
import java.nio.charset.StandardCharsets;

/* renamed from: o.xl  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C9851xl {
    private static int R = 0;
    private static int S = 1;
    public static final int a;
    public static final b d;
    private static byte e$ss2$2844;
    private boolean A;
    private final View B;
    private Integer C;
    private Integer D;
    private boolean E;
    private boolean F;
    private CharSequence G;
    private boolean H;
    private int I;

    /* renamed from: J  reason: collision with root package name */
    private Float f13928J;
    private boolean K;
    private int L;
    private int M;
    private int N;
    private Boolean O;
    private Integer P;
    private boolean Q;
    private boolean b;
    private boolean c;
    private InterfaceC9757wS e;
    private final Context f;
    private Float g;
    private int h;
    private Drawable i;
    private boolean j;
    private Integer k;
    private int l;
    private int m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f13929o;
    private boolean p;
    private Integer q;
    private Boolean r;
    private int s;
    private int t;
    private InterfaceC9762wX u;
    private int v;
    private Float w;
    private int x;
    private InterfaceC9841xb y;
    private Drawable z;

    static {
        c();
        d = new b(null);
        a = 8;
    }

    static void c() {
        e$ss2$2844 = (byte) 24;
    }

    public final C9851xl a(int i, int i2, int i3, int i4) {
        this.x = i;
        this.v = i2;
        this.t = i3;
        this.s = i4;
        this.p = true;
        return this;
    }

    public final C9851xl b(CharSequence charSequence) {
        this.G = charSequence;
        return this;
    }

    public final C9851xl c(InterfaceC9841xb interfaceC9841xb) {
        C8632dsu.c((Object) interfaceC9841xb, "");
        this.y = interfaceC9841xb;
        return this;
    }

    public final C9851xl c(boolean z) {
        this.F = z;
        return this;
    }

    public final C9851xl d(Drawable drawable) {
        C8632dsu.c((Object) drawable, "");
        this.i = drawable;
        return this;
    }

    public final C9851xl d(InterfaceC9757wS interfaceC9757wS) {
        C8632dsu.c((Object) interfaceC9757wS, "");
        this.e = interfaceC9757wS;
        return this;
    }

    public final C9851xl d(boolean z) {
        this.E = z;
        return this;
    }

    public final C9851xl e(int i, int i2, int i3, int i4) {
        this.M = i;
        this.L = i2;
        this.N = i3;
        this.I = i4;
        this.K = true;
        return this;
    }

    public final C9851xl e(Drawable drawable) {
        this.z = drawable;
        this.A = true;
        return this;
    }

    public final C9851xl e(boolean z) {
        this.H = z;
        return this;
    }

    public final C9851xl h(boolean z) {
        this.Q = z;
        return this;
    }

    public C9851xl(Context context, View view) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) view, "");
        this.f = context;
        this.B = view;
        this.E = true;
        this.H = true;
    }

    /* renamed from: o.xl$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final boolean d(Context context) {
            C8632dsu.c((Object) context, "");
            Object systemService = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
        }
    }

    public final C9843xd a() {
        C9843xd c9843xd = new C9843xd(this.f, this.Q);
        if (this.A) {
            c9843xd.setScrimDrawable(this.z);
        }
        c9843xd.setTarget$widgetry_release(this.B);
        if (this.c) {
            Integer num = this.D;
            C8632dsu.d(num);
            c9843xd.setBackgroundColors(num.intValue(), this.C, this.j);
        }
        Float f = this.g;
        if (f != null) {
            c9843xd.setBgElevation(f.floatValue());
        }
        InterfaceC9841xb interfaceC9841xb = this.y;
        if (interfaceC9841xb != null) {
            c9843xd.setOnTooltipClickListener(interfaceC9841xb);
        }
        c9843xd.setTitle(this.G);
        Integer num2 = this.P;
        if (num2 != null) {
            c9843xd.setTitleTextColor(ContextCompat.getColor(this.f, num2.intValue()));
        }
        c9843xd.setIcon(this.i);
        c9843xd.setMessage(this.f13929o);
        Integer num3 = this.q;
        if (num3 != null) {
            c9843xd.setMessageTextColor(num3.intValue());
        }
        Float f2 = this.w;
        if (f2 != null) {
            c9843xd.setMessageTextSize(f2.floatValue());
        }
        Boolean bool = this.r;
        if (bool != null) {
            c9843xd.setCenterMessageText(bool.booleanValue());
        }
        if (this.b) {
            c9843xd.setContentMarginStart(this.l);
            c9843xd.setContentMarginTop(this.m);
            c9843xd.setContentMarginEnd(this.n);
            c9843xd.setContentMarginBottom(this.h);
        }
        Boolean bool2 = this.O;
        if (bool2 != null && bool2.booleanValue()) {
            c9843xd.setTooltipVerticalOrientation();
        }
        Float f3 = this.f13928J;
        if (f3 != null) {
            c9843xd.setTitleTextSize(f3.floatValue());
        }
        if (this.p) {
            c9843xd.setMessagePadding(this.x, this.v, this.t, this.s);
        }
        if (this.K) {
            c9843xd.setTitlePadding(this.M, this.L, this.N, this.I);
        }
        Integer num4 = this.k;
        if (num4 != null) {
            c9843xd.setTooltipMaxWidth(num4.intValue());
        }
        c9843xd.setConsumptionManager(this.e);
        c9843xd.setOnTooltipLayoutChangeListener(this.u);
        c9843xd.setTitleCentered(this.E);
        c9843xd.setTitleAllCaps(this.H);
        c9843xd.setTitleBold(this.F);
        return c9843xd;
    }

    public final C9851xl d(int i) {
        return e(this.f.getDrawable(i));
    }

    public final C9851xl b(int i, int i2, int i3, int i4) {
        return a(b(i), b(i2), b(i3), b(i4));
    }

    public final C9851xl b(boolean z) {
        this.r = Boolean.valueOf(z);
        return this;
    }

    public final C9851xl a(boolean z) {
        this.O = Boolean.valueOf(z);
        return this;
    }

    public final C9851xl a(Integer num) {
        Float f;
        if (num != null) {
            num.intValue();
            f = Float.valueOf(this.f.getResources().getDimension(num.intValue()));
        } else {
            f = null;
        }
        this.f13928J = f;
        return this;
    }

    public final C9851xl c(int i, int i2, int i3, int i4) {
        return e(b(i), b(i2), b(i3), b(i4));
    }

    private final int b(int i) {
        if (i == -1) {
            return 0;
        }
        return this.f.getResources().getDimensionPixelSize(i);
    }

    public final C9851xl a(int i, Integer num, boolean z) {
        Integer num2;
        this.D = Integer.valueOf(ContextCompat.getColor(this.f, i));
        if (num != null) {
            num.intValue();
            num2 = Integer.valueOf(ContextCompat.getColor(this.f, num.intValue()));
        } else {
            num2 = null;
        }
        this.C = num2;
        this.j = z;
        this.c = true;
        return this;
    }

    public final C9851xl a(CharSequence charSequence, Integer num, Integer num2) {
        Integer num3;
        C8632dsu.c((Object) charSequence, "");
        this.f13929o = charSequence;
        Float f = null;
        if (num != null) {
            num.intValue();
            num3 = Integer.valueOf(ContextCompat.getColor(this.f, num.intValue()));
        } else {
            num3 = null;
        }
        this.q = num3;
        if (num2 != null) {
            num2.intValue();
            f = Float.valueOf(this.f.getResources().getDimension(num2.intValue()));
        }
        this.w = f;
        return this;
    }

    public static /* synthetic */ C9851xl d(C9851xl c9851xl, int i, Integer num, Integer num2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                num = null;
            }
            if ((i2 & 4) != 0) {
                num2 = null;
            }
            return c9851xl.d(i, num, num2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMessage");
    }

    public final C9851xl d(int i, Integer num, Integer num2) {
        int i2 = 2 % 2;
        String string = this.f.getResources().getString(i);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            T(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i3 = S + 65;
            R = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 5;
            }
        }
        Spanned c = C8168dfL.c(string);
        C8632dsu.a(c, "");
        C9851xl a2 = a(c, num, num2);
        int i5 = S + 49;
        R = i5 % 128;
        if (i5 % 2 == 0) {
            return a2;
        }
        throw null;
    }

    public final C9851xl c(int i) {
        int i2 = 2 % 2;
        int i3 = S + 23;
        R = i3 % 128;
        if (i3 % 2 != 0) {
            this.f.getResources().getString(i).startsWith("'!#+");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String string = this.f.getResources().getString(i);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            T(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i4 = R + 97;
            S = i4 % 128;
            int i5 = i4 % 2;
        }
        return b(C8168dfL.c(string));
    }

    public final C9851xl e(int i) {
        this.P = Integer.valueOf(i);
        return this;
    }

    private void T(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$2844);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
