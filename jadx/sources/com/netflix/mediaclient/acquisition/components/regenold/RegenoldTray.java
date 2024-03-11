package com.netflix.mediaclient.acquisition.components.regenold;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditText;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import o.C8632dsu;
import o.C9834xU;
import o.TH;
import o.dpR;
import o.drM;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class RegenoldTray extends TH {
    public static final int $stable = 8;
    private final View closeRegistrationTrayButton;
    private final FormViewEditText emailFormView;
    private final NetflixSignupButton saveEmailButton;

    public final View getCloseRegistrationTrayButton() {
        return this.closeRegistrationTrayButton;
    }

    public final FormViewEditText getEmailFormView() {
        return this.emailFormView;
    }

    public final NetflixSignupButton getSaveEmailButton() {
        return this.saveEmailButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegenoldTray(Context context, drM<? super View, dpR> drm) {
        super(context, R.layout.reggie_registration_tray, drm, null, 0, 0, 0, 0, context.getResources().getDimensionPixelSize(C9834xU.a.z), false, false, false, false, false, 16120, null);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) drm, "");
        View findViewById = findViewById(R.id.email);
        C8632dsu.a(findViewById, "");
        this.emailFormView = (FormViewEditText) findViewById;
        View findViewById2 = findViewById(R.id.closeButton);
        C8632dsu.a(findViewById2, "");
        this.closeRegistrationTrayButton = findViewById2;
        View findViewById3 = findViewById(R.id.saveEmailButton);
        C8632dsu.a(findViewById3, "");
        this.saveEmailButton = (NetflixSignupButton) findViewById3;
    }
}
