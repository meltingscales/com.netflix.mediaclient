package com.netflix.mediaclient.acquisition.components.faq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.faq.FaqFragment;
import com.netflix.mediaclient.acquisition.databinding.FaqBlockViewBinding;
import o.C1204Sr;
import o.C8627dsp;
import o.C8632dsu;
import o.C9726vo;
import o.dpR;
import o.drX;

/* loaded from: classes3.dex */
public final class FaqBlockView extends LinearLayout {
    public static final int $stable = 8;
    private final FaqBlockViewBinding binding;
    private final ImageView expandIndicatorIcon;
    private final FrameLayout expandingContainer;
    private int expandingContainerHeight;
    private final LinearLayout faqHeader;
    private FaqFragment.FaqInteractionListener faqInteractionListener;
    private final C1204Sr faqValueText;
    private final C1204Sr headerText;
    private boolean isExpanded;
    private FaqBlockViewModel viewModel;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaqBlockView(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaqBlockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public final ImageView getExpandIndicatorIcon() {
        return this.expandIndicatorIcon;
    }

    public final FrameLayout getExpandingContainer() {
        return this.expandingContainer;
    }

    public final LinearLayout getFaqHeader() {
        return this.faqHeader;
    }

    public final FaqFragment.FaqInteractionListener getFaqInteractionListener() {
        return this.faqInteractionListener;
    }

    public final C1204Sr getFaqValueText() {
        return this.faqValueText;
    }

    public final C1204Sr getHeaderText() {
        return this.headerText;
    }

    public final FaqBlockViewModel getViewModel() {
        return this.viewModel;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public final void setFaqInteractionListener(FaqFragment.FaqInteractionListener faqInteractionListener) {
        this.faqInteractionListener = faqInteractionListener;
    }

    public final void setViewModel(FaqBlockViewModel faqBlockViewModel) {
        this.viewModel = faqBlockViewModel;
    }

    public /* synthetic */ FaqBlockView(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaqBlockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C8632dsu.c((Object) context, "");
        FaqBlockViewBinding inflate = FaqBlockViewBinding.inflate(LayoutInflater.from(context), this);
        C8632dsu.a(inflate, "");
        this.binding = inflate;
        LinearLayout linearLayout = inflate.faqHeader;
        C8632dsu.a(linearLayout, "");
        this.faqHeader = linearLayout;
        ImageView imageView = inflate.expandIndicatorIcon;
        C8632dsu.a(imageView, "");
        this.expandIndicatorIcon = imageView;
        C1204Sr c1204Sr = inflate.headerText;
        C8632dsu.a(c1204Sr, "");
        this.headerText = c1204Sr;
        C1204Sr c1204Sr2 = inflate.faqValueText;
        C8632dsu.a(c1204Sr2, "");
        this.faqValueText = c1204Sr2;
        FrameLayout frameLayout = inflate.expandingContainer;
        C8632dsu.a(frameLayout, "");
        this.expandingContainer = frameLayout;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FaqBlockView, 0, 0);
        C8632dsu.a(obtainStyledAttributes, "");
        try {
            if (obtainStyledAttributes.hasValue(R.styleable.FaqBlockView_faqBlockHeaderText)) {
                c1204Sr.setText(obtainStyledAttributes.getString(R.styleable.FaqBlockView_faqBlockHeaderText));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.FaqBlockView_faqBlockValueText)) {
                c1204Sr2.setText(obtainStyledAttributes.getString(R.styleable.FaqBlockView_faqBlockValueText));
            }
            obtainStyledAttributes.recycle();
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.components.faq.FaqBlockView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FaqBlockView._init_$lambda$0(FaqBlockView.this, view);
                }
            });
            imageView.setRotation(45.0f);
            frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.netflix.mediaclient.acquisition.components.faq.FaqBlockView.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    FaqBlockView faqBlockView = FaqBlockView.this;
                    faqBlockView.expandingContainerHeight = faqBlockView.getExpandingContainer().getMeasuredHeight();
                    FaqBlockView.this.getExpandingContainer().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    FaqBlockView.this.initExpandingView();
                }
            });
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(FaqBlockView faqBlockView, View view) {
        C8632dsu.c((Object) faqBlockView, "");
        faqBlockView.toggleExpand();
    }

    public final void bind(FaqBlockViewModel faqBlockViewModel, FaqFragment.FaqInteractionListener faqInteractionListener) {
        C8632dsu.c((Object) faqBlockViewModel, "");
        C8632dsu.c((Object) faqInteractionListener, "");
        this.headerText.setText(faqBlockViewModel.getHeader());
        this.faqValueText.setText(faqBlockViewModel.getValue());
        this.faqValueText.setMovementMethod(LinkMovementMethod.getInstance());
        this.faqInteractionListener = faqInteractionListener;
        this.viewModel = faqBlockViewModel;
    }

    public final void toggleExpand() {
        if (this.isExpanded) {
            shrinkView();
        } else {
            expandView();
        }
        C9726vo.d(this.viewModel, this.faqInteractionListener, new drX<FaqBlockViewModel, FaqFragment.FaqInteractionListener, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.faq.FaqBlockView$toggleExpand$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // o.drX
            public /* bridge */ /* synthetic */ dpR invoke(FaqBlockViewModel faqBlockViewModel, FaqFragment.FaqInteractionListener faqInteractionListener) {
                invoke2(faqBlockViewModel, faqInteractionListener);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(FaqBlockViewModel faqBlockViewModel, FaqFragment.FaqInteractionListener faqInteractionListener) {
                C8632dsu.c((Object) faqBlockViewModel, "");
                C8632dsu.c((Object) faqInteractionListener, "");
                boolean isExpanded = FaqBlockView.this.isExpanded();
                String faqItemId = faqBlockViewModel.getFaqItemId();
                if (isExpanded) {
                    faqInteractionListener.logFaqItemShrunk(faqItemId);
                } else {
                    faqInteractionListener.logFaqItemExpanded(faqItemId);
                }
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
        rotateIndicator(0.0f);
    }

    public final void shrinkView() {
        animateExpandingContainer(this.expandingContainerHeight, 0);
        rotateIndicator(45.0f);
    }

    public final void rotateIndicator(float f) {
        ViewPropertyAnimator animate = this.expandIndicatorIcon.animate();
        animate.rotation(f);
        animate.setInterpolator(new OvershootInterpolator());
        animate.setStartDelay(300L);
        animate.setDuration(300L);
        animate.start();
    }

    private final void animateExpandingContainer(int i, int i2) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.expandingContainer, new HeightProperty(), i, i2);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: com.netflix.mediaclient.acquisition.components.faq.FaqBlockView$animateExpandingContainer$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C8632dsu.c((Object) animator, "");
                super.onAnimationEnd(animator);
                FaqBlockView faqBlockView = FaqBlockView.this;
                faqBlockView.setExpanded(!faqBlockView.isExpanded());
            }
        });
        ofInt.start();
    }
}
