package com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.KeyboardController;
import com.netflix.mediaclient.acquisition.databinding.FormInputMaturityPinEntryBinding;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import o.C1204Sr;
import o.C8569dql;
import o.C8627dsp;
import o.C8632dsu;
import o.C9618tM;
import o.InterfaceC8554dpx;
import o.dpB;
import o.dpD;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;

@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class MaturityPinEntry extends Hilt_MaturityPinEntry {
    public static final int SLOT_COUNT = 4;
    private final FormInputMaturityPinEntryBinding binding;
    @Inject
    public KeyboardController keyboardController;
    private final InterfaceC8554dpx nextMap$delegate;
    private final C1204Sr pinErrorText;
    private final AppCompatEditText slot1;
    private final AppCompatEditText slot2;
    private final AppCompatEditText slot3;
    private final AppCompatEditText slot4;
    private MaturityPinEntryViewModel viewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaturityPinEntry(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaturityPinEntry(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaturityPinEntry(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public final void setKeyboardController(KeyboardController keyboardController) {
        C8632dsu.c((Object) keyboardController, "");
        this.keyboardController = keyboardController;
    }

    public /* synthetic */ MaturityPinEntry(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaturityPinEntry(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        InterfaceC8554dpx b;
        List<AppCompatEditText> j;
        C8632dsu.c((Object) context, "");
        FormInputMaturityPinEntryBinding inflate = FormInputMaturityPinEntryBinding.inflate(LayoutInflater.from(context), this);
        C8632dsu.a(inflate, "");
        this.binding = inflate;
        AppCompatEditText appCompatEditText = inflate.slot1;
        C8632dsu.a(appCompatEditText, "");
        this.slot1 = appCompatEditText;
        AppCompatEditText appCompatEditText2 = inflate.slot2;
        C8632dsu.a(appCompatEditText2, "");
        this.slot2 = appCompatEditText2;
        AppCompatEditText appCompatEditText3 = inflate.slot3;
        C8632dsu.a(appCompatEditText3, "");
        this.slot3 = appCompatEditText3;
        AppCompatEditText appCompatEditText4 = inflate.slot4;
        C8632dsu.a(appCompatEditText4, "");
        this.slot4 = appCompatEditText4;
        C1204Sr c1204Sr = inflate.pinErrorText;
        C8632dsu.a(c1204Sr, "");
        this.pinErrorText = c1204Sr;
        b = dpB.b(new drO<Map<EditText, ? extends AppCompatEditText>>() { // from class: com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntry$nextMap$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public final Map<EditText, ? extends AppCompatEditText> invoke() {
                AppCompatEditText appCompatEditText5;
                AppCompatEditText appCompatEditText6;
                AppCompatEditText appCompatEditText7;
                AppCompatEditText appCompatEditText8;
                AppCompatEditText appCompatEditText9;
                AppCompatEditText appCompatEditText10;
                AppCompatEditText appCompatEditText11;
                AppCompatEditText appCompatEditText12;
                Map<EditText, ? extends AppCompatEditText> c;
                appCompatEditText5 = MaturityPinEntry.this.slot1;
                appCompatEditText6 = MaturityPinEntry.this.slot2;
                Pair a = dpD.a(appCompatEditText5, appCompatEditText6);
                appCompatEditText7 = MaturityPinEntry.this.slot2;
                appCompatEditText8 = MaturityPinEntry.this.slot3;
                Pair a2 = dpD.a(appCompatEditText7, appCompatEditText8);
                appCompatEditText9 = MaturityPinEntry.this.slot3;
                appCompatEditText10 = MaturityPinEntry.this.slot4;
                Pair a3 = dpD.a(appCompatEditText9, appCompatEditText10);
                appCompatEditText11 = MaturityPinEntry.this.slot3;
                appCompatEditText12 = MaturityPinEntry.this.slot4;
                c = dqE.c(a, a2, a3, dpD.a(appCompatEditText11, appCompatEditText12));
                return c;
            }
        });
        this.nextMap$delegate = b;
        setOrientation(1);
        j = C8569dql.j(appCompatEditText, appCompatEditText2, appCompatEditText3, appCompatEditText4);
        for (AppCompatEditText appCompatEditText5 : j) {
            appCompatEditText5.setText("0");
            setupListeners(appCompatEditText5);
        }
    }

    public final KeyboardController getKeyboardController() {
        KeyboardController keyboardController = this.keyboardController;
        if (keyboardController != null) {
            return keyboardController;
        }
        C8632dsu.d("");
        return null;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    public final Map<EditText, EditText> getNextMap() {
        return (Map) this.nextMap$delegate.getValue();
    }

    public final void bind(MaturityPinEntryViewModel maturityPinEntryViewModel) {
        this.viewModel = maturityPinEntryViewModel;
        String value = maturityPinEntryViewModel != null ? maturityPinEntryViewModel.getValue() : null;
        if (value != null && value.length() == 4) {
            this.slot1.setText(String.valueOf(value.charAt(0)));
            this.slot2.setText(String.valueOf(value.charAt(1)));
            this.slot3.setText(String.valueOf(value.charAt(2)));
            this.slot4.setText(String.valueOf(value.charAt(3)));
            return;
        }
        updatePinViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePinViewModel() {
        String pinValueFromUI = getPinValueFromUI();
        MaturityPinEntryViewModel maturityPinEntryViewModel = this.viewModel;
        if (maturityPinEntryViewModel != null) {
            maturityPinEntryViewModel.setValue(pinValueFromUI);
        }
        boolean z = pinValueFromUI.length() == 4;
        updateErrorState(z);
        this.pinErrorText.setVisibility(z ? 4 : 0);
    }

    private final String getPinValueFromUI() {
        Editable text = this.slot1.getText();
        Editable text2 = this.slot2.getText();
        Editable text3 = this.slot3.getText();
        Editable text4 = this.slot4.getText();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        sb.append((Object) text2);
        sb.append((Object) text3);
        sb.append((Object) text4);
        return sb.toString();
    }

    private final void setupListeners(final EditText editText) {
        Observable<Boolean> takeUntil = C9618tM.b(editText).takeUntil(C9618tM.d(editText));
        final drM<Boolean, dpR> drm = new drM<Boolean, dpR>() { // from class: com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntry$setupListeners$focusDisposable$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                C8632dsu.d(bool);
                if (bool.booleanValue()) {
                    EditText editText2 = editText;
                    editText2.setSelection(editText2.getText().length());
                }
            }
        };
        takeUntil.subscribe(new Consumer() { // from class: com.netflix.mediaclient.acquisition.components.form2.maturityPinEntry.MaturityPinEntry$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MaturityPinEntry.setupListeners$lambda$1(drM.this, obj);
            }
        });
        editText.addTextChangedListener(new MaturityPinEntry$setupListeners$textChangeListener$1(editText, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$1(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        drm.invoke(obj);
    }

    private final void updateErrorState(boolean z) {
        List<AppCompatEditText> j;
        int i = z ? R.drawable.maturity_pin_selector : R.drawable.maturity_pin_error;
        j = C8569dql.j(this.slot1, this.slot2, this.slot3, this.slot4);
        for (AppCompatEditText appCompatEditText : j) {
            appCompatEditText.setBackgroundResource(i);
        }
    }
}
