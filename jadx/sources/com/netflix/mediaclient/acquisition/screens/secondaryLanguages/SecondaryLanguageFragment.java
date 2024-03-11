package com.netflix.mediaclient.acquisition.screens.secondaryLanguages;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.components.signupButton.OnrampButton;
import com.netflix.mediaclient.acquisition.databinding.FragmentSecondaryLanguageBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
import com.netflix.mediaclient.acquisition.services.logging.TtrEventListener;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.C1204Sr;
import o.C8150deu;
import o.C8632dsu;
import o.duD;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class SecondaryLanguageFragment extends Hilt_SecondaryLanguageFragment {
    public static final int $stable = 8;
    private FragmentSecondaryLanguageBinding binding;
    @Inject
    public FormDataObserverFactory formDataObserverFactory;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    @Inject
    public SecondaryLanguageLogger secondaryLanguageLogger;
    @Inject
    public TtrEventListener ttrEventListener;
    private final boolean useDarkTheme;
    public SecondaryLanguageViewModel viewModel;
    private final AppView appView = AppView.secondaryLanguagesSelector;
    private NetworkRequestResponseListener networkResponseListener = new NetworkRequestResponseListener() { // from class: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment$networkResponseListener$1
        @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
        public void onBeforeNetworkAction(Request request) {
            C8632dsu.c((Object) request, "");
        }

        @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
        public void onAfterNetworkAction(Response response) {
            C8632dsu.c((Object) response, "");
            SecondaryLanguageFragment.this.getSecondaryLanguageLogger().endSessions();
        }
    };

    /* loaded from: classes3.dex */
    public interface SecondaryLanguageInteractionListener {
        void endSessions();

        void logNextAction(List<String> list);
    }

    public static /* synthetic */ void getCtaButton$annotations() {
    }

    public static /* synthetic */ void getHeader$annotations() {
    }

    public static /* synthetic */ void getNetworkResponseListener$annotations() {
    }

    public static /* synthetic */ void getRecyclerView$annotations() {
    }

    public static /* synthetic */ void getScrollView$annotations() {
    }

    public static /* synthetic */ void getSubheader$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }

    public NetworkRequestResponseListener getNetworkResponseListener() {
        return this.networkResponseListener;
    }

    public boolean getUseDarkTheme() {
        return this.useDarkTheme;
    }

    public final void setFormDataObserverFactory(FormDataObserverFactory formDataObserverFactory) {
        C8632dsu.c((Object) formDataObserverFactory, "");
        this.formDataObserverFactory = formDataObserverFactory;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public void setNetworkResponseListener(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        this.networkResponseListener = networkRequestResponseListener;
    }

    public final void setSecondaryLanguageLogger(SecondaryLanguageLogger secondaryLanguageLogger) {
        C8632dsu.c((Object) secondaryLanguageLogger, "");
        this.secondaryLanguageLogger = secondaryLanguageLogger;
    }

    public final void setTtrEventListener(TtrEventListener ttrEventListener) {
        C8632dsu.c((Object) ttrEventListener, "");
        this.ttrEventListener = ttrEventListener;
    }

    public final void setViewModel(SecondaryLanguageViewModel secondaryLanguageViewModel) {
        C8632dsu.c((Object) secondaryLanguageViewModel, "");
        this.viewModel = secondaryLanguageViewModel;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
    }

    public final SecondaryLanguageViewModel getViewModel() {
        SecondaryLanguageViewModel secondaryLanguageViewModel = this.viewModel;
        if (secondaryLanguageViewModel != null) {
            return secondaryLanguageViewModel;
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

    public final SignupMoneyballEntryPoint getMoneyballEntryPoint() {
        SignupMoneyballEntryPoint signupMoneyballEntryPoint = this.moneyballEntryPoint;
        if (signupMoneyballEntryPoint != null) {
            return signupMoneyballEntryPoint;
        }
        C8632dsu.d("");
        return null;
    }

    private final FragmentSecondaryLanguageBinding requireBinding() {
        FragmentSecondaryLanguageBinding fragmentSecondaryLanguageBinding = this.binding;
        if (fragmentSecondaryLanguageBinding != null) {
            return fragmentSecondaryLanguageBinding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public RecyclerView getRecyclerView() {
        RecyclerView recyclerView = requireBinding().recyclerView;
        C8632dsu.a(recyclerView, "");
        return recyclerView;
    }

    public NetflixSignupButton getCtaButton() {
        OnrampButton onrampButton = requireBinding().ctaButton;
        C8632dsu.a(onrampButton, "");
        return onrampButton;
    }

    public C1204Sr getHeader() {
        C1204Sr c1204Sr = requireBinding().header;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public C1204Sr getSubheader() {
        C1204Sr c1204Sr = requireBinding().subheader;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public NestedScrollView getScrollView() {
        NestedScrollView nestedScrollView = requireBinding().scrollView;
        C8632dsu.a(nestedScrollView, "");
        return nestedScrollView;
    }

    public final FormDataObserverFactory getFormDataObserverFactory() {
        FormDataObserverFactory formDataObserverFactory = this.formDataObserverFactory;
        if (formDataObserverFactory != null) {
            return formDataObserverFactory;
        }
        C8632dsu.d("");
        return null;
    }

    public final SecondaryLanguageLogger getSecondaryLanguageLogger() {
        SecondaryLanguageLogger secondaryLanguageLogger = this.secondaryLanguageLogger;
        if (secondaryLanguageLogger != null) {
            return secondaryLanguageLogger;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
        getViewModel().getSecondaryLanguageLoading().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createButtonLoadingObserver(getCtaButton()));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.secondaryLanguages.Hilt_SecondaryLanguageFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(createSecondaryLanguageViewModel());
    }

    private final SecondaryLanguageViewModel createSecondaryLanguageViewModel() {
        return getMoneyballEntryPoint().secondaryLanguageViewModelInitializer().createSecondaryLanguageViewModel(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = FragmentSecondaryLanguageBinding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    @SuppressLint({"FragmentLiveDataObserve"})
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initSignupHeading();
        TextViewCompat.setTextAppearance(getCtaButton().getButton(), R.style.SignupCtaButton_OnboardingTweaks);
        initLanguageRecyclerView();
        initClickListeners();
        getViewModel().getSelectedLanguagesLiveData().observe(this, new Observer() { // from class: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SecondaryLanguageFragment.onViewCreated$lambda$2(SecondaryLanguageFragment.this, (String) obj);
            }
        });
        getTtrEventListener().onPageRenderSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(SecondaryLanguageFragment secondaryLanguageFragment, String str) {
        List d;
        C8632dsu.c((Object) secondaryLanguageFragment, "");
        StringField secondaryLanguages = secondaryLanguageFragment.getViewModel().getSecondaryLanguages();
        if (secondaryLanguages != null) {
            C8632dsu.d((Object) str);
            secondaryLanguages.setValue(str);
        }
        C8632dsu.d((Object) str);
        d = duD.d((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : d) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        secondaryLanguageFragment.updateButtonStates(arrayList.size());
    }

    public void updateButtonStates(int i) {
        getCtaButton().setText(getViewModel().getCtaButtonText());
        getCtaButton().setActivated(i > 0);
    }

    private final void initLanguageRecyclerView() {
        RecyclerView.LayoutManager linearLayoutManager;
        RecyclerView recyclerView = getRecyclerView();
        if (C8150deu.s(getContext())) {
            linearLayoutManager = new GridLayoutManager(getContext(), 2);
        } else {
            linearLayoutManager = new LinearLayoutManager(getContext());
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        getRecyclerView().setAdapter(new SecondaryLanguageRecyclerViewAdapter(getViewModel().languagesData(), getViewModel().getSelectedLanguagesLiveData(), getUseDarkTheme()));
    }

    public void initSignupHeading() {
        getHeader().setText(getViewModel().getHeadingText());
        getSubheader().setText(getViewModel().getSubheadingString());
    }

    private final void initClickListeners() {
        getCtaButton().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.secondaryLanguages.SecondaryLanguageFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecondaryLanguageFragment.initClickListeners$lambda$3(SecondaryLanguageFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$3(SecondaryLanguageFragment secondaryLanguageFragment, View view) {
        C8632dsu.c((Object) secondaryLanguageFragment, "");
        secondaryLanguageFragment.getSecondaryLanguageLogger().logNextAction(secondaryLanguageFragment.getViewModel().secondaryLanguagesList());
        secondaryLanguageFragment.getViewModel().submitSecondaryLanguage(secondaryLanguageFragment.getNetworkResponseListener());
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
        getSecondaryLanguageLogger().endSessions();
    }
}
