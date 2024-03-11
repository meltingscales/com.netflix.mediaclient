package o;

import android.content.Context;
import android.util.AttributeSet;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.player.IPlayerFragment;
import com.netflix.model.leafs.PostPlayItem;
import com.netflix.model.leafs.offline.OfflinePostPlayItem;
import o.C7639czx;

/* renamed from: o.cxf  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7515cxf extends C7640czy {
    private C1204Sr a;
    private C1204Sr c;

    public final void setMovieLengthText(C1204Sr c1204Sr) {
        this.a = c1204Sr;
    }

    public final void setOfflineEpisodesCount(C1204Sr c1204Sr) {
        this.c = c1204Sr;
    }

    public C7515cxf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.C7640czy
    public void c() {
        super.c();
        this.a = (C1204Sr) findViewById(C7639czx.e.k);
        this.c = (C1204Sr) findViewById(C7639czx.e.m);
    }

    @Override // o.C7640czy
    protected String a(PostPlayItem postPlayItem) {
        if (postPlayItem != null) {
            return postPlayItem.getAncestorTitle();
        }
        return null;
    }

    @Override // o.C7640czy
    public void d(C7641czz c7641czz, PostPlayItem postPlayItem, NetflixActivity netflixActivity, IPlayerFragment iPlayerFragment, PlayLocationType playLocationType) {
        if (postPlayItem != null) {
            OfflinePostPlayItem offlinePostPlayItem = (OfflinePostPlayItem) postPlayItem;
            if (offlinePostPlayItem.getVideoType() == VideoType.MOVIE) {
                C1204Sr c1204Sr = this.a;
                if (c1204Sr != null) {
                    c1204Sr.setVisibility(0);
                }
                C1204Sr c1204Sr2 = this.c;
                if (c1204Sr2 != null) {
                    c1204Sr2.setVisibility(8);
                }
                C1204Sr c1204Sr3 = this.a;
                if (c1204Sr3 != null) {
                    c1204Sr3.setText(C8178dfV.d(offlinePostPlayItem.getRuntime(), getContext()));
                }
            } else {
                C1204Sr c1204Sr4 = this.a;
                if (c1204Sr4 != null) {
                    c1204Sr4.setVisibility(8);
                }
                C1204Sr c1204Sr5 = this.c;
                if (c1204Sr5 != null) {
                    c1204Sr5.setVisibility(0);
                }
                C1204Sr c1204Sr6 = this.c;
                if (c1204Sr6 != null) {
                    c1204Sr6.setText(C1333Xq.d(com.netflix.mediaclient.ui.R.o.bK).a(offlinePostPlayItem.getOfflineEpisodeCount()).c());
                }
            }
        }
        super.d(c7641czz, postPlayItem, netflixActivity, iPlayerFragment, playLocationType);
    }
}
