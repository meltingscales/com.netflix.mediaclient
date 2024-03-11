package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] SNACKBAR_BUTTON_STYLE_ATTR;
    private static final int[] SNACKBAR_CONTENT_STYLE_ATTRS;
    private static int a = 1;
    private static int e;
    private static byte e$ss2$205;
    private final AccessibilityManager accessibilityManager;
    private boolean hasAction;

    static {
        e();
        int i = R.attr.snackbarButtonStyle;
        SNACKBAR_BUTTON_STYLE_ATTR = new int[]{i};
        SNACKBAR_CONTENT_STYLE_ATTRS = new int[]{i, R.attr.snackbarTextViewStyle};
    }

    static void e() {
        e$ss2$205 = (byte) 24;
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback) {
        super(context, viewGroup, view, contentViewCallback);
        this.accessibilityManager = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void show() {
        super.show();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void dismiss() {
        super.dismiss();
    }

    public static Snackbar make(View view, CharSequence charSequence, int i) {
        return makeInternal(null, view, charSequence, i);
    }

    private static Snackbar makeInternal(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup findSuitableParent = findSuitableParent(view);
        if (findSuitableParent == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = findSuitableParent.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(hasSnackbarContentStyleAttrs(context) ? R.layout.mtrl_layout_snackbar_include : R.layout.design_layout_snackbar_include, findSuitableParent, false);
        Snackbar snackbar = new Snackbar(context, findSuitableParent, snackbarContentLayout, snackbarContentLayout);
        snackbar.setText(charSequence);
        snackbar.setDuration(i);
        return snackbar;
    }

    private static boolean hasSnackbarContentStyleAttrs(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(SNACKBAR_CONTENT_STYLE_ATTRS);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
        if ((r2 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
        r0 = new java.lang.Object[1];
        b(r4.substring(4), r0);
        r4 = ((java.lang.String) r0[0]).intern();
        r12 = r1.getText(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
        if ((r12 instanceof android.text.Spanned) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
        r0 = new android.text.SpannableString(r4);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r12, 0, r4.length(), java.lang.Object.class, r0, 0);
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
        r13 = new java.lang.Object[1];
        b(r4.substring(4), r13);
        ((java.lang.String) r13[0]).intern();
        r11 = r1.getText(r12) instanceof android.text.Spanned;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r4.startsWith("'!#+") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r4.startsWith("'!#+") != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        r2 = com.google.android.material.snackbar.Snackbar.e + 115;
        com.google.android.material.snackbar.Snackbar.a = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.material.snackbar.Snackbar make(android.view.View r11, int r12, int r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.snackbar.Snackbar.e
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.google.android.material.snackbar.Snackbar.a = r2
            int r1 = r1 % r0
            java.lang.String r2 = "'!#+"
            r3 = 0
            if (r1 != 0) goto L23
            android.content.res.Resources r1 = r11.getResources()
            java.lang.String r4 = r1.getString(r12)
            boolean r2 = r4.startsWith(r2)
            r5 = 88
            int r5 = r5 / r3
            if (r2 == 0) goto L88
            goto L31
        L23:
            android.content.res.Resources r1 = r11.getResources()
            java.lang.String r4 = r1.getString(r12)
            boolean r2 = r4.startsWith(r2)
            if (r2 == 0) goto L88
        L31:
            int r2 = com.google.android.material.snackbar.Snackbar.e
            int r2 = r2 + 115
            int r5 = r2 % 128
            com.google.android.material.snackbar.Snackbar.a = r5
            int r2 = r2 % r0
            r0 = 1
            r5 = 4
            if (r2 == 0) goto L70
            java.lang.String r2 = r4.substring(r5)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            b(r2, r0)
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.intern()
            java.lang.CharSequence r12 = r1.getText(r12)
            boolean r0 = r12 instanceof android.text.Spanned
            if (r0 == 0) goto L88
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r4)
            r5 = r12
            android.text.SpannedString r5 = (android.text.SpannedString) r5
            r6 = 0
            int r7 = r4.length()
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r12 = r0
            android.text.SpannableString r12 = (android.text.SpannableString) r12
            r10 = 0
            r9 = r0
            android.text.TextUtils.copySpansFrom(r5, r6, r7, r8, r9, r10)
            r4 = r0
            goto L88
        L70:
            java.lang.String r11 = r4.substring(r5)
            java.lang.Object[] r13 = new java.lang.Object[r0]
            b(r11, r13)
            r11 = r13[r3]
            java.lang.String r11 = (java.lang.String) r11
            r11.intern()
            java.lang.CharSequence r11 = r1.getText(r12)
            boolean r11 = r11 instanceof android.text.Spanned
            r11 = 0
            throw r11
        L88:
            com.google.android.material.snackbar.Snackbar r11 = make(r11, r4, r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar.make(android.view.View, int, int):com.google.android.material.snackbar.Snackbar");
    }

    private static ViewGroup findSuitableParent(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public Snackbar setText(CharSequence charSequence) {
        getMessageView().setText(charSequence);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        r4 = new java.lang.Object[1];
        b(r5.substring(4), r4);
        r5 = ((java.lang.String) r4[0]).intern();
        r13 = r1.getText(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
        if ((r13 instanceof android.text.Spanned) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
        r1 = new android.text.SpannableString(r5);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r13, 0, r5.length(), java.lang.Object.class, r1, 0);
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
        if ((!r5.startsWith("'!#+")) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r5.startsWith("'!#+") != true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.material.snackbar.Snackbar setAction(int r13, android.view.View.OnClickListener r14) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.snackbar.Snackbar.a
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.google.android.material.snackbar.Snackbar.e = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = "'!#+"
            r4 = 1
            if (r1 == 0) goto L25
            android.content.Context r1 = r12.getContext()
            java.lang.String r5 = r1.getString(r13)
            boolean r3 = r5.startsWith(r3)
            r6 = 16
            int r6 = r6 / r2
            r3 = r3 ^ r4
            if (r3 == 0) goto L34
            goto L66
        L25:
            android.content.Context r1 = r12.getContext()
            java.lang.String r5 = r1.getString(r13)
            boolean r3 = r5.startsWith(r3)
            if (r3 == r4) goto L34
            goto L66
        L34:
            r3 = 4
            java.lang.String r3 = r5.substring(r3)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            b(r3, r4)
            r2 = r4[r2]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = r2.intern()
            java.lang.CharSequence r13 = r1.getText(r13)
            boolean r1 = r13 instanceof android.text.Spanned
            if (r1 == 0) goto L66
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r5)
            r6 = r13
            android.text.SpannedString r6 = (android.text.SpannedString) r6
            r7 = 0
            int r8 = r5.length()
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r13 = r1
            android.text.SpannableString r13 = (android.text.SpannableString) r13
            r11 = 0
            r10 = r1
            android.text.TextUtils.copySpansFrom(r6, r7, r8, r9, r10, r11)
            r5 = r1
        L66:
            com.google.android.material.snackbar.Snackbar r13 = r12.setAction(r5, r14)
            int r14 = com.google.android.material.snackbar.Snackbar.a
            int r14 = r14 + 65
            int r1 = r14 % 128
            com.google.android.material.snackbar.Snackbar.e = r1
            int r14 = r14 % r0
            if (r14 != 0) goto L76
            return r13
        L76:
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar.setAction(int, android.view.View$OnClickListener):com.google.android.material.snackbar.Snackbar");
    }

    public Snackbar setAction(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button actionView = getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.hasAction = false;
        } else {
            this.hasAction = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.Snackbar$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Snackbar.this.lambda$setAction$0(onClickListener, view);
                }
            });
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAction$0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        dispatchDismiss(1);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int getDuration() {
        int recommendedTimeoutMillis;
        int duration = super.getDuration();
        if (duration == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = this.accessibilityManager.getRecommendedTimeoutMillis(duration, (this.hasAction ? 4 : 0) | 3);
            return recommendedTimeoutMillis;
        } else if (this.hasAction && this.accessibilityManager.isTouchExplorationEnabled()) {
            return -2;
        } else {
            return duration;
        }
    }

    public Snackbar setActionTextColor(int i) {
        getActionView().setTextColor(i);
        return this;
    }

    /* loaded from: classes5.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = getMeasuredWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - paddingLeft) - paddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    private TextView getMessageView() {
        return getContentLayout().getMessageView();
    }

    private Button getActionView() {
        return getContentLayout().getActionView();
    }

    private SnackbarContentLayout getContentLayout() {
        return (SnackbarContentLayout) this.view.getChildAt(0);
    }

    private static void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$205);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
