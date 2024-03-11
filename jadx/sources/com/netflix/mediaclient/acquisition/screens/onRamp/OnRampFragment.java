package com.netflix.mediaclient.acquisition.screens.onRamp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.moneyball.fields.StringField;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.components.signupButton.OnrampButton;
import com.netflix.mediaclient.acquisition.databinding.FragmentOnRampBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.C1204Sr;
import o.C8168dfL;
import o.C8627dsp;
import o.C8632dsu;
import o.duD;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class OnRampFragment extends Hilt_OnRampFragment {
    public static final long ARTIFICIAL_PERSONALIZATION_WAIT_TIME = 3000;
    private FragmentOnRampBinding binding;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    @Inject
    public OnRampLogger onRampLogger;
    @Inject
    public OnRampNavigationListener onRampNavigationListener;
    public OnRampViewModel viewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final AppView appView = AppView.onrampTitleSelector;
    private NetworkRequestResponseListener networkResponseListener = new NetworkRequestResponseListener() { // from class: com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment$networkResponseListener$1
        @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
        public void onBeforeNetworkAction(Request request) {
            C8632dsu.c((Object) request, "");
        }

        @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
        public void onAfterNetworkAction(Response response) {
            C8632dsu.c((Object) response, "");
            OnRampFragment.this.getOnRampLogger().endSessions();
        }
    };

    /* loaded from: classes3.dex */
    public interface OnRampInteractionListener {
        void endSessions();

        void logContinueAction(List<String> list);

        void logSelectTitle(String str, boolean z);
    }

    /* loaded from: classes3.dex */
    public interface OnRampNavigationListener {
        void onrampFinished();

        void onrampNavigated();

        void onrampOutroDisplayed();

        void onrampSignOut();
    }

    public static /* synthetic */ void getChooseTextView$annotations() {
    }

    public static /* synthetic */ void getHeaderButton$annotations() {
    }

    public static /* synthetic */ void getNetworkResponseListener$annotations() {
    }

    public static /* synthetic */ void getRecyclerView$annotations() {
    }

    public static /* synthetic */ void getSubheaderTextView$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }

    public final NetworkRequestResponseListener getNetworkResponseListener() {
        return this.networkResponseListener;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setNetworkResponseListener(NetworkRequestResponseListener networkRequestResponseListener) {
        C8632dsu.c((Object) networkRequestResponseListener, "");
        this.networkResponseListener = networkRequestResponseListener;
    }

    public final void setOnRampLogger(OnRampLogger onRampLogger) {
        C8632dsu.c((Object) onRampLogger, "");
        this.onRampLogger = onRampLogger;
    }

    public final void setOnRampNavigationListener(OnRampNavigationListener onRampNavigationListener) {
        C8632dsu.c((Object) onRampNavigationListener, "");
        this.onRampNavigationListener = onRampNavigationListener;
    }

    public final void setViewModel(OnRampViewModel onRampViewModel) {
        C8632dsu.c((Object) onRampViewModel, "");
        this.viewModel = onRampViewModel;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    public final OnRampViewModel getViewModel() {
        OnRampViewModel onRampViewModel = this.viewModel;
        if (onRampViewModel != null) {
            return onRampViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    private final FragmentOnRampBinding requireBinding() {
        FragmentOnRampBinding fragmentOnRampBinding = this.binding;
        if (fragmentOnRampBinding != null) {
            return fragmentOnRampBinding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public RecyclerView getRecyclerView() {
        RecyclerView recyclerView = requireBinding().recyclerView;
        C8632dsu.a(recyclerView, "");
        return recyclerView;
    }

    public TextView getSubheaderTextView() {
        C1204Sr c1204Sr = requireBinding().subheaderText;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public TextView getChooseTextView() {
        C1204Sr c1204Sr = requireBinding().chooseText;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public NetflixSignupButton getHeaderButton() {
        OnrampButton onrampButton = requireBinding().headerCtaButton;
        C8632dsu.a(onrampButton, "");
        return onrampButton;
    }

    public final SignupMoneyballEntryPoint getMoneyballEntryPoint() {
        SignupMoneyballEntryPoint signupMoneyballEntryPoint = this.moneyballEntryPoint;
        if (signupMoneyballEntryPoint != null) {
            return signupMoneyballEntryPoint;
        }
        C8632dsu.d("");
        return null;
    }

    public final OnRampNavigationListener getOnRampNavigationListener() {
        OnRampNavigationListener onRampNavigationListener = this.onRampNavigationListener;
        if (onRampNavigationListener != null) {
            return onRampNavigationListener;
        }
        C8632dsu.d("");
        return null;
    }

    public final OnRampLogger getOnRampLogger() {
        OnRampLogger onRampLogger = this.onRampLogger;
        if (onRampLogger != null) {
            return onRampLogger;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.onRamp.Hilt_OnRampFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(createOnRampViewModel());
    }

    public final OnRampViewModel createOnRampViewModel() {
        return getMoneyballEntryPoint().onRampViewModelInitializer().createOnRampViewModel(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        getOnRampNavigationListener().onrampNavigated();
        this.binding = FragmentOnRampBinding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initTitlesGridRecyclerView();
        initCTATextAppearance();
        initClickListeners();
        initTitleSelectionListeners();
        initTextViews();
    }

    public final void initTextViews() {
        getChooseTextView().setText(getViewModel().getChooseText());
        getSubheaderTextView().setText(getViewModel().getSubheaderText());
    }

    private final void initCTATextAppearance() {
        TextViewCompat.setTextAppearance(getHeaderButton().getButton(), R.style.SignupCtaButton_OnboardingTweaks);
    }

    private final void initTitlesGridRecyclerView() {
        List<String> d;
        Object obj;
        StringField titleSelections = getViewModel().getTitleSelections();
        Object value = titleSelections != null ? titleSelections.getValue() : null;
        String str = value instanceof String ? (String) value : null;
        if (str != null && C8168dfL.h(str)) {
            d = duD.d((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
            for (String str2 : d) {
                Iterator<T> it = getViewModel().getTitlesData().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C8632dsu.c((Object) ((OnRampTitle) obj).getId(), (Object) str2)) {
                        break;
                    }
                }
                OnRampTitle onRampTitle = (OnRampTitle) obj;
                if (onRampTitle != null) {
                    onRampTitle.setSelected(true);
                }
            }
        }
        getRecyclerView().setLayoutManager(new GridLayoutManager(getContext(), getViewModel().getColumnCount()));
        getRecyclerView().setAdapter(new OnRampTitlesRecyclerViewAdapter(getViewModel().getTitlesData(), getViewModel().getSelectedTitlesLiveData(), getOnRampLogger()));
        getRecyclerView().addItemDecoration(new OnRampGridSpacingItemDecoration(getViewModel().getColumnCount(), getResources().getDimensionPixelSize(R.dimen.onramp_title_grid_spacing)));
    }

    public final void initTitleSelectionListeners() {
        Object value;
        StringField titleSelections = getViewModel().getTitleSelections();
        if (titleSelections != null && (value = titleSelections.getValue()) != null) {
            updateViewsForSelectedTitles((String) value);
            getViewModel().getSelectedTitlesLiveData().setValue(value);
        }
        getViewModel().getSelectedTitlesLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                OnRampFragment.initTitleSelectionListeners$lambda$3(OnRampFragment.this, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTitleSelectionListeners$lambda$3(OnRampFragment onRampFragment, String str) {
        C8632dsu.c((Object) onRampFragment, "");
        C8632dsu.d((Object) str);
        onRampFragment.updateViewsForSelectedTitles(str);
    }

    public final void updateViewsForSelectedTitles(String str) {
        List d;
        C8632dsu.c((Object) str, "");
        d = duD.d((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : d) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        updateButtonStates(arrayList.size());
        StringField titleSelections = getViewModel().getTitleSelections();
        if (titleSelections == null) {
            return;
        }
        titleSelections.setValue(str);
    }

    public void updateButtonStates(int i) {
        getHeaderButton().setActivated(i >= 3);
    }

    public final void initClickListeners() {
        getHeaderButton().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnRampFragment.initClickListeners$lambda$5(OnRampFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$5(OnRampFragment onRampFragment, View view) {
        C8632dsu.c((Object) onRampFragment, "");
        onRampFragment.continueClicked();
    }

    public void continueClicked() {
        getViewModel().performNextAction(this.networkResponseListener);
        getOnRampLogger().logContinueAction(getViewModel().getTitleSelectionsList());
        getOnRampNavigationListener().onrampFinished();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
        getOnRampLogger().endSessions();
    }
}
