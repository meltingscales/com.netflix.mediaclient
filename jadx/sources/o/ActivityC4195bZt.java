package o;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.ui.lightbox.api.LightBoxItem;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;

@aIA
@AndroidEntryPoint
/* renamed from: o.bZt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ActivityC4195bZt extends AbstractActivityC4191bZp {
    public static final e a = new e(null);

    @Override // o.MO
    public boolean i() {
        return false;
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public boolean shouldAttachToolbar() {
        return false;
    }

    /* renamed from: o.bZt$e */
    /* loaded from: classes4.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final void c(Context context, ArrayList<LightBoxItem> arrayList, int i) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) arrayList, "");
            Intent intent = new Intent(context, ActivityC4195bZt.class);
            intent.putParcelableArrayListExtra("com.netflix.mediaclient.ui.games.impl.lightbox.LightBoxActivity.EXTRA_ITEM", arrayList);
            intent.putExtra("com.netflix.mediaclient.ui.games.impl.lightbox.LightBoxActivity.EXTRA_INITIAL_POSITION", i);
            context.startActivity(intent);
        }
    }

    @Override // o.MO
    public Fragment d() {
        return C4194bZs.b.e(getIntent().getParcelableArrayListExtra("com.netflix.mediaclient.ui.games.impl.lightbox.LightBoxActivity.EXTRA_ITEM"), getIntent().getIntExtra("com.netflix.mediaclient.ui.games.impl.lightbox.LightBoxActivity.EXTRA_INITIAL_POSITION", 0));
    }

    @Override // com.netflix.mediaclient.android.activity.NetflixActivity
    public AppView getUiScreen() {
        return AppView.UNKNOWN;
    }
}
