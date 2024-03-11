package com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextInteractionListenerFactory;
import com.netflix.mediaclient.acquisition.databinding.FormInputProfileEntryEditTextCheckboxBinding;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import o.C1026Lt;
import o.C1030Lx;
import o.C1204Sr;
import o.C8627dsp;
import o.C8632dsu;
import o.C9618tM;
import o.C9631tZ;
import o.C9834xU;
import o.dpR;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class ProfileEntryEditTextCheckbox extends Hilt_ProfileEntryEditTextCheckbox {
    private final FormInputProfileEntryEditTextCheckboxBinding binding;
    private final EditText editText;
    private Disposable focusChangeDisposable;
    private final C1204Sr inputError;
    private final TextInputLayout inputLayout;
    private final ConstraintLayout inputWrapper;
    private FormViewEditText.FormViewEditTextInteractionListener interactionListener;
    @Inject
    public FormViewEditTextInteractionListenerFactory interactionListenerFactory;
    private final CheckBox kidsCheckBox;
    private final C1204Sr kidsIcon;
    private Disposable textChangeDisposable;
    private boolean useDarkMode;
    private String userIconType;
    private ProfileEntryEditTextCheckboxViewModel viewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int SELECTED_COLOR = C9834xU.c.e;
    private static final int DEFAULT_COLOR = C9834xU.c.m;

    /* loaded from: classes3.dex */
    public interface OnInputChangedListener {
        void onInputChanged();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileEntryEditTextCheckbox(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileEntryEditTextCheckbox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileEntryEditTextCheckbox(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public static /* synthetic */ void getEditText$annotations() {
    }

    public static /* synthetic */ void getInputError$annotations() {
    }

    public static /* synthetic */ void getInputLayout$annotations() {
    }

    public static /* synthetic */ void getInputWrapper$annotations() {
    }

    public final EditText getEditText() {
        return this.editText;
    }

    public final C1204Sr getInputError() {
        return this.inputError;
    }

    public final TextInputLayout getInputLayout() {
        return this.inputLayout;
    }

    public final ConstraintLayout getInputWrapper() {
        return this.inputWrapper;
    }

    public final CheckBox getKidsCheckBox() {
        return this.kidsCheckBox;
    }

    public final C1204Sr getKidsIcon() {
        return this.kidsIcon;
    }

    public final ProfileEntryEditTextCheckboxViewModel getViewModel() {
        return this.viewModel;
    }

    public final void setInteractionListenerFactory(FormViewEditTextInteractionListenerFactory formViewEditTextInteractionListenerFactory) {
        C8632dsu.c((Object) formViewEditTextInteractionListenerFactory, "");
        this.interactionListenerFactory = formViewEditTextInteractionListenerFactory;
    }

    public final void setViewModel(ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel) {
        this.viewModel = profileEntryEditTextCheckboxViewModel;
    }

    public /* synthetic */ ProfileEntryEditTextCheckbox(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileEntryEditTextCheckbox(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
        FormInputProfileEntryEditTextCheckboxBinding inflate = FormInputProfileEntryEditTextCheckboxBinding.inflate(LayoutInflater.from(context), this);
        C8632dsu.a(inflate, "");
        this.binding = inflate;
        CheckBox checkBox = inflate.kidsCheckBox;
        C8632dsu.a(checkBox, "");
        this.kidsCheckBox = checkBox;
        C1204Sr c1204Sr = inflate.kidsIcon;
        C8632dsu.a(c1204Sr, "");
        this.kidsIcon = c1204Sr;
        EditText editText = inflate.editText;
        C8632dsu.a(editText, "");
        this.editText = editText;
        C1204Sr c1204Sr2 = inflate.inputError;
        C8632dsu.a(c1204Sr2, "");
        this.inputError = c1204Sr2;
        TextInputLayout textInputLayout = inflate.inputLayout;
        C8632dsu.a(textInputLayout, "");
        this.inputLayout = textInputLayout;
        ConstraintLayout constraintLayout = inflate.inputWrapper;
        C8632dsu.a(constraintLayout, "");
        this.inputWrapper = constraintLayout;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ProfileEntryEditTextCheckbox, 0, 0);
        try {
            this.userIconType = obtainStyledAttributes.getString(R.styleable.ProfileEntryEditTextCheckbox_userIconType);
            boolean z = obtainStyledAttributes.getBoolean(R.styleable.ProfileEntryEditTextCheckbox_useDarkMode, false);
            this.useDarkMode = z;
            if (z) {
                updateForDarkMode();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final FormViewEditTextInteractionListenerFactory getInteractionListenerFactory() {
        FormViewEditTextInteractionListenerFactory formViewEditTextInteractionListenerFactory = this.interactionListenerFactory;
        if (formViewEditTextInteractionListenerFactory != null) {
            return formViewEditTextInteractionListenerFactory;
        }
        C8632dsu.d("");
        return null;
    }

    public static /* synthetic */ void bind$default(ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox, ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel, String str, OnInputChangedListener onInputChangedListener, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        profileEntryEditTextCheckbox.bind(profileEntryEditTextCheckboxViewModel, str, onInputChangedListener, str2);
    }

    public final void bind(final ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel, String str, OnInputChangedListener onInputChangedListener, final String str2) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) onInputChangedListener, "");
        this.interactionListener = getInteractionListenerFactory().createTextLogger(AppView.profileNameInput, InputKind.profileName);
        String profileNameValue = profileEntryEditTextCheckboxViewModel != null ? profileEntryEditTextCheckboxViewModel.getProfileNameValue() : null;
        this.inputLayout.setHintTextAppearance(R.style.SignupTextInputLayoutHintStyle);
        TextViewCompat.setTextAppearance(this.editText, C9834xU.o.f);
        this.editText.setText(profileNameValue);
        this.inputLayout.setHint(str);
        if (str2 != null) {
            this.editText.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox$bind$1$1
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    C8632dsu.c((Object) view, "");
                    C8632dsu.c((Object) accessibilityNodeInfo, "");
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    accessibilityNodeInfo.setText(str2);
                }
            });
        }
        Integer inputFieldCharacterLimit = profileEntryEditTextCheckboxViewModel != null ? profileEntryEditTextCheckboxViewModel.getInputFieldCharacterLimit() : null;
        if (inputFieldCharacterLimit != null) {
            this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(inputFieldCharacterLimit.intValue())});
        }
        this.viewModel = profileEntryEditTextCheckboxViewModel;
        bindRxListeners(onInputChangedListener);
        if (profileEntryEditTextCheckboxViewModel != null && profileEntryEditTextCheckboxViewModel.showKidsCheckbox()) {
            this.kidsCheckBox.setVisibility(0);
            this.kidsIcon.setVisibility(0);
        } else {
            this.kidsCheckBox.setVisibility(8);
            this.kidsIcon.setVisibility(8);
        }
        this.kidsCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ProfileEntryEditTextCheckbox.bind$lambda$3(ProfileEntryEditTextCheckboxViewModel.this, this, compoundButton, z);
            }
        });
        String str3 = this.userIconType;
        if (str3 == null || str3.length() == 0) {
            this.binding.addUserIcon.setVisibility(8);
            return;
        }
        this.binding.addUserIcon.setImageResource(C8632dsu.c((Object) this.userIconType, (Object) "user") ? C1026Lt.a.PZ : C1026Lt.a.Pp);
        this.binding.addUserIcon.setVisibility(0);
    }

    public static final void bind$lambda$3(ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel, ProfileEntryEditTextCheckbox profileEntryEditTextCheckbox, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) profileEntryEditTextCheckbox, "");
        if (profileEntryEditTextCheckboxViewModel != null) {
            profileEntryEditTextCheckboxViewModel.updateIsKidsProfile(z);
        }
        int i = z ? SELECTED_COLOR : DEFAULT_COLOR;
        C1204Sr c1204Sr = profileEntryEditTextCheckbox.kidsIcon;
        c1204Sr.setTextColor(ColorStateList.valueOf(ContextCompat.getColor(c1204Sr.getContext(), i)));
    }

    public final void bindRxListeners(final OnInputChangedListener onInputChangedListener) {
        C8632dsu.c((Object) onInputChangedListener, "");
        Observable<Boolean> skip = C9618tM.b(this.editText).takeUntil(C9618tM.d(this.editText)).skip(1L);
        final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox$bindRxListeners$1
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
                FormViewEditText.FormViewEditTextInteractionListener formViewEditTextInteractionListener;
                formViewEditTextInteractionListener = ProfileEntryEditTextCheckbox.this.interactionListener;
                if (formViewEditTextInteractionListener != null) {
                    C8632dsu.d(bool);
                    formViewEditTextInteractionListener.onFocusChange(bool.booleanValue());
                }
            }
        };
        Observable<Boolean> doOnNext = skip.doOnNext(new Consumer() { // from class: com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfileEntryEditTextCheckbox.bindRxListeners$lambda$4(drM.this, obj);
            }
        });
        final drM<Boolean, dpR> drm2 = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox$bindRxListeners$2
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
                if (bool.booleanValue()) {
                    return;
                }
                ProfileEntryEditTextCheckboxViewModel viewModel = ProfileEntryEditTextCheckbox.this.getViewModel();
                if (viewModel != null) {
                    viewModel.setShowValidationState(true);
                }
                ProfileEntryEditTextCheckbox.this.provideUxFeedback();
            }
        };
        this.focusChangeDisposable = doOnNext.subscribe(new Consumer() { // from class: com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfileEntryEditTextCheckbox.bindRxListeners$lambda$5(drM.this, obj);
            }
        });
        Observable<CharSequence> skip2 = C9631tZ.b(this.editText).takeUntil(C9618tM.d(this.editText)).skip(1L);
        final drM<CharSequence, dpR> drm3 = new drM<CharSequence, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox$bindRxListeners$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* bridge */ /* synthetic */ dpR invoke(CharSequence charSequence) {
                invoke2(charSequence);
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(CharSequence charSequence) {
                ProfileEntryEditTextCheckboxViewModel viewModel = ProfileEntryEditTextCheckbox.this.getViewModel();
                if (viewModel != null) {
                    viewModel.setProfileNameValue(charSequence.toString());
                }
                ProfileEntryEditTextCheckbox.this.provideUxFeedback();
                onInputChangedListener.onInputChanged();
            }
        };
        this.textChangeDisposable = skip2.subscribe(new Consumer() { // from class: com.netflix.mediaclient.acquisition.components.form2.profileEntryEditText.ProfileEntryEditTextCheckbox$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ProfileEntryEditTextCheckbox.bindRxListeners$lambda$6(drM.this, obj);
            }
        });
    }

    public static final void bindRxListeners$lambda$4(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final void bindRxListeners$lambda$5(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public static final void bindRxListeners$lambda$6(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        public final int getBackgroundRes(boolean z, boolean z2, boolean z3) {
            return z ? com.netflix.mediaclient.ui.R.e.aT : z3 ? R.drawable.text_input_layout_focused_transparent_background : com.netflix.mediaclient.ui.R.e.aS;
        }

        private Companion() {
        }

        public final int getSELECTED_COLOR() {
            return ProfileEntryEditTextCheckbox.SELECTED_COLOR;
        }

        public final int getDEFAULT_COLOR() {
            return ProfileEntryEditTextCheckbox.DEFAULT_COLOR;
        }
    }

    public final void setIsDuplicateName(boolean z) {
        ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel = this.viewModel;
        if (profileEntryEditTextCheckboxViewModel != null) {
            profileEntryEditTextCheckboxViewModel.setDuplicate(z);
        }
        provideUxFeedback();
    }

    public final int getTextInputLayoutBackgroundRes(boolean z, boolean z2) {
        return Companion.getBackgroundRes(z, z2, this.editText.hasFocus());
    }

    public final void provideUxFeedback() {
        ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel = this.viewModel;
        String error = profileEntryEditTextCheckboxViewModel != null ? profileEntryEditTextCheckboxViewModel.getError() : null;
        boolean z = false;
        boolean z2 = error != null;
        this.inputError.setVisibility(z2 ? 0 : 8);
        this.inputError.setText(error);
        ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel2 = this.viewModel;
        Integer inputFieldCharacterLimit = profileEntryEditTextCheckboxViewModel2 != null ? profileEntryEditTextCheckboxViewModel2.getInputFieldCharacterLimit() : null;
        if (inputFieldCharacterLimit != null) {
            this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(inputFieldCharacterLimit.intValue())});
        }
        ProfileEntryEditTextCheckboxViewModel profileEntryEditTextCheckboxViewModel3 = this.viewModel;
        if (profileEntryEditTextCheckboxViewModel3 != null && profileEntryEditTextCheckboxViewModel3.getShowValidationState()) {
            z = true;
        }
        this.inputWrapper.setBackgroundResource(getTextInputLayoutBackgroundRes(z2, z));
    }

    private final void updateForDarkMode() {
        int color = ContextCompat.getColor(getContext(), C1030Lx.d.c);
        this.editText.setTextColor(color);
        if (this.userIconType != null) {
            this.binding.addUserIcon.setImageTintList(ColorStateList.valueOf(color));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }
}
