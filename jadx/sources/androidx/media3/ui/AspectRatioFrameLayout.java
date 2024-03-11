package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class AspectRatioFrameLayout extends FrameLayout {
    private AspectRatioListener aspectRatioListener;
    private final AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher;
    private int resizeMode;
    private float videoAspectRatio;

    /* loaded from: classes2.dex */
    public interface AspectRatioListener {
        void onAspectRatioUpdated(float f, float f2, boolean z);
    }

    public void setAspectRatioListener(AspectRatioListener aspectRatioListener) {
        this.aspectRatioListener = aspectRatioListener;
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.resizeMode = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.resizeMode = obtainStyledAttributes.getInt(R.styleable.AspectRatioFrameLayout_resize_mode, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.aspectRatioUpdateDispatcher = new AspectRatioUpdateDispatcher();
    }

    public void setAspectRatio(float f) {
        if (this.videoAspectRatio != f) {
            this.videoAspectRatio = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i) {
        if (this.resizeMode != i) {
            this.resizeMode = i;
            requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r4 > 0.0f) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r4 > 0.0f) goto L21;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.videoAspectRatio
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            return
        Lb:
            int r9 = r8.getCroppedViewWidth()
            int r0 = r8.getCroppedViewHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.videoAspectRatio
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 > 0) goto L2e
            androidx.media3.ui.AspectRatioFrameLayout$AspectRatioUpdateDispatcher r9 = r8.aspectRatioUpdateDispatcher
            float r10 = r8.videoAspectRatio
            r0 = 0
            r9.scheduleUpdate(r10, r3, r0)
            return
        L2e:
            int r5 = r8.resizeMode
            r6 = 1
            if (r5 == 0) goto L41
            if (r5 == r6) goto L45
            r7 = 2
            if (r5 == r7) goto L4a
            r7 = 4
            if (r5 == r7) goto L3c
            goto L4e
        L3c:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L45
            goto L4a
        L41:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L4a
        L45:
            float r10 = r8.videoAspectRatio
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L4e
        L4a:
            float r9 = r8.videoAspectRatio
            float r2 = r2 * r9
            int r9 = (int) r2
        L4e:
            androidx.media3.ui.AspectRatioFrameLayout$AspectRatioUpdateDispatcher r10 = r8.aspectRatioUpdateDispatcher
            float r1 = r8.videoAspectRatio
            r10.scheduleUpdate(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public int getCroppedViewWidth() {
        return getMeasuredWidth();
    }

    public int getCroppedViewHeight() {
        return getMeasuredHeight();
    }

    /* loaded from: classes2.dex */
    final class AspectRatioUpdateDispatcher implements Runnable {
        private boolean aspectRatioMismatch;
        private boolean isScheduled;
        private float naturalAspectRatio;
        private float targetAspectRatio;

        private AspectRatioUpdateDispatcher() {
        }

        public void scheduleUpdate(float f, float f2, boolean z) {
            this.targetAspectRatio = f;
            this.naturalAspectRatio = f2;
            this.aspectRatioMismatch = z;
            if (this.isScheduled) {
                return;
            }
            this.isScheduled = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.isScheduled = false;
            if (AspectRatioFrameLayout.this.aspectRatioListener == null) {
                return;
            }
            AspectRatioFrameLayout.this.aspectRatioListener.onAspectRatioUpdated(this.targetAspectRatio, this.naturalAspectRatio, this.aspectRatioMismatch);
        }
    }
}
