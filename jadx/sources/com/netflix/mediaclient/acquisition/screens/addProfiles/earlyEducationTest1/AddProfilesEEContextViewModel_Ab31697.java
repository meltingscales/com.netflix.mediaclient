package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.lib.services.StringProvider;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class AddProfilesEEContextViewModel_Ab31697 {
    public static final int $stable = 0;
    private final String bullet1Text;
    private final String bullet2Text;
    private final String bullet3Text;
    private final String ctaButtonText;
    private final int iconBullet1Drawable;
    private final int iconBullet2Drawable;
    private final int iconBullet3Drawable;
    private final String titleText;

    public final String getBullet1Text() {
        return this.bullet1Text;
    }

    public final String getBullet2Text() {
        return this.bullet2Text;
    }

    public final String getBullet3Text() {
        return this.bullet3Text;
    }

    public final String getCtaButtonText() {
        return this.ctaButtonText;
    }

    public final int getIconBullet1Drawable() {
        return this.iconBullet1Drawable;
    }

    public final int getIconBullet2Drawable() {
        return this.iconBullet2Drawable;
    }

    public final int getIconBullet3Drawable() {
        return this.iconBullet3Drawable;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public AddProfilesEEContextViewModel_Ab31697(StringProvider stringProvider) {
        C8632dsu.c((Object) stringProvider, "");
        this.ctaButtonText = stringProvider.getString(R.string.add_profile_modal_cta);
        this.titleText = stringProvider.getString(R.string.add_profile_context_page_headline);
        this.bullet1Text = stringProvider.getString(R.string.add_profile_context_page_bullet_1);
        this.bullet2Text = stringProvider.getString(R.string.add_profile_context_page_bullet_2);
        this.bullet3Text = stringProvider.getString(R.string.add_profile_context_page_bullet_3);
        this.iconBullet1Drawable = R.drawable.ic_test1_earlyedu_home;
        this.iconBullet2Drawable = R.drawable.ic_test1_earlyedu_deny;
        this.iconBullet3Drawable = R.drawable.ic_test1_earlyedu_clapboard;
    }
}
