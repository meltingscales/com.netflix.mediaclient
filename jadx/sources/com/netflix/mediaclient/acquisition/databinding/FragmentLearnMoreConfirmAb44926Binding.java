package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class FragmentLearnMoreConfirmAb44926Binding {
    public final C1204Sr alternateInstructions;
    public final View divider;
    public final C1204Sr header;
    public final NetflixImageView imgMessage;
    public final C1204Sr instructions;
    public final CardView learnMoreContent;
    public final C1204Sr learnMoreEmail;
    public final C1204Sr message;
    private final ScrollView rootView;

    public ScrollView getRoot() {
        return this.rootView;
    }

    private FragmentLearnMoreConfirmAb44926Binding(ScrollView scrollView, C1204Sr c1204Sr, View view, C1204Sr c1204Sr2, NetflixImageView netflixImageView, C1204Sr c1204Sr3, CardView cardView, C1204Sr c1204Sr4, C1204Sr c1204Sr5) {
        this.rootView = scrollView;
        this.alternateInstructions = c1204Sr;
        this.divider = view;
        this.header = c1204Sr2;
        this.imgMessage = netflixImageView;
        this.instructions = c1204Sr3;
        this.learnMoreContent = cardView;
        this.learnMoreEmail = c1204Sr4;
        this.message = c1204Sr5;
    }

    public static FragmentLearnMoreConfirmAb44926Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLearnMoreConfirmAb44926Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_learn_more_confirm_ab44926, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLearnMoreConfirmAb44926Binding bind(View view) {
        View findChildViewById;
        int i = R.id.alternate_instructions;
        C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
        if (c1204Sr != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null) {
            i = R.id.header;
            C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr2 != null) {
                i = R.id.img_message;
                NetflixImageView netflixImageView = (NetflixImageView) ViewBindings.findChildViewById(view, i);
                if (netflixImageView != null) {
                    i = R.id.instructions;
                    C1204Sr c1204Sr3 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                    if (c1204Sr3 != null) {
                        i = R.id.learn_more_content;
                        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                        if (cardView != null) {
                            i = R.id.learn_more_email;
                            C1204Sr c1204Sr4 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                            if (c1204Sr4 != null) {
                                i = R.id.message;
                                C1204Sr c1204Sr5 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                if (c1204Sr5 != null) {
                                    return new FragmentLearnMoreConfirmAb44926Binding((ScrollView) view, c1204Sr, findChildViewById, c1204Sr2, netflixImageView, c1204Sr3, cardView, c1204Sr4, c1204Sr5);
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
