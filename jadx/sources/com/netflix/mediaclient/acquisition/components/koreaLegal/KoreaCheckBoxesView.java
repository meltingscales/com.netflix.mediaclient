package com.netflix.mediaclient.acquisition.components.koreaLegal;

import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.core.text.HtmlCompat;
import com.netflix.mediaclient.acquisition.components.form2.BooleanViewModel;
import com.netflix.mediaclient.acquisition.components.form2.checkBox.FormViewCheckBox;
import com.netflix.mediaclient.acquisition.components.tou.TermsAndConsentsComponent;
import com.netflix.mediaclient.acquisition.databinding.KoreaCheckBoxesLayoutBinding;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.C1204Sr;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8554dpx;
import o.InterfaceC8639dta;
import o.dpA;
import o.drO;
import o.dsA;
import o.dsS;
import o.dsW;
import o.dtC;

/* loaded from: classes3.dex */
public final class KoreaCheckBoxesView extends LinearLayout implements TermsAndConsentsComponent {
    static final /* synthetic */ dtC<Object>[] $$delegatedProperties = {dsA.b(new MutablePropertyReference1Impl(KoreaCheckBoxesView.class, "checkBoxViewModels", "getCheckBoxViewModels()Ljava/util/List;", 0)), dsA.b(new MutablePropertyReference1Impl(KoreaCheckBoxesView.class, "checkBoxTitleTexts", "getCheckBoxTitleTexts()Ljava/util/List;", 0))};
    public static final int $stable = 8;
    private final CheckBox allCheckBox;
    private final InterfaceC8554dpx allConsentCheckBoxes$delegate;
    private final KoreaCheckBoxesLayoutBinding binding;
    private String bottomTermsText;
    private final C1204Sr bottomTermsTextView;
    private final InterfaceC8639dta checkBoxTitleTexts$delegate;
    private final InterfaceC8639dta checkBoxViewModels$delegate;
    private final FormViewCheckBox consentCheckBox1;
    private final FormViewCheckBox consentCheckBox2;
    private final FormViewCheckBox consentCheckBox3;
    private final FormViewCheckBox consentCheckBox4;
    private final FormViewCheckBox consentCheckBox5;
    private final C1204Sr consentErrorMessage;
    private final View dividerView;
    private MainCheckboxViewModel mainCheckboxViewModel;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KoreaCheckBoxesView(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KoreaCheckBoxesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public static /* synthetic */ void getAllCheckBox$annotations() {
    }

    public static /* synthetic */ void getBottomTermsTextView$annotations() {
    }

    public static /* synthetic */ void getConsentCheckBox1$annotations() {
    }

    public static /* synthetic */ void getConsentCheckBox2$annotations() {
    }

    public static /* synthetic */ void getConsentCheckBox3$annotations() {
    }

    public static /* synthetic */ void getConsentCheckBox4$annotations() {
    }

    public static /* synthetic */ void getConsentCheckBox5$annotations() {
    }

    public static /* synthetic */ void getConsentErrorMessage$annotations() {
    }

    public static /* synthetic */ void getDividerView$annotations() {
    }

    public final CheckBox getAllCheckBox() {
        return this.allCheckBox;
    }

    public final String getBottomTermsText() {
        return this.bottomTermsText;
    }

    public final C1204Sr getBottomTermsTextView() {
        return this.bottomTermsTextView;
    }

    public final FormViewCheckBox getConsentCheckBox1() {
        return this.consentCheckBox1;
    }

    public final FormViewCheckBox getConsentCheckBox2() {
        return this.consentCheckBox2;
    }

    public final FormViewCheckBox getConsentCheckBox3() {
        return this.consentCheckBox3;
    }

    public final FormViewCheckBox getConsentCheckBox4() {
        return this.consentCheckBox4;
    }

    public final FormViewCheckBox getConsentCheckBox5() {
        return this.consentCheckBox5;
    }

    public final C1204Sr getConsentErrorMessage() {
        return this.consentErrorMessage;
    }

    public final View getDividerView() {
        return this.dividerView;
    }

    public final MainCheckboxViewModel getMainCheckboxViewModel() {
        return this.mainCheckboxViewModel;
    }

    public final void setMainCheckboxViewModel(MainCheckboxViewModel mainCheckboxViewModel) {
        this.mainCheckboxViewModel = mainCheckboxViewModel;
    }

    public /* synthetic */ KoreaCheckBoxesView(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoreaCheckBoxesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        final List i2;
        final List i3;
        C8632dsu.c((Object) context, "");
        KoreaCheckBoxesLayoutBinding inflate = KoreaCheckBoxesLayoutBinding.inflate(LayoutInflater.from(context), this);
        C8632dsu.a(inflate, "");
        this.binding = inflate;
        CheckBox checkBox = inflate.allCheckbox;
        C8632dsu.a(checkBox, "");
        this.allCheckBox = checkBox;
        FormViewCheckBox formViewCheckBox = inflate.consentCheckBox1;
        C8632dsu.a(formViewCheckBox, "");
        this.consentCheckBox1 = formViewCheckBox;
        FormViewCheckBox formViewCheckBox2 = inflate.consentCheckBox2;
        C8632dsu.a(formViewCheckBox2, "");
        this.consentCheckBox2 = formViewCheckBox2;
        FormViewCheckBox formViewCheckBox3 = inflate.consentCheckBox3;
        C8632dsu.a(formViewCheckBox3, "");
        this.consentCheckBox3 = formViewCheckBox3;
        FormViewCheckBox formViewCheckBox4 = inflate.consentCheckBox4;
        C8632dsu.a(formViewCheckBox4, "");
        this.consentCheckBox4 = formViewCheckBox4;
        FormViewCheckBox formViewCheckBox5 = inflate.consentCheckBox5;
        C8632dsu.a(formViewCheckBox5, "");
        this.consentCheckBox5 = formViewCheckBox5;
        View view = inflate.divider;
        C8632dsu.a(view, "");
        this.dividerView = view;
        C1204Sr c1204Sr = inflate.consentErrorMessage;
        C8632dsu.a(c1204Sr, "");
        this.consentErrorMessage = c1204Sr;
        C1204Sr c1204Sr2 = inflate.bottomTermsText;
        C8632dsu.a(c1204Sr2, "");
        this.bottomTermsTextView = c1204Sr2;
        dsW dsw = dsW.a;
        i2 = C8569dql.i();
        this.checkBoxViewModels$delegate = new dsS<List<? extends BooleanViewModel>>(i2) { // from class: com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesView$special$$inlined$observable$1
            @Override // o.dsS
            public void afterChange(dtC<?> dtc, List<? extends BooleanViewModel> list, List<? extends BooleanViewModel> list2) {
                List allConsentCheckBoxes;
                List allConsentCheckBoxes2;
                List<Pair> h;
                boolean isSingleCheckBox;
                boolean isSingleCheckBox2;
                C8632dsu.c((Object) dtc, "");
                allConsentCheckBoxes = this.getAllConsentCheckBoxes();
                Iterator it = allConsentCheckBoxes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ((FormViewCheckBox) it.next()).setVisibility(8);
                }
                List<BooleanViewModel> checkBoxViewModels = this.getCheckBoxViewModels();
                allConsentCheckBoxes2 = this.getAllConsentCheckBoxes();
                h = C8576dqs.h(checkBoxViewModels, allConsentCheckBoxes2);
                for (Pair pair : h) {
                    FormViewCheckBox formViewCheckBox6 = (FormViewCheckBox) pair.c();
                    formViewCheckBox6.bind((BooleanViewModel) pair.b());
                    formViewCheckBox6.setVisibility(0);
                }
                CheckBox allCheckBox = this.getAllCheckBox();
                isSingleCheckBox = this.isSingleCheckBox();
                allCheckBox.setVisibility(isSingleCheckBox ? 8 : 0);
                View dividerView = this.getDividerView();
                isSingleCheckBox2 = this.isSingleCheckBox();
                dividerView.setVisibility(isSingleCheckBox2 ? 8 : 0);
            }
        };
        i3 = C8569dql.i();
        this.checkBoxTitleTexts$delegate = new dsS<List<? extends String>>(i3) { // from class: com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesView$special$$inlined$observable$2
            @Override // o.dsS
            public void afterChange(dtC<?> dtc, List<? extends String> list, List<? extends String> list2) {
                List j;
                List<Pair> h;
                C8632dsu.c((Object) dtc, "");
                List<String> checkBoxTitleTexts = this.getCheckBoxTitleTexts();
                j = C8569dql.j(this.getConsentCheckBox1(), this.getConsentCheckBox2(), this.getConsentCheckBox3(), this.getConsentCheckBox4(), this.getConsentCheckBox5());
                h = C8576dqs.h(checkBoxTitleTexts, j);
                for (Pair pair : h) {
                    ((FormViewCheckBox) pair.c()).setText(HtmlCompat.fromHtml((String) pair.b(), 0, null, null));
                }
            }
        };
        this.allConsentCheckBoxes$delegate = dpA.d(new drO<List<? extends FormViewCheckBox>>() { // from class: com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesView$allConsentCheckBoxes$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // o.drO
            public final List<? extends FormViewCheckBox> invoke() {
                List<? extends FormViewCheckBox> j;
                j = C8569dql.j(KoreaCheckBoxesView.this.getConsentCheckBox1(), KoreaCheckBoxesView.this.getConsentCheckBox2(), KoreaCheckBoxesView.this.getConsentCheckBox3(), KoreaCheckBoxesView.this.getConsentCheckBox4(), KoreaCheckBoxesView.this.getConsentCheckBox5());
                return j;
            }
        });
        setOrientation(1);
        initCheckBoxes();
    }

