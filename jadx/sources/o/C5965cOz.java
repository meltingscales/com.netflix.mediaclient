package o;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.webclient.model.leafs.AvatarInfo;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.components.SingletonComponent;
import java.util.ArrayList;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.cOG;

/* renamed from: o.cOz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5965cOz extends AbstractC9900yh<cOA> {
    private final InterfaceC5153btQ e;

    @EntryPoint
    @InstallIn({SingletonComponent.class})
    /* renamed from: o.cOz$b */
    /* loaded from: classes4.dex */
    public interface b {
        InterfaceC5844cKl at();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5965cOz(Context context, C1729aMb c1729aMb, int i, InterfaceC5153btQ interfaceC5153btQ) {
        super(context, c1729aMb, i);
        C8632dsu.c((Object) context, "");
        this.e = interfaceC5153btQ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public cOA onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        View inflate = this.d.inflate(cOG.a.d, viewGroup, false);
        C8632dsu.a(inflate, "");
        return new cOA(viewGroup, inflate, this, cOG.b.c);
    }

    @Override // o.AbstractC9900yh
    /* renamed from: c */
    public void b(cOA coa, int i) {
        Map d;
        Map k;
        Throwable th;
        boolean g;
        C8632dsu.c((Object) coa, "");
        InterfaceC5159btW b2 = b(i);
        String url = b2 != null ? b2.getUrl() : null;
        if (b2 != null && url != null) {
            g = C8691duz.g(url);
            if (!g) {
                View view = coa.b;
                C8632dsu.d(view);
                ((NetflixImageView) view).showImage(new ShowImageRequest().a(url).c(ShowImageRequest.Priority.a));
                coa.b.setContentDescription(b2.getContentDescription());
                C5960cOu.b.c(b2, a(b2));
                d(coa, b2);
                return;
            }
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("Profile Picture was null in LopiAdapter.onBindCoverViewHolder", null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b3 = c1596aHd.b();
            if (b3 != null) {
                String c = errorType.c();
                c1596aHd.a(c + " " + b3);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    private final void d(cOA coa, final InterfaceC5159btW interfaceC5159btW) {
        View view = coa.b;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: o.cOB
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C5965cOz.e(C5965cOz.this, interfaceC5159btW, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C5965cOz c5965cOz, InterfaceC5159btW interfaceC5159btW, View view) {
        Map d;
        Map k;
        Throwable th;
        C8632dsu.c((Object) c5965cOz, "");
        C8632dsu.c((Object) interfaceC5159btW, "");
        C5960cOu.b.a(c5965cOz.a(interfaceC5159btW), interfaceC5159btW.getId());
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.b(c5965cOz.a(), NetflixActivity.class);
        if (netflixActivity != null && !C8054ddD.l(netflixActivity)) {
            AvatarInfo avatarInfo = new AvatarInfo(interfaceC5159btW.getId(), interfaceC5159btW.getUrl(), true);
            InterfaceC5844cKl at = ((b) EntryPointAccessors.fromApplication(netflixActivity, b.class)).at();
            if (netflixActivity.getIntent().hasExtra("EXTRA_ORIGINAL_ICONS_DEEPLINK") && netflixActivity.getIntent().getBooleanExtra("EXTRA_ORIGINAL_ICONS_DEEPLINK", false)) {
                String b2 = C8126deW.b(netflixActivity);
                if (b2 != null && b2.length() != 0) {
                    at.a().a(netflixActivity, b2, avatarInfo);
                }
                netflixActivity.finish();
                return;
            }
            Intent intent = new Intent();
            at.a().c(intent, avatarInfo);
            netflixActivity.setResult(-1, intent);
            netflixActivity.finish();
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d = dqE.d();
        k = dqE.k(d);
        C1596aHd c1596aHd = new C1596aHd("Activity was null in LopiAdapter.holder.cover clickListener", null, null, true, k, false, false, 96, null);
        ErrorType errorType = c1596aHd.a;
        if (errorType != null) {
            c1596aHd.e.put("errorType", errorType.c());
            String b3 = c1596aHd.b();
            if (b3 != null) {
                String c = errorType.c();
                c1596aHd.a(c + " " + b3);
            }
        }
        if (c1596aHd.b() != null && c1596aHd.i != null) {
            th = new Throwable(c1596aHd.b(), c1596aHd.i);
        } else if (c1596aHd.b() != null) {
            th = new Throwable(c1596aHd.b());
        } else {
            th = c1596aHd.i;
            if (th == null) {
                th = new Throwable("Handled exception with no message");
            } else if (th == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        ArrayList<InterfaceC5159btW> profileIcons;
        InterfaceC5153btQ interfaceC5153btQ = this.e;
        if (interfaceC5153btQ == null || (profileIcons = interfaceC5153btQ.getProfileIcons()) == null) {
            return 0;
        }
        return profileIcons.size();
    }

    private final InterfaceC5159btW b(int i) {
        InterfaceC5153btQ interfaceC5153btQ;
        ArrayList<InterfaceC5159btW> profileIcons;
        if (i >= getItemCount() || (interfaceC5153btQ = this.e) == null || (profileIcons = interfaceC5153btQ.getProfileIcons()) == null) {
            return null;
        }
        return profileIcons.get(i);
    }

    private final TrackingInfo a(InterfaceC5159btW interfaceC5159btW) {
        return C5960cOu.b.c(interfaceC5159btW.getUuid());
    }
}
