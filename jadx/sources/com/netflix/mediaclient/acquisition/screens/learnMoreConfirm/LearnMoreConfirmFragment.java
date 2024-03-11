package com.netflix.mediaclient.acquisition.screens.learnMoreConfirm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.status.DialogWarningObserver;
import com.netflix.mediaclient.acquisition.databinding.FragmentLearnMoreConfirmBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.services.logging.TtrEventListener;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C8632dsu;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class LearnMoreConfirmFragment extends Hilt_LearnMoreConfirmFragment {
    public static final int $stable = 8;
    private final AppView appView = AppView.learnMoreConfirm;
    private FragmentLearnMoreConfirmBinding binding;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    @Inject
    public TtrEventListener ttrEventListener;
    public LearnMoreConfirmViewModel viewModel;

    public static /* synthetic */ void getBanner$annotations() {
    }

    public static /* synthetic */ void getHeader$annotations() {
    }

    public static /* synthetic */ void getSubheader$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setTtrEventListener(TtrEventListener ttrEventListener) {
        C8632dsu.c((Object) ttrEventListener, "");
        this.ttrEventListener = ttrEventListener;
    }

    public final void setViewModel(LearnMoreConfirmViewModel learnMoreConfirmViewModel) {
        C8632dsu.c((Object) learnMoreConfirmViewModel, "");
        this.viewModel = learnMoreConfirmViewModel;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
    }

    public final LearnMoreConfirmViewModel getViewModel() {
        LearnMoreConfirmViewModel learnMoreConfirmViewModel = this.viewModel;
        if (learnMoreConfirmViewModel != null) {
            return learnMoreConfirmViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    private final FragmentLearnMoreConfirmBinding requireBinding() {
        FragmentLearnMoreConfirmBinding fragmentLearnMoreConfirmBinding = this.binding;
        if (fragmentLearnMoreConfirmBinding != null) {
            return fragmentLearnMoreConfirmBinding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final TextView getHeader() {
        View findViewById = requireView().findViewById(R.id.header);
        C8632dsu.a(findViewById, "");
        return (TextView) findViewById;
    }

    public final TextView getSubheader() {
        View findViewById = requireView().findViewById(R.id.subheader);
        C8632dsu.a(findViewById, "");
        return (TextView) findViewById;
    }

    public final View getBanner() {
        View findViewById = requireView().findViewById(R.id.banner);
        C8632dsu.a(findViewById, "");
        return findViewById;
    }

    public final SignupMoneyballEntryPoint getMoneyballEntryPoint() {
        SignupMoneyballEntryPoint signupMoneyballEntryPoint = this.moneyballEntryPoint;
        if (signupMoneyballEntryPoint != null) {
            return signupMoneyballEntryPoint;
        }
        C8632dsu.d("");
        return null;
    }

    public final TtrEventListener getTtrEventListener() {
        TtrEventListener ttrEventListener = this.ttrEventListener;
        if (ttrEventListener != null) {
            return ttrEventListener;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.learnMoreConfirm.Hilt_LearnMoreConfirmFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(createLearnMoreConfirmViewModel());
    }

    public LearnMoreConfirmViewModel createLearnMoreConfirmViewModel() {
        return getMoneyballEntryPoint().learnMoreConfirmViewModelInitializer().createLearnMoreConfirmViewModel(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = FragmentLearnMoreConfirmBinding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initViews();
        getTtrEventListener().onPageRenderSuccess();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    public void initViews() {
        getHeader().setText(getViewModel().getHeaderText());
        getSubheader().setText(getViewModel().getSubHeaderText());
        View banner = getBanner();
        if (banner == null) {
            return;
        }
        banner.setVisibility(getViewModel().getShowReceivedEmailExperience() ^ true ? 4 : 0);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
        getViewModel().getDisplayedError().observe(getViewLifecycleOwner(), new DialogWarningObserver(requireNetflixActivity()));
    }
}
