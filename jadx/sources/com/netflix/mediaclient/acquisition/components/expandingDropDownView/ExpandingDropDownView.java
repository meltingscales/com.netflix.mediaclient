package com.netflix.mediaclient.acquisition.components.expandingDropDownView;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.res.TypedArrayKt;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.databinding.ExpandingDropDownViewBinding;
import o.C1204Sr;
import o.C8627dsp;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes3.dex */
public final class ExpandingDropDownView extends LinearLayout {
    public static final int $stable = 8;
    private final ExpandingDropDownViewBinding binding;
    private final FrameLayout expandingContainer;
    private int expandingContainerHeight;
    private final LinearLayout expandingHeader;
    private final ImageView expandingHeaderChevron;
    private final C1204Sr expandingHeaderText;
    private boolean isExpanded;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandingDropDownView(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandingDropDownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final View getExpandingContainer() {
        return this.expandingContainer;
    }

    /* renamed from: getExpandingContainer  reason: collision with other method in class */
    public final FrameLayout m2795getExpandingContainer() {
        return this.expandingContainer;
    }

    public final LinearLayout getExpandingHeader() {
        return this.expandingHeader;
    }

    public final ImageView getExpandingHeaderChevron() {
        return this.expandingHeaderChevron;
    }

    public final C1204Sr getExpandingHeaderText() {
        return this.expandingHeaderText;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public /* synthetic */ ExpandingDropDownView(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandingDropDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        ExpandingDropDownViewBinding inflate = ExpandingDropDownViewBinding.inflate(LayoutInflater.from(context), this);
        C8632dsu.a(inflate, "");
        this.binding = inflate;
        LinearLayout linearLayout = inflate.expandingHeader;
        C8632dsu.a(linearLayout, "");
        this.expandingHeader = linearLayout;
        ImageView imageView = inflate.expandingHeaderChevron;
        C8632dsu.a(imageView, "");
        this.expandingHeaderChevron = imageView;
        C1204Sr c1204Sr = inflate.expandingHeaderText;
        C8632dsu.a(c1204Sr, "");
        this.expandingHeaderText = c1204Sr;
        FrameLayout frameLayout = inflate.expandingContainer;
        C8632dsu.a(frameLayout, "");
        this.expandingContainer = frameLayout;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ExpandingDropDownView, 0, 0);
        C8632dsu.a(obtainStyledAttributes, "");
        try {
            if (obtainStyledAttributes.hasValue(R.styleable.ExpandingDropDownView_expandingHeaderText)) {
                c1204Sr.setText(obtainStyledAttributes.getString(R.styleable.ExpandingDropDownView_expandingHeaderText));
            }
            View.inflate(context, TypedArrayKt.getResourceIdOrThrow(obtainStyledAttributes, R.styleable.ExpandingDropDownView_expandingFormLayout), frameLayout);
            obtainStyledAttributes.recycle();
            frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.netflix.mediaclient.acquisition.components.expandingDropDownView.ExpandingDropDownView.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ExpandingDropDownView expandingDropDownView = ExpandingDropDownView.this;
                    expandingDropDownView.expandingContainerHeight = expandingDropDownView.m2795getExpandingContainer().getHeight();
                    ExpandingDropDownView.this.m2795getExpandingContainer().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    ExpandingDropDownView.this.initExpandingView();
                }
            });
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void toggleExpand() {
        if (this.isExpanded) {
            shrinkView();
        } else {
            expandView();
        }
    }

    public final void setHeaderText(String str) {
        C8632dsu.c((Object) str, "");
        this.expandingHeaderText.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHeaderClickListener$lambda$0(drM drm, View view) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(view);
    }

    public final void setHeaderClickListener(final drM<? super View, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        this.expandingHeader.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.components.expandingDropDownView.ExpandingDropDownView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpandingDropDownView.setHeaderClickListener$lambda$0(drM.this, view);
            }
        });
    }

    public final void initExpandingView() {
        this.expandingContainer.getLayoutParams().height = 0;
        FrameLayout frameLayout = this.expandingContainer;
        frameLayout.setLayoutParams(frameLayout.getLayoutParams());
    }

    public final void expandView() {
        animateExpandingContainer(0, this.expandingContainerHeight);
        this.expandingHeaderChevron.setRotation(90.0f);
    }

    public final void shrinkView() {
        animateExpandingContainer(this.expandingContainerHeight, 0);
        this.expandingHeaderChevron.setRotation(0.0f);
    }

    private final void animateExpandingContainer(int i, int i2) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.expandingContainer, new HeightProperty(), i, i2);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.netflix.mediaclient.acquisition.components.expandingDropDownView.ExpandingDropDownView$animateExpandingContainer$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C8632dsu.c((Object) animator, "");
                super.onAnimationEnd(animator);
                ExpandingDropDownView expandingDropDownView = ExpandingDropDownView.this;
                expandingDropDownView.setExpanded(!expandingDropDownView.isExpanded());
            }
        });
        ofInt.start();
    }
}
