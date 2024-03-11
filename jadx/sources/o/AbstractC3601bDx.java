package o;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;

/* renamed from: o.bDx  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3601bDx extends NetflixDialogFrag {
    public void e() {
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: o.bDx.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                AbstractC3601bDx.this.c(view);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        if (getDialog().getWindow() != null && getDialog().getWindow().getDecorView() != null) {
            getDialog().getWindow().getDecorView().setLayoutParams(new WindowManager.LayoutParams(-1, -1));
            WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.x = 0;
            attributes.y = 0;
            attributes.gravity = 17;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (C8150deu.p(getActivity()) * getResources().getFraction(com.netflix.mediaclient.ui.R.h.b, 1, 1)), -2);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismiss();
        e();
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixDialogFrag, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        e();
    }
}
