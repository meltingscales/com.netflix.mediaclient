package com.netflix.mediaclient.acquisition.components.form2.edittext;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.TypedArrayKt;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.InputKind;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel;
import com.netflix.mediaclient.acquisition.di.SignupMoneyballEntryPoint;
import com.netflix.mediaclient.util.AccessibilityUtils;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import o.C1026Lt;
import o.C1333Xq;
import o.C8168dfL;
import o.C8627dsp;
import o.C8632dsu;
import o.C8654dtp;
import o.C9618tM;
import o.C9631tZ;
import o.C9737vz;
import o.InterfaceC8554dpx;
import o.dpB;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes3.dex */
public class FormViewEditText extends LinearLayout {
    public static final int $stable = 8;
    private int defaultBackground;
    private final InterfaceC8554dpx editText$delegate;
    private int editTextInputColor;
    private FormViewEditTextViewModel.Error error;
    private int errorBackground;
    private int errorTextInputColor;
    private int focusedBackground;
    private int focusedTextInputColor;
    private Integer hintRes;
    private final InterfaceC8554dpx inputError$delegate;
    private int inputErrorEmptyRes;
    private int inputErrorLengthRes;
    private int inputErrorRegexRes;
    private final InterfaceC8554dpx inputLayout$delegate;
    private FormViewEditTextInteractionListener interactionListener;
    private final FormViewEditTextInteractionListenerFactory interactionListenerFactory;
    private boolean showValidationState;
    private int validatedBackground;
    private FormViewEditTextViewModel viewModel;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes3.dex */
    public interface ActivityAccessor {
        FormViewEditTextInteractionListenerFactory getFormViewEditTextInteractionListenerFactory();

        SignupMoneyballEntryPoint getSignupEntryPoint();
    }

    /* loaded from: classes3.dex */
    public interface FormViewEditTextInteractionListener {
        void onFocusChange(boolean z);

        void onPostValidation(boolean z);

        void onPreValidation();
    }

    /* loaded from: classes3.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormViewEditTextViewModel.Error.values().length];
            try {
                iArr[FormViewEditTextViewModel.Error.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormViewEditTextViewModel.Error.LENGTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormViewEditTextViewModel.Error.REGEX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormViewEditText(Context context) {
        this(context, null, 0, 0, 0, 30, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormViewEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0, 28, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormViewEditText(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 0, 24, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormViewEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, 0, 16, null);
        C8632dsu.c((Object) context, "");
    }

    public static /* synthetic */ void getEditText$annotations() {
    }

    private final boolean getHasError() {
        return this.error != null;
    }

    public static /* synthetic */ void getInputError$annotations() {
    }

    public static /* synthetic */ void getInputLayout$annotations() {
    }

    public static /* synthetic */ void getViewModel$annotations() {
    }

    protected final int getDefaultBackground() {
        return this.defaultBackground;
    }

    public final int getEditTextInputColor() {
        return this.editTextInputColor;
    }

    protected final int getErrorBackground() {
        return this.errorBackground;
    }

    public final int getErrorTextInputColor() {
        return this.errorTextInputColor;
    }

    protected final int getFocusedBackground() {
        return this.focusedBackground;
    }

    public final int getFocusedTextInputColor() {
        return this.focusedTextInputColor;
    }

    public final boolean getShowValidationState() {
        return this.showValidationState;
    }

    protected final int getValidatedBackground() {
        return this.validatedBackground;
    }

    public final FormViewEditTextViewModel getViewModel() {
        return this.viewModel;
    }

    protected final void setDefaultBackground(int i) {
        this.defaultBackground = i;
    }

    public final void setEditTextInputColor(int i) {
        this.editTextInputColor = i;
    }

    protected final void setErrorBackground(int i) {
        this.errorBackground = i;
    }

    public final void setErrorTextInputColor(int i) {
        this.errorTextInputColor = i;
    }

    protected final void setFocusedBackground(int i) {
        this.focusedBackground = i;
    }

    public final void setFocusedTextInputColor(int i) {
        this.focusedTextInputColor = i;
    }

    protected final void setValidatedBackground(int i) {
        this.validatedBackground = i;
    }

    public final void setViewModel(FormViewEditTextViewModel formViewEditTextViewModel) {
        this.viewModel = formViewEditTextViewModel;
    }

