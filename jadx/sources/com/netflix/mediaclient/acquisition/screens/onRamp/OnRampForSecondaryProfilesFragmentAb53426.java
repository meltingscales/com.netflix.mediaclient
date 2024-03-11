package com.netflix.mediaclient.acquisition.screens.onRamp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Skipped;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.components.signupButton.OnrampButton;
import com.netflix.mediaclient.acquisition.databinding.FragmentOnRampForProfileOnboardingAb53426Binding;
import com.netflix.mediaclient.ui.R;
import dagger.hilt.android.AndroidEntryPoint;
import o.C1030Lx;
import o.C1204Sr;
import o.C8632dsu;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class OnRampForSecondaryProfilesFragmentAb53426 extends Hilt_OnRampForSecondaryProfilesFragmentAb53426 {
    public static final int $stable = 8;
    private FragmentOnRampForProfileOnboardingAb53426Binding binding;
    private final int transitioningBackgroundColorRes = C1030Lx.d.h;

    public static /* synthetic */ void getChooseTextView$annotations() {
    }

    public static /* synthetic */ void getHeaderButton$annotations() {
    }

    public static /* synthetic */ void getRecyclerView$annotations() {
    }

    public static /* synthetic */ void getSubheaderTextView$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public int getTransitioningBackgroundColorRes() {
        return this.transitioningBackgroundColorRes;
    }

    private final FragmentOnRampForProfileOnboardingAb53426Binding requireBinding() {
        FragmentOnRampForProfileOnboardingAb53426Binding fragmentOnRampForProfileOnboardingAb53426Binding = this.binding;
        if (fragmentOnRampForProfileOnboardingAb53426Binding != null) {
            return fragmentOnRampForProfileOnboardingAb53426Binding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment
    public RecyclerView getRecyclerView() {
        RecyclerView recyclerView = requireBinding().recyclerView;
        C8632dsu.a(recyclerView, "");
        return recyclerView;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment
    public TextView getSubheaderTextView() {
        C1204Sr c1204Sr = requireBinding().subheaderText;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment
    public TextView getChooseTextView() {
        C1204Sr c1204Sr = requireBinding().chooseText;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment
    public NetflixSignupButton getHeaderButton() {
        OnrampButton onrampButton = requireBinding().headerCtaButton;
        C8632dsu.a(onrampButton, "");
        return onrampButton;
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

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        getOnRampNavigationListener().onrampNavigated();
        this.binding = FragmentOnRampForProfileOnboardingAb53426Binding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment, com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        String lowercaseStepsText = getViewModel().getStepsViewModel().getLowercaseStepsText();
        if (lowercaseStepsText != null) {
            getStepsView().setText(lowercaseStepsText);
            getStepsView().setVisibility(0);
        }
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment, com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C8632dsu.c((Object) menuItem, "");
        if (menuItem.getItemId() == R.g.fQ) {
            Logger.INSTANCE.logEvent(new Skipped(AppView.skipProfilesGateSetting, null, CommandValue.SkipCommand, null));
            continueClicked();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment
    public void updateButtonStates(int i) {
        int i2 = 3 - i;
        boolean z = i2 <= 0;
        getHeaderButton().setActivated(z);
        if (z) {
            getHeaderButton().setText(getViewModel().getButtonFinishedText());
            return;
        }
        getHeaderButton().setText(getViewModel().getButtonText(i2));
        getHeaderButton().updateTextAndButtonColor(C1030Lx.d.f13374o, C1030Lx.d.a);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment
    public void continueClicked() {
        getViewModel().performNextAction(getNetworkResponseListener());
        getOnRampLogger().logContinueAction(getViewModel().getTitleSelectionsList());
    }
}
