package o;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import o.C6545cfN;
import o.C9834xU;

/* renamed from: o.cfI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6540cfI extends C6545cfN {
    private String b = "com.netflix.mediaclient.intent.action.MDX_ACTION_REMOTE_LOGIN_CONSENT";

    private String d() {
        return null;
    }

    private String d(String str) {
        return getString(com.netflix.mediaclient.ui.R.o.es, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        dismissAllowingStateLoss();
        getFragmentManager().beginTransaction().remove(this).commit();
        FragmentActivity activity = getActivity();
        if (activity instanceof C6545cfN.c) {
            ((C6545cfN.c) activity).e(this.b, Boolean.toString(z));
        }
    }

    public static C6540cfI b(String str) {
        C6540cfI c6540cfI = new C6540cfI();
        Bundle bundle = new Bundle();
        if (str != null && !"".equals(str.trim())) {
            bundle.putString("friendlyName", str);
        }
        c6540cfI.setArguments(bundle);
        return c6540cfI;
    }

    @Override // o.C6545cfN, com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        String d = d();
        String d2 = d(getArguments().getString("friendlyName"));
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), C9834xU.o.c);
        if (d != null) {
            builder.setTitle(d);
        } else {
            C1044Mm.j("mdxui", "No title...");
        }
        if (d2 != null) {
            builder.setMessage(d2);
        } else {
            C1044Mm.j("mdxui", "No message...");
        }
        builder.setPositiveButton(getString(com.netflix.mediaclient.ui.R.o.gl), new DialogInterface.OnClickListener() { // from class: o.cfI.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                synchronized (C6540cfI.this.a) {
                    if (C6540cfI.this.a.get()) {
                        C1044Mm.j("mdxui", "Already clicked!");
                        return;
                    }
                    C6540cfI.this.a.set(true);
                    C6540cfI.this.c(true);
                }
            }
        });
        builder.setNegativeButton(getString(com.netflix.mediaclient.ui.R.o.cL), new DialogInterface.OnClickListener() { // from class: o.cfI.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                synchronized (C6540cfI.this.a) {
                    if (C6540cfI.this.a.get()) {
                        C1044Mm.j("mdxui", "Already clicked!");
                        return;
                    }
                    C6540cfI.this.a.set(true);
                    C6540cfI.this.c(false);
                }
            }
        });
        addDismissOrCancelListener(new NetflixDialogFrag.a() { // from class: o.cfI.2
            @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag.a
            public void a(NetflixDialogFrag netflixDialogFrag) {
                synchronized (C6540cfI.this.a) {
                    if (C6540cfI.this.a.get()) {
                        return;
                    }
                    C6540cfI.this.c(false);
                }
            }
        });
        return builder.create();
    }
}
