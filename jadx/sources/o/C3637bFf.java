package o;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.clutils.EmptyPlayContext;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.ui.details.CharacterHelper$retainedFragments$1;
import com.netflix.mediaclient.ui.kids.character_details.KidsCharacterDetailsActivity;
import com.netflix.mediaclient.ui.kids.character_details.KidsCharacterFrag;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import com.netflix.mediaclient.util.PlayContext;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* renamed from: o.bFf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3637bFf implements InterfaceC5345bwx {
    private final CharacterHelper$retainedFragments$1 a;
    private final FragmentHelper c;
    public static final d e = new d(null);
    private static final String b = "CharacterHelper";

    @Override // o.InterfaceC5345bwx
    public void b(Intent intent, Fragment fragment, Intent intent2, boolean z) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
    }

    @Override // o.InterfaceC5345bwx
    public void c(Intent intent, Fragment fragment, boolean z) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
    }

    @Override // o.InterfaceC5345bwx
    public boolean c(Intent intent, Fragment fragment) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
        return true;
    }

    public C3637bFf(FragmentHelper fragmentHelper) {
        C8632dsu.c((Object) fragmentHelper, "");
        this.c = fragmentHelper;
        this.a = new CharacterHelper$retainedFragments$1();
    }

    @Override // o.InterfaceC5345bwx
    public boolean e(Intent intent) {
        C8632dsu.c((Object) intent, "");
        intent.setExtrasClassLoader(C3637bFf.class.getClassLoader());
        if (intent.getComponent() != null && intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID) != null) {
            ComponentName component = intent.getComponent();
            C8632dsu.d(component);
            if (C8632dsu.c((Object) component.getClassName(), (Object) KidsCharacterDetailsActivity.q().getCanonicalName()) && C8632dsu.c((Object) VideoType.CHARACTERS.getValue(), (Object) intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_TYPE_STRING_VALUE))) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC5345bwx
    /* renamed from: c */
    public NetflixFrag d(Intent intent) {
        C8632dsu.c((Object) intent, "");
        if (e(intent)) {
            KidsCharacterFrag kidsCharacterFrag = (KidsCharacterFrag) this.a.get(intent);
            if (kidsCharacterFrag == null) {
                KidsCharacterFrag.d dVar = KidsCharacterFrag.j;
                String stringExtra = intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID);
                C8632dsu.d((Object) stringExtra);
                Parcelable parcelableExtra = intent.getParcelableExtra(NetflixActivity.EXTRA_TRACKINGINFO_HOLDER);
                C8632dsu.d(parcelableExtra);
                return dVar.c(stringExtra, (TrackingInfoHolder) parcelableExtra);
            }
            return kidsCharacterFrag;
        }
        return null;
    }

    @Override // o.InterfaceC5345bwx
    public boolean a() {
        return this.c.e();
    }

    @Override // o.InterfaceC5345bwx
    public AppView a(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return AppView.characterDetails;
    }

    @Override // o.InterfaceC5345bwx
    public TrackingInfo b(Intent intent) {
        C8632dsu.c((Object) intent, "");
        return new C8263dhA(g(intent), i(intent));
    }

    @Override // o.InterfaceC5345bwx
    public void a(Intent intent, Fragment fragment) {
        C8632dsu.c((Object) intent, "");
        C8632dsu.c((Object) fragment, "");
        this.a.remove(intent);
        ((NetflixFrag) fragment).bt_();
    }

    private final String i(Intent intent) {
        return intent.getStringExtra(NetflixActivity.EXTRA_VIDEO_ID);
    }

    private final PlayContext g(Intent intent) {
        Map d2;
        Map k;
        Throwable th;
        TrackingInfoHolder trackingInfoHolder = (TrackingInfoHolder) intent.getParcelableExtra(NetflixActivity.EXTRA_TRACKINGINFO_HOLDER);
        if (trackingInfoHolder != null) {
            return TrackingInfoHolder.b(trackingInfoHolder, false, 1, null);
        }
        PlayContext playContext = (PlayContext) intent.getParcelableExtra(NetflixActivity.EXTRA_PLAY_CONTEXT);
        if (playContext == null) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            String i = i(intent);
            C8632dsu.d((Object) i);
            String str = "playContext is null!  id: " + i;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd(str, null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
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
            return new EmptyPlayContext(b, -392);
        }
        return playContext;
    }

    /* renamed from: o.bFf$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
        }
    }
}
