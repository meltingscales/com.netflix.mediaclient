package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.player.IPlayerFragment;
import com.netflix.model.leafs.PostPlayItem;
import o.C7639czx;

/* renamed from: o.czr  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7633czr extends AbstractC7635czt {
    C7640czy d;
    C7637czv e;

    public C7633czr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C7633czr(Context context) {
        super(context, null);
    }

    @Override // o.AbstractC7635czt
    protected void a() {
        this.e = (C7637czv) findViewById(C7639czx.e.w);
        this.d = (C7640czy) findViewById(C7639czx.e.u);
    }

    @Override // o.AbstractC7635czt
    public void e(C7641czz c7641czz, PostPlayItem postPlayItem, IPlayerFragment iPlayerFragment, PlayLocationType playLocationType, View.OnClickListener onClickListener, NetflixActivity netflixActivity) {
        this.h = c7641czz;
        this.e.e(c7641czz, postPlayItem, iPlayerFragment, playLocationType, onClickListener, netflixActivity);
        this.d.d(this.h, postPlayItem, netflixActivity, iPlayerFragment, playLocationType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC7635czt
    public void d(int i) {
        super.d(i);
        this.d.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.AbstractC7635czt
    public void j() {
        super.j();
        this.d.i();
    }

    @Override // o.AbstractC7635czt
    protected void c(int i) {
        C7640czy c7640czy = this.d;
        if (c7640czy != null) {
            c7640czy.f();
        }
    }

    @Override // o.AbstractC7635czt
    protected void b() {
        C7640czy c7640czy = this.d;
        if (c7640czy != null) {
            c7640czy.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7635czt
    public void bH_() {
        this.e.d();
        this.d.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7635czt
    public void c() {
        this.e.c();
        this.d.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC7635czt
    public void e() {
        this.e.e();
        this.d.d();
    }
}
