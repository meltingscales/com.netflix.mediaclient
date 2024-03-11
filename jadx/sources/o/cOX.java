package o;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import o.C5967cPa;
import o.C9834xU;

/* loaded from: classes4.dex */
public final class cOX extends NetflixDialogFrag {
    public static final b d = new b(null);
    private DialogInterface.OnClickListener b;

    public final void e(DialogInterface.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity(), C9834xU.o.c);
        builder.setTitle(C5967cPa.a.b);
        builder.setMessage(C5967cPa.a.e);
        builder.setNegativeButton(com.netflix.mediaclient.ui.R.o.cL, this.b);
        builder.setPositiveButton(C5967cPa.a.a, this.b);
        AlertDialog create = builder.create();
        C8632dsu.a(create, "");
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        C8632dsu.c((Object) dialogInterface, "");
        super.onCancel(dialogInterface);
        DialogInterface.OnClickListener onClickListener = this.b;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -2);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final cOX b(DialogInterface.OnClickListener onClickListener) {
            cOX cox = new cOX();
            cox.e(onClickListener);
            return cox;
        }
    }
}
