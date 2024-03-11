package o;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import o.C9834xU;

/* loaded from: classes4.dex */
public final class cLM extends NetflixDialogFrag {
    public static final e b = new e(null);
    public static final int e = 8;
    private DialogInterface.OnClickListener a;
    private String d;

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog create = new AlertDialog.Builder(requireContext(), C9834xU.o.c).setTitle(C1333Xq.d(com.netflix.mediaclient.ui.R.o.kt).d(SignupConstants.Field.PROFILE_NAME, this.d).c()).setMessage(getString(com.netflix.mediaclient.ui.R.o.ku)).setPositiveButton(com.netflix.mediaclient.ui.R.o.kv, this.a).setNegativeButton(com.netflix.mediaclient.ui.R.o.cL, this.a).create();
        create.setCanceledOnTouchOutside(false);
        C8632dsu.a(create, "");
        return create;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        C8632dsu.c((Object) dialogInterface, "");
        super.onCancel(dialogInterface);
        DialogInterface.OnClickListener onClickListener = this.a;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        dismiss();
    }

    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final cLM d(String str, DialogInterface.OnClickListener onClickListener) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) onClickListener, "");
            cLM clm = new cLM();
            clm.setStyle(0, com.netflix.mediaclient.ui.R.l.j);
            clm.d = str;
            clm.a = onClickListener;
            return clm;
        }
    }
}
