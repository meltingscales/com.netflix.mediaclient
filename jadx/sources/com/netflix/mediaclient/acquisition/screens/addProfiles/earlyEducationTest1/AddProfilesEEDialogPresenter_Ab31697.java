package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class AddProfilesEEDialogPresenter_Ab31697 {
    public static final int $stable = 0;

    public final boolean showEarlyEducationDialog(Fragment fragment) {
        C8632dsu.c((Object) fragment, "");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return false;
        }
        FragmentTransaction beginTransaction = activity.getSupportFragmentManager().beginTransaction();
        C8632dsu.a(beginTransaction, "");
        new AddProfilesEEDialogFragment_Ab31697().show(beginTransaction, AddProfilesEEDialogFragment_Ab31697.TAG_EARLY_EDUCATION_DIALOG);
        return true;
    }
}
