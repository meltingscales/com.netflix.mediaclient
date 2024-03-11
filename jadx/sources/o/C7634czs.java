package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.ui.player.IPlayerFragment;
import com.netflix.model.leafs.PostPlayItem;
import o.C7639czx;
import o.cBO;
import o.cIE;

/* renamed from: o.czs  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7634czs extends AbstractC7635czt {
    protected IPlayerFragment a;
    protected Button b;
    protected Button c;
    private C7624czi d;
    protected int e;
    private boolean g;

    public C7634czs(Context context) {
        this(context, null);
    }

    public C7634czs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7634czs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = false;
    }

    protected void i() {
        if (this.e == 0) {
            this.c.animate().alpha(0.0f);
            this.b.animate().alpha(0.0f);
            if (this.g) {
                g();
                return;
            }
            return;
        }
        this.b.setAlpha(1.0f);
        this.c.setAlpha(1.0f);
        h();
    }

    @Override // o.AbstractC7635czt
    protected void a() {
        this.b = (Button) findViewById(C7639czx.e.O);
        this.c = (Button) findViewById(C7639czx.e.B);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: o.czs.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C7634czs c7634czs = C7634czs.this;
                if (view == c7634czs.b) {
                    c7634czs.g = true;
                    IPlayerFragment iPlayerFragment = C7634czs.this.a;
                    if (iPlayerFragment == null || iPlayerFragment.g() == null) {
                        return;
                    }
                    C7634czs.this.a.g().onNext(cBO.y.c);
                }
            }
        });
    }

    @Override // o.AbstractC7635czt
    public void b(int i) {
        this.e = i;
        i();
    }

    @Override // o.AbstractC7635czt
    protected void c(int i) {
        this.e = i;
        i();
    }

    @Override // o.AbstractC7635czt
    protected void b() {
        this.b.setVisibility(4);
    }

    @Override // o.AbstractC7635czt
    public void e(C7641czz c7641czz, PostPlayItem postPlayItem, IPlayerFragment iPlayerFragment, PlayLocationType playLocationType, View.OnClickListener onClickListener, NetflixActivity netflixActivity) {
        this.h = c7641czz;
        this.a = iPlayerFragment;
        if (postPlayItem.getPlayAction() != null) {
            this.d = new C7624czi(netflixActivity, iPlayerFragment, postPlayItem.getPlayAction(), playLocationType, this.c, c7641czz, postPlayItem);
        }
    }

    protected void h() {
        this.c.setText(getResources().getString(cIE.a.m, Integer.valueOf(this.e)));
    }

    protected void g() {
        this.d.c(true);
    }
}
