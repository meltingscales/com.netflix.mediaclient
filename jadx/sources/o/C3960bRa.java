package o;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import o.C3895bOq;
import o.C9834xU;

/* renamed from: o.bRa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3960bRa extends NetflixDialogFrag {
    public static final e a = new e(null);
    private String c;
    private DialogInterface.OnClickListener e;

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog create = new AlertDialog.Builder(requireContext(), C9834xU.o.c).setTitle(C1333Xq.d(C3895bOq.e.f).d("gameTitle", this.c).c()).setMessage(getString(C3895bOq.e.b)).setPositiveButton(C3895bOq.e.j, this.e).setNegativeButton(C3895bOq.e.g, this.e).create();
        C8632dsu.a(create, "");
        return create;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        C8632dsu.c((Object) dialogInterface, "");
        super.onCancel(dialogInterface);
        DialogInterface.OnClickListener onClickListener = this.e;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        dismiss();
    }

    /* renamed from: o.bRa$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final C3960bRa e(String str, DialogInterface.OnClickListener onClickListener) {
            C8632dsu.c((Object) str, "");
            C8632dsu.c((Object) onClickListener, "");
            C3960bRa c3960bRa = new C3960bRa();
            c3960bRa.setStyle(0, com.netflix.mediaclient.ui.R.l.j);
            c3960bRa.c = str;
            c3960bRa.e = onClickListener;
            return c3960bRa;
        }
    }
}
