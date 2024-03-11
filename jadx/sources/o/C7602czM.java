package o;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.netflix.cl.Logger;
import com.netflix.cl.util.ExtCLUtils;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.clutils.CLv2Utils;
import o.C9834xU;

/* renamed from: o.czM  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7602czM extends NetflixDialogFrag {
    private Long e;
    public static final d a = new d(null);
    public static final int d = 8;
    private static final String b = SignupConstants.Field.VIDEO_TITLE;
    private static final String c = "msg";

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(b) : null;
        String string2 = arguments != null ? arguments.getString(c) : null;
        FragmentActivity activity = getActivity();
        C8632dsu.d(activity);
        AlertDialog create = new AlertDialog.Builder(activity, C9834xU.o.c).setTitle(string).setMessage(string2).setCancelable(false).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.czO
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C7602czM.a(C7602czM.this, dialogInterface, i);
            }
        }).create();
        C8632dsu.a(create, "");
        create.setCanceledOnTouchOutside(false);
        create.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: o.czP
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                boolean b2;
                b2 = C7602czM.b(C7602czM.this, dialogInterface, i, keyEvent);
                return b2;
            }
        });
        Long l = this.e;
        if (l != null) {
            l.longValue();
            Logger.INSTANCE.cancelSession(this.e);
        }
        this.e = Logger.INSTANCE.startSession(CLv2Utils.a(null, ExtCLUtils.DebugSessionType.AppRestartError));
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C7602czM c7602czM, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) c7602czM, "");
        c7602czM.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(C7602czM c7602czM, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C8632dsu.c((Object) c7602czM, "");
        if (i == 4 && keyEvent.getAction() == 1) {
            c7602czM.b();
            return false;
        }
        return false;
    }

    private final void b() {
        Logger.INSTANCE.endSession(this.e);
        AbstractApplicationC1040Mh.getInstance().d(requireNetflixActivity(), "RestartAppDialog");
    }

    /* renamed from: o.czM$d */
    /* loaded from: classes6.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
