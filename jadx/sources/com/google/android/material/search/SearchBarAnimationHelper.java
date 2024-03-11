package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.animation.AnimatableView;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
class SearchBarAnimationHelper {
    private Animator defaultCenterViewAnimator;
    private Animator secondaryViewAnimator;
    private final Set<Object> onLoadAnimationCallbacks = new LinkedHashSet();
    private final Set<AnimatorListenerAdapter> expandAnimationListeners = new LinkedHashSet();
    private final Set<AnimatorListenerAdapter> collapseAnimationListeners = new LinkedHashSet();
    private boolean onLoadAnimationFadeInEnabled = true;
    private Animator runningExpandOrCollapseAnimator = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.onLoadAnimationFadeInEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void stopOnLoadAnimation(SearchBar searchBar) {
        Animator animator = this.secondaryViewAnimator;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.defaultCenterViewAnimator;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).stopAnimation();
        }
        if (centerView != null) {
            centerView.setAlpha(0.0f);
        }
    }
}
