package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.android.widget.NetflixImageView;

/* renamed from: o.yp  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9908yp extends RecyclerView.ItemDecoration {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int a;
    public static final d b;
    private static char[] b$s43$711 = null;
    private static final int c;
    private static long d$s44$711 = 0;
    private static final int e;
    private static int h = 0;

    /* renamed from: o  reason: collision with root package name */
    private static int f13933o = 1;
    private final GradientDrawable d;
    private final int f;
    private final C9868yB g;
    private Rect i;
    private final int j;

    static void e() {
        d$s44$711 = 4526045880585428061L;
        b$s43$711 = new char[]{14414};
    }

    /* renamed from: o.yp$d */
    /* loaded from: classes2.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("ItemPositionOverlayDecoration");
        }
    }

    public C9908yp(Context context, int i, int i2, int i3) {
        C8632dsu.c((Object) context, "");
        this.f = i2;
        this.j = i3;
        int i4 = c;
        this.g = new C9868yB(context, i4, -i4, 0, -0.3f, 0.0f, 32, null);
        this.i = new Rect();
        if (!C8120deQ.a()) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i});
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            this.d = gradientDrawable;
            int i5 = h + 79;
            f13933o = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            int i6 = 2 % 2;
            return;
        }
        this.d = null;
        int i7 = f13933o + 107;
        h = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        int i8 = 2 % 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        float f;
        float f2;
        RecyclerView recyclerView2 = recyclerView;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = h + 73;
        f13933o = i4 % 128;
        int i5 = i4 % 2;
        C8632dsu.c((Object) canvas, "");
        C8632dsu.c((Object) recyclerView2, "");
        C8632dsu.c((Object) state, "");
        boolean z = recyclerView.getLayoutDirection() == 1;
        int childCount = recyclerView.getChildCount();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        int i6 = 0;
        while (i6 < childCount) {
            int i7 = h + 71;
            f13933o = i7 % 128;
            int i8 = i7 % i2;
            View childAt = recyclerView2.getChildAt(i6);
            int childAdapterPosition = recyclerView2.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1) {
                recyclerView2.getDecoratedBoundsWithMargins(childAt, this.i);
                int i9 = this.f - this.j;
                if (z) {
                    f = this.i.right - i9;
                    int i10 = f13933o + 93;
                    h = i10 % 128;
                    int i11 = i10 % i2;
                } else {
                    f = this.i.left + i9;
                    int i12 = h + NetflixImageView.DEFAULT_LAYER_GRAVITY;
                    f13933o = i12 % 128;
                    int i13 = i12 % i2;
                }
                float f3 = this.i.bottom - e;
                int i14 = childAdapterPosition + 1;
                b(this.i, canvas, String.valueOf(i14), f, f3, z, i6);
                if (i6 != childCount - 1 || i14 >= itemCount) {
                    i = 2;
                } else {
                    if (z) {
                        int i15 = h + 41;
                        f13933o = i15 % 128;
                        f2 = i15 % 2 == 0 ? this.i.left % i9 : this.i.left - i9;
                    } else {
                        f2 = this.i.right + i9;
                    }
                    float f4 = f2;
                    int i16 = h + 13;
                    f13933o = i16 % 128;
                    i = 2;
                    int i17 = i16 % 2;
                    b(this.i, canvas, String.valueOf(childAdapterPosition + 2), f4, f3, z, i6);
                }
            } else {
                i = i2;
            }
            i6++;
            i2 = i;
            recyclerView2 = recyclerView;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        if ((r8 % 2) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r7 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        return 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        return 0.3f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r7 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        r7 = o.C9908yp.f13933o + 75;
        o.C9908yp.h = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        r7 = o.C9908yp.h + 13;
        o.C9908yp.f13933o = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        return 0.7f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
        return 0.85f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r8 != true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
        if (r8 != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
        r8 = o.C9908yp.h + 115;
        o.C9908yp.f13933o = r8 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float b(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C9908yp.h
            int r1 = r1 + 61
            int r2 = r1 % 128
            o.C9908yp.f13933o = r2
            int r1 = r1 % r0
            r2 = 32549(0x7f25, float:4.5611E-41)
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L28
            java.lang.Object[] r1 = new java.lang.Object[r4]
            k(r4, r2, r5, r1)
            r1 = r1[r5]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r2 = 5
            boolean r7 = o.C8684dus.b(r7, r1, r5, r2, r3)
            if (r8 == r4) goto L3b
            goto L50
        L28:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            k(r4, r2, r5, r1)
            r1 = r1[r5]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            boolean r7 = o.C8684dus.b(r7, r1, r5, r0, r3)
            if (r8 == 0) goto L50
        L3b:
            int r8 = o.C9908yp.h
            int r8 = r8 + 115
            int r1 = r8 % 128
            o.C9908yp.f13933o = r1
            int r8 = r8 % r0
            if (r8 == 0) goto L4f
            if (r7 == 0) goto L4b
            r7 = 1056964608(0x3f000000, float:0.5)
            goto L6b
        L4b:
            r7 = 1050253722(0x3e99999a, float:0.3)
            goto L6b
        L4f:
            throw r3
        L50:
            if (r7 == 0) goto L5f
            int r7 = o.C9908yp.f13933o
            int r7 = r7 + 75
            int r8 = r7 % 128
            o.C9908yp.h = r8
            int r7 = r7 % r0
            r7 = 1062836634(0x3f59999a, float:0.85)
            goto L6b
        L5f:
            int r7 = o.C9908yp.h
            int r7 = r7 + 13
            int r8 = r7 % 128
            o.C9908yp.f13933o = r8
            int r7 = r7 % r0
            r7 = 1060320051(0x3f333333, float:0.7)
        L6b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9908yp.b(java.lang.String, boolean):float");
    }

    public final void b(Rect rect, Canvas canvas, String str, float f, float f2, boolean z, int i) {
        int e2;
        int i2;
        int i3 = 2 % 2;
        C8632dsu.c((Object) rect, "");
        C8632dsu.c((Object) canvas, "");
        C8632dsu.c((Object) str, "");
        C9868yB c9868yB = this.g;
        e2 = dsT.e(rect.height() * 0.5f);
        c9868yB.d(e2, str);
        int c2 = this.g.c();
        int e3 = this.g.e();
        float f3 = c2;
        float b2 = b(str, z);
        int i4 = this.f;
        int i5 = this.j;
        canvas.save();
        if (z) {
            canvas.clipRect(0.0f, 0.0f, i4 + i5 + f + this.j, e3 + f2);
        } else {
            canvas.clipRect(rect.left - this.j, 0.0f, rect.right, e3 + f2);
        }
        if (!z && str.length() > 1) {
            int i6 = h + 83;
            f13933o = i6 % 128;
            i2 = i6 % 2 == 0 ? c2 % 5 : c2 / 4;
        } else {
            int i7 = h + 57;
            f13933o = i7 % 128;
            int i8 = i7 % 2;
            i2 = 0;
        }
        this.g.b(canvas, (f - (f3 * b2)) + i2, f2);
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i = 2 % 2;
        int i2 = h + 113;
        f13933o = i2 % 128;
        int i3 = i2 % 2;
        C8632dsu.c((Object) rect, "");
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) recyclerView, "");
        C8632dsu.c((Object) state, "");
        if (recyclerView.getLayoutDirection() == 1) {
            int i4 = f13933o + 57;
            h = i4 % 128;
            int i5 = i4 % 2;
            rect.set(0, 0, this.f, 0);
        } else {
            rect.set(this.f, 0, 0, 0);
        }
        int i6 = h + 121;
        f13933o = i6 % 128;
        int i7 = i6 % 2;
    }

    static {
        e();
        Object obj = null;
        b = new d(null);
        a = 8;
        C1332Xp c1332Xp = C1332Xp.b;
        c = (int) TypedValue.applyDimension(1, 10, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        e = (int) TypedValue.applyDimension(1, 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        int i = h + 5;
        f13933o = i % 128;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void k(int i, char c2, int i2, Object[] objArr) {
        int i3;
        int i4 = 2 % 2;
        C9581sN c9581sN = new C9581sN();
        long[] jArr = new long[i];
        c9581sN.d = 0;
        while (c9581sN.d < i) {
            int i5 = $11 + 105;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            jArr[c9581sN.d] = (((char) (b$s43$711[i2 + c9581sN.d] ^ 8527296503698573146L)) ^ (c9581sN.d * (8527296503698573146L ^ d$s44$711))) ^ c2;
            c9581sN.d++;
        }
        char[] cArr = new char[i];
        c9581sN.d = 0;
        while (c9581sN.d < i) {
            int i7 = $10 + 89;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[c9581sN.d] = (char) jArr[c9581sN.d];
                i3 = c9581sN.d;
            } else {
                cArr[c9581sN.d] = (char) jArr[c9581sN.d];
                i3 = c9581sN.d + 1;
            }
            c9581sN.d = i3;
        }
        objArr[0] = new String(cArr);
    }
}
