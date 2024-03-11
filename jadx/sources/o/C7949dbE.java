package o;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import o.C7939dav;

/* renamed from: o.dbE  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7949dbE extends LinearLayout {
    private static byte e$ss2$136 = 24;
    private static int g = 0;
    private static int i = 1;
    private CountDownTimer a;
    private boolean b;
    private final long c;
    private long d;
    private final C7979dbi e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7949dbE(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7949dbE(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C7949dbE(Context context, AttributeSet attributeSet, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7949dbE(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C8632dsu.c((Object) context, "");
        this.c = TimeUnit.DAYS.toMillis(7L);
        setOrientation(0);
        C7979dbi a = C7979dbi.a(LayoutInflater.from(context), this);
        C8632dsu.a(a, "");
        this.e = a;
        c(this.d);
        int i3 = C7939dav.i.h;
        String string = context.getString(i3);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            f(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i3);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                int i4 = g + 19;
                i = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                string = spannableString;
            } else {
                int i7 = i + 71;
                g = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 2;
                }
            }
        }
        setContentDescription(string);
    }

    public final void setTimeInMs(long j) {
        long e;
        a();
        this.d = j;
        e = C8657dts.e(j - System.currentTimeMillis(), 0L);
        c(e);
    }

    public final void c() {
        long e;
        CountDownTimer countDownTimer = this.a;
        if (countDownTimer != null && countDownTimer != null) {
            countDownTimer.cancel();
        }
        e = C8657dts.e(this.d - System.currentTimeMillis(), 0L);
        this.a = new b(e, this).start();
    }

    /* renamed from: o.dbE$b */
    /* loaded from: classes5.dex */
    public static final class b extends CountDownTimer {
        final /* synthetic */ C7949dbE e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j, C7949dbE c7949dbE) {
            super(j, 1000L);
            this.e = c7949dbE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.e.c(j);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.e.a = null;
        }
    }

    public final void a() {
        CountDownTimer countDownTimer = this.a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            a();
            this.b = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b) {
            c();
            this.b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(long j) {
        if (this.d > 0 && j < this.c) {
            C1204Sr c1204Sr = this.e.f13825o;
            C8632dsu.a(c1204Sr, "");
            c1204Sr.setVisibility(8);
            ConstraintLayout constraintLayout = this.e.a;
            C8632dsu.a(constraintLayout, "");
            constraintLayout.setVisibility(0);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (timeUnit.toDays(j) < 1) {
                C1204Sr c1204Sr2 = this.e.d;
                dsE dse = dsE.b;
                String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j))}, 1));
                C8632dsu.a(format, "");
                c1204Sr2.setText(format);
                this.e.i.setText(getContext().getText(C7939dav.i.r));
                C1204Sr c1204Sr3 = this.e.e;
                long j2 = 60;
                String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toMinutes(j) % j2)}, 1));
                C8632dsu.a(format2, "");
                c1204Sr3.setText(format2);
                this.e.g.setText(getContext().getText(C7939dav.i.t));
                C1204Sr c1204Sr4 = this.e.f;
                String format3 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toSeconds(j) % j2)}, 1));
                C8632dsu.a(format3, "");
                c1204Sr4.setText(format3);
                this.e.m.setText(getContext().getText(C7939dav.i.p));
                return;
            }
            C1204Sr c1204Sr5 = this.e.d;
            dsE dse2 = dsE.b;
            String format4 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toDays(j))}, 1));
            C8632dsu.a(format4, "");
            c1204Sr5.setText(format4);
            this.e.i.setText(getContext().getText(C7939dav.i.n));
            C1204Sr c1204Sr6 = this.e.e;
            String format5 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j) % 24)}, 1));
            C8632dsu.a(format5, "");
            c1204Sr6.setText(format5);
            this.e.g.setText(getContext().getText(C7939dav.i.r));
            C1204Sr c1204Sr7 = this.e.f;
            String format6 = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf((timeUnit.toMinutes(j) % 60) + 1)}, 1));
            C8632dsu.a(format6, "");
            c1204Sr7.setText(format6);
            this.e.m.setText(getContext().getText(C7939dav.i.t));
            return;
        }
        this.e.f13825o.setText(getContext().getText(C7939dav.i.h));
        C1204Sr c1204Sr8 = this.e.f13825o;
        C8632dsu.a(c1204Sr8, "");
        c1204Sr8.setVisibility(0);
        ConstraintLayout constraintLayout2 = this.e.a;
        C8632dsu.a(constraintLayout2, "");
        constraintLayout2.setVisibility(8);
    }

    private static void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$136);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
