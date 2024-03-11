package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import o.C1204Sr;

/* loaded from: classes3.dex */
public final class UpiWaitingFragmentBinding {
    public final ImageView approveIconImageView;
    public final ImageView bankAppIconImageView;
    public final Barrier bottomBarrier;
    public final NetflixSignupButton continueButton;
    public final LinearLayout continueContainerLayout;
    public final C1204Sr headerText;
    public final LinearLayout loadingContainerLayout;
    public final C1204Sr loadingMessageTextView;
    public final ProgressBar loadingView;
    public final ImageView netflixAppIconImageView;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView;
    public final C1204Sr timerTextView;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private UpiWaitingFragmentBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, Barrier barrier, NetflixSignupButton netflixSignupButton, LinearLayout linearLayout, C1204Sr c1204Sr, LinearLayout linearLayout2, C1204Sr c1204Sr2, ProgressBar progressBar, ImageView imageView3, ScrollView scrollView, C1204Sr c1204Sr3) {
        this.rootView = constraintLayout;
        this.approveIconImageView = imageView;
        this.bankAppIconImageView = imageView2;
        this.bottomBarrier = barrier;
        this.continueButton = netflixSignupButton;
        this.continueContainerLayout = linearLayout;
        this.headerText = c1204Sr;
        this.loadingContainerLayout = linearLayout2;
        this.loadingMessageTextView = c1204Sr2;
        this.loadingView = progressBar;
        this.netflixAppIconImageView = imageView3;
        this.scrollView = scrollView;
        this.timerTextView = c1204Sr3;
    }

    public static UpiWaitingFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static UpiWaitingFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.upi_waiting_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static UpiWaitingFragmentBinding bind(View view) {
        int i = R.id.approveIconImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.bankAppIconImageView;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.bottomBarrier;
                Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                if (barrier != null) {
                    i = R.id.continueButton;
                    NetflixSignupButton netflixSignupButton = (NetflixSignupButton) ViewBindings.findChildViewById(view, i);
                    if (netflixSignupButton != null) {
                        i = R.id.continueContainerLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.headerText;
                            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr != null) {
                                i = R.id.loadingContainerLayout;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = R.id.loadingMessageTextView;
                                    C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                    if (c1204Sr2 != null) {
                                        i = R.id.loadingView;
                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                        if (progressBar != null) {
                                            i = R.id.netflixAppIconImageView;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView3 != null) {
                                                i = R.id.scrollView;
                                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                                                if (scrollView != null) {
                                                    i = R.id.timerTextView;
                                                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                                    if (c1204Sr3 != null) {
                                                        return new UpiWaitingFragmentBinding((ConstraintLayout) view, imageView, imageView2, barrier, netflixSignupButton, linearLayout, c1204Sr, linearLayout2, c1204Sr2, progressBar, imageView3, scrollView, c1204Sr3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
