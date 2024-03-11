package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class EndCompoundLayout extends LinearLayout {
    private static int b = 1;
    private static int d = 0;
    private static byte e$ss2$7324 = 24;
    private final AccessibilityManager accessibilityManager;
    private EditText editText;
    private final TextWatcher editTextWatcher;
    private final LinkedHashSet<TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final EndIconDelegates endIconDelegates;
    private final FrameLayout endIconFrame;
    private int endIconMinSize;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;
    private ImageView.ScaleType endIconScaleType;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;
    private final CheckableImageButton endIconView;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private PorterDuff.Mode errorIconTintMode;
    private final CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;
    private CharSequence suffixText;
    private final TextView suffixTextView;
    final TextInputLayout textInputLayout;
    private AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getEndIconMode() {
        return this.endIconMode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EndCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.endIconMode = 0;
        this.endIconChangedListeners = new LinkedHashSet<>();
        this.editTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                EndCompoundLayout.this.getEndIconDelegate().beforeEditTextChanged(charSequence, i, i2, i3);
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.getEndIconDelegate().afterEditTextChanged(editable);
            }
        };
        TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(TextInputLayout textInputLayout2) {
                if (EndCompoundLayout.this.editText == textInputLayout2.getEditText()) {
                    return;
                }
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.removeTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                    if (EndCompoundLayout.this.editText.getOnFocusChangeListener() == EndCompoundLayout.this.getEndIconDelegate().getOnEditTextFocusChangeListener()) {
                        EndCompoundLayout.this.editText.setOnFocusChangeListener(null);
                    }
                }
                EndCompoundLayout.this.editText = textInputLayout2.getEditText();
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.addTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                }
                EndCompoundLayout.this.getEndIconDelegate().onEditTextAttached(EndCompoundLayout.this.editText);
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
            }
        };
        this.onEditTextAttachedListener = onEditTextAttachedListener;
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.endIconFrame = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton createIconView = createIconView(this, from, R.id.text_input_error_icon);
        this.errorIconView = createIconView;
        CheckableImageButton createIconView2 = createIconView(frameLayout, from, R.id.text_input_end_icon);
        this.endIconView = createIconView2;
        this.endIconDelegates = new EndIconDelegates(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.suffixTextView = appCompatTextView;
        initErrorIconView(tintTypedArray);
        initEndIconView(tintTypedArray);
        initSuffixTextView(tintTypedArray);
        frameLayout.addView(createIconView2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(createIconView);
        textInputLayout.addOnEditTextAttachedListener(onEditTextAttachedListener);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                EndCompoundLayout.this.addTouchExplorationStateChangeListenerIfNeeded();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                EndCompoundLayout.this.removeTouchExplorationStateChangeListenerIfNeeded();
            }
        });
    }

    private CheckableImageButton createIconView(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void initErrorIconView(TintTypedArray tintTypedArray) {
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_errorIconTint)) {
            this.errorIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.TextInputLayout_errorIconTint);
        }
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_errorIconTintMode)) {
            this.errorIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(R.styleable.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(tintTypedArray.getDrawable(R.styleable.TextInputLayout_errorIconDrawable));
        }
        this.errorIconView.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        ViewCompat.setImportantForAccessibility(this.errorIconView, 2);
        this.errorIconView.setClickable(false);
        this.errorIconView.setPressable(false);
        this.errorIconView.setFocusable(false);
    }

    private void initEndIconView(TintTypedArray tintTypedArray) {
        if (!tintTypedArray.hasValue(R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconTint)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.TextInputLayout_endIconTint);
            }
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconTintMode)) {
                this.endIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(R.styleable.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconMode)) {
            setEndIconMode(tintTypedArray.getInt(R.styleable.TextInputLayout_endIconMode, 0));
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(tintTypedArray.getText(R.styleable.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(tintTypedArray.getBoolean(R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (tintTypedArray.hasValue(R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_passwordToggleTint)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, R.styleable.TextInputLayout_passwordToggleTint);
            }
            if (tintTypedArray.hasValue(R.styleable.TextInputLayout_passwordToggleTintMode)) {
                this.endIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(R.styleable.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            setEndIconMode(tintTypedArray.getBoolean(R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconContentDescription(tintTypedArray.getText(R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        setEndIconMinSize(tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_endIconScaleType)) {
            setEndIconScaleType(IconHelper.convertScaleType(tintTypedArray.getInt(R.styleable.TextInputLayout_endIconScaleType, -1)));
        }
    }

    private void initSuffixTextView(TintTypedArray tintTypedArray) {
        this.suffixTextView.setVisibility(8);
        this.suffixTextView.setId(R.id.textinput_suffix_text);
        this.suffixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.setAccessibilityLiveRegion(this.suffixTextView, 1);
        setSuffixTextAppearance(tintTypedArray.getResourceId(R.styleable.TextInputLayout_suffixTextAppearance, 0));
        if (tintTypedArray.hasValue(R.styleable.TextInputLayout_suffixTextColor)) {
            setSuffixTextColor(tintTypedArray.getColorStateList(R.styleable.TextInputLayout_suffixTextColor));
        }
        setSuffixText(tintTypedArray.getText(R.styleable.TextInputLayout_suffixText));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
        refreshErrorIconDrawableState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorIconDrawable(Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        updateErrorIconVisibility();
        IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, this.errorIconTintMode);
    }

    Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.errorIconTintList != colorStateList) {
            this.errorIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, colorStateList, this.errorIconTintMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.errorIconTintMode != mode) {
            this.errorIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EndIconDelegate getEndIconDelegate() {
        return this.endIconDelegates.get(this.endIconMode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconMode(int i) {
        if (this.endIconMode == i) {
            return;
        }
        tearDownDelegate(getEndIconDelegate());
        int i2 = this.endIconMode;
        this.endIconMode = i;
        dispatchOnEndIconChanged(i2);
        setEndIconVisible(i != 0);
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        setEndIconDrawable(getIconResId(endIconDelegate));
        setEndIconContentDescription(endIconDelegate.getIconContentDescriptionResId());
        setEndIconCheckable(endIconDelegate.isIconCheckable());
        if (endIconDelegate.isBoxBackgroundModeSupported(this.textInputLayout.getBoxBackgroundMode())) {
            setUpDelegate(endIconDelegate);
            setEndIconOnClickListener(endIconDelegate.getOnIconClickListener());
            EditText editText = this.editText;
            if (editText != null) {
                endIconDelegate.onEditTextAttached(editText);
                setOnFocusChangeListenersIfNeeded(endIconDelegate);
            }
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshIconState(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void refreshIconState(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        boolean z3 = true;
        if (!endIconDelegate.isIconCheckable() || (isChecked = this.endIconView.isChecked()) == endIconDelegate.isIconChecked()) {
            z2 = false;
        } else {
            this.endIconView.setChecked(!isChecked);
            z2 = true;
        }
        if (!endIconDelegate.isIconActivable() || (isActivated = this.endIconView.isActivated()) == endIconDelegate.isIconActivated()) {
            z3 = z2;
        } else {
            setEndIconActivated(!isActivated);
        }
        if (z || z3) {
            refreshEndIconDrawableState();
        }
    }

    private void setUpDelegate(EndIconDelegate endIconDelegate) {
        endIconDelegate.setUp();
        this.touchExplorationStateChangeListener = endIconDelegate.getTouchExplorationStateChangeListener();
        addTouchExplorationStateChangeListenerIfNeeded();
    }

    private void tearDownDelegate(EndIconDelegate endIconDelegate) {
        removeTouchExplorationStateChangeListenerIfNeeded();
        this.touchExplorationStateChangeListener = null;
        endIconDelegate.tearDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTouchExplorationStateChangeListenerIfNeeded() {
        if (this.touchExplorationStateChangeListener == null || this.accessibilityManager == null || !ViewCompat.isAttachedToWindow(this)) {
            return;
        }
        AccessibilityManagerCompat.addTouchExplorationStateChangeListener(this.accessibilityManager, this.touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTouchExplorationStateChangeListenerIfNeeded() {
        AccessibilityManager accessibilityManager;
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.touchExplorationStateChangeListener;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.accessibilityManager) == null) {
            return;
        }
        AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
    }

    private int getIconResId(EndIconDelegate endIconDelegate) {
        int i = this.endIconDelegates.customEndIconDrawableId;
        return i == 0 ? endIconDelegate.getIconDrawableResId() : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnFocusChangeListenersIfNeeded(EndIconDelegate endIconDelegate) {
        if (this.editText == null) {
            return;
        }
        if (endIconDelegate.getOnEditTextFocusChangeListener() != null) {
            this.editText.setOnFocusChangeListener(endIconDelegate.getOnEditTextFocusChangeListener());
        }
        if (endIconDelegate.getOnIconViewFocusChangeListener() != null) {
            this.endIconView.setOnFocusChangeListener(endIconDelegate.getOnIconViewFocusChangeListener());
        }
    }

    void refreshErrorIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.errorIconView, this.errorIconTintList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconVisible(boolean z) {
        if (isEndIconVisible() != z) {
            this.endIconView.setVisibility(z ? 0 : 8);
            updateEndLayoutVisibility();
            updateSuffixTextViewPadding();
            this.textInputLayout.updateDummyDrawables();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconActivated(boolean z) {
        this.endIconView.setActivated(z);
    }

    void refreshEndIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.endIconView, this.endIconTintList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconCheckable(boolean z) {
        this.endIconView.setCheckable(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEndIconChecked() {
        return hasEndIcon() && this.endIconView.isChecked();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void checkEndIcon() {
        this.endIconView.performClick();
        this.endIconView.jumpDrawablesToCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshEndIconDrawableState();
        }
    }

    Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconContentDescription(int i) {
        int i2 = 2 % 2;
        int i3 = b;
        int i4 = i3 + 43;
        d = i4 % 128;
        int i5 = i4 % 2;
        String str = null;
        if (i != 0) {
            int i6 = i3 + NetflixImageView.DEFAULT_LAYER_GRAVITY;
            d = i6 % 128;
            int i7 = i6 % 2;
            Resources resources = getResources();
            String string = resources.getString(i);
            if (!string.startsWith("'!#+")) {
                str = string;
            } else {
                int i8 = d + 63;
                b = i8 % 128;
                if (i8 % 2 == 0) {
                    String substring = string.substring(4);
                    Object[] objArr = new Object[1];
                    c(substring, objArr);
                    ((String) objArr[0]).intern();
                    boolean z = resources.getText(i) instanceof Spanned;
                    str.hashCode();
                    throw null;
                }
                String substring2 = string.substring(4);
                Object[] objArr2 = new Object[1];
                c(substring2, objArr2);
                str = ((String) objArr2[0]).intern();
                CharSequence text = resources.getText(i);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(str);
                    TextUtils.copySpansFrom((SpannedString) text, 0, str.length(), Object.class, spannableString, 0);
                    str = spannableString;
                }
            }
        }
        setEndIconContentDescription(str);
        int i9 = b + 115;
        d = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconMinSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != this.endIconMinSize) {
            this.endIconMinSize = i;
            IconHelper.setIconMinSize(this.endIconView, i);
            IconHelper.setIconMinSize(this.errorIconView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.endIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.endIconView, scaleType);
        IconHelper.setIconScaleType(this.errorIconView, scaleType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSuffixText(CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSuffixTextAppearance(int i) {
        TextViewCompat.setTextAppearance(this.suffixTextView, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleContentDescription(int i) {
        String str;
        int i2 = 2 % 2;
        int i3 = b + 47;
        d = i3 % 128;
        int i4 = i3 % 2;
        if (i != 0) {
            Resources resources = getResources();
            str = resources.getString(i);
            if (str.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                c(str.substring(4), objArr);
                str = ((String) objArr[0]).intern();
                CharSequence text = resources.getText(i);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(str);
                    TextUtils.copySpansFrom((SpannedString) text, 0, str.length(), Object.class, spannableString, 0);
                    str = spannableString;
                }
            }
        } else {
            str = null;
        }
        setPasswordVisibilityToggleContentDescription(str);
        int i5 = d + 109;
        b = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.endIconMode != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onHintStateChanged(boolean z) {
        this.hintExpanded = z;
        updateSuffixTextVisibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onTextInputBoxStateUpdated() {
        updateErrorIconVisibility();
        refreshErrorIconDrawableState();
        refreshEndIconDrawableState();
        if (getEndIconDelegate().shouldTintIconOnError()) {
            tintEndIconOnError(this.textInputLayout.shouldShowError());
        }
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i = (this.suffixText == null || this.hintExpanded) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().onSuffixVisibilityChanged(i == 0);
        }
        updateEndLayoutVisibility();
        this.suffixTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateSuffixTextViewPadding() {
        if (this.textInputLayout.editText == null) {
            return;
        }
        ViewCompat.setPaddingRelative(this.suffixTextView, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.textInputLayout.editText.getPaddingTop(), (isEndIconVisible() || isErrorIconVisible()) ? 0 : ViewCompat.getPaddingEnd(this.textInputLayout.editText), this.textInputLayout.editText.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getCurrentEndIconView() {
        if (isErrorIconVisible()) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    private void updateErrorIconVisibility() {
        this.errorIconView.setVisibility(getErrorIconDrawable() != null && this.textInputLayout.isErrorEnabled() && this.textInputLayout.shouldShowError() ? 0 : 8);
        updateEndLayoutVisibility();
        updateSuffixTextViewPadding();
        if (hasEndIcon()) {
            return;
        }
        this.textInputLayout.updateDummyDrawables();
    }

    private void updateEndLayoutVisibility() {
        int i = 0;
        this.endIconFrame.setVisibility((this.endIconView.getVisibility() != 0 || isErrorIconVisible()) ? 8 : 0);
        boolean z = (this.suffixText == null || this.hintExpanded) ? true : false;
        if (!isEndIconVisible() && !isErrorIconVisible() && z) {
            i = 8;
        }
        setVisibility(i);
    }

    private void dispatchOnEndIconChanged(int i) {
        Iterator<TextInputLayout.OnEndIconChangedListener> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this.textInputLayout, i);
        }
    }

    private void tintEndIconOnError(boolean z) {
        if (z && getEndIconDrawable() != null) {
            Drawable mutate = DrawableCompat.wrap(getEndIconDrawable()).mutate();
            DrawableCompat.setTint(mutate, this.textInputLayout.getErrorCurrentTextColors());
            this.endIconView.setImageDrawable(mutate);
            return;
        }
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class EndIconDelegates {
        private final int customEndIconDrawableId;
        private final SparseArray<EndIconDelegate> delegates = new SparseArray<>();
        private final EndCompoundLayout endLayout;
        private final int passwordIconDrawableId;

        EndIconDelegates(EndCompoundLayout endCompoundLayout, TintTypedArray tintTypedArray) {
            this.endLayout = endCompoundLayout;
            this.customEndIconDrawableId = tintTypedArray.getResourceId(R.styleable.TextInputLayout_endIconDrawable, 0);
            this.passwordIconDrawableId = tintTypedArray.getResourceId(R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        EndIconDelegate get(int i) {
            EndIconDelegate endIconDelegate = this.delegates.get(i);
            if (endIconDelegate == null) {
                EndIconDelegate create = create(i);
                this.delegates.append(i, create);
                return create;
            }
            return endIconDelegate;
        }

        private EndIconDelegate create(int i) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                return new DropdownMenuEndIconDelegate(this.endLayout);
                            }
                            throw new IllegalArgumentException("Invalid end icon mode: " + i);
                        }
                        return new ClearTextEndIconDelegate(this.endLayout);
                    }
                    return new PasswordToggleEndIconDelegate(this.endLayout, this.passwordIconDrawableId);
                }
                return new NoEndIconDelegate(this.endLayout);
            }
            return new CustomEndIconDelegate(this.endLayout);
        }
    }

    private void c(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$7324);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
