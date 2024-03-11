package o;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.transition.Fade;
import androidx.transition.Transition;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.service.logging.perf.PerformanceProfilerImpl;
import com.netflix.mediaclient.service.logging.perf.Sessions;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.home.HomeActivity;
import com.netflix.mediaclient.ui.home.api.Params;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: o.cco  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6413cco implements InterfaceC5345bwx {
    private final NetflixActivity b;
    private boolean d = false;

    @Override // o.InterfaceC5345bwx
    public void a(Intent intent, Fragment fragment) {
    }

    @Override // o.InterfaceC5345bwx
    public boolean a() {
        return false;
    }

    @Override // o.InterfaceC5345bwx
    public boolean c(Intent intent, Fragment fragment) {
        return true;
    }

    public static boolean c(Intent intent) {
        return HomeActivity.c(intent) && "lolomo".equals(intent.getStringExtra("genre_id"));
    }

    public C6413cco(NetflixActivity netflixActivity, FragmentHelper fragmentHelper) {
        this.b = netflixActivity;
    }

    @Override // o.InterfaceC5345bwx
    public boolean e(Intent intent) {
        return HomeActivity.a(intent) || i(intent) || j(intent) || ((this.b instanceof HomeActivity) && c(intent));
    }

    private boolean i(Intent intent) {
        return h(intent) && intent.hasExtra("lomo_parcel");
    }

    private boolean j(Intent intent) {
        return h(intent) && intent.hasExtra("genre_parcel");
    }

    private boolean h(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null || !component.getClassName().equals(ActivityC6433cdH.c().getCanonicalName())) {
            return false;
        }
        intent.setExtrasClassLoader(getClass().getClassLoader());
        return true;
    }

    @Override // o.InterfaceC5345bwx
    public AppView a(Intent intent) {
        if (c(intent)) {
            return AppView.browseTitles;
        }
        return AppView.browseTitlesGallery;
    }

    @Override // o.InterfaceC5345bwx
    public TrackingInfo b(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.setClassLoader(getClass().getClassLoader());
            final GenreItem genreItem = (GenreItem) extras.getParcelable("genre_parcel");
            final LoMo loMo = (LoMo) extras.getParcelable("lomo_parcel");
            return new TrackingInfo() { // from class: o.cco.2
                @Override // com.netflix.cl.model.JsonSerializer
                public JSONObject toJSONObject() {
                    JSONObject jSONObject = new JSONObject();
                    GenreItem genreItem2 = genreItem;
                    if (genreItem2 == null || genreItem2.getId() == null) {
                        LoMo loMo2 = loMo;
                        if (loMo2 != null) {
                            jSONObject.put("listId", loMo2.getId());
                            jSONObject.put("trackId", loMo.getTrackId());
                        }
                    } else {
                        jSONObject.put("genreId", genreItem.getId());
                        if (genreItem.getTrackId() > 0) {
                            jSONObject.put("trackId", genreItem.getTrackId());
                        }
                        String unifiedEntityId = genreItem.getUnifiedEntityId();
                        if (C8168dfL.h(unifiedEntityId)) {
                            jSONObject.put("unifiedEntityId", unifiedEntityId);
                        }
                    }
                    return jSONObject;
                }
            };
        }
        return null;
    }

    @Override // o.InterfaceC5345bwx
    /* renamed from: f */
    public NetflixFrag d(Intent intent) {
        Bundle extras;
        String str;
        String str2;
        boolean z;
        if (e(intent) && (extras = intent.getExtras()) != null) {
            extras.setClassLoader(getClass().getClassLoader());
            String string = extras.getString("genre_id");
            String string2 = extras.getString("genre_filter");
            GenreItem genreItem = (GenreItem) extras.getParcelable("genre_parcel");
            LoMo loMo = (LoMo) extras.getParcelable("lomo_parcel");
            if (C8153dex.Z()) {
                if (string == null && genreItem != null) {
                    string = genreItem.getId();
                }
                if (genreItem != null && string != null && (C6452cda.c(string) || C6452cda.f(string))) {
                    str = string;
                    str2 = str;
                    if (!C8168dfL.g(str) && loMo == null) {
                        C1044Mm.e("GenreFragmentCreator", "No new ID to show");
                        return null;
                    } else if (C8153dex.Z() && "lolomo".equals(str)) {
                        C1044Mm.e("GenreFragmentCreator", "Won't try to display home lolomo");
                        return null;
                    } else if (!"queue".equals(str) && (loMo == null || !LoMoType.INSTANT_QUEUE.a().equals(loMo.getId()))) {
                        if (loMo == null && C6409cck.a(loMo.getId())) {
                            return C6409cck.c(loMo);
                        }
                        if (genreItem == null && extras.getString("similars_videotype") != null) {
                            return C6404ccf.a(str, extras.getString("similars_videotype"), genreItem);
                        }
                        if (genreItem == null && genreItem.getGenreType() == GenreItem.GenreType.GALLERY) {
                            return C6404ccf.e(str, str2, genreItem);
                        }
                        if (C8153dex.Z() || this.d || !intent.getBooleanExtra("is_cold_start", false)) {
                            z = false;
                        } else {
                            this.d = true;
                            z = true;
                        }
                        if (Objects.equals(str, "lolomo") && str2 == null && genreItem == null) {
                            PerformanceProfilerImpl.INSTANCE.d(Sessions.LOLOMO_LOAD);
                        }
                        return (NetflixFrag) InterfaceC3993bSg.e(this.b).a(new Params.Lolomo(str, str2, genreItem, a(intent), z, false));
                    }
                }
            }
            str = string;
            str2 = string2;
            if (!C8168dfL.g(str)) {
            }
            if (C8153dex.Z()) {
            }
            if (!"queue".equals(str)) {
                if (loMo == null) {
                }
                if (genreItem == null) {
                }
                if (genreItem == null) {
                }
                if (C8153dex.Z()) {
                }
                z = false;
                if (Objects.equals(str, "lolomo")) {
                    PerformanceProfilerImpl.INSTANCE.d(Sessions.LOLOMO_LOAD);
                }
                return (NetflixFrag) InterfaceC3993bSg.e(this.b).a(new Params.Lolomo(str, str2, genreItem, a(intent), z, false));
            }
        }
        return null;
    }

    public boolean g(Intent intent) {
        intent.setExtrasClassLoader(getClass().getClassLoader());
        return intent.hasExtra("genre_filter") || (C8153dex.Z() && c(intent));
    }

    @Override // o.InterfaceC5345bwx
    public void c(Intent intent, Fragment fragment, boolean z) {
        if (g(intent)) {
            fragment.setEnterTransition(d(z));
        }
    }

    @Override // o.InterfaceC5345bwx
    public void b(Intent intent, Fragment fragment, Intent intent2, boolean z) {
        boolean z2 = intent2 == null || e(intent2);
        if (g(intent) && z2) {
            fragment.setExitTransition(d(z));
        }
    }

    private Transition d(boolean z) {
        if (z) {
            return new Fade().setDuration(FragmentHelper.o());
        }
        int e = BrowseExperience.e(this.b, 16842836);
        C8349dih c8349dih = new C8349dih(C8150deu.h());
        c8349dih.a(e);
        return c8349dih;
    }
}
