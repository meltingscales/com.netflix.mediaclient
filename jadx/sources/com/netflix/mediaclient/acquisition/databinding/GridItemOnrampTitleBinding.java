package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.android.widget.NetflixImageView;

/* loaded from: classes3.dex */
public final class GridItemOnrampTitleBinding {
    private final ConstraintLayout rootView;
    public final FrameLayout selectedOverlay;
    public final NetflixImageView titleImage;

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    private GridItemOnrampTitleBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, NetflixImageView netflixImageView) {
        this.rootView = constraintLayout;
        this.selectedOverlay = frameLayout;
        this.titleImage = netflixImageView;
    }

    public static GridItemOnrampTitleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GridItemOnrampTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.grid_item_onramp_title, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GridItemOnrampTitleBinding bind(View view) {
        int i = R.id.selectedOverlay;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.titleImage;
            NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
            if (netflixImageView != null) {
                return new GridItemOnrampTitleBinding((ConstraintLayout) view, frameLayout, netflixImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
