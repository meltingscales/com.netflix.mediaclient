package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Base64;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.timepicker.TimePickerView;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.OnDoubleTapListener {
    private static int a = 1;
    private static int c = 0;
    private static byte e$ss2$2623 = 24;
    private TimePickerPresenter activePresenter;
    private Button cancelButton;
    private int clockIcon;
    private int keyboardIcon;
    private MaterialButton modeButton;
    private CharSequence negativeButtonText;
    private CharSequence positiveButtonText;
    private ViewStub textInputStub;
    private TimeModel time;
    private TimePickerClockPresenter timePickerClockPresenter;
    private TimePickerTextInputPresenter timePickerTextInputPresenter;
    private TimePickerView timePickerView;
    private CharSequence titleText;
    private final Set<View.OnClickListener> positiveButtonListeners = new LinkedHashSet();
    private final Set<View.OnClickListener> negativeButtonListeners = new LinkedHashSet();
    private final Set<DialogInterface.OnCancelListener> cancelListeners = new LinkedHashSet();
    private final Set<DialogInterface.OnDismissListener> dismissListeners = new LinkedHashSet();
    private int titleResId = 0;
    private int positiveButtonTextResId = 0;
    private int negativeButtonTextResId = 0;
    private int inputMode = 0;
    private int overrideThemeResId = 0;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), getThemeResId());
        Context context = dialog.getContext();
        int resolveOrThrow = MaterialAttributes.resolveOrThrow(context, R.attr.colorSurface, MaterialTimePicker.class.getCanonicalName());
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.MaterialTimePicker, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        this.clockIcon = obtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_clockIcon, 0);
        this.keyboardIcon = obtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_keyboardIcon, 0);
        obtainStyledAttributes.recycle();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(resolveOrThrow));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        materialShapeDrawable.setElevation(ViewCompat.getElevation(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        restoreState(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.time);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.inputMode);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.titleResId);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.titleText);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.positiveButtonTextResId);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.positiveButtonText);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.negativeButtonTextResId);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.negativeButtonText);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.overrideThemeResId);
    }

    private void restoreState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.time = timeModel;
        if (timeModel == null) {
            this.time = new TimeModel();
        }
        this.inputMode = bundle.getInt("TIME_PICKER_INPUT_MODE", this.time.format != 1 ? 0 : 1);
        this.titleResId = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.titleText = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.positiveButtonTextResId = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.positiveButtonText = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.negativeButtonTextResId = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.negativeButtonText = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.overrideThemeResId = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00db, code lost:
        if (r10.startsWith("'!#+") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ea, code lost:
        if (r10.startsWith("'!#+") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ec, code lost:
        r11 = new java.lang.Object[1];
        d(r10.substring(4), r11);
        r10 = ((java.lang.String) r11[0]).intern();
        r4 = r9.getText(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0103, code lost:
        if ((r4 instanceof android.text.Spanned) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0105, code lost:
        r9 = new android.text.SpannableString(r10);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r4, 0, r10.length(), java.lang.Object.class, r9, 0);
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x011e, code lost:
        r3.setText(r10);
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r18, android.view.ViewGroup r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.MaterialTimePicker.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.activePresenter instanceof TimePickerTextInputPresenter) {
            view.postDelayed(new Runnable() { // from class: com.google.android.material.timepicker.MaterialTimePicker$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialTimePicker.this.lambda$onViewCreated$0();
                }
            }, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$0() {
        ((TimePickerTextInputPresenter) this.activePresenter).resetChecked();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.activePresenter = null;
        this.timePickerClockPresenter = null;
        this.timePickerTextInputPresenter = null;
        TimePickerView timePickerView = this.timePickerView;
        if (timePickerView != null) {
            timePickerView.setOnDoubleTapListener(null);
            this.timePickerView = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancelListener : this.cancelListeners) {
            onCancelListener.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismissListener : this.dismissListeners) {
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        updateCancelButtonVisibility();
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener
    public void onDoubleTap() {
        this.inputMode = 1;
        updateInputMode(this.modeButton);
        this.timePickerTextInputPresenter.resetChecked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateInputMode(MaterialButton materialButton) {
        int i = 2 % 2;
        int i2 = a;
        int i3 = i2 + 67;
        c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
            if (materialButton == null) {
                return;
            }
        } else if (materialButton == null) {
            return;
        }
        if (this.timePickerView != null) {
            int i5 = i2 + 57;
            int i6 = i5 % 128;
            c = i6;
            Object obj = null;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            } else if (this.textInputStub == null) {
                int i7 = i2 + 17;
                c = i7 % 128;
                int i8 = i7 % 2;
            } else {
                TimePickerPresenter timePickerPresenter = this.activePresenter;
                if (timePickerPresenter != null) {
                    int i9 = i6 + 75;
                    a = i9 % 128;
                    int i10 = i9 % 2;
                    timePickerPresenter.hide();
                }
                TimePickerPresenter initializeOrRetrieveActivePresenterForMode = initializeOrRetrieveActivePresenterForMode(this.inputMode, this.timePickerView, this.textInputStub);
                this.activePresenter = initializeOrRetrieveActivePresenterForMode;
                initializeOrRetrieveActivePresenterForMode.show();
                this.activePresenter.invalidate();
                Pair<Integer, Integer> dataForMode = dataForMode(this.inputMode);
                materialButton.setIconResource(((Integer) dataForMode.first).intValue());
                String string = getResources().getString(((Integer) dataForMode.second).intValue());
                if (!(!string.startsWith("'!#+"))) {
                    int i11 = a + 9;
                    c = i11 % 128;
                    if (i11 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        d(string.substring(4), objArr);
                        ((String) objArr[0]).intern();
                        throw null;
                    }
                    String substring = string.substring(4);
                    Object[] objArr2 = new Object[1];
                    d(substring, objArr2);
                    string = ((String) objArr2[0]).intern();
                }
                materialButton.setContentDescription(string);
                materialButton.sendAccessibilityEvent(4);
            }
        }
    }

    private void updateCancelButtonVisibility() {
        Button button = this.cancelButton;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    private TimePickerPresenter initializeOrRetrieveActivePresenterForMode(int i, TimePickerView timePickerView, ViewStub viewStub) {
        if (i != 0) {
            if (this.timePickerTextInputPresenter == null) {
                this.timePickerTextInputPresenter = new TimePickerTextInputPresenter((LinearLayout) viewStub.inflate(), this.time);
            }
            this.timePickerTextInputPresenter.clearCheck();
            return this.timePickerTextInputPresenter;
        }
        TimePickerClockPresenter timePickerClockPresenter = this.timePickerClockPresenter;
        if (timePickerClockPresenter == null) {
            timePickerClockPresenter = new TimePickerClockPresenter(timePickerView, this.time);
        }
        this.timePickerClockPresenter = timePickerClockPresenter;
        return timePickerClockPresenter;
    }

    private Pair<Integer, Integer> dataForMode(int i) {
        if (i != 0) {
            if (i == 1) {
                return new Pair<>(Integer.valueOf(this.clockIcon), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
            }
            throw new IllegalArgumentException("no icon for mode: " + i);
        }
        return new Pair<>(Integer.valueOf(this.keyboardIcon), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
    }

    private int getThemeResId() {
        int i = this.overrideThemeResId;
        if (i != 0) {
            return i;
        }
        TypedValue resolve = MaterialAttributes.resolve(requireContext(), R.attr.materialTimePickerTheme);
        if (resolve == null) {
            return 0;
        }
        return resolve.data;
    }

    private void d(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$2623);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
