package o;

import android.view.View;
import android.widget.AdapterView;
import com.netflix.cl.model.AppView;
import o.AbstractC1212Sz;
import o.InterfaceC1077Nv;

/* loaded from: classes4.dex */
public class bFB extends AbstractC1212Sz implements InterfaceC1077Nv, AdapterView.OnItemClickListener {
    private a a;
    protected boolean e;
    private InterfaceC1077Nv.e j;

    /* loaded from: classes4.dex */
    public interface a {
        void e(int i, int i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return this.e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
    }

    public bFB(AbstractC1212Sz.c cVar, a aVar) {
        super(cVar, AppView.episodesSelector);
        C8166dfJ.d();
        this.a = aVar;
    }

    @Override // o.AbstractC1212Sz
    public void a(int i) {
        this.a.e(i, getItemCount());
    }

    @Override // o.InterfaceC1077Nv
    public void setLoadingStatusCallback(InterfaceC1077Nv.e eVar) {
        if (isLoadingData() || eVar == null) {
            this.j = eVar;
        } else {
            eVar.c(InterfaceC1078Nw.aJ);
        }
    }
}
