package o;

import android.content.Context;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C1030Lx;
import o.C6956cnA;

/* renamed from: o.cog  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7040cog extends AbstractC3336ax<d> {
    private static byte e$ss2$145 = 24;
    private static int h = 1;
    private static int j;
    private Integer b;
    private View.OnClickListener c;
    private boolean d;
    private Integer f;

    @Override // o.AbstractC3073as
    public int a() {
        return C6956cnA.b.i;
    }

    public final void a(Integer num) {
        this.b = num;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void d(Integer num) {
        this.f = num;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final Integer i() {
        return this.b;
    }

    public final View.OnClickListener l() {
        return this.c;
    }

    public final boolean n() {
        return this.d;
    }

    public final Integer o() {
        return this.f;
    }

    /* renamed from: o.cog$e */
    /* loaded from: classes4.dex */
    public static final class e extends AccessibilityDelegateCompat {
        final /* synthetic */ Context a;
        final /* synthetic */ AbstractC7040cog c;

        e(Context context, AbstractC7040cog abstractC7040cog) {
            this.a = context;
            this.c = abstractC7040cog;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) accessibilityNodeInfoCompat, "");
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setRoleDescription(this.a.getResources().getString(C6956cnA.c.f));
            accessibilityNodeInfoCompat.setSelected(this.c.n());
        }
    }

    /* renamed from: o.cog$d */
    /* loaded from: classes4.dex */
    public static class d extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(d.class, "baseView", "getBaseView()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(d.class, "titleView", "getTitleView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "selectedView", "getSelectedView()Landroid/widget/ImageView;", 0))};
        public static final int b = 8;
        private final dsZ e = bIF.d(this, C6956cnA.e.v, false, 2, null);
        private final dsZ c = bIF.d(this, C6956cnA.e.y, false, 2, null);
        private final dsZ d = bIF.d(this, C6956cnA.e.u, false, 2, null);

        public final View a() {
            return (View) this.e.getValue(this, a[0]);
        }

        public final C1204Sr b() {
            return (C1204Sr) this.c.getValue(this, a[1]);
        }

        public final ImageView d() {
            return (ImageView) this.d.getValue(this, a[2]);
        }
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(d dVar) {
        String str;
        int i = 2 % 2;
        C8632dsu.c((Object) dVar, "");
        Context context = dVar.a().getContext();
        dVar.b().setTextColor(ContextCompat.getColor(context, this.d ? C1030Lx.d.c : C1030Lx.d.d));
        C1204Sr b = dVar.b();
        Integer num = this.f;
        String str2 = null;
        int i2 = 4;
        boolean z = false;
        if (num != null) {
            int i3 = h + 97;
            j = i3 % 128;
            int i4 = i3 % 2;
            str = context.getResources().getString(num.intValue());
            if (str.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                k(str.substring(4), objArr);
                str = ((String) objArr[0]).intern();
            }
        } else {
            str = null;
        }
        b.setText(str);
        C1204Sr b2 = dVar.b();
        Integer num2 = this.b;
        if (num2 != null) {
            int i5 = j + 77;
            h = i5 % 128;
            int i6 = i5 % 2;
            String string = context.getResources().getString(num2.intValue());
            if (!(!string.startsWith("'!#+"))) {
                Object[] objArr2 = new Object[1];
                k(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
            }
            str2 = string;
        }
        b2.setContentDescription(str2);
        ImageView d2 = dVar.d();
        if (!this.d) {
            int i7 = j + NetflixImageView.DEFAULT_LAYER_GRAVITY;
            h = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = 0;
        }
        d2.setVisibility(i2);
        View a = dVar.a();
        View.OnClickListener onClickListener = this.c;
        a.setOnClickListener(onClickListener);
        if (onClickListener != null) {
            int i9 = h + 89;
            j = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        }
        a.setClickable(z);
        ViewCompat.setAccessibilityDelegate(dVar.a(), new e(context, this));
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$145);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
