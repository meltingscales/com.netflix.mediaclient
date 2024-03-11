package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.cIq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5795cIq extends RecyclerView.ItemDecoration {
    public static final b d = new b(null);
    private final cHZ b;
    private int c;
    private final View e;

    public final void c(float f) {
        this.c = (int) (f + 0.5d);
    }

    public C5795cIq(View view, cHZ chz) {
        C8632dsu.c((Object) view, "");
        C8632dsu.c((Object) chz, "");
        this.e = view;
        this.b = chz;
    }

    /* renamed from: o.cIq$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("InteractiveSpaceItemDecoration");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getItemOffsets(android.graphics.Rect r5, android.view.View r6, androidx.recyclerview.widget.RecyclerView r7, androidx.recyclerview.widget.RecyclerView.State r8) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r5, r0)
            o.C8632dsu.c(r6, r0)
            o.C8632dsu.c(r7, r0)
            o.C8632dsu.c(r8, r0)
            int r7 = r7.getChildAdapterPosition(r6)
            o.cHZ r8 = r4.b
            int r8 = r8.getItemCount()
            int r8 = r8 + (-1)
            r1 = 0
            int r8 = java.lang.Math.max(r1, r8)
            if (r7 != r8) goto L22
            goto L24
        L22:
            if (r7 != 0) goto L6f
        L24:
            android.view.View r2 = r4.e
            int r2 = r2.getWidth()
            if (r2 != 0) goto L3f
            android.view.View r2 = r4.e
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L39
            android.view.View r2 = (android.view.View) r2
            goto L3a
        L39:
            r2 = 0
        L3a:
            if (r2 == 0) goto L3d
            goto L41
        L3d:
            r2 = r1
            goto L45
        L3f:
            android.view.View r2 = r4.e
        L41:
            int r2 = r2.getWidth()
        L45:
            int r3 = r6.getWidth()
            if (r3 != 0) goto L4e
            int r3 = r4.c
            goto L52
        L4e:
            int r3 = r6.getWidth()
        L52:
            int r2 = r2 / 2
            int r3 = r3 / 2
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            o.C8632dsu.a(r6, r0)
            int r2 = r2 - r3
            int r6 = o.C9687vB.e(r6)
            int r2 = r2 - r6
            if (r7 != 0) goto L6b
            if (r7 == r8) goto L6b
            r5.set(r2, r1, r1, r1)
            goto L72
        L6b:
            r5.set(r1, r1, r2, r1)
            goto L72
        L6f:
            r5.setEmpty()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C5795cIq.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }
}
