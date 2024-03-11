package com.netflix.mediaclient.acquisition.lib.services.logging;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertDialog;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes3.dex */
public final class LoggedErrorListenerImpl implements SignupErrorReporter.LoggedErrorListener {
    public static final Companion Companion = new Companion(null);
    public static final String DIALOG_TITLE = "Developer Action Required";
    private static boolean IGNORE_ERRORS;
    private final Activity alertDialogHost;
    private final boolean isDebugBuild;

    public LoggedErrorListenerImpl(boolean z, Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.isDebugBuild = z;
        this.alertDialogHost = activity;
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public final boolean getIGNORE_ERRORS() {
            return LoggedErrorListenerImpl.IGNORE_ERRORS;
        }

        public final void setIGNORE_ERRORS(boolean z) {
            LoggedErrorListenerImpl.IGNORE_ERRORS = z;
        }
    }

    @Override // com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter.LoggedErrorListener
    public void onErrorLogged(String str, String str2) {
        C8632dsu.c((Object) str, "");
        if (!this.isDebugBuild || IGNORE_ERRORS) {
            return;
        }
        String str3 = errorCodeToUserFriendlySummary(str) + "\n\n" + (str + ": '" + str2 + "'");
        final Throwable th = new Throwable(str3);
        new AlertDialog.Builder(this.alertDialogHost, R.style.Theme_AppCompat_Dialog).setTitle(DIALOG_TITLE).setMessage(str3).setCancelable(false).setPositiveButton("Ignore", (DialogInterface.OnClickListener) null).setNegativeButton("Throw Exception", new DialogInterface.OnClickListener() { // from class: com.netflix.mediaclient.acquisition.lib.services.logging.LoggedErrorListenerImpl$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LoggedErrorListenerImpl.onErrorLogged$lambda$0(th, dialogInterface, i);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onErrorLogged$lambda$0(Throwable th, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) th, "");
        throw new Exception(th);
    }

    private final String errorCodeToUserFriendlySummary(String str) {
        switch (str.hashCode()) {
            case -1458414803:
                if (str.equals(SignupConstants.Error.MISSING_MOP_LOGO_URL)) {
                    return "Dynecom has sent down a MOP key the client does not have an image for. The UI will be missing the corresponding MOP image.";
                }
                break;
            case -1177665085:
                if (str.equals(SignupConstants.Error.WARN_USER_MODE)) {
                    return "Dynecom has sent a warnUserMode to the client. Users will not be able to proceed through sign up.";
                }
                break;
            case -930863694:
                if (str.equals(SignupConstants.Error.DATA_MANIPULATION_ERROR)) {
                    return "Data from Dynecom could not be manipulated correctly. e.g. a field had a type of Boolean where a type of String was expected. Users may not be able to proceed through sign up.";
                }
                break;
            case -141864418:
                if (str.equals(SignupConstants.Error.UNKNOWN_MODE)) {
                    return "Dynecom has sent a mode the client does not recognize. Users will not be able to proceed through sign up.";
                }
                break;
            case 420944133:
                if (str.equals(SignupConstants.Error.MULTI_FIELD_MERGE_ERROR)) {
                    return "Cannot merge Dynecom fields. e.g. the client is expecting both a year and month field to construct an input, but only a month was sent down. Users may not be able to proceed through sign up.";
                }
                break;
            case 1095811840:
                if (str.equals(SignupConstants.Error.UNRECOGNIZED_STRING_KEY_ERROR)) {
                    return "Dynecom has sent a string key the client does not recognize. Important UI messaging may be incorrect such as a heading or CTA.";
                }
                break;
            case 1327249917:
                if (str.equals(SignupConstants.Error.MISSING_FIELD_ERROR)) {
                    return "Expected Dynecom field is missing. Users may not be able to proceed through sign up.";
                }
                break;
        }
        throw new IllegalArgumentException("Unknown errorCode: " + str);
    }
}
