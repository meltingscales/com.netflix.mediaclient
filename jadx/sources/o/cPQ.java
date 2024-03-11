package o;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import o.cPX;

/* loaded from: classes4.dex */
public final class cPQ extends NetflixDialogFrag {
    private cPY a;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        View inflate = layoutInflater.inflate(cPX.e.b, viewGroup, false);
        C8632dsu.a(inflate, "");
        return inflate;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        cPY c = cPY.c(view);
        c.b.setOnClickListener(new View.OnClickListener() { // from class: o.cPR
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cPQ.a(cPQ.this, view2);
            }
        });
        this.a = c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cPQ cpq, View view) {
        C8632dsu.c((Object) cpq, "");
        cpq.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(cPX.c.a);
        if (C8150deu.o(getContext()) > dimensionPixelSize) {
            window.setLayout(dimensionPixelSize, -2);
        } else {
            window.setLayout(-1, -2);
        }
        window.setGravity(17);
    }
}