    public final CharSequence getAllCheckBoxText() {
        return this.allCheckBox.getText();
    }

    public final void setAllCheckBoxText(CharSequence charSequence) {
        this.allCheckBox.setText(charSequence);
    }

    public final void setBottomTermsText(String str) {
        if (str != null && str.length() != 0) {
            this.bottomTermsTextView.setVisibility(0);
        }
        this.bottomTermsTextView.setMovementMethod(LinkMovementMethod.getInstance());
        this.bottomTermsTextView.setText(Html.fromHtml(str));
        this.bottomTermsText = str;
    }

    public final List<BooleanViewModel> getCheckBoxViewModels() {
        return (List) this.checkBoxViewModels$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final void setCheckBoxViewModels(List<BooleanViewModel> list) {
        C8632dsu.c((Object) list, "");
        this.checkBoxViewModels$delegate.setValue(this, $$delegatedProperties[0], list);
    }

    public final List<String> getCheckBoxTitleTexts() {
        return (List) this.checkBoxTitleTexts$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final void setCheckBoxTitleTexts(List<String> list) {
        C8632dsu.c((Object) list, "");
        this.checkBoxTitleTexts$delegate.setValue(this, $$delegatedProperties[1], list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<FormViewCheckBox> getAllConsentCheckBoxes() {
        return (List) this.allConsentCheckBoxes$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSingleCheckBox() {
        return getCheckBoxViewModels().size() < 2;
    }

    private final boolean getAreAllCheckBoxesChecked() {
        List<BooleanViewModel> checkBoxViewModels = getCheckBoxViewModels();
        if (!(checkBoxViewModels instanceof Collection) || !checkBoxViewModels.isEmpty()) {
            for (BooleanViewModel booleanViewModel : checkBoxViewModels) {
                if (!booleanViewModel.getValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void initCheckBoxes() {
        this.allCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesView$$ExternalSyntheticLambda0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                KoreaCheckBoxesView.initCheckBoxes$lambda$7(KoreaCheckBoxesView.this, compoundButton, z);
            }
        });
        this.allCheckBox.setMovementMethod(LinkMovementMethod.getInstance());
        for (final FormViewCheckBox formViewCheckBox : getAllConsentCheckBoxes()) {
            MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
            C8632dsu.a(linkMovementMethod, "");
            formViewCheckBox.setMovementMethod(linkMovementMethod);
            formViewCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesView$$ExternalSyntheticLambda1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    KoreaCheckBoxesView.initCheckBoxes$lambda$9$lambda$8(FormViewCheckBox.this, this, compoundButton, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCheckBoxes$lambda$7(KoreaCheckBoxesView koreaCheckBoxesView, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) koreaCheckBoxesView, "");
        MainCheckboxViewModel mainCheckboxViewModel = koreaCheckBoxesView.mainCheckboxViewModel;
        if (mainCheckboxViewModel != null) {
            mainCheckboxViewModel.setChecked(z);
        }
        koreaCheckBoxesView.allCheckBox.setActivated(true);
        for (FormViewCheckBox formViewCheckBox : koreaCheckBoxesView.getAllConsentCheckBoxes()) {
            formViewCheckBox.setChecked(z);
        }
        koreaCheckBoxesView.updateErrorVisibility();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initCheckBoxes$lambda$9$lambda$8(FormViewCheckBox formViewCheckBox, KoreaCheckBoxesView koreaCheckBoxesView, CompoundButton compoundButton, boolean z) {
        C8632dsu.c((Object) formViewCheckBox, "");
        C8632dsu.c((Object) koreaCheckBoxesView, "");
        formViewCheckBox.setActivated(true);
        if (!z || koreaCheckBoxesView.getAreAllCheckBoxesChecked()) {
            koreaCheckBoxesView.updateErrorVisibility();
        }
    }

    private final void updateErrorVisibility() {
        this.consentErrorMessage.setVisibility(((getAreAllCheckBoxesChecked() && this.allCheckBox.isChecked()) || (isSingleCheckBox() && getAreAllCheckBoxesChecked())) ? 8 : 0);
        if (this.consentErrorMessage.getVisibility() == 0) {
            this.allCheckBox.setActivated(true);
            for (FormViewCheckBox formViewCheckBox : getAllConsentCheckBoxes()) {
                formViewCheckBox.setActivated(true);
            }
        }
    }

    @Override // com.netflix.mediaclient.acquisition.components.tou.TermsAndConsentsComponent
    public boolean hasAcceptedRequiredCheckBoxes() {
        updateErrorVisibility();
        return (getAreAllCheckBoxesChecked() && this.allCheckBox.isChecked()) || (isSingleCheckBox() && getAreAllCheckBoxesChecked());
    }
}
