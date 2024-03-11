package o;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsFrag;
import o.C7142cqd;

/* renamed from: o.cqR  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7130cqR extends MultiTitleNotificationsFrag {
    public static final a e = new a(null);

    @Override // com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsFrag
    public boolean G() {
        return false;
    }

    /* renamed from: o.cqR$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    @Override // com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsFrag
    public C7119cqG d(int i, int i2) {
        return new C7129cqQ(i, i2);
    }

    @Override // com.netflix.mediaclient.ui.notifications.multititle.MultiTitleNotificationsFrag
    public void F() {
        super.F();
        I();
    }

    private final void I() {
        ViewGroup viewGroup;
        FragmentActivity activity = getActivity();
        if (activity == null || (viewGroup = (ViewGroup) activity.findViewById(C7142cqd.b.s)) == null) {
            return;
        }
        viewGroup.getLayoutParams().width = (int) (viewGroup.getContext().getResources().getDisplayMetrics().widthPixels / 1.3d);
    }
}
