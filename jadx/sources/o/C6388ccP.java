package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.UiLocation;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.lolomo.LolomoRecyclerViewAdapter;
import com.netflix.model.leafs.VideoEntityModelImpl;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.functions.Consumer;
import java.util.LinkedList;
import java.util.List;
import o.AbstractC6379ccG;
import o.C9646uN;
import o.C9834xU;
import o.C9912yt;
import o.InterfaceC5223buh;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ccP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6388ccP<O extends InterfaceC5223buh> extends AbstractC6337cbR<a, O> {
    private static final InterfaceC5222bug<InterfaceC5223buh> b = new VideoEntityModelImpl(new InterfaceC5223buh() { // from class: o.ccP.3
        @Override // o.InterfaceC5223buh
        public String getBoxartId() {
            return "";
        }

        @Override // o.InterfaceC5223buh
        public String getBoxshotUrl() {
            return "";
        }

        @Override // o.InterfaceC5175btm
        public String getId() {
            return "";
        }

        @Override // o.InterfaceC5175btm
        public String getTitle() {
            return "";
        }

        @Override // o.InterfaceC5175btm
        public String getUnifiedEntityId() {
            return null;
        }

        @Override // o.InterfaceC5223buh
        public String getVideoMerchComputeId() {
            return null;
        }

        @Override // o.InterfaceC5151btO
        public boolean isAvailableForDownload() {
            return false;
        }

        @Override // o.InterfaceC5151btO
        public boolean isAvailableToPlay() {
            return true;
        }

        @Override // o.InterfaceC5151btO
        public boolean isOriginal() {
            return false;
        }

        @Override // o.InterfaceC5151btO
        public boolean isPlayable() {
            return false;
        }

        @Override // o.InterfaceC5175btm
        public VideoType getType() {
            return VideoType.UNAVAILABLE;
        }
    }, null, -1);
    private final LinkedList<InterfaceC5222bug<O>> c;
    protected final C9912yt h;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(C9646uN.e eVar) {
    }

    public C6388ccP(Context context, LoMo loMo, LolomoRecyclerViewAdapter lolomoRecyclerViewAdapter, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, lolomoRecyclerViewAdapter, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
        this.c = new LinkedList<>();
        this.h = new C9912yt(context, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6388ccP(Context context, LoMo loMo, String str, ServiceManager serviceManager, C1729aMb c1729aMb, int i, InterfaceC6394ccV interfaceC6394ccV, TrackingInfoHolder trackingInfoHolder) {
        super(context, loMo, str, serviceManager, c1729aMb, i, interfaceC6394ccV, trackingInfoHolder);
        this.c = new LinkedList<>();
        this.h = new C9912yt(context, this);
    }

    @Override // o.AbstractC6337cbR, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.h.e(recyclerView);
    }

    @Override // o.AbstractC6337cbR, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.h.b(recyclerView);
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = d().i();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = d().i();
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = d().i();
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = d().i();
        if (i == 0) {
            C1220Th c1220Th = new C1220Th(viewGroup.getContext());
            c1220Th.setId(com.netflix.mediaclient.ui.R.g.dM);
            c1220Th.setLayoutParams(layoutParams);
            return b(viewGroup, c1220Th, this);
        }
        return a(viewGroup, this, layoutParams);
    }

    protected c b(ViewGroup viewGroup, C1220Th c1220Th, InterfaceC1732aMe interfaceC1732aMe) {
        return new c(viewGroup, c1220Th, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final d a(ViewGroup viewGroup, InterfaceC1732aMe interfaceC1732aMe, RecyclerView.LayoutParams layoutParams) {
        View view = new View(viewGroup.getContext());
        view.setId(com.netflix.mediaclient.ui.R.g.dM);
        view.setLayoutParams(layoutParams);
        return e(viewGroup, view, interfaceC1732aMe, layoutParams);
    }

    public d e(ViewGroup viewGroup, View view, InterfaceC1732aMe interfaceC1732aMe, RecyclerView.LayoutParams layoutParams) {
        if (interfaceC1732aMe.d().b()) {
            return new e(viewGroup, view, interfaceC1732aMe, this.h);
        }
        return new d(viewGroup, view, interfaceC1732aMe, this.h);
    }

    @Override // o.AbstractC6337cbR
    /* renamed from: b */
    public void d(a aVar, InterfaceC5222bug<O> interfaceC5222bug, int i, boolean z) {
        aVar.e(j(), interfaceC5222bug, i, z, ((AbstractC6337cbR) this).a);
    }

    @Override // o.AbstractC6337cbR
    /* renamed from: e */
    public void b(a aVar, int i, boolean z) {
        aVar.e(j(), b, i, z, new TrackingInfoHolder(PlayLocationType.UNKNOWN));
    }

    @Override // o.AbstractC9900yh
    public void e(RecyclerView recyclerView, int i) {
        super.e(recyclerView, i);
        if (i == 0) {
            e(recyclerView);
        } else if (i == 1) {
            while (!this.c.isEmpty()) {
                a(a(), this.c.pop());
            }
        }
    }

    public static void a(Context context, InterfaceC5222bug<? extends InterfaceC5223buh> interfaceC5222bug) {
        String boxshotUrl;
        if (interfaceC5222bug.getEvidence() != null && interfaceC5222bug.getEvidence().getImageUrl() != null) {
            boxshotUrl = interfaceC5222bug.getEvidence().getImageUrl();
        } else {
            boxshotUrl = interfaceC5222bug.getVideo().getBoxshotUrl();
        }
        if (C8168dfL.g(boxshotUrl)) {
            C1044Mm.d("StandardListAdapter", "image url is empty, StandardListAdapter.onScrollStateChanged");
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) C8141del.e(context, FragmentActivity.class);
        ((SingleSubscribeProxy) InterfaceC9638uF.a.d(context).d(C9646uN.d(fragmentActivity).e(boxshotUrl).c(true).b()).as(AutoDispose.b(AndroidLifecycleScopeProvider.c(fragmentActivity)))).c(new Consumer() { // from class: o.ccQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6388ccP.c((C9646uN.e) obj);
            }
        }, new Consumer() { // from class: o.ccS
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1044Mm.e("StandardListAdapter", "prefetching image failed", (Throwable) obj);
            }
        });
    }

    @Override // o.AbstractC9900yh
    public void d(RecyclerView recyclerView, RecyclerView recyclerView2, int i) {
        if (i == 0) {
            e(recyclerView2);
        }
    }

    void e(RecyclerView recyclerView) {
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            ((a) recyclerView.getChildViewHolder(recyclerView.getChildAt(i))).l();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC6337cbR
    public void b(List<InterfaceC5222bug<O>> list) {
        this.c.addAll(list);
    }

    /* renamed from: o.ccP$a */
    /* loaded from: classes4.dex */
    public static abstract class a extends AbstractC6379ccG.d<InterfaceC5223buh> {
        public a(ViewGroup viewGroup, View view, InterfaceC1732aMe interfaceC1732aMe) {
            super(viewGroup, view, interfaceC1732aMe, view.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ccP$c */
    /* loaded from: classes4.dex */
    public static class c extends a {
        final C1220Th c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(ViewGroup viewGroup, C1220Th c1220Th, InterfaceC1732aMe interfaceC1732aMe) {
            super(viewGroup, c1220Th, interfaceC1732aMe);
            this.c = c1220Th;
            c1220Th.setScaleType(ImageView.ScaleType.CENTER_CROP);
            c1220Th.setRoundedCornerRadius(c1220Th.getResources().getDimension(C9834xU.a.s));
        }

        @Override // o.AbstractC6379ccG.d
        public void e(C6374ccB c6374ccB, InterfaceC5222bug<InterfaceC5223buh> interfaceC5222bug, int i, boolean z, TrackingInfoHolder trackingInfoHolder) {
            super.e(c6374ccB, interfaceC5222bug, i, z, trackingInfoHolder);
            this.c.c(interfaceC5222bug.getVideo(), interfaceC5222bug.getEvidence(), q(), getAdapterPosition(), z);
        }

        @Override // o.AbstractC6379ccG.d, o.AbstractC9900yh.c
        public void d() {
            super.d();
            this.c.onViewRecycled();
        }

        @Override // o.AbstractC6379ccG.d
        public boolean j() {
            return this.c.c();
        }

        @Override // o.AbstractC6379ccG.d
        public JSONObject a(InterfaceC5222bug<InterfaceC5223buh> interfaceC5222bug, C6374ccB c6374ccB) {
            if (c6374ccB != null && c6374ccB.c() != null && TextUtils.equals(LoMoType.PEOPLE.a(), c6374ccB.c().getListContext())) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("location", UiLocation.ROLES_DISPLAY.e());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return jSONObject;
            }
            return super.a(interfaceC5222bug, c6374ccB);
        }
    }

    /* renamed from: o.ccP$d */
    /* loaded from: classes4.dex */
    public static class d extends a implements C9912yt.a {
        protected AnimatedVectorDrawable c;
        protected View d;
        private final C9912yt g;
        private boolean i;

        @Override // o.C9912yt.a
        public boolean ak_() {
            return true;
        }

        @Override // o.C9912yt.a
        public Rect g() {
            return null;
        }

        @Override // o.C9912yt.a
        public View h() {
            return this.d;
        }

        @Override // o.C9912yt.a
        public AnimatedVectorDrawable i() {
            return this.c;
        }

        @Override // o.AbstractC6379ccG.d
        public boolean j() {
            return false;
        }

        @Override // o.AbstractC6379ccG.d
        public void l() {
        }

        d(ViewGroup viewGroup, View view, InterfaceC1732aMe interfaceC1732aMe, C9912yt c9912yt) {
            super(viewGroup, view, interfaceC1732aMe);
            this.i = false;
            this.c = (AnimatedVectorDrawable) ContextCompat.getDrawable(viewGroup.getContext(), interfaceC1732aMe.d().h() ? C9834xU.j.c : C9834xU.j.b);
            this.d = view;
            this.g = c9912yt;
        }

        @Override // o.AbstractC6379ccG.d, o.AbstractC9900yh.c
        public void a() {
            super.a();
            if (getAdapterPosition() >= this.a.d().m()) {
                this.g.b();
                this.i = true;
            }
        }

        @Override // o.AbstractC9900yh.c
        public void b() {
            if (this.i) {
                this.g.c();
                this.i = false;
            }
            super.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o.ccP$e */
    /* loaded from: classes4.dex */
    public static class e extends d {
        private e(ViewGroup viewGroup, View view, InterfaceC1732aMe interfaceC1732aMe, C9912yt c9912yt) {
            super(viewGroup, view, interfaceC1732aMe, c9912yt);
            ((d) this).c = (AnimatedVectorDrawable) ContextCompat.getDrawable(viewGroup.getContext(), interfaceC1732aMe.d().h() ? C9834xU.j.a : C9834xU.j.e);
        }

        @Override // o.C6388ccP.d, o.C9912yt.a
        public Rect g() {
            return new Rect(0, 0, this.itemView.getWidth(), this.itemView.getWidth());
        }
    }
}
