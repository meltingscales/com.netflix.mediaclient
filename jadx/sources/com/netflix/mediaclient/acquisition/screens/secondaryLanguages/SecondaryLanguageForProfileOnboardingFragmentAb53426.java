package com.netflix.mediaclient.acquisition.screens.secondaryLanguages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Skipped;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.components.signupButton.OnrampButton;
import com.netflix.mediaclient.acquisition.databinding.FragmentSecondaryLanguageForProfileOnboardingAb53426Binding;
import com.netflix.mediaclient.ui.R;
import dagger.hilt.android.AndroidEntryPoint;
import o.C1030Lx;
import o.C1204Sr;
import o.C8632dsu;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class SecondaryLanguageForProfileOnboardingFragmentAb53426 extends Hilt_SecondaryLanguageForProfileOnboardingFragmentAb53426 {
    public static final int $stable = 8;
    private FragmentSecondaryLanguageForProfileOnboardingAb53426Binding binding;
    private final boolean useDarkTheme = true;
    private final int transitioningBackgroundColorRes = C1030Lx.d.h;

    public static /* synthetic */ void getCtaButton$annotations() {
    }

    public static /* synthetic */ void getHeader$annotations() {
    }

    public static /* synthetic */ void getRecyclerView$annotations() {
    }

    public static /* synthetic */ void getScrollView$annotations() {
    }

    public static /* synthetic */ void getSubheader$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public int getTransitioningBackgroundColorRes() {
        return this.transitioningBackgroundColorRes;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment
    public boolean getUseDarkTheme() {
        return this.useDarkTheme;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment
    public void updateButtonStates(int i) {
    }

    private final FragmentSecondaryLanguageForProfileOnboardingAb53426Binding requireBinding() {
        FragmentSecondaryLanguageForProfileOnboardingAb53426Binding fragmentSecondaryLanguageForProfileOnboardingAb53426Binding = this.binding;
        if (fragmentSecondaryLanguageForProfileOnboardingAb53426Binding != null) {
            return fragmentSecondaryLanguageForProfileOnboardingAb53426Binding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment
    public RecyclerView getRecyclerView() {
        RecyclerView recyclerView = requireBinding().recyclerView;
        C8632dsu.a(recyclerView, "");
        return recyclerView;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment
    public NetflixSignupButton getCtaButton() {
        OnrampButton onrampButton = requireBinding().ctaButton;
        C8632dsu.a(onrampButton, "");
        return onrampButton;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment
    public C1204Sr getHeader() {
        C1204Sr c1204Sr = requireBinding().header;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment
    public C1204Sr getSubheader() {
        C1204Sr c1204Sr = requireBinding().subheader;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment
    public NestedScrollView getScrollView() {
        NestedScrollView nestedScrollView = requireBinding().scrollView;
        C8632dsu.a(nestedScrollView, "");
        return nestedScrollView;
    }

    private final C1204Sr getStepsView() {
        C1204Sr c1204Sr = requireBinding().stepLabel;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = FragmentSecondaryLanguageForProfileOnboardingAb53426Binding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment
    public void initSignupHeading() {
        getHeader().setText(getViewModel().getHeadingTextWithName());
        getSubheader().setText(getViewModel().getSubheadingString());
        String lowercaseStepsText = getViewModel().getStepsViewModel().getLowercaseStepsText();
        if (lowercaseStepsText != null) {
            getStepsView().setText(lowercaseStepsText);
            getStepsView().setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C8632dsu.c((Object) menuItem, "");
        if (menuItem.getItemId() == R.g.fQ) {
            Logger.INSTANCE.logEvent(new Skipped(AppView.skipProfilesGateSetting, null, CommandValue.SkipCommand, null));
            getSecondaryLanguageLogger().logNextAction(getViewModel().secondaryLanguagesList());
            getViewModel().submitSecondaryLanguage(getNetworkResponseListener());
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment, com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }
}
