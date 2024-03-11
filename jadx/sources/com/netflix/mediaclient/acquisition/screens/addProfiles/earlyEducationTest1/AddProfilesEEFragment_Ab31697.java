package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.core.content.ContextCompat;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.databinding.FragmentAddProfilesEeAb31697Binding;
import com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import o.C1204Sr;
import o.C8632dsu;
import o.aRN;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public class AddProfilesEEFragment_Ab31697 extends Hilt_AddProfilesEEFragment_Ab31697 {
    public static final int $stable = 8;
    private FragmentAddProfilesEeAb31697Binding binding;
    @Inject
    public AddProfilesEEDialogPresenter_Ab31697 earlyEducationDialogPresenter;
    private AddProfilesEEViewModel_Ab31697 viewmodel_Ab31697;

    public static /* synthetic */ void getCheckBoxErrorTextView$annotations() {
    }

    public static /* synthetic */ void getCheckBoxView$annotations() {
    }

    public static /* synthetic */ void getFaqLayout$annotations() {
    }

    public static /* synthetic */ void getReminderTextView$annotations() {
    }

    public static /* synthetic */ void getShareAccountTextView$annotations() {
    }

    public static /* synthetic */ void getToolTipTextView$annotations() {
    }

    public final void setEarlyEducationDialogPresenter(AddProfilesEEDialogPresenter_Ab31697 addProfilesEEDialogPresenter_Ab31697) {
        C8632dsu.c((Object) addProfilesEEDialogPresenter_Ab31697, "");
        this.earlyEducationDialogPresenter = addProfilesEEDialogPresenter_Ab31697;
    }

    public final AddProfilesEEDialogPresenter_Ab31697 getEarlyEducationDialogPresenter() {
        AddProfilesEEDialogPresenter_Ab31697 addProfilesEEDialogPresenter_Ab31697 = this.earlyEducationDialogPresenter;
        if (addProfilesEEDialogPresenter_Ab31697 != null) {
            return addProfilesEEDialogPresenter_Ab31697;
        }
        C8632dsu.d("");
        return null;
    }

    private final FragmentAddProfilesEeAb31697Binding requireBinding() {
        FragmentAddProfilesEeAb31697Binding fragmentAddProfilesEeAb31697Binding = this.binding;
        if (fragmentAddProfilesEeAb31697Binding != null) {
            return fragmentAddProfilesEeAb31697Binding;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    public final CheckBox getCheckBoxView() {
        CheckBox checkBox = requireBinding().checkBox;
        C8632dsu.a(checkBox, "");
        return checkBox;
    }

    public final C1204Sr getShareAccountTextView() {
        C1204Sr c1204Sr = requireBinding().shareAccountTextView;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final C1204Sr getCheckBoxErrorTextView() {
        C1204Sr c1204Sr = requireBinding().checkBoxErrorTextView;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final C1204Sr getReminderTextView() {
        C1204Sr c1204Sr = requireBinding().reminderTextView;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final C1204Sr getToolTipTextView() {
        C1204Sr c1204Sr = requireBinding().toolTipTextView;
        C8632dsu.a(c1204Sr, "");
        return c1204Sr;
    }

    public final AddProfilesEEFAQView_Ab31697 getFaqLayout() {
        AddProfilesEEFAQView_Ab31697 addProfilesEEFAQView_Ab31697 = requireBinding().faqLayout;
        C8632dsu.a(addProfilesEEFAQView_Ab31697, "");
        return addProfilesEEFAQView_Ab31697;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.binding = FragmentAddProfilesEeAb31697Binding.inflate(layoutInflater, viewGroup, false);
        return requireBinding().getRoot();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment
    public AddProfilesViewModel createAddProfilesViewModel() {
        AddProfilesEEViewModel_Ab31697 createAddProfilesViewModel_Ab31697 = getMoneyballEntryPoint().addProfilesViewModelInitializer().createAddProfilesViewModel_Ab31697(this);
        this.viewmodel_Ab31697 = createAddProfilesViewModel_Ab31697;
        if (createAddProfilesViewModel_Ab31697 == null) {
            C8632dsu.d("");
            return null;
        }
        return createAddProfilesViewModel_Ab31697;
    }

    @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment, com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        initEarlyEducationUI();
    }

    @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment, com.netflix.mediaclient.acquisition.screens.AbstractNetworkFragment2, com.netflix.mediaclient.acquisition.lib.screens.SignupFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    private final void initEarlyEducationUI() {
        aRN.a aVar = aRN.e;
        if (aVar.c()) {
            initCheckBox();
        } else if (aVar.b()) {
            initFAQ();
        } else if (aVar.d()) {
            initToolTip();
        } else if (aVar.a()) {
            initReminder();
        }
    }

    private final void initCheckBox() {
        C1204Sr shareAccountTextView = getShareAccountTextView();
        AddProfilesEEViewModel_Ab31697 addProfilesEEViewModel_Ab31697 = this.viewmodel_Ab31697;
        if (addProfilesEEViewModel_Ab31697 == null) {
            C8632dsu.d("");
            addProfilesEEViewModel_Ab31697 = null;
        }
        shareAccountTextView.setText(addProfilesEEViewModel_Ab31697.getCheckBoxText());
        getShareAccountTextView().setVisibility(0);
        getCheckBoxView().setVisibility(0);
        getCheckBoxView().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEFragment_Ab31697$$ExternalSyntheticLambda1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AddProfilesEEFragment_Ab31697.initCheckBox$lambda$1(AddProfilesEEFragment_Ab31697.this, compoundButton, z);
            }
        });
        getShareAccountTextView().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEFragment_Ab31697$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddProfilesEEFragment_Ab31697.initCheckBox$lambda$2(AddProfilesEEFragment_Ab31697.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCheckBox$lambda$1(AddProfilesEEFragment_Ab31697 addProfilesEEFragment_Ab31697, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) addProfilesEEFragment_Ab31697, "");
        AddProfilesEEViewModel_Ab31697 addProfilesEEViewModel_Ab31697 = addProfilesEEFragment_Ab31697.viewmodel_Ab31697;
        if (addProfilesEEViewModel_Ab31697 == null) {
            C8632dsu.d("");
            addProfilesEEViewModel_Ab31697 = null;
        }
        addProfilesEEViewModel_Ab31697.setCheckBoxSelected(z);
        addProfilesEEFragment_Ab31697.getCheckBoxErrorTextView().setVisibility(8);
        addProfilesEEFragment_Ab31697.getCheckBoxView().setActivated(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCheckBox$lambda$2(AddProfilesEEFragment_Ab31697 addProfilesEEFragment_Ab31697, View view) {
        C8632dsu.c((Object) addProfilesEEFragment_Ab31697, "");
        AddProfilesEEViewModel_Ab31697 addProfilesEEViewModel_Ab31697 = addProfilesEEFragment_Ab31697.viewmodel_Ab31697;
        AddProfilesEEViewModel_Ab31697 addProfilesEEViewModel_Ab316972 = null;
        if (addProfilesEEViewModel_Ab31697 == null) {
            C8632dsu.d("");
            addProfilesEEViewModel_Ab31697 = null;
        }
        AddProfilesEEViewModel_Ab31697 addProfilesEEViewModel_Ab316973 = addProfilesEEFragment_Ab31697.viewmodel_Ab31697;
        if (addProfilesEEViewModel_Ab316973 == null) {
            C8632dsu.d("");
            addProfilesEEViewModel_Ab316973 = null;
        }
        addProfilesEEViewModel_Ab31697.setCheckBoxSelected(!addProfilesEEViewModel_Ab316973.isCheckBoxSelected());
        CheckBox checkBoxView = addProfilesEEFragment_Ab31697.getCheckBoxView();
        AddProfilesEEViewModel_Ab31697 addProfilesEEViewModel_Ab316974 = addProfilesEEFragment_Ab31697.viewmodel_Ab31697;
        if (addProfilesEEViewModel_Ab316974 == null) {
            C8632dsu.d("");
        } else {
            addProfilesEEViewModel_Ab316972 = addProfilesEEViewModel_Ab316974;
        }
        checkBoxView.setChecked(addProfilesEEViewModel_Ab316972.isCheckBoxSelected());
        addProfilesEEFragment_Ab31697.getCheckBoxErrorTextView().setVisibility(8);
        addProfilesEEFragment_Ab31697.getCheckBoxView().setActivated(false);
    }

    private final void initFAQ() {
        AddProfilesEEFAQView_Ab31697 faqLayout = getFaqLayout();
        AddProfilesEEViewModel_Ab31697 addProfilesEEViewModel_Ab31697 = this.viewmodel_Ab31697;
        if (addProfilesEEViewModel_Ab31697 == null) {
            C8632dsu.d("");
            addProfilesEEViewModel_Ab31697 = null;
        }
        faqLayout.initFAQView(addProfilesEEViewModel_Ab31697.getFaqList());
        getFaqLayout().setVisibility(0);
    }

    private final void initToolTip() {
        C1204Sr toolTipTextView = getToolTipTextView();
        AddProfilesEEViewModel_Ab31697 addProfilesEEViewModel_Ab31697 = this.viewmodel_Ab31697;
        if (addProfilesEEViewModel_Ab31697 == null) {
            C8632dsu.d("");
            addProfilesEEViewModel_Ab31697 = null;
        }
        toolTipTextView.setText(addProfilesEEViewModel_Ab31697.getToolTipText());
        getToolTipTextView().setVisibility(0);
        getToolTipTextView().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEFragment_Ab31697$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddProfilesEEFragment_Ab31697.initToolTip$lambda$3(AddProfilesEEFragment_Ab31697.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolTip$lambda$3(AddProfilesEEFragment_Ab31697 addProfilesEEFragment_Ab31697, View view) {
        C8632dsu.c((Object) addProfilesEEFragment_Ab31697, "");
        addProfilesEEFragment_Ab31697.getEarlyEducationDialogPresenter().showEarlyEducationDialog(addProfilesEEFragment_Ab31697);
    }

    private final void initReminder() {
        Context context = getContext();
        AddProfilesEEViewModel_Ab31697 addProfilesEEViewModel_Ab31697 = null;
        Drawable drawable = context != null ? context.getDrawable(R.drawable.ic_test1_earlyedu_info) : null;
        Context context2 = getContext();
        if (context2 != null && drawable != null) {
            drawable.setTint(ContextCompat.getColor(context2, R.color.early_education_medium_grey));
        }
        getReminderTextView().setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        C1204Sr reminderTextView = getReminderTextView();
        AddProfilesEEViewModel_Ab31697 addProfilesEEViewModel_Ab316972 = this.viewmodel_Ab31697;
        if (addProfilesEEViewModel_Ab316972 == null) {
            C8632dsu.d("");
        } else {
            addProfilesEEViewModel_Ab31697 = addProfilesEEViewModel_Ab316972;
        }
        reminderTextView.setText(addProfilesEEViewModel_Ab31697.getReminderText());
        getReminderTextView().setMovementMethod(LinkMovementMethod.getInstance());
        getReminderTextView().setVisibility(0);
        getReminderTextView().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEFragment_Ab31697$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddProfilesEEFragment_Ab31697.initReminder$lambda$5(AddProfilesEEFragment_Ab31697.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initReminder$lambda$5(AddProfilesEEFragment_Ab31697 addProfilesEEFragment_Ab31697, View view) {
        C8632dsu.c((Object) addProfilesEEFragment_Ab31697, "");
        addProfilesEEFragment_Ab31697.getEarlyEducationDialogPresenter().showEarlyEducationDialog(addProfilesEEFragment_Ab31697);
    }

    @Override // com.netflix.mediaclient.acquisition.screens.addProfiles.AddProfilesFragment
    public void initClickListeners() {
        getCtaButton().setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEFragment_Ab31697$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddProfilesEEFragment_Ab31697.initClickListeners$lambda$6(AddProfilesEEFragment_Ab31697.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$6(AddProfilesEEFragment_Ab31697 addProfilesEEFragment_Ab31697, View view) {
        C8632dsu.c((Object) addProfilesEEFragment_Ab31697, "");
        addProfilesEEFragment_Ab31697.checkForDuplicateNames();
        if (addProfilesEEFragment_Ab31697.getViewModel().isFormValid()) {
            addProfilesEEFragment_Ab31697.logAndSubmitProfiles();
            return;
        }
        C1204Sr checkBoxErrorTextView = addProfilesEEFragment_Ab31697.getCheckBoxErrorTextView();
        AddProfilesEEViewModel_Ab31697 addProfilesEEViewModel_Ab31697 = addProfilesEEFragment_Ab31697.viewmodel_Ab31697;
        if (addProfilesEEViewModel_Ab31697 == null) {
            C8632dsu.d("");
            addProfilesEEViewModel_Ab31697 = null;
        }
        checkBoxErrorTextView.setText(addProfilesEEViewModel_Ab31697.getCheckBoxInlineErrorText());
        addProfilesEEFragment_Ab31697.getCheckBoxErrorTextView().setVisibility(0);
        addProfilesEEFragment_Ab31697.getCheckBoxView().setActivated(true);
    }
}
