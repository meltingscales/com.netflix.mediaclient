package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.databinding.ContextAddProfilesEeAb31697Binding;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.acquisition.util.SignupUtilities;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C1204Sr;
import o.C8632dsu;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class AddProfilesEEContextFragment_Ab31697 extends Hilt_AddProfilesEEContextFragment_Ab31697 {
    public static final int $stable = 8;
    @Inject
    public AddProfilesEEContextClickListener addProfilesEEContextClickListener;
    private final AppView appView = AppView.addProfile;
    private ContextAddProfilesEeAb31697Binding binding;
    @Inject
    public SignupMoneyballEntryPoint moneyballEntryPoint;
    public AddProfilesEEContextViewModel_Ab31697 viewModel;

    /* loaded from: classes3.dex */
    public interface AddProfilesEEContextClickListener {
        void onAddProfilesEEContextConfirm();
    }

    public static /* synthetic */ void getBullet1TextView$annotations() {
    }

    public static /* synthetic */ void getBullet2TextView$annotations() {
    }

    public static /* synthetic */ void getBullet3TextView$annotations() {
    }

    public static /* synthetic */ void getCtaButton$annotations() {
    }

    public static /* synthetic */ void getIconBullet1$annotations() {
    }

    public static /* synthetic */ void getIconBullet2$annotations() {
    }

    public static /* synthetic */ void getIconBullet3$annotations() {
    }

    public static /* synthetic */ void getTitleText$annotations() {
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment
    public AppView getAppView() {
        return this.appView;
    }

    public final void setAddProfilesEEContextClickListener(AddProfilesEEContextClickListener addProfilesEEContextClickListener) {
        C8632dsu.c((Object) addProfilesEEContextClickListener, "");
        this.addProfilesEEContextClickListener = addProfilesEEContextClickListener;
    }

    public final void setMoneyballEntryPoint(SignupMoneyballEntryPoint signupMoneyballEntryPoint) {
        C8632dsu.c((Object) signupMoneyballEntryPoint, "");
        this.moneyballEntryPoint = signupMoneyballEntryPoint;
    }

    public final void setViewModel(AddProfilesEEContextViewModel_Ab31697 addProfilesEEContextViewModel_Ab31697) {
        C8632dsu.c((Object) addProfilesEEContextViewModel_Ab31697, "");
        this.viewModel = addProfilesEEContextViewModel_Ab31697;
    }

    public final AddProfilesEEContextViewModel_Ab31697 getViewModel() {
        AddProfilesEEContextViewModel_Ab31697 addProfilesEEContextViewModel_Ab31697 = this.viewModel;
        if (addProfilesEEContextViewModel_Ab31697 != null) {
            return addProfilesEEContextViewModel_Ab31697;
        }
        C8632dsu.d("");
        return null;
    }

    public final AddProfilesEEContextClickListener getAddProfilesEEContextClickListener() {
        AddProfilesEEContextClickListener addProfilesEEContextClickListener = this.addProfilesEEContextClickListener;
        if (addProfilesEEContextClickListener != null) {
            return addProfilesEEContextClickListener;
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

    private final ContextAddProfilesEeAb31697Binding requireBinding() {
        ContextAddProfilesEeAb31697Binding contextAddProfilesEeAb31697Binding = this.binding;
        if (contextAddProfilesEeAb31697Binding != null) {
            return contextAddProfilesEeAb31697Binding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final ImageView getIconBullet1() {
        ImageView imageView = requireBinding().bulletsLayout.iconBullet1;
        C8632dsu.a(imageView, "");
        return imageView;
    }

    public final ImageView getIconBullet2() {
        ImageView imageView = requireBinding().bulletsLayout.iconBullet2;
        C8632dsu.a(imageView, "");
        return imageView;
    }

    public final ImageView getIconBullet3() {
        ImageView imageView = requireBinding().bulletsLayout.iconBullet3;
        C8632dsu.a(imageView, "");
        return imageView;
    }

    public final C1204Sr getBullet1TextView() {
        C1204Sr c1204Sr = requireBinding().bulletsLayout.bullet1;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final C1204Sr getBullet2TextView() {
        C1204Sr c1204Sr = requireBinding().bulletsLayout.bullet2;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final C1204Sr getBullet3TextView() {
        C1204Sr c1204Sr = requireBinding().bulletsLayout.bullet3;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final C1204Sr getTitleText() {
        C1204Sr c1204Sr = requireBinding().titleText;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final NetflixSignupButton getCtaButton() {
        NetflixSignupButton netflixSignupButton = requireBinding().ctaButton;
        C8632dsu.a(netflixSignupButton, "");
        return netflixSignupButton;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.Hilt_AddProfilesEEContextFragment_Ab31697, com.netflix.mediaclient.acquisition.lib.screens.Hilt_SignupFragment, androidx.fragment.app.Fragment
    @SuppressLint({"MissingSuperCall"})
    public void onAttach(Context context) {
        C8632dsu.c((Object) context, "");
        super.onAttach(context);
        setViewModel(getMoneyballEntryPoint().addProfilesEEContextViewModelInitializer_Ab31697().createAddProfilesEEContextViewModel_Ab31697());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = ContextAddProfilesEeAb31697Binding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initUI();
        initClickListeners();
    }

    @Override // com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    private final void initUI() {
        getCtaButton().setText(getViewModel().getCtaButtonText());
        getTitleText().setText(getViewModel().getTitleText());
        getBullet1TextView().setText(getViewModel().getBullet1Text());
        getBullet2TextView().setText(getViewModel().getBullet2Text());
        getBullet3TextView().setText(getViewModel().getBullet3Text());
        Context context = getContext();
        if (context != null) {
            getIconBullet1().setImageDrawable(SignupUtilities.getDrawableInColor(context, getViewModel().getIconBullet1Drawable(), R.color.signup_red_dark));
        }
        Context context2 = getContext();
        if (context2 != null) {
            getIconBullet2().setImageDrawable(SignupUtilities.getDrawableInColor(context2, getViewModel().getIconBullet2Drawable(), R.color.signup_red_dark));
        }
        Context context3 = getContext();
        if (context3 != null) {
            getIconBullet3().setImageDrawable(SignupUtilities.getDrawableInColor(context3, getViewModel().getIconBullet3Drawable(), R.color.signup_red_dark));
        }
    }

    private final void initClickListeners() {
        getCtaButton().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEContextFragment_Ab31697$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddProfilesEEContextFragment_Ab31697.initClickListeners$lambda$4(AddProfilesEEContextFragment_Ab31697.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$4(AddProfilesEEContextFragment_Ab31697 addProfilesEEContextFragment_Ab31697, View view) {
        C8632dsu.c((Object) addProfilesEEContextFragment_Ab31697, "");
        addProfilesEEContextFragment_Ab31697.getAddProfilesEEContextClickListener().onAddProfilesEEContextConfirm();
    }
}
