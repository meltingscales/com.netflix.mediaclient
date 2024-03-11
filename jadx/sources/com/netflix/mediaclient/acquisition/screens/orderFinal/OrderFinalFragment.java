package com.netflix.mediaclient.acquisition.screens.orderFinal;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Observer;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.components.banner.SignupBannerView;
import com.netflix.mediaclient.acquisition.components.form.FormDataObserverFactory;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.databinding.FragmentOrderFinalBinding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener;
import com.netflix.mediaclient.acquisition.lib.Request;
import com.netflix.mediaclient.acquisition.lib.Response;
import com.netflix.mediaclient.acquisition.lib.util.kotlinx.TextViewKt;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import o.C1204Sr;
import o.C6371cbz;
import o.C8632dsu;
import o.C9618tM;
import o.dpR;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class OrderFinalFragment extends Hilt_OrderFinalFragment {
    public static final int $stable = 8;
    private final AppView appView = AppView.orderFinal;
    private FragmentOrderFinalBinding binding;
    @Inject
    public FormDataObserverFactory formDataObserverFactory;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    @Inject
    public OrderFinalLogger orderFinalLogger;
    public OrderFinalViewModel viewModel;

    /* loaded from: classes3.dex */
    public interface OrderFinalInteractionListener {
        void endSessions();

        void logContinueAction();

        void logPhoneFocusChange(boolean z);
    }

    public static /* synthetic */ void getAutoContinueMessage$annotations() {
    }

    public static /* synthetic */ void getCountryFlagPicker$annotations() {
    }

    public static /* synthetic */ void getCtaButton$annotations() {
    }

    public static /* synthetic */ void getDirectDebitMessage$annotations() {
    }

    public static /* synthetic */ void getPhoneBodyText$annotations() {
    }

    public static /* synthetic */ void getPhoneEditText$annotations() {
    }

    public static /* synthetic */ void getPhoneEntry$annotations() {
    }

    public static /* synthetic */ void getPhoneEntryTitle$annotations() {
    }

    public static /* synthetic */ void getScrollView$annotations() {
    }

    public static /* synthetic */ void getSignupConfirmationMessage$annotations() {
    }

    public static /* synthetic */ void getSmsCheckboxSection$annotations() {
    }

    public static /* synthetic */ void getSmsConsentCheckbox$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getWarningView$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }

    public final void setFormDataObserverFactory(FormDataObserverFactory formDataObserverFactory) {
        C8632dsu.c((Object) formDataObserverFactory, "");
        this.formDataObserverFactory = formDataObserverFactory;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setOrderFinalLogger(OrderFinalLogger orderFinalLogger) {
        C8632dsu.c((Object) orderFinalLogger, "");
        this.orderFinalLogger = orderFinalLogger;
    }

    public final void setViewModel(OrderFinalViewModel orderFinalViewModel) {
        C8632dsu.c((Object) orderFinalViewModel, "");
        this.viewModel = orderFinalViewModel;
    }

    public final OrderFinalViewModel getViewModel() {
        OrderFinalViewModel orderFinalViewModel = this.viewModel;
        if (orderFinalViewModel != null) {
            return orderFinalViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    private final FragmentOrderFinalBinding requireBinding() {
        FragmentOrderFinalBinding fragmentOrderFinalBinding = this.binding;
        if (fragmentOrderFinalBinding != null) {
            return fragmentOrderFinalBinding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final View getScrollView() {
        NestedScrollView nestedScrollView = requireBinding().scrollView;
        C8632dsu.a(nestedScrollView, "");
        return nestedScrollView;
    }

    public final SignupBannerView getWarningView() {
        SignupBannerView signupBannerView = requireBinding().warningView;
        C8632dsu.a(signupBannerView, "");
        return signupBannerView;
    }

    public final TextView getTitle() {
        C1204Sr c1204Sr = requireBinding().messaging.title;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final TextView getSignupConfirmationMessage() {
        C1204Sr c1204Sr = requireBinding().messaging.signupConfirmationMessage;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final TextView getAutoContinueMessage() {
        C1204Sr c1204Sr = requireBinding().messaging.autoContinueMessage;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final TextView getDirectDebitMessage() {
        C1204Sr c1204Sr = requireBinding().messaging.directDebitMessage;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final NetflixSignupButton getCtaButton() {
        NetflixSignupButton netflixSignupButton = requireBinding().ctaButton;
        C8632dsu.a(netflixSignupButton, "");
        return netflixSignupButton;
    }

    public final LinearLayout getPhoneEntry() {
        LinearLayout root = requireBinding().phoneEntry.getRoot();
        C8632dsu.a(root, "");
        return root;
    }

    public final TextView getPhoneEntryTitle() {
        C1204Sr c1204Sr = requireBinding().phoneEntry.phoneEntryTitle;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final EditText getPhoneEditText() {
        EditText editText = requireBinding().phoneEntry.phoneEditText;
        C8632dsu.a(editText, "");
        return editText;
    }

    public final C6371cbz getCountryFlagPicker() {
        C6371cbz c6371cbz = requireBinding().phoneEntry.countryPicker;
        C8632dsu.a(c6371cbz, "");
        return c6371cbz;
    }

    public final TextView getPhoneBodyText() {
        C1204Sr c1204Sr = requireBinding().phoneEntry.phoneBodyText;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final LinearLayout getSmsCheckboxSection() {
        LinearLayout linearLayout = requireBinding().phoneEntry.smsCheckboxSection;
        C8632dsu.a(linearLayout, "");
        return linearLayout;
    }

    public final CheckBox getSmsConsentCheckbox() {
        CheckBox checkBox = requireBinding().phoneEntry.smsConsentCheckbox;
        C8632dsu.a(checkBox, "");
        return checkBox;
    }

    public final SignupMoneyballEntryPoint getMoneyballEntryPoint() {
        SignupMoneyballEntryPoint signupMoneyballEntryPoint = this.moneyballEntryPoint;
        if (signupMoneyballEntryPoint != null) {
            return signupMoneyballEntryPoint;
        }
        C8632dsu.d("");
        return null;
    }

    public final FormDataObserverFactory getFormDataObserverFactory() {
        FormDataObserverFactory formDataObserverFactory = this.formDataObserverFactory;
        if (formDataObserverFactory != null) {
            return formDataObserverFactory;
        }
        C8632dsu.d("");
        return null;
    }

    public final OrderFinalLogger getOrderFinalLogger() {
        OrderFinalLogger orderFinalLogger = this.orderFinalLogger;
        if (orderFinalLogger != null) {
            return orderFinalLogger;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.orderFinal.Hilt_OrderFinalFragment, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(getMoneyballEntryPoint().orderFinalViewModelInitializer().createOrderFinalViewModel(this));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = FragmentOrderFinalBinding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initClickListeners();
        initMessages();
        initPhoneEntry();
    }

    private final void initMessages() {
        TextViewKt.setTextOrGone(getTitle(), getViewModel().getTitle());
        TextViewKt.setTextOrGone(getSignupConfirmationMessage(), getViewModel().getSignupConfirmationMessage());
        TextViewKt.setTextOrGone(getAutoContinueMessage(), getViewModel().getAutoContinueMessage());
        TextViewKt.setTextOrGone(getDirectDebitMessage(), getViewModel().getDirectDebitMessage());
    }

    @SuppressLint({"CheckResult", "AutoDispose", "FragmentLiveDataObserve"})
    private final void initPhoneEntry() {
        if (!getViewModel().getShouldShowPhoneNumber()) {
            getPhoneEntry().setVisibility(8);
            return;
        }
        getPhoneEntryTitle().setText(getViewModel().getPhoneEntryTitle());
        getViewModel().getCountryCodeLiveData().observe(this, new Observer() { // from class: com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                OrderFinalFragment.initPhoneEntry$lambda$1(OrderFinalFragment.this, (String) obj);
            }
        });
        getViewModel().fetchPhoneCodes();
        getCountryFlagPicker().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OrderFinalFragment.initPhoneEntry$lambda$2(OrderFinalFragment.this, view);
            }
        });
        getPhoneEditText().addTextChangedListener(new TextWatcher() { // from class: com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment$initPhoneEntry$3
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (editable != null) {
                    OrderFinalFragment.this.getViewModel().updatePhoneNumber(editable.toString());
                }
            }
        });
        getPhoneBodyText().setText(getViewModel().getPhoneBodyText());
        if (getViewModel().showSmsConsent()) {
            getSmsCheckboxSection().setVisibility(0);
            getSmsConsentCheckbox().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment$$ExternalSyntheticLambda4
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    OrderFinalFragment.initPhoneEntry$lambda$3(OrderFinalFragment.this, compoundButton, z);
                }
            });
        }
        Observable<Boolean> skip = C9618tM.b(getPhoneEditText()).takeUntil(C9618tM.d(getPhoneEditText())).skip(1L);
        final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment$initPhoneEntry$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Boolean bool) {
                invoke2(bool);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                OrderFinalLogger orderFinalLogger = OrderFinalFragment.this.getOrderFinalLogger();
                C8632dsu.d(bool);
                orderFinalLogger.logPhoneFocusChange(bool.booleanValue());
            }
        };
        Observable<Boolean> doOnNext = skip.doOnNext(new Consumer() { // from class: com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderFinalFragment.initPhoneEntry$lambda$4(drM.this, obj);
            }
        });
        final OrderFinalFragment$initPhoneEntry$6 orderFinalFragment$initPhoneEntry$6 = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment$initPhoneEntry$6
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(Boolean bool) {
                invoke2(bool);
                return dpR.c;
            }
        };
        doOnNext.subscribe(new Consumer() { // from class: com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderFinalFragment.initPhoneEntry$lambda$5(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPhoneEntry$lambda$1(OrderFinalFragment orderFinalFragment, String str) {
        C8632dsu.c((Object) orderFinalFragment, "");
        C8632dsu.d((Object) str);
        orderFinalFragment.updateCountryFlag(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPhoneEntry$lambda$2(OrderFinalFragment orderFinalFragment, View view) {
        C8632dsu.c((Object) orderFinalFragment, "");
        orderFinalFragment.showCountryDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPhoneEntry$lambda$3(OrderFinalFragment orderFinalFragment, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) orderFinalFragment, "");
        orderFinalFragment.getViewModel().updateSmsConsent(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPhoneEntry$lambda$4(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPhoneEntry$lambda$5(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    private final void showCountryDialog() {
        final String[] phoneCodesArray = getViewModel().getPhoneCodesArray();
        if (phoneCodesArray != null) {
            new AlertDialog.Builder(getContext()).setSingleChoiceItems(phoneCodesArray, -1, new DialogInterface.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    OrderFinalFragment.showCountryDialog$lambda$7$lambda$6(OrderFinalFragment.this, phoneCodesArray, dialogInterface, i);
                }
            }).setCancelable(true).create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCountryDialog$lambda$7$lambda$6(OrderFinalFragment orderFinalFragment, String[] strArr, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) orderFinalFragment, "");
        C8632dsu.c((Object) strArr, "");
        orderFinalFragment.getViewModel().updateSelectedCountry(strArr[i]);
        dialogInterface.dismiss();
    }

    private final void updateCountryFlag(String str) {
        getCountryFlagPicker().b(str);
    }

    private final void initClickListeners() {
        getCtaButton().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OrderFinalFragment.initClickListeners$lambda$8(OrderFinalFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$8(final OrderFinalFragment orderFinalFragment, View view) {
        C8632dsu.c((Object) orderFinalFragment, "");
        orderFinalFragment.getOrderFinalLogger().logContinueAction();
        orderFinalFragment.getViewModel().performContinueAction(new NetworkRequestResponseListener() { // from class: com.netflix.mediaclient.acquisition.screens.orderFinal.OrderFinalFragment$initClickListeners$1$1
            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
            public void onBeforeNetworkAction(Request request) {
                C8632dsu.c((Object) request, "");
            }

            @Override // com.netflix.mediaclient.acquisition.lib.NetworkRequestResponseListener
            public void onAfterNetworkAction(Response response) {
                C8632dsu.c((Object) response, "");
                OrderFinalFragment.this.getOrderFinalLogger().endSessions();
            }
        });
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupWarningObserver() {
        getViewModel().getDisplayedError().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createInlineWarningObserver(getWarningView(), getScrollView()));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2
    public void setupLoadingObserver() {
        getViewModel().getOrderFinalLoading().observe(getViewLifecycleOwner(), getFormDataObserverFactory().createButtonLoadingObserver(getCtaButton()));
    }

    @Override // com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
        getOrderFinalLogger().endSessions();
    }
}
