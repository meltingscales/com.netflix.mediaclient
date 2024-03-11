package com.netflix.mediaclient.acquisition.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.viewbinding.ViewBindings;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.checkBox.FormViewCheckBox;
import o.C1204Sr;

/* loaded from: classes6.dex */
public final class KoreaCheckBoxesLayoutBinding {
    public final CheckBox allCheckbox;
    public final C1204Sr bottomTermsText;
    public final FormViewCheckBox consentCheckBox1;
    public final FormViewCheckBox consentCheckBox2;
    public final FormViewCheckBox consentCheckBox3;
    public final FormViewCheckBox consentCheckBox4;
    public final FormViewCheckBox consentCheckBox5;
    public final C1204Sr consentErrorMessage;
    public final View divider;
    private final View rootView;

    public View getRoot() {
        return this.rootView;
    }

    private KoreaCheckBoxesLayoutBinding(View view, CheckBox checkBox, C1204Sr c1204Sr, FormViewCheckBox formViewCheckBox, FormViewCheckBox formViewCheckBox2, FormViewCheckBox formViewCheckBox3, FormViewCheckBox formViewCheckBox4, FormViewCheckBox formViewCheckBox5, C1204Sr c1204Sr2, View view2) {
        this.rootView = view;
        this.allCheckbox = checkBox;
        this.bottomTermsText = c1204Sr;
        this.consentCheckBox1 = formViewCheckBox;
        this.consentCheckBox2 = formViewCheckBox2;
        this.consentCheckBox3 = formViewCheckBox3;
        this.consentCheckBox4 = formViewCheckBox4;
        this.consentCheckBox5 = formViewCheckBox5;
        this.consentErrorMessage = c1204Sr2;
        this.divider = view2;
    }

    public static KoreaCheckBoxesLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.korea_check_boxes_layout, viewGroup);
        return bind(viewGroup);
    }

    public static KoreaCheckBoxesLayoutBinding bind(View view) {
        View findChildViewById;
        int i = R.id.allCheckbox;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i);
        if (checkBox != null) {
            i = R.id.bottomTermsText;
            C1204Sr c1204Sr = (C1204Sr) ViewBindings.findChildViewById(view, i);
            if (c1204Sr != null) {
                i = R.id.consentCheckBox1;
                FormViewCheckBox formViewCheckBox = (FormViewCheckBox) ViewBindings.findChildViewById(view, i);
                if (formViewCheckBox != null) {
                    i = R.id.consentCheckBox2;
                    FormViewCheckBox formViewCheckBox2 = (FormViewCheckBox) ViewBindings.findChildViewById(view, i);
                    if (formViewCheckBox2 != null) {
                        i = R.id.consentCheckBox3;
                        FormViewCheckBox formViewCheckBox3 = (FormViewCheckBox) ViewBindings.findChildViewById(view, i);
                        if (formViewCheckBox3 != null) {
                            i = R.id.consentCheckBox4;
                            FormViewCheckBox formViewCheckBox4 = (FormViewCheckBox) ViewBindings.findChildViewById(view, i);
                            if (formViewCheckBox4 != null) {
                                i = R.id.consentCheckBox5;
                                FormViewCheckBox formViewCheckBox5 = (FormViewCheckBox) ViewBindings.findChildViewById(view, i);
                                if (formViewCheckBox5 != null) {
                                    i = R.id.consentErrorMessage;
                                    C1204Sr c1204Sr2 = (C1204Sr) ViewBindings.findChildViewById(view, i);
                                    if (c1204Sr2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null) {
                                        return new KoreaCheckBoxesLayoutBinding(view, checkBox, c1204Sr, formViewCheckBox, formViewCheckBox2, formViewCheckBox3, formViewCheckBox4, formViewCheckBox5, c1204Sr2, findChildViewById);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
