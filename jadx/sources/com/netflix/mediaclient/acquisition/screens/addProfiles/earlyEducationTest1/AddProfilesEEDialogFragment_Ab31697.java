package com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.event.discrete.Closed;
import com.netflix.cl.model.event.discrete.Presented;
import com.netflix.mediaclient.acquisition.R;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import com.netflix.mediaclient.acquisition.util.SignupUtilities;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import o.C8627dsp;
import o.C8632dsu;
import o.C9834xU;

/* loaded from: classes3.dex */
public final class AddProfilesEEDialogFragment_Ab31697 extends NetflixDialogFrag {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String TAG_EARLY_EDUCATION_DIALOG = "earlyEducationDialog";

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 16973840);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C8632dsu.a(onCreateDialog, "");
        Window window = onCreateDialog.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.windowAnimations = R.style.DialogFade;
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C8632dsu.c((Object) layoutInflater, "");
        View inflate = layoutInflater.inflate(R.layout.dialog_add_profiles_ee_ab31697, viewGroup, false);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawableResource(C9834xU.c.A);
        }
        return inflate;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        NetflixSignupButton netflixSignupButton = (NetflixSignupButton) view.findViewById(R.id.ctaButton);
        String string = view.getContext().getString(R.string.add_profile_modal_cta);
        C8632dsu.a(string, "");
        netflixSignupButton.setText(string);
        Context context = view.getContext();
        C8632dsu.a(context, "");
        ((ImageView) view.findViewById(R.id.iconBullet1)).setImageDrawable(SignupUtilities.getDrawableInColor(context, R.drawable.ic_test1_earlyedu_deny, R.color.signup_red_dark));
        Context context2 = view.getContext();
        C8632dsu.a(context2, "");
        ((ImageView) view.findViewById(R.id.iconBullet2)).setImageDrawable(SignupUtilities.getDrawableInColor(context2, R.drawable.ic_test1_earlyedu_home, R.color.signup_red_dark));
        Context context3 = view.getContext();
        C8632dsu.a(context3, "");
        ((ImageView) view.findViewById(R.id.iconBullet3)).setImageDrawable(SignupUtilities.getDrawableInColor(context3, R.drawable.ic_test1_earlyedu_clapboard, R.color.signup_red_dark));
        Logger.INSTANCE.logEvent(new Presented(AppView.addProfilesSharingEducationPrompt, Boolean.FALSE, null));
        C8632dsu.d(netflixSignupButton);
        initClickListeners(netflixSignupButton);
    }

    private final void initClickListeners(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.screens.addProfiles.earlyEducationTest1.AddProfilesEEDialogFragment_Ab31697$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AddProfilesEEDialogFragment_Ab31697.initClickListeners$lambda$0(AddProfilesEEDialogFragment_Ab31697.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClickListeners$lambda$0(AddProfilesEEDialogFragment_Ab31697 addProfilesEEDialogFragment_Ab31697, View view) {
        C8632dsu.c((Object) addProfilesEEDialogFragment_Ab31697, "");
        addProfilesEEDialogFragment_Ab31697.dismiss();
        Logger.INSTANCE.logEvent(new Closed(AppView.addProfilesSharingEducationPrompt, null, CommandValue.CloseCommand, null));
    }
}
