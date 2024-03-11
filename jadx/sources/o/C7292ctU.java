package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.offline.OfflineActivityV2;
import com.netflix.mediaclient.util.ViewUtils;
import o.C7292ctU;
import o.C8168dfL;
import o.C8632dsu;
import o.C9834xU;
import o.InterfaceC4251baw;
import o.dpR;

/* renamed from: o.ctU  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7292ctU extends C1204Sr {
    private final InterfaceC8554dpx a;
    private final InterfaceC8554dpx b;
    private final InterfaceC8554dpx e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7292ctU(Context context) {
        this(context, null, 0, 6, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7292ctU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C7292ctU(Context context, AttributeSet attributeSet, int i, int i2, C8627dsp c8627dsp) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7292ctU(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InterfaceC8554dpx b;
        InterfaceC8554dpx b2;
        InterfaceC8554dpx b3;
        C8632dsu.c((Object) context, "");
        b = dpB.b(new drO<Spanned>() { // from class: com.netflix.mediaclient.ui.offline.OfflineSmartDownloadsTextView$onText$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final Spanned invoke() {
                return C8168dfL.c(C7292ctU.this.getResources().getText(R.o.dd).toString());
            }
        });
        this.b = b;
        b2 = dpB.b(new drO<Spanned>() { // from class: com.netflix.mediaclient.ui.offline.OfflineSmartDownloadsTextView$offText$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final Spanned invoke() {
                return C8168dfL.c(C7292ctU.this.getResources().getText(R.o.df).toString());
            }
        });
        this.e = b2;
        b3 = dpB.b(new drO<Drawable>() { // from class: com.netflix.mediaclient.ui.offline.OfflineSmartDownloadsTextView$caretIcon$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final Drawable invoke() {
                return C7292ctU.this.getResources().getDrawable(R.e.t, context.getTheme());
            }
        });
        this.a = b3;
        ViewUtils.a((TextView) this, C9834xU.o.l);
        setGravity(16);
        setupDrawable();
        setOnClickListener(new View.OnClickListener() { // from class: o.ctW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7292ctU.d(C7292ctU.this, view);
            }
        });
    }

    private final Spanned a() {
        return (Spanned) this.b.getValue();
    }

    private final Spanned d() {
        return (Spanned) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C7292ctU c7292ctU, View view) {
        C8632dsu.c((Object) c7292ctU, "");
        c7292ctU.c();
    }

    protected void c() {
        Context context = getContext();
        OfflineActivityV2.c cVar = OfflineActivityV2.b;
        Context context2 = getContext();
        C8632dsu.a(context2, "");
        context.startActivity(cVar.a(context2));
    }

    public void setupDrawable() {
        Resources resources = getResources();
        int i = com.netflix.mediaclient.ui.R.e.M;
        Activity activity = (Activity) C9737vz.b(getContext(), Activity.class);
        setCompoundDrawablesRelativeWithIntrinsicBounds(resources.getDrawable(i, activity != null ? activity.getTheme() : null), (Drawable) null, (Drawable) null, (Drawable) null);
        setCompoundDrawablePadding(getResources().getDimensionPixelSize(C9834xU.a.aa));
    }

    public void d(boolean z) {
        setText(z ? a() : d());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onVisibilityChanged(View view, int i) {
        C8632dsu.c((Object) view, "");
        super.onVisibilityChanged(view, i);
        b();
    }

    public final void b() {
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.b(getContext(), NetflixActivity.class);
        if (C8054ddD.l(netflixActivity)) {
            return;
        }
        if (netflixActivity == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        C1645aIz.a(netflixActivity, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.offline.OfflineSmartDownloadsTextView$updateSmartDownloadStatus$1
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                c(serviceManager);
                return dpR.c;
            }

            public final void c(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                InterfaceC4251baw p = serviceManager.p();
                if (p != null) {
                    C7292ctU.this.d(p.b());
                }
            }
        });
    }
}
