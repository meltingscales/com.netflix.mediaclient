package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import com.netflix.mediaclient.rowconfig.layoutmanager.FillerGridLayoutManager;
import com.netflix.mediaclient.ui.messaging.impl.MessagingEpoxyController;
import o.AbstractC6684chu;
import o.C6638chA;
import o.C9834xU;

/* renamed from: o.chr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6681chr extends AbstractC6684chu<d> {
    public static final b i = new b(null);
    public static final int j = 8;
    private int g = C9834xU.c.I;

    public final void d(int i2) {
        this.g = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6684chu
    /* renamed from: e */
    public void a(d dVar) {
        C8632dsu.c((Object) dVar, "");
    }

    /* renamed from: o.chr$b */
    /* loaded from: classes4.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("MessagingDialogFrag");
        }
    }

    /* renamed from: o.chr$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC6684chu.d {
        private View d;

        @Override // o.AbstractC6684chu.d
        public View b() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MessagingEpoxyController messagingEpoxyController, View view, DialogFragment dialogFragment, int i) {
            super(messagingEpoxyController);
            C8632dsu.c((Object) messagingEpoxyController, "");
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) dialogFragment, "");
            C6640chC e = C6640chC.e(view);
            C8632dsu.a(e, "");
            C3786bKp c3786bKp = e.a;
            c3786bKp.setAdapter(messagingEpoxyController.getAdapter());
            Context context = c3786bKp.getContext();
            C8632dsu.a(context, "");
            c3786bKp.setLayoutManager(new FillerGridLayoutManager(context, 0, 0, false, false, 30, null));
            c3786bKp.setBackgroundColor(ContextCompat.getColor(c3786bKp.getContext(), i));
            C8632dsu.d(c3786bKp);
            C1332Xp c1332Xp = C1332Xp.b;
            C9702vQ.d(c3786bKp, (int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()), false, false, 6, null);
            this.d = view;
        }
    }

    @Override // o.AbstractC6684chu, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Window window2;
        C8632dsu.c((Object) layoutInflater, "");
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setBackgroundDrawableResource(17170445);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window = dialog3.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6684chu
    /* renamed from: d */
    public d e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, MessagingEpoxyController messagingEpoxyController) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) layoutInflater, "");
        C8632dsu.c((Object) messagingEpoxyController, "");
        View inflate = layoutInflater.inflate(C6638chA.a.c, viewGroup, false);
        C8632dsu.a(inflate, "");
        return new d(messagingEpoxyController, inflate, this, this.g);
    }

    @Override // o.bMW, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (window == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        window.setGravity(17);
        if (getResources().getConfiguration().orientation == 1) {
            window.setLayout(-1, -2);
        } else {
            window.setLayout(-2, -1);
        }
        C6640chC.e(requireView()).c.setBackgroundColor(0);
    }

    public final void n() {
        dismiss();
    }
}
