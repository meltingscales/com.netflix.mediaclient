package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.Layer;
import com.netflix.android.org.json.HTTP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.dZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7890dZ extends AbstractC7877dM {
    private AbstractC5913cN<Float, Float> A;
    private AbstractC5913cN<Typeface, Typeface> B;
    private final C3658bG f;
    private final LongSparseArray<String> h;
    private AbstractC5913cN<Integer, Integer> i;
    private AbstractC5913cN<Integer, Integer> j;
    private final Matrix k;
    private final LottieDrawable l;
    private final RectF m;
    private final Paint n;

    /* renamed from: o  reason: collision with root package name */
    private final Map<C8422dl, List<C7483cx>> f13817o;
    private final Paint p;
    private AbstractC5913cN<Integer, Integer> q;
    private AbstractC5913cN<Float, Float> r;
    private AbstractC5913cN<Integer, Integer> s;
    private final StringBuilder t;
    private final C6212cY u;
    private AbstractC5913cN<Float, Float> v;
    private AbstractC5913cN<Float, Float> w;
    private final List<e> x;
    private AbstractC5913cN<Float, Float> y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7890dZ(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        C8557dq c8557dq;
        C8557dq c8557dq2;
        C8530dp c8530dp;
        C8530dp c8530dp2;
        this.t = new StringBuilder(2);
        this.m = new RectF();
        this.k = new Matrix();
        this.n = new Paint(1) { // from class: o.dZ.2
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.p = new Paint(1) { // from class: o.dZ.4
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.f13817o = new HashMap();
        this.h = new LongSparseArray<>();
        this.x = new ArrayList();
        this.l = lottieDrawable;
        this.f = layer.b();
        C6212cY b = layer.t().b();
        this.u = b;
        b.b(this);
        c(b);
        C8800dz q = layer.q();
        if (q != null && (c8530dp2 = q.e) != null) {
            AbstractC5913cN<Integer, Integer> b2 = c8530dp2.b();
            this.i = b2;
            b2.b(this);
            c(this.i);
        }
        if (q != null && (c8530dp = q.c) != null) {
            AbstractC5913cN<Integer, Integer> b3 = c8530dp.b();
            this.q = b3;
            b3.b(this);
            c(this.q);
        }
        if (q != null && (c8557dq2 = q.a) != null) {
            AbstractC5913cN<Float, Float> b4 = c8557dq2.b();
            this.r = b4;
            b4.b(this);
            c(this.r);
        }
        if (q == null || (c8557dq = q.d) == null) {
            return;
        }
        AbstractC5913cN<Float, Float> b5 = c8557dq.b();
        this.w = b5;
        b5.b(this);
        c(this.w);
    }

    @Override // o.AbstractC7877dM, o.InterfaceC7271ct
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f.c().width(), this.f.c().height());
    }

    @Override // o.AbstractC7877dM
    void a(Canvas canvas, Matrix matrix, int i) {
        DocumentData g = this.u.g();
        C8315di c8315di = this.f.j().get(g.d);
        if (c8315di == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        b(g, matrix);
        if (this.l.useTextGlyphs()) {
            d(g, matrix, c8315di, canvas);
        } else {
            c(g, c8315di, canvas);
        }
        canvas.restore();
    }

    private void b(DocumentData documentData, Matrix matrix) {
        AbstractC5913cN<Integer, Integer> abstractC5913cN = this.j;
        if (abstractC5913cN != null) {
            this.n.setColor(abstractC5913cN.g().intValue());
        } else {
            AbstractC5913cN<Integer, Integer> abstractC5913cN2 = this.i;
            if (abstractC5913cN2 != null) {
                this.n.setColor(abstractC5913cN2.g().intValue());
            } else {
                this.n.setColor(documentData.b);
            }
        }
        AbstractC5913cN<Integer, Integer> abstractC5913cN3 = this.s;
        if (abstractC5913cN3 != null) {
            this.p.setColor(abstractC5913cN3.g().intValue());
        } else {
            AbstractC5913cN<Integer, Integer> abstractC5913cN4 = this.q;
            if (abstractC5913cN4 != null) {
                this.p.setColor(abstractC5913cN4.g().intValue());
            } else {
                this.p.setColor(documentData.i);
            }
        }
        int intValue = ((this.g.e() == null ? 100 : this.g.e().g().intValue()) * PrivateKeyType.INVALID) / 100;
        this.n.setAlpha(intValue);
        this.p.setAlpha(intValue);
        AbstractC5913cN<Float, Float> abstractC5913cN5 = this.v;
        if (abstractC5913cN5 != null) {
            this.p.setStrokeWidth(abstractC5913cN5.g().floatValue());
            return;
        }
        AbstractC5913cN<Float, Float> abstractC5913cN6 = this.r;
        if (abstractC5913cN6 != null) {
            this.p.setStrokeWidth(abstractC5913cN6.g().floatValue());
        } else {
            this.p.setStrokeWidth(documentData.n * C8914fh.d());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(com.airbnb.lottie.model.DocumentData r21, android.graphics.Matrix r22, o.C8315di r23, android.graphics.Canvas r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            o.cN<java.lang.Float, java.lang.Float> r0 = r8.y
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.g()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L15
        L13:
            float r0 = r9.g
        L15:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            float r11 = o.C8914fh.c(r22)
            java.lang.String r0 = r9.m
            java.util.List r12 = r8.e(r0)
            int r13 = r12.size()
            int r0 = r9.k
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            o.cN<java.lang.Float, java.lang.Float> r1 = r8.A
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r1.g()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L4a
        L3c:
            o.cN<java.lang.Float, java.lang.Float> r1 = r8.w
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r1.g()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L4a:
            float r0 = r0 + r1
        L4b:
            r14 = r0
            r15 = 0
            r0 = -1
            r7 = r0
            r6 = r15
        L50:
            if (r6 >= r13) goto Lb0
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.c
            if (r0 != 0) goto L5f
            r0 = 0
            goto L61
        L5f:
            float r0 = r0.x
        L61:
            r2 = r0
            r16 = 1
            r0 = r20
            r3 = r23
            r4 = r10
            r5 = r14
            r17 = r6
            r6 = r16
            java.util.List r6 = r0.d(r1, r2, r3, r4, r5, r6)
            r5 = r15
        L73:
            int r0 = r6.size()
            if (r5 >= r0) goto Lad
            java.lang.Object r0 = r6.get(r5)
            o.dZ$e r0 = (o.C7890dZ.e) r0
            int r7 = r7 + 1
            r24.save()
            float r1 = o.C7890dZ.e.c(r0)
            r4 = r24
            r8.e(r4, r9, r7, r1)
            java.lang.String r1 = o.C7890dZ.e.b(r0)
            r0 = r20
            r2 = r21
            r3 = r23
            r16 = r5
            r5 = r11
            r18 = r6
            r6 = r10
            r19 = r7
            r7 = r14
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            r24.restore()
            int r5 = r16 + 1
            r6 = r18
            r7 = r19
            goto L73
        Lad:
            int r6 = r17 + 1
            goto L50
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7890dZ.d(com.airbnb.lottie.model.DocumentData, android.graphics.Matrix, o.di, android.graphics.Canvas):void");
    }

    private void a(String str, DocumentData documentData, C8315di c8315di, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            C8422dl c8422dl = this.f.a().get(C8422dl.a(str.charAt(i), c8315di.e(), c8315di.d()));
            if (c8422dl != null) {
                b(c8422dl, f2, documentData, canvas);
                canvas.translate((((float) c8422dl.a()) * f2 * C8914fh.d()) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(com.airbnb.lottie.model.DocumentData r19, o.C8315di r20, android.graphics.Canvas r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            android.graphics.Typeface r0 = r7.c(r9)
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r1 = r8.m
            com.airbnb.lottie.LottieDrawable r2 = r7.l
            o.cs r2 = r2.getTextDelegate()
            if (r2 == 0) goto L21
            java.lang.String r3 = r18.e()
            java.lang.String r1 = r2.e(r3, r1)
        L21:
            android.graphics.Paint r2 = r7.n
            r2.setTypeface(r0)
            o.cN<java.lang.Float, java.lang.Float> r0 = r7.y
            if (r0 == 0) goto L35
            java.lang.Object r0 = r0.g()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L37
        L35:
            float r0 = r8.g
        L37:
            android.graphics.Paint r2 = r7.n
            float r3 = o.C8914fh.d()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r7.p
            android.graphics.Paint r3 = r7.n
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r7.p
            android.graphics.Paint r3 = r7.n
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r8.k
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            o.cN<java.lang.Float, java.lang.Float> r3 = r7.A
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r3.g()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L7a
        L6c:
            o.cN<java.lang.Float, java.lang.Float> r3 = r7.w
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r3.g()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L7a:
            float r2 = r2 + r3
        L7b:
            float r3 = o.C8914fh.d()
            float r2 = r2 * r3
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r2 / r0
            java.util.List r12 = r7.e(r1)
            int r13 = r12.size()
            r14 = 0
            r0 = -1
            r15 = r0
            r6 = r14
        L91:
            if (r6 >= r13) goto Ldc
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r8.c
            if (r0 != 0) goto La0
            r0 = 0
            goto La2
        La0:
            float r0 = r0.x
        La2:
            r2 = r0
            r4 = 0
            r16 = 0
            r0 = r18
            r3 = r20
            r5 = r11
            r17 = r6
            r6 = r16
            java.util.List r0 = r0.d(r1, r2, r3, r4, r5, r6)
            r1 = r14
        Lb4:
            int r2 = r0.size()
            if (r1 >= r2) goto Ld9
            java.lang.Object r2 = r0.get(r1)
            o.dZ$e r2 = (o.C7890dZ.e) r2
            int r15 = r15 + 1
            r21.save()
            float r3 = o.C7890dZ.e.c(r2)
            r7.e(r10, r8, r15, r3)
            java.lang.String r2 = o.C7890dZ.e.b(r2)
            r7.a(r2, r8, r10, r11)
            r21.restore()
            int r1 = r1 + 1
            goto Lb4
        Ld9:
            int r6 = r17 + 1
            goto L91
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7890dZ.c(com.airbnb.lottie.model.DocumentData, o.di, android.graphics.Canvas):void");
    }

    private void e(Canvas canvas, DocumentData documentData, int i, float f) {
        PointF pointF = documentData.e;
        PointF pointF2 = documentData.c;
        float d = C8914fh.d();
        float f2 = (i * documentData.j * d) + (pointF == null ? 0.0f : (documentData.j * d) + pointF.y);
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = AnonymousClass1.e[documentData.h.ordinal()];
        if (i2 == 1) {
            canvas.translate(f3, f2);
        } else if (i2 == 2) {
            canvas.translate((f3 + f4) - f, f2);
        } else if (i2 != 3) {
        } else {
            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dZ$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            e = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Typeface c(C8315di c8315di) {
        Typeface g;
        AbstractC5913cN<Typeface, Typeface> abstractC5913cN = this.B;
        if (abstractC5913cN == null || (g = abstractC5913cN.g()) == null) {
            Typeface typeface = this.l.getTypeface(c8315di);
            return typeface != null ? typeface : c8315di.a();
        }
        return g;
    }

    private List<String> e(String str) {
        return Arrays.asList(str.replaceAll(HTTP.CRLF, "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void a(String str, DocumentData documentData, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String b = b(str, i);
            i += b.length();
            e(b, documentData, canvas);
            canvas.translate(this.n.measureText(b) + f, 0.0f);
        }
    }

    private List<e> d(String str, float f, C8315di c8315di, float f2, float f3, boolean z) {
        float measureText;
        String substring;
        String trim;
        String substring2;
        String trim2;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                C8422dl c8422dl = this.f.a().get(C8422dl.a(charAt, c8315di.e(), c8315di.d()));
                if (c8422dl != null) {
                    measureText = ((float) c8422dl.a()) * f2 * C8914fh.d();
                }
            } else {
                measureText = this.n.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i++;
                e d = d(i);
                if (i3 == i2) {
                    d.d(str.substring(i2, i4).trim(), (f4 - f7) - ((trim2.length() - substring2.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    d.d(str.substring(i2, i3 - 1).trim(), ((f4 - f5) - ((substring.length() - trim.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            d(i).d(str.substring(i2), f4);
        }
        return this.x.subList(0, i);
    }

    private e d(int i) {
        for (int size = this.x.size(); size < i; size++) {
            this.x.add(new e());
        }
        return this.x.get(i - 1);
    }

    private void b(C8422dl c8422dl, float f, DocumentData documentData, Canvas canvas) {
        List<C7483cx> d = d(c8422dl);
        for (int i = 0; i < d.size(); i++) {
            Path c = d.get(i).c();
            c.computeBounds(this.m, false);
            this.k.reset();
            this.k.preTranslate(0.0f, (-documentData.a) * C8914fh.d());
            this.k.preScale(f, f);
            c.transform(this.k);
            if (documentData.f) {
                c(c, this.n, canvas);
                c(c, this.p, canvas);
            } else {
                c(c, this.p, canvas);
                c(c, this.n, canvas);
            }
        }
    }

    private void c(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void e(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.f) {
            d(str, this.n, canvas);
            d(str, this.p, canvas);
            return;
        }
        d(str, this.p, canvas);
        d(str, this.n, canvas);
    }

    private void d(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<C7483cx> d(C8422dl c8422dl) {
        if (this.f13817o.containsKey(c8422dl)) {
            return this.f13817o.get(c8422dl);
        }
        List<C7879dO> b = c8422dl.b();
        int size = b.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C7483cx(this.l, this, b.get(i), this.f));
        }
        this.f13817o.put(c8422dl, arrayList);
        return arrayList;
    }

    private String b(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!e(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.h.containsKey(j)) {
            return this.h.get(j);
        }
        this.t.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.t.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.t.toString();
        this.h.put(j, sb);
        return sb;
    }

    private boolean e(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    @Override // o.AbstractC7877dM, o.InterfaceC8395dk
    public <T> void a(T t, C8912ff<T> c8912ff) {
        super.a(t, c8912ff);
        if (t == InterfaceC6637ch.a) {
            AbstractC5913cN<Integer, Integer> abstractC5913cN = this.j;
            if (abstractC5913cN != null) {
                d(abstractC5913cN);
            }
            if (c8912ff == null) {
                this.j = null;
                return;
            }
            C8156df c8156df = new C8156df(c8912ff);
            this.j = c8156df;
            c8156df.b(this);
            c(this.j);
        } else if (t == InterfaceC6637ch.v) {
            AbstractC5913cN<Integer, Integer> abstractC5913cN2 = this.s;
            if (abstractC5913cN2 != null) {
                d(abstractC5913cN2);
            }
            if (c8912ff == null) {
                this.s = null;
                return;
            }
            C8156df c8156df2 = new C8156df(c8912ff);
            this.s = c8156df2;
            c8156df2.b(this);
            c(this.s);
        } else if (t == InterfaceC6637ch.y) {
            AbstractC5913cN<Float, Float> abstractC5913cN3 = this.v;
            if (abstractC5913cN3 != null) {
                d(abstractC5913cN3);
            }
            if (c8912ff == null) {
                this.v = null;
                return;
            }
            C8156df c8156df3 = new C8156df(c8912ff);
            this.v = c8156df3;
            c8156df3.b(this);
            c(this.v);
        } else if (t == InterfaceC6637ch.B) {
            AbstractC5913cN<Float, Float> abstractC5913cN4 = this.A;
            if (abstractC5913cN4 != null) {
                d(abstractC5913cN4);
            }
            if (c8912ff == null) {
                this.A = null;
                return;
            }
            C8156df c8156df4 = new C8156df(c8912ff);
            this.A = c8156df4;
            c8156df4.b(this);
            c(this.A);
        } else if (t == InterfaceC6637ch.z) {
            AbstractC5913cN<Float, Float> abstractC5913cN5 = this.y;
            if (abstractC5913cN5 != null) {
                d(abstractC5913cN5);
            }
            if (c8912ff == null) {
                this.y = null;
                return;
            }
            C8156df c8156df5 = new C8156df(c8912ff);
            this.y = c8156df5;
            c8156df5.b(this);
            c(this.y);
        } else if (t != InterfaceC6637ch.R) {
            if (t == InterfaceC6637ch.C) {
                this.u.d(c8912ff);
            }
        } else {
            AbstractC5913cN<Typeface, Typeface> abstractC5913cN6 = this.B;
            if (abstractC5913cN6 != null) {
                d(abstractC5913cN6);
            }
            if (c8912ff == null) {
                this.B = null;
                return;
            }
            C8156df c8156df6 = new C8156df(c8912ff);
            this.B = c8156df6;
            c8156df6.b(this);
            c(this.B);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.dZ$e */
    /* loaded from: classes2.dex */
    public static class e {
        private float a;
        private String c;

        void d(String str, float f) {
            this.c = str;
            this.a = f;
        }

        private e() {
            this.c = "";
            this.a = 0.0f;
        }
    }
}
