package o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import com.netflix.model.leafs.ArtworkColors;
import o.C9834xU;

/* renamed from: o.yB  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9868yB {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] a$s58$1317 = null;
    public static final b b;
    public static final int c;
    private static final float d;
    private static final float e;
    private static int r = 0;
    private static int s = 1;
    private Integer a;
    private String f;
    private final int g;
    private final Paint h;
    private int[] i;
    private final int j;
    private final float k;
    private Rect l;
    private final Paint m;
    private Float n;

    /* renamed from: o  reason: collision with root package name */
    private final int f13930o;
    private final float t;

    static void d() {
        a$s58$1317 = new char[]{12907};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C9868yB(android.content.Context r10, int r11, int r12, int r13, float r14, float r15, int r16, o.C8627dsp r17) {
        /*
            r9 = this;
            r0 = r16 & 16
            r1 = 2
            if (r0 == 0) goto L15
            int r0 = o.C9868yB.s
            int r0 = r0 + 121
            int r2 = r0 % 128
            o.C9868yB.r = r2
            int r0 = r0 % r1
            int r0 = r1 % r1
            r0 = -1107967345(0xffffffffbdf5c28f, float:-0.12)
            r7 = r0
            goto L16
        L15:
            r7 = r14
        L16:
            r0 = r16 & 32
            if (r0 == 0) goto L28
            int r0 = o.C9868yB.s
            int r0 = r0 + 51
            int r2 = r0 % 128
            o.C9868yB.r = r2
            int r0 = r0 % r1
            float r0 = o.C9868yB.e
            int r1 = r1 % r1
            r8 = r0
            goto L29
        L28:
            r8 = r15
        L29:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9868yB.<init>(android.content.Context, int, int, int, float, float, int, o.dsp):void");
    }

    /* renamed from: o.yB$b */
    /* loaded from: classes2.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("Top10Painter");
        }
    }

    public C9868yB(Context context, int i, int i2, int i3, float f, float f2) {
        C8632dsu.c((Object) context, "");
        this.f13930o = i;
        this.j = i2;
        this.g = i3;
        this.t = f;
        this.k = f2;
        this.l = new Rect();
        Paint paint = new Paint(1);
        this.m = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        C1332Xp c1332Xp = C1332Xp.b;
        this.i = new int[]{ContextCompat.getColor((Context) C1332Xp.b(Context.class), C9834xU.c.i)};
        Typeface e2 = C1336Xt.e((Activity) C9737vz.b(context, Activity.class));
        paint.setColor(ContextCompat.getColor((Context) C1332Xp.b(Context.class), C9834xU.c.q));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f2);
        float f3 = d;
        paint.setTextSize(f3);
        paint.setTypeface(e2);
        paint.setLetterSpacing(f);
        int[] iArr = this.i;
        paint2.setColor(iArr.length == 1 ? iArr[0] : ArtworkColors.DEFAULT_BACKGROUND_COLOR);
        paint2.setTextSize(f3);
        paint2.setTypeface(e2);
        paint2.setLetterSpacing(f);
        if (!C8120deQ.a()) {
            int i4 = s + 11;
            r = i4 % 128;
            if (i4 % 2 != 0) {
                paint.setShadowLayer(i, i2, i3, paint.getColor());
                throw null;
            } else {
                paint.setShadowLayer(i, i2, i3, paint.getColor());
                int i5 = 2 % 2;
            }
        }
        int i6 = r + 117;
        s = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int c() {
        int i = 2 % 2;
        if (this.f == null) {
            throw new IllegalStateException("You must call setTextToDraw before calling getTextWidth");
        }
        int i2 = s + 109;
        r = i2 % 128;
        int i3 = i2 % 2;
        int ceil = (int) Math.ceil(this.l.width() + (this.k * 2));
        int i4 = r + 87;
        s = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return ceil;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = r4.l.height() / (r4.k + 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = r4.l.height() + (r4.k * 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        return (int) java.lang.Math.ceil(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        throw new java.lang.IllegalStateException("You must call setTextToDraw before calling getTextHeight");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r4.f != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r4.f != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        r1 = r1 + 97;
        o.C9868yB.r = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C9868yB.s
            int r2 = r1 + 105
            int r3 = r2 % 128
            o.C9868yB.r = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            java.lang.String r2 = r4.f
            r3 = 50
            int r3 = r3 / 0
            if (r2 == 0) goto L47
            goto L1b
        L17:
            java.lang.String r2 = r4.f
            if (r2 == 0) goto L47
        L1b:
            int r1 = r1 + 97
            int r2 = r1 % 128
            o.C9868yB.r = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L33
            android.graphics.Rect r0 = r4.l
            int r0 = r0.height()
            float r0 = (float) r0
            float r1 = r4.k
            r2 = 3
            float r2 = (float) r2
            float r1 = r1 + r2
            float r0 = r0 / r1
            double r0 = (double) r0
            goto L40
        L33:
            android.graphics.Rect r1 = r4.l
            int r1 = r1.height()
            float r1 = (float) r1
            float r2 = r4.k
            float r0 = (float) r0
            float r2 = r2 * r0
            float r1 = r1 + r2
            double r0 = (double) r1
        L40:
            double r0 = java.lang.Math.ceil(r0)
            float r0 = (float) r0
            int r0 = (int) r0
            return r0
        L47:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must call setTextToDraw before calling getTextHeight"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9868yB.e():int");
    }

    private final void c(int i, String str) {
        Paint paint;
        int length;
        Rect rect;
        int i2;
        int i3 = 2 % 2;
        int i4 = r + 9;
        int i5 = i4 % 128;
        s = i5;
        int i6 = i4 % 2;
        if (this.n == null) {
            int i7 = i5 + 75;
            r = i7 % 128;
            if (i7 % 2 != 0) {
                this.a = Integer.valueOf(i);
                b(this.l, i);
                paint = this.m;
                length = str.length();
                rect = this.l;
                i2 = 1;
            } else {
                this.a = Integer.valueOf(i);
                b(this.l, i);
                paint = this.m;
                length = str.length();
                rect = this.l;
                i2 = 0;
            }
            paint.getTextBounds(str, i2, length, rect);
            int i8 = r + 121;
            s = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C9868yB.s
            int r1 = r1 + 85
            int r2 = r1 % 128
            o.C9868yB.r = r2
            int r1 = r1 % r0
            int r1 = r7.length()
            r2 = 0
            r3 = 1
            if (r1 <= r3) goto L41
            byte[] r1 = new byte[r3]
            r1[r2] = r2
            r4 = 83
            int[] r4 = new int[]{r2, r3, r4, r3}
            java.lang.Object[] r5 = new java.lang.Object[r3]
            p(r3, r1, r4, r5)
            r1 = r5[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r3 = 0
            boolean r7 = o.C8684dus.c(r7, r1, r2, r0, r3)
            if (r7 == 0) goto L41
            android.graphics.Paint r7 = r6.m
            float r1 = r6.t
            r7.setLetterSpacing(r1)
            android.graphics.Paint r7 = r6.h
            float r1 = r6.t
            r7.setLetterSpacing(r1)
            goto L4c
        L41:
            android.graphics.Paint r7 = r6.m
            r1 = 0
            r7.setLetterSpacing(r1)
            android.graphics.Paint r7 = r6.h
            r7.setLetterSpacing(r1)
        L4c:
            int r7 = o.C9868yB.s
            int r7 = r7 + 33
            int r1 = r7 % 128
            o.C9868yB.r = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L5a
            r7 = 44
            int r7 = r7 / r2
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9868yB.c(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r5 != r1.intValue()) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C9868yB.s
            int r1 = r1 + 21
            int r2 = r1 % 128
            o.C9868yB.r = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            o.C8632dsu.c(r6, r1)
            java.lang.Integer r1 = r4.a
            if (r1 != 0) goto L1f
            int r1 = o.C9868yB.s
            int r1 = r1 + 73
            int r2 = r1 % 128
            o.C9868yB.r = r2
            int r1 = r1 % r0
            goto L25
        L1f:
            int r0 = r1.intValue()
            if (r5 == r0) goto L34
        L25:
            android.graphics.Paint r0 = r4.m
            float r1 = o.C9868yB.d
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r4.h
            r0.setTextSize(r1)
            r0 = 0
            r4.n = r0
        L34:
            r4.f = r6
            r4.c(r6)
            android.graphics.Paint r0 = r4.m
            int r1 = r6.length()
            android.graphics.Rect r2 = r4.l
            r3 = 0
            r0.getTextBounds(r6, r3, r1, r2)
            r4.c(r5, r6)
            r4.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9868yB.d(int, java.lang.String):void");
    }

    public final void a(int[] iArr) {
        int i = 2 % 2;
        int i2 = s + 9;
        r = i2 % 128;
        if (i2 % 2 == 0) {
            C8632dsu.c((Object) iArr, "");
            this.i = iArr;
            b();
            return;
        }
        C8632dsu.c((Object) iArr, "");
        this.i = iArr;
        b();
        throw null;
    }

    private final void b(Rect rect, int i) {
        int i2 = 2 % 2;
        int i3 = s + 95;
        r = i3 % 128;
        int i4 = i3 % 2;
        Float valueOf = Float.valueOf((d * i) / rect.height());
        float floatValue = valueOf.floatValue();
        this.m.setTextSize(floatValue - this.k);
        this.h.setTextSize(floatValue - this.k);
        this.n = valueOf;
        int i5 = s + 83;
        r = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r12.i.length > 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r12.i.length > 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        r2 = new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, r12.l.height(), r12.i, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b() {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C9868yB.r
            int r1 = r1 + 87
            int r2 = r1 % 128
            o.C9868yB.s = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L18
            android.graphics.Paint r1 = r12.h
            int[] r4 = r12.i
            int r4 = r4.length
            if (r4 <= r2) goto L35
            goto L1f
        L18:
            android.graphics.Paint r1 = r12.h
            int[] r4 = r12.i
            int r4 = r4.length
            if (r4 <= r2) goto L35
        L1f:
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            r5 = 0
            r6 = 0
            r7 = 0
            android.graphics.Rect r4 = r12.l
            int r4 = r4.height()
            float r8 = (float) r4
            int[] r9 = r12.i
            r10 = 0
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.CLAMP
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L36
        L35:
            r2 = r3
        L36:
            r1.setShader(r2)
            int r1 = o.C9868yB.s
            int r1 = r1 + 103
            int r2 = r1 % 128
            o.C9868yB.r = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L45
            return
        L45:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9868yB.b():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (o.C8632dsu.c((java.lang.Object) r1, (java.lang.Object) ((java.lang.String) r6[0]).intern()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
        r2 = o.C9868yB.s;
        r4 = r2 + 75;
        o.C9868yB.r = r4 % 128;
        r4 = r4 % 2;
        r9 = r9 - (r7.k * 2);
        r2 = r2 + 45;
        o.C9868yB.r = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
        r8.drawText(r1, r9, r10 - r7.k, r7.m);
        r8.drawText(r1, r9, r10 - r7.k, r7.h);
        r8 = o.C9868yB.r + 107;
        o.C9868yB.s = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
        if ((r8 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
        r8 = 49 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
        throw new java.lang.IllegalStateException("You must call setTextToDraw before calling drawText");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        r6 = new java.lang.Object[1];
        p(true, new byte[]{0}, new int[]{0, 1, 83, 1}, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Canvas r8, float r9, float r10) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C9868yB.r
            int r1 = r1 + 117
            int r2 = r1 % 128
            o.C9868yB.s = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            if (r1 != 0) goto L1c
            o.C8632dsu.c(r8, r2)
            java.lang.String r1 = r7.f
            r2 = 22
            int r2 = r2 / r3
            if (r1 == 0) goto L76
            goto L23
        L1c:
            o.C8632dsu.c(r8, r2)
            java.lang.String r1 = r7.f
            if (r1 == 0) goto L76
        L23:
            r2 = 1
            byte[] r4 = new byte[r2]
            r4[r3] = r3
            r5 = 83
            int[] r5 = new int[]{r3, r2, r5, r2}
            java.lang.Object[] r6 = new java.lang.Object[r2]
            p(r2, r4, r5, r6)
            r2 = r6[r3]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            boolean r2 = o.C8632dsu.c(r1, r2)
            if (r2 == 0) goto L56
            int r2 = o.C9868yB.s
            int r4 = r2 + 75
            int r5 = r4 % 128
            o.C9868yB.r = r5
            int r4 = r4 % r0
            float r4 = r7.k
            float r5 = (float) r0
            float r4 = r4 * r5
            float r9 = r9 - r4
            int r2 = r2 + 45
            int r4 = r2 % 128
            o.C9868yB.r = r4
            int r2 = r2 % r0
        L56:
            float r2 = r7.k
            android.graphics.Paint r4 = r7.m
            float r2 = r10 - r2
            r8.drawText(r1, r9, r2, r4)
            float r2 = r7.k
            android.graphics.Paint r4 = r7.h
            float r10 = r10 - r2
            r8.drawText(r1, r9, r10, r4)
            int r8 = o.C9868yB.r
            int r8 = r8 + 107
            int r9 = r8 % 128
            o.C9868yB.s = r9
            int r8 = r8 % r0
            if (r8 != 0) goto L75
            r8 = 49
            int r8 = r8 / r3
        L75:
            return
        L76:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "You must call setTextToDraw before calling drawText"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9868yB.b(android.graphics.Canvas, float, float):void");
    }

    static {
        d();
        b = new b(null);
        c = 8;
        C1332Xp c1332Xp = C1332Xp.b;
        e = (int) TypedValue.applyDimension(1, 2, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        d = (int) TypedValue.applyDimension(1, 20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        int i = r + 75;
        s = i % 128;
        if (i % 2 == 0) {
            int i2 = 48 / 0;
        }
    }

    private static void p(boolean z, byte[] bArr, int[] iArr, Object[] objArr) {
        int i = 2 % 2;
        C9584sQ c9584sQ = new C9584sQ();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = a$s58$1317;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr2[i6] = (char) (cArr[i6] ^ (-1938542877577235927L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            c9584sQ.c = 0;
            char c2 = 0;
            while (c9584sQ.c < i3) {
                if (bArr[c9584sQ.c] == 1) {
                    int i7 = $11 + 37;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr4[c9584sQ.c] = (char) (((cArr3[c9584sQ.c] * 2) + 1) - c2);
                } else {
                    cArr4[c9584sQ.c] = (char) ((cArr3[c9584sQ.c] * 2) - c2);
                }
                c2 = cArr4[c9584sQ.c];
                c9584sQ.c++;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i9 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i9, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i9);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            c9584sQ.c = 0;
            while (c9584sQ.c < i3) {
                cArr6[c9584sQ.c] = cArr3[(i3 - c9584sQ.c) - 1];
                c9584sQ.c++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i10 = $11 + 3;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            c9584sQ.c = 0;
            while (c9584sQ.c < i3) {
                cArr3[c9584sQ.c] = (char) (cArr3[c9584sQ.c] - iArr[2]);
                c9584sQ.c++;
            }
        }
        String str = new String(cArr3);
        int i12 = $10 + 65;
        $11 = i12 % 128;
        if (i12 % 2 != 0) {
            objArr[0] = str;
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
