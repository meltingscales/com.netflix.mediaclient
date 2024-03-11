package o;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C9834xU;

/* renamed from: o.cfN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6545cfN extends NetflixDialogFrag {
    protected final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: o.cfN$c */
    /* loaded from: classes4.dex */
    public interface c {
        void a(String str, String str2);

        void e(String str, String str2);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    public static C6545cfN c(C6537cfF c6537cfF) {
        C6545cfN c6545cfN = new C6545cfN();
        Bundle bundle = new Bundle();
        if (c6537cfF.d() != null) {
            bundle.putString(SignupConstants.Field.VIDEO_TITLE, c6537cfF.d());
        }
        if (c6537cfF.a() != null) {
            bundle.putString("message", c6537cfF.a());
        }
        bundle.putInt("buttonCount", c6537cfF.c().length);
        for (int i = 0; i < c6537cfF.c().length; i++) {
            bundle.putString("buttonName" + i, (String) c6537cfF.c()[i].first);
            bundle.putString("buttonCode" + i, (String) c6537cfF.c()[i].second);
        }
        c6545cfN.setArguments(bundle);
        return c6545cfN;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString(SignupConstants.Field.VIDEO_TITLE);
        String string2 = getArguments().getString("message");
        int i = getArguments().getInt("buttonCount", 0);
        String[] strArr = new String[i];
        final String[] strArr2 = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = getArguments().getString("buttonName" + i2);
            strArr2[i2] = getArguments().getString("buttonCode" + i2);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), C9834xU.o.c);
        if (string != null) {
            builder.setTitle(string);
        } else {
            C1044Mm.j("mdxui", "No title...");
        }
        if (string2 != null) {
            builder.setMessage(string2);
        } else {
            C1044Mm.j("mdxui", "No message...");
        }
        if (i < 1) {
            C1044Mm.d("mdxui", "We are expecting at least one button!");
        }
        if (i > 0) {
            builder.setPositiveButton(strArr[0], new DialogInterface.OnClickListener() { // from class: o.cfN.5
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i3) {
                    synchronized (C6545cfN.this.a) {
                        if (C6545cfN.this.a.get()) {
                            C1044Mm.j("mdxui", "Already clicked!");
                            return;
                        }
                        C6545cfN.this.a.set(true);
                        C6545cfN.this.dismissAllowingStateLoss();
                        C6545cfN.this.getFragmentManager().beginTransaction().remove(C6545cfN.this).commit();
                        FragmentActivity activity = C6545cfN.this.getActivity();
                        if (activity instanceof c) {
                            ((c) activity).a(r2, strArr2[0]);
                        }
                    }
                }
            });
        }
        if (i > 1) {
            builder.setNegativeButton(strArr[1], new DialogInterface.OnClickListener() { // from class: o.cfN.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i3) {
                    synchronized (C6545cfN.this.a) {
                        if (C6545cfN.this.a.get()) {
                            C1044Mm.j("mdxui", "Already clicked!");
                            return;
                        }
                        C6545cfN.this.a.set(true);
                        C6545cfN.this.dismissAllowingStateLoss();
                        C6545cfN.this.getFragmentManager().beginTransaction().remove(C6545cfN.this).commit();
                        FragmentActivity activity = C6545cfN.this.getActivity();
                        if (activity instanceof c) {
                            ((c) activity).a(r2, strArr2[1]);
                        }
                    }
                }
            });
        }
        if (i > 2) {
            builder.setNegativeButton(strArr[2], new DialogInterface.OnClickListener() { // from class: o.cfN.4
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i3) {
                    synchronized (C6545cfN.this.a) {
                        if (C6545cfN.this.a.get()) {
                            C1044Mm.j("mdxui", "Already clicked!");
                            return;
                        }
                        C6545cfN.this.a.set(true);
                        C6545cfN.this.dismissAllowingStateLoss();
                        C6545cfN.this.getFragmentManager().beginTransaction().remove(C6545cfN.this).commit();
                        FragmentActivity activity = C6545cfN.this.getActivity();
                        if (activity instanceof c) {
                            ((c) activity).a(r2, strArr2[2]);
                        }
                    }
                }
            });
        }
        if (i > 3) {
            C1044Mm.d("mdxui", "We can support up to 3 buttons!");
        }
        return builder.create();
    }
}
