package o;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import o.C9834xU;

/* renamed from: o.bRz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3985bRz extends NetflixDialogFrag {
    public static final c a = new c(null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(DialogInterface dialogInterface, int i) {
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog create = new AlertDialog.Builder(requireActivity(), C9834xU.o.c).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.bRB
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C3985bRz.b(dialogInterface, i);
            }
        }).setMessage(getString(com.netflix.mediaclient.ui.R.o.n)).create();
        C8632dsu.a(create, "");
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    /* renamed from: o.bRz$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final C3985bRz e() {
            C3985bRz c3985bRz = new C3985bRz();
            c3985bRz.setStyle(1, com.netflix.mediaclient.ui.R.l.g);
            return c3985bRz;
        }
    }
}