    public /* synthetic */ FormViewEditText(Context context, AttributeSet attributeSet, int i, int i2, int i3, int i4, C8627dsp c8627dsp) {
        this(context, (i4 & 2) != 0 ? null : attributeSet, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? R.layout.form_input_view_holder : i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormViewEditText(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet, i, i2);
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        C8632dsu.c((Object) context, "");
        b = dpB.b(new drO<EditText>() { // from class: com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText$editText$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final EditText invoke() {
                return (EditText) FormViewEditText.this.findViewById(R.id.editText);
            }
        });
        this.editText$delegate = b;
        b2 = dpB.b(new drO<TextView>() { // from class: com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText$inputError$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final TextView invoke() {
                return (TextView) FormViewEditText.this.findViewById(R.id.inputError);
            }
        });
        this.inputError$delegate = b2;
        b3 = dpB.b(new drO<TextInputLayout>() { // from class: com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText$inputLayout$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // o.drO
            public final TextInputLayout invoke() {
                return (TextInputLayout) FormViewEditText.this.findViewById(R.id.inputLayout);
            }
        });
        this.inputLayout$delegate = b3;
        this.inputErrorLengthRes = -1;
        this.inputErrorEmptyRes = -1;
        this.inputErrorRegexRes = -1;
        this.errorBackground = com.netflix.mediaclient.ui.R.e.aR;
        this.validatedBackground = R.drawable.text_input_layout_validated_background;
        this.focusedBackground = R.drawable.text_input_layout_focused_background;
        this.defaultBackground = com.netflix.mediaclient.ui.R.e.aV;
        View.inflate(context, i3, this);
        setupEventListeners();
        applyAttrs(attributeSet);
        if (isInEditMode()) {
            this.interactionListenerFactory = new FormViewEditTextInteractionListenerFactory() { // from class: com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText.1
                @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextInteractionListenerFactory
                public FormViewEditTextInteractionListener createTextLogger(AppView appView, InputKind inputKind) {
                    return null;
                }
            };
            setupEditMode();
            return;
        }
        this.interactionListenerFactory = ((ActivityAccessor) EntryPointAccessors.fromActivity((Activity) C9737vz.e(context, Activity.class), ActivityAccessor.class)).getFormViewEditTextInteractionListenerFactory();
    }

    public final EditText getEditText() {
        Object value = this.editText$delegate.getValue();
        C8632dsu.a(value, "");
        return (EditText) value;
    }

    public final TextView getInputError() {
        Object value = this.inputError$delegate.getValue();
        C8632dsu.a(value, "");
        return (TextView) value;
    }

    public final TextInputLayout getInputLayout() {
        Object value = this.inputLayout$delegate.getValue();
        C8632dsu.a(value, "");
        return (TextInputLayout) value;
    }

    private final void applyAttrs(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.FormViewEditText);
        C8632dsu.a(obtainStyledAttributes, "");
        if (isInEditMode() && obtainStyledAttributes.hasValue(R.styleable.FormViewEditText_android_text)) {
            getEditText().setText(obtainStyledAttributes.getString(R.styleable.FormViewEditText_android_text));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.FormViewEditText_android_inputType)) {
            getEditText().setInputType(obtainStyledAttributes.getInt(R.styleable.FormViewEditText_android_inputType, 0));
            getEditText().setTypeface(Typeface.DEFAULT);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.FormViewEditText_hint)) {
            this.hintRes = Integer.valueOf(TypedArrayKt.getResourceIdOrThrow(obtainStyledAttributes, R.styleable.FormViewEditText_hint));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.FormViewEditText_inputErrorAppearance)) {
            TextViewCompat.setTextAppearance(getInputError(), TypedArrayKt.getResourceIdOrThrow(obtainStyledAttributes, R.styleable.FormViewEditText_inputErrorAppearance));
            TextViewCompat.setCompoundDrawableTintList(getInputError(), getInputError().getTextColors());
        }
        if (obtainStyledAttributes.hasValue(R.styleable.FormViewEditText_showErrorIcon)) {
            getInputError().setCompoundDrawablesRelativeWithIntrinsicBounds(C1026Lt.a.Re, 0, 0, 0);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.FormViewEditText_defaultBackground)) {
            this.defaultBackground = TypedArrayKt.getResourceIdOrThrow(obtainStyledAttributes, R.styleable.FormViewEditText_defaultBackground);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.FormViewEditText_focusedBackground)) {
            this.focusedBackground = TypedArrayKt.getResourceIdOrThrow(obtainStyledAttributes, R.styleable.FormViewEditText_focusedBackground);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.FormViewEditText_validatedBackground)) {
            this.validatedBackground = TypedArrayKt.getResourceIdOrThrow(obtainStyledAttributes, R.styleable.FormViewEditText_validatedBackground);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.FormViewEditText_errorBackground)) {
            this.errorBackground = TypedArrayKt.getResourceIdOrThrow(obtainStyledAttributes, R.styleable.FormViewEditText_errorBackground);
        }
        int color = ContextCompat.getColor(getContext(), com.netflix.mediaclient.ui.R.c.w);
        this.editTextInputColor = obtainStyledAttributes.getColor(R.styleable.FormViewEditText_editTextInputColor, color);
        this.errorTextInputColor = obtainStyledAttributes.getColor(R.styleable.FormViewEditText_errorTextInputColor, color);
        this.focusedTextInputColor = obtainStyledAttributes.getColor(R.styleable.FormViewEditText_focusedTextInputColor, color);
        this.inputErrorLengthRes = TypedArrayKt.getResourceIdOrThrow(obtainStyledAttributes, R.styleable.FormViewEditText_errorLength);
        this.inputErrorEmptyRes = TypedArrayKt.getResourceIdOrThrow(obtainStyledAttributes, R.styleable.FormViewEditText_errorEmpty);
        this.inputErrorRegexRes = TypedArrayKt.getResourceIdOrThrow(obtainStyledAttributes, R.styleable.FormViewEditText_errorRegex);
        if (obtainStyledAttributes.hasValue(R.styleable.FormViewEditText_showValidationState)) {
            setShowValidationState(obtainStyledAttributes.getBoolean(R.styleable.FormViewEditText_showValidationState, false));
        }
        refreshStyling$default(this, false, 1, null);
        obtainStyledAttributes.recycle();
    }

    private final void setupEditMode() {
        FormViewEditTextViewModel formViewEditTextViewModel = new FormViewEditTextViewModel() { // from class: com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText$setupEditMode$1
            private final boolean isReadOnly;
            private final boolean isValid;
            private String value;
            private final InputKind inputKind = InputKind.email;
            private final AppView appView = AppView.emailInput;
            private final int minLength = 4;
            private final int maxLength = 20;

            @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
            public AppView getAppView() {
                return this.appView;
            }

            @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
            public InputKind getInputKind() {
                return this.inputKind;
            }

            @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
            public int getMaxLength() {
                return this.maxLength;
            }

            @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
            public int getMinLength() {
                return this.minLength;
            }

            @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
            public String getValue() {
                return this.value;
            }

            @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
            public boolean isReadOnly() {
                return this.isReadOnly;
            }

            @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
            public boolean isValid() {
                return this.isValid;
            }

            @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
            public void setValue(String str) {
                this.value = str;
            }

            @Override // com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel
            public FormViewEditTextViewModel.Error getError() {
                C8654dtp c8654dtp = new C8654dtp(getMinLength(), getMaxLength());
                String value = getValue();
                Integer valueOf = value != null ? Integer.valueOf(value.length()) : null;
                if (valueOf == null || !c8654dtp.a(valueOf.intValue())) {
                    return FormViewEditTextViewModel.Error.REGEX;
                }
                return null;
            }
        };
        this.viewModel = formViewEditTextViewModel;
        bind(formViewEditTextViewModel);
    }

    @SuppressLint({"CheckResult"})
    private final void setupEventListeners() {
        Observable<Boolean> skip = C9618tM.b(getEditText()).takeUntil(C9618tM.d(this)).skip(1L);
        final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText$setupEventListeners$1
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
                formViewEditTextInteractionListener = FormViewEditText.this.interactionListener;
                if (formViewEditTextInteractionListener != null) {
                    C8632dsu.d(bool);
                    formViewEditTextInteractionListener.onFocusChange(bool.booleanValue());
                }
            }
        };
        Observable<Boolean> doOnNext = skip.doOnNext(new Consumer() { // from class: com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FormViewEditText.setupEventListeners$lambda$1(drM.this, obj);
            }
        });
        final drM<Boolean, dpR> drm2 = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText$setupEventListeners$2
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
                if (!bool.booleanValue()) {
                    FormViewEditText.this.showValidationState = true;
                }
                FormViewEditText.this.updateState();
            }
        };
        doOnNext.subscribe(new Consumer() { // from class: com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FormViewEditText.setupEventListeners$lambda$2(drM.this, obj);
            }
        });
        Observable<CharSequence> skip2 = C9631tZ.b(getEditText()).takeUntil(C9618tM.d(this)).skip(1L);
        final drM<CharSequence, dpR> drm3 = new drM<CharSequence, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText$setupEventListeners$3
            /* JADX INFO: Access modifiers changed from: package-private */
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
                FormViewEditTextViewModel viewModel = FormViewEditText.this.getViewModel();
                if (viewModel != null) {
                    viewModel.setValue(charSequence.toString());
                }
                FormViewEditText.this.updateState();
            }
        };
        skip2.subscribe(new Consumer() { // from class: com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FormViewEditText.setupEventListeners$lambda$3(drM.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupEventListeners$lambda$1(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupEventListeners$lambda$2(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupEventListeners$lambda$3(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    public final void bind(FormViewEditTextViewModel formViewEditTextViewModel) {
        this.interactionListener = this.interactionListenerFactory.createTextLogger(formViewEditTextViewModel != null ? formViewEditTextViewModel.getAppView() : null, formViewEditTextViewModel != null ? formViewEditTextViewModel.getInputKind() : null);
        this.viewModel = formViewEditTextViewModel;
        if (formViewEditTextViewModel == null) {
            setVisibility(8);
            return;
        }
        Integer num = this.hintRes;
        if (num != null) {
            getInputLayout().setHint(C8168dfL.d(num.intValue()));
        }
        String value = formViewEditTextViewModel.getValue();
        if (value != null && value.length() != 0) {
            getEditText().setText(value);
            setShowValidationState(true);
        }
        getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(formViewEditTextViewModel.getMaxLength())});
        setVisibility(0);
        if (formViewEditTextViewModel.isReadOnly()) {
            getEditText().setEnabled(false);
        }
    }

    public final void setShowValidationState(boolean z) {
        this.showValidationState = z;
        if (!z || !getHasError()) {
            updateState();
        } else if (z) {
            Context context = getContext();
            C8632dsu.a(context, "");
            AccessibilityUtils.b(context, getInputError().getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState() {
        FormViewEditTextViewModel.Error error;
        FormViewEditTextViewModel formViewEditTextViewModel = this.viewModel;
        if (formViewEditTextViewModel == null) {
            return;
        }
        if (this.showValidationState) {
            FormViewEditTextInteractionListener formViewEditTextInteractionListener = this.interactionListener;
            if (formViewEditTextInteractionListener != null) {
                formViewEditTextInteractionListener.onPreValidation();
            }
            error = formViewEditTextViewModel.getError();
            boolean z = error != null;
            if (z && this.error != error) {
                TextView inputError = getInputError();
                C8632dsu.d(error);
                inputError.setText(getErrorMessage(formViewEditTextViewModel, error));
                Context context = getContext();
                C8632dsu.a(context, "");
                AccessibilityUtils.b(context, getInputError().getText());
            }
            FormViewEditTextInteractionListener formViewEditTextInteractionListener2 = this.interactionListener;
            if (formViewEditTextInteractionListener2 != null) {
                formViewEditTextInteractionListener2.onPostValidation(z);
            }
        } else {
            error = null;
        }
        this.error = error;
        getInputError().setVisibility(getHasError() ? 0 : 8);
        styleInputLayout(getHasError(), this.showValidationState, getEditText().hasFocus());
    }

    private final String getErrorMessage(FormViewEditTextViewModel formViewEditTextViewModel, FormViewEditTextViewModel.Error error) {
        int i = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C8168dfL.d(this.inputErrorRegexRes);
                }
                throw new NoWhenBranchMatchedException();
            }
            return C1333Xq.d(this.inputErrorLengthRes).d("minLength", Integer.valueOf(formViewEditTextViewModel.getMinLength())).d("maxLength", Integer.valueOf(formViewEditTextViewModel.getMaxLength())).c();
        }
        return C8168dfL.d(this.inputErrorEmptyRes);
    }

    public void styleInputLayout(boolean z, boolean z2, boolean z3) {
        Pair pair;
        if (z2 && z) {
            pair = new Pair(Integer.valueOf(this.errorBackground), Integer.valueOf(this.errorTextInputColor));
        } else if (z2) {
            pair = new Pair(Integer.valueOf(this.validatedBackground), Integer.valueOf(this.editTextInputColor));
        } else if (z3) {
            pair = new Pair(Integer.valueOf(this.focusedBackground), Integer.valueOf(this.focusedTextInputColor));
        } else {
            pair = new Pair(Integer.valueOf(this.defaultBackground), Integer.valueOf(this.editTextInputColor));
        }
        int intValue = ((Number) pair.b()).intValue();
        int intValue2 = ((Number) pair.c()).intValue();
        getInputLayoutBackground().setBackgroundResource(intValue);
        getEditText().setTextColor(intValue2);
    }

    public View getInputLayoutBackground() {
        return getInputLayout();
    }

    public final void setImeOptions(int i) {
        getEditText().setImeOptions(i);
    }

    public final void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        C8632dsu.c((Object) onEditorActionListener, "");
        getEditText().setOnEditorActionListener(onEditorActionListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public static /* synthetic */ void refreshStyling$default(FormViewEditText formViewEditText, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshStyling");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        formViewEditText.refreshStyling(z);
    }

    public final void refreshStyling(boolean z) {
        styleInputLayout(!getHasError(), this.showValidationState, z | getEditText().hasFocus());
    }
}
