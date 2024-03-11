package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import o.C8632dsu;
import o.C9834xU;
import o.C9954zi;

/* renamed from: o.zi  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9954zi {
    private final ViewStub a;
    private boolean b;
    private boolean c;
    private String d;
    private final InterfaceC8554dpx e;

    public C9954zi(ViewStub viewStub) {
        InterfaceC8554dpx b;
        C8632dsu.c((Object) viewStub, "");
        this.a = viewStub;
        b = dpB.b(new drO<ViewGroup>() { // from class: com.netflix.android.widgetry.widget.ExperienceBadge$badgeViewGroup$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: b */
            public final ViewGroup invoke() {
                ViewStub viewStub2;
                C9954zi.this.b = true;
                viewStub2 = C9954zi.this.a;
                View inflate = viewStub2.inflate();
                C8632dsu.d(inflate);
                ViewGroup viewGroup = (ViewGroup) inflate;
                viewGroup.setVisibility(8);
                return viewGroup;
            }
        });
        this.e = b;
        viewStub.setLayoutResource(C9834xU.i.h);
    }

    private final ViewGroup c() {
        return (ViewGroup) this.e.getValue();
    }

    public final void a(boolean z) {
        this.c = z;
        if (z && this.d != null) {
            c().setVisibility(0);
        } else if (z || !this.b) {
        } else {
            c().setVisibility(8);
        }
    }

    public final void c(String str) {
        C8632dsu.c((Object) str, "");
        this.d = str;
        if (this.c) {
            a(true);
        }
        ((NetflixImageView) c().findViewById(C9834xU.g.a)).showImage(new ShowImageRequest().a(str).a(true));
    }
}
