package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.player.IPlayerFragment;
import com.netflix.model.leafs.PostPlayItem;
import o.C7639czx;

/* renamed from: o.czu  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7636czu extends AbstractC7635czt {
    protected TextView b;
    protected C1203Sq c;

    @Override // o.AbstractC7635czt
    protected void b() {
    }

    @Override // o.AbstractC7635czt
    protected void c(int i) {
    }

    public C7636czu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C7636czu(Context context) {
        super(context, null);
    }

    @Override // o.AbstractC7635czt
    protected void a() {
        this.b = (TextView) findViewById(C7639czx.e.L);
        this.c = (C1203Sq) findViewById(C7639czx.e.K);
    }

    @Override // o.AbstractC7635czt
    public void e(C7641czz c7641czz, PostPlayItem postPlayItem, IPlayerFragment iPlayerFragment, PlayLocationType playLocationType, View.OnClickListener onClickListener, NetflixActivity netflixActivity) {
        this.h = c7641czz;
        this.b.setText(getContext().getString(com.netflix.mediaclient.ui.R.o.fZ, postPlayItem.getAncestorTitle()));
        this.c.setOnClickListener(onClickListener);
    }
}
