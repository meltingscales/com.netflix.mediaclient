package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.model.leafs.originals.interactive.PlayerControls;
import com.netflix.model.leafs.originals.interactive.condition.State;

/* renamed from: o.cIl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5790cIl extends RecyclerView.ViewHolder {
    private final cHX a;
    private boolean b;
    private final float c;
    private final ViewGroup d;

    public abstract void a(State state, String str, PlayerControls playerControls, boolean z);

    public abstract long b();

    public abstract void c(State state);

    public final void d(boolean z) {
        this.b = z;
    }

    public abstract State e();

    public final boolean g() {
        return this.b;
    }

    public final ViewGroup i() {
        return this.d;
    }

    public final float j() {
        return this.c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5790cIl(ViewGroup viewGroup, cHX chx) {
        super(viewGroup);
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) chx, "");
        this.a = chx;
        this.d = viewGroup;
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: o.cIj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC5790cIl.d(AbstractC5790cIl.this, view);
            }
        });
        C5794cIp c5794cIp = C5794cIp.a;
        Context context = viewGroup.getContext();
        C8632dsu.a(context, "");
        this.c = c5794cIp.c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractC5790cIl abstractC5790cIl, View view) {
        C8632dsu.c((Object) abstractC5790cIl, "");
        int adapterPosition = abstractC5790cIl.getAdapterPosition();
        if (adapterPosition != -1) {
            abstractC5790cIl.d(adapterPosition);
        }
    }

    public void d(int i) {
        State e = e();
        if (e != null) {
            this.a.c(e, i, b());
        }
    }

    public void f() {
        c(null);
        this.d.setTag(null);
    }
}
