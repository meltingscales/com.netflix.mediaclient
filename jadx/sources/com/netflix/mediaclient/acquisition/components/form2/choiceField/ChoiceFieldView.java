package com.netflix.mediaclient.acquisition.components.form2.choiceField;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.netflix.mediaclient.acquisition.databinding.ChoiceFieldViewBinding;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import o.C1204Sr;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;
import o.C9834xU;

/* loaded from: classes6.dex */
public class ChoiceFieldView extends LinearLayout {
    public static final int $stable = 8;
    private static int d = 1;
    private static int e;
    private static byte e$ss2$187;
    private final ChoiceFieldViewBinding binding;
    private final C1204Sr inputError;
    private final ConstraintLayout inputLayout;
    private final C1204Sr selectedOption;
    private ChoiceFieldViewModel viewModel;

    static {
        c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChoiceFieldView(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChoiceFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChoiceFieldView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    static void c() {
        e$ss2$187 = (byte) 24;
    }

    public static /* synthetic */ void getInputError$annotations() {
    }

    public static /* synthetic */ void getSelectedOption$annotations() {
    }

    public final C1204Sr getInputError() {
        return this.inputError;
    }

    public final C1204Sr getSelectedOption() {
        return this.selectedOption;
    }

    public /* synthetic */ ChoiceFieldView(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChoiceFieldView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
        ChoiceFieldViewBinding inflate = ChoiceFieldViewBinding.inflate(LayoutInflater.from(context), this);
        C8632dsu.a(inflate, "");
        this.binding = inflate;
        ConstraintLayout constraintLayout = inflate.inputLayout;
        C8632dsu.a(constraintLayout, "");
        this.inputLayout = constraintLayout;
        C1204Sr c1204Sr = inflate.editText;
        C8632dsu.a(c1204Sr, "");
        this.selectedOption = c1204Sr;
        C1204Sr c1204Sr2 = inflate.inputError;
        C8632dsu.a(c1204Sr2, "");
        this.inputError = c1204Sr2;
    }

    public final void bind(ChoiceFieldViewModel choiceFieldViewModel) {
        this.viewModel = choiceFieldViewModel;
        setUpText();
        ConstraintLayout constraintLayout = this.inputLayout;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.components.form2.choiceField.ChoiceFieldView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChoiceFieldView.bind$lambda$0(ChoiceFieldView.this, view);
            }
        });
        constraintLayout.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(ChoiceFieldView choiceFieldView, View view) {
        C8632dsu.c((Object) choiceFieldView, "");
        choiceFieldView.showDialog();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setUpText() {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            com.netflix.mediaclient.acquisition.components.form2.choiceField.ChoiceFieldViewModel r1 = r13.viewModel
            r2 = 0
            if (r1 == 0) goto Ld
            java.lang.String r1 = r1.getValue()
            goto Le
        Ld:
            r1 = r2
        Le:
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L31
            int r5 = com.netflix.mediaclient.acquisition.components.form2.choiceField.ChoiceFieldView.d
            int r5 = r5 + 79
            int r6 = r5 % 128
            com.netflix.mediaclient.acquisition.components.form2.choiceField.ChoiceFieldView.e = r6
            int r5 = r5 % r0
            int r1 = r1.length()
            if (r1 != 0) goto L22
            goto L31
        L22:
            o.Sr r1 = r13.selectedOption
            com.netflix.mediaclient.acquisition.components.form2.choiceField.ChoiceFieldViewModel r5 = r13.viewModel
            if (r5 == 0) goto L2c
            java.lang.String r2 = r5.getValue()
        L2c:
            r1.setText(r2)
            goto La4
        L31:
            com.netflix.mediaclient.acquisition.components.form2.choiceField.ChoiceFieldViewModel r1 = r13.viewModel
            if (r1 == 0) goto L3e
            int r1 = r1.getLabel()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L3f
        L3e:
            r1 = r2
        L3f:
            if (r1 == 0) goto La4
            o.Sr r1 = r13.selectedOption
            com.netflix.mediaclient.acquisition.components.form2.choiceField.ChoiceFieldViewModel r5 = r13.viewModel
            if (r5 == 0) goto L5e
            int r6 = com.netflix.mediaclient.acquisition.components.form2.choiceField.ChoiceFieldView.e
            int r6 = r6 + 93
            int r7 = r6 % 128
            com.netflix.mediaclient.acquisition.components.form2.choiceField.ChoiceFieldView.d = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L57
            int r2 = r5.getLabel()
            goto L5f
        L57:
            r5.getLabel()
            r2.hashCode()
            throw r2
        L5e:
            r2 = r4
        L5f:
            android.content.Context r5 = r1.getContext()
            java.lang.String r6 = r5.getString(r2)
            java.lang.String r7 = "'!#+"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto La1
            r7 = 4
            java.lang.String r6 = r6.substring(r7)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r13.b(r6, r7)
            r6 = r7[r4]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            java.lang.CharSequence r2 = r5.getText(r2)
            boolean r5 = r2 instanceof android.text.Spanned
            if (r5 == 0) goto La1
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r6)
            r7 = r2
            android.text.SpannedString r7 = (android.text.SpannedString) r7
            r8 = 0
            int r9 = r6.length()
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r2 = r5
            android.text.SpannableString r2 = (android.text.SpannableString) r2
            r12 = 0
            r11 = r5
            android.text.TextUtils.copySpansFrom(r7, r8, r9, r10, r11, r12)
            r6 = r5
        La1:
            r1.setText(r6)
        La4:
            int r1 = com.netflix.mediaclient.acquisition.components.form2.choiceField.ChoiceFieldView.d
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.netflix.mediaclient.acquisition.components.form2.choiceField.ChoiceFieldView.e = r2
            int r1 = r1 % r0
            if (r1 == 0) goto Lb0
            int r3 = r3 / r4
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.acquisition.components.form2.choiceField.ChoiceFieldView.setUpText():void");
    }

    private final void showDialog() {
        int d2;
        ChoiceFieldViewModel choiceFieldViewModel = this.viewModel;
        String[] strArr = null;
        final List<OptionFieldViewModel> options = choiceFieldViewModel != null ? choiceFieldViewModel.getOptions() : null;
        if (options != null) {
            d2 = C8572dqo.d(options, 10);
            ArrayList arrayList = new ArrayList(d2);
            for (OptionFieldViewModel optionFieldViewModel : options) {
                String displayName = optionFieldViewModel.getDisplayName();
                C8632dsu.d((Object) displayName);
                arrayList.add(displayName);
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), C9834xU.o.c);
        ChoiceFieldViewModel choiceFieldViewModel2 = this.viewModel;
        AlertDialog create = builder.setTitle(choiceFieldViewModel2 != null ? choiceFieldViewModel2.getLabel() : 0).setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.components.form2.choiceField.ChoiceFieldView$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ChoiceFieldView.showDialog$lambda$2(options, this, dialogInterface, i);
            }
        }).setCancelable(true).create();
        create.getListView().setDividerHeight(1);
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$2(List list, ChoiceFieldView choiceFieldView, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) choiceFieldView, "");
        OptionFieldViewModel optionFieldViewModel = list != null ? (OptionFieldViewModel) list.get(i) : null;
        ChoiceFieldViewModel choiceFieldViewModel = choiceFieldView.viewModel;
        if (choiceFieldViewModel != null) {
            choiceFieldViewModel.setValue(optionFieldViewModel != null ? optionFieldViewModel.getValue() : null);
        }
        choiceFieldView.selectedOption.setText(optionFieldViewModel != null ? optionFieldViewModel.getDisplayName() : null);
        dialogInterface.dismiss();
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$187);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
