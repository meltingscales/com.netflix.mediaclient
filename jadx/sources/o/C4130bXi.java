package o;

import android.text.TextUtils;
import com.netflix.ale.AleCryptoBouncyCastle;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.graphql.models.type.UiExperienceType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyLocalMoments;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_GamesInMyList;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import dagger.Lazy;
import java.util.List;
import o.AbstractC8997hK;
import org.linphone.core.Privacy;

/* renamed from: o.bXi  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4130bXi {
    public static final C3004aqk e(String str, String str2, aOV aov, bNS bns, Lazy<XH> lazy, List<String> list, String str3, bZD bzd) {
        AbstractC8997hK bVar;
        AbstractC8997hK abstractC8997hK;
        AbstractC8997hK abstractC8997hK2;
        AbstractC8997hK abstractC8997hK3;
        AbstractC8997hK abstractC8997hK4;
        AbstractC8997hK abstractC8997hK5;
        List e;
        AbstractC8997hK abstractC8997hK6;
        AbstractC8997hK abstractC8997hK7;
        AbstractC8997hK abstractC8997hK8;
        List j;
        List j2;
        List e2;
        C8632dsu.c((Object) bns, "");
        C8632dsu.c((Object) lazy, "");
        C8632dsu.c((Object) bzd, "");
        boolean f = C8151dev.f();
        boolean a = BrowseExperience.a();
        boolean z = false;
        boolean z2 = (C8153dex.g() || a) ? false : true;
        boolean k = C8153dex.k();
        if (aov == null) {
            bVar = AbstractC8997hK.e.c;
        } else {
            if (!aov.aw() && lazy.get().c().a()) {
                z = true;
            }
            bVar = new AbstractC8997hK.b(Boolean.valueOf(z));
        }
        AbstractC8997hK abstractC8997hK9 = bVar;
        String str4 = !a ? "saget" : f ? "costner" : "danza";
        String c = C0956Jb.c(str);
        AbstractC8997hK bVar2 = (c == null || c.length() == 0) ? AbstractC8997hK.e.c : new AbstractC8997hK.b(c);
        if (C8153dex.d()) {
            abstractC8997hK = new AbstractC8997hK.b(Boolean.TRUE);
        } else {
            abstractC8997hK = AbstractC8997hK.e.c;
        }
        AbstractC8997hK abstractC8997hK10 = abstractC8997hK;
        if (C8153dex.d()) {
            abstractC8997hK2 = new AbstractC8997hK.b(Boolean.TRUE);
        } else {
            abstractC8997hK2 = AbstractC8997hK.e.c;
        }
        AbstractC8997hK abstractC8997hK11 = abstractC8997hK2;
        if (C8153dex.d()) {
            abstractC8997hK3 = new AbstractC8997hK.b(Boolean.TRUE);
        } else {
            abstractC8997hK3 = AbstractC8997hK.e.c;
        }
        AbstractC8997hK abstractC8997hK12 = abstractC8997hK3;
        if (C8153dex.d() && C1864aRb.b.e()) {
            abstractC8997hK4 = new AbstractC8997hK.b(Boolean.TRUE);
        } else {
            abstractC8997hK4 = AbstractC8997hK.e.c;
        }
        AbstractC8997hK abstractC8997hK13 = abstractC8997hK4;
        AbstractC8997hK.b bVar3 = new AbstractC8997hK.b(Boolean.valueOf(aQC.a.d().a()));
        AbstractC8997hK.b bVar4 = new AbstractC8997hK.b(Integer.valueOf(!f ? 3 : 5));
        AbstractC8997hK.b bVar5 = new AbstractC8997hK.b(40);
        AbstractC8997hK.b bVar6 = new AbstractC8997hK.b(75);
        AbstractC8997hK.b bVar7 = new AbstractC8997hK.b(Boolean.valueOf(a));
        AbstractC8997hK.b bVar8 = new AbstractC8997hK.b(Boolean.valueOf(!C8171dfO.e()));
        Boolean bool = Boolean.TRUE;
        AbstractC8997hK abstractC8997hK14 = bVar2;
        C3000aqg c3000aqg = new C3000aqg(bVar5, bVar6, bVar4, bVar7, bVar8, null, null, new AbstractC8997hK.b(bool), new AbstractC8997hK.b(bool), new AbstractC8997hK.b(bool), new AbstractC8997hK.b(Boolean.valueOf(a)), abstractC8997hK9, new AbstractC8997hK.b(Boolean.valueOf(C1860aQy.b.e().c())), null, null, abstractC8997hK10, new AbstractC8997hK.b(bool), new AbstractC8997hK.b(Boolean.valueOf(C8153dex.r())), null, null, new AbstractC8997hK.b(Boolean.valueOf(C8153dex.o())), null, new AbstractC8997hK.b(bool), null, null, null, abstractC8997hK11, bVar3, new AbstractC8997hK.b(Boolean.valueOf(C8153dex.s())), abstractC8997hK12, null, new AbstractC8997hK.b(bool), new AbstractC8997hK.b(Boolean.valueOf(k)), new AbstractC8997hK.b(Boolean.valueOf(ConfigFastPropertyLocalMoments.Companion.e())), new AbstractC8997hK.b(Boolean.valueOf(Config_FastProperty_GamesInMyList.Companion.e())), null, null, null, null, null, null, null, null, abstractC8997hK12, abstractC8997hK13, null, null, null, null, null, null, null, null, null, new AbstractC8997hK.b(Boolean.valueOf(bzd.c())), 1135370336, 4188152, null);
        String join = TextUtils.join(",", bns.e());
        if (join == null || join.length() == 0) {
            abstractC8997hK5 = AbstractC8997hK.e.c;
        } else {
            C8632dsu.d((Object) join);
            abstractC8997hK5 = new AbstractC8997hK.b(join);
        }
        AbstractC8997hK.b bVar9 = new AbstractC8997hK.b(c3000aqg);
        AbstractC8997hK.b bVar10 = new AbstractC8997hK.b(bool);
        e = C8566dqi.e("hero");
        AbstractC8997hK.b bVar11 = new AbstractC8997hK.b(e);
        AbstractC8997hK bVar12 = str2 == null ? AbstractC8997hK.e.c : new AbstractC8997hK.b(str2);
        AbstractC8997hK bVar13 = a ? new AbstractC8997hK.b(bool) : AbstractC8997hK.e.c;
        if (k) {
            e2 = C8566dqi.e(UiExperienceType.e);
            abstractC8997hK6 = new AbstractC8997hK.b(e2);
        } else {
            abstractC8997hK6 = AbstractC8997hK.e.c;
        }
        AbstractC8997hK abstractC8997hK15 = abstractC8997hK6;
        if (k && c != null && c.length() != 0 && list != null && !list.isEmpty()) {
            abstractC8997hK7 = new AbstractC8997hK.b(list);
        } else {
            abstractC8997hK7 = AbstractC8997hK.e.c;
        }
        AbstractC8997hK abstractC8997hK16 = abstractC8997hK7;
        if (k && c != null && c.length() != 0 && str3 != null && str3.length() != 0) {
            abstractC8997hK8 = new AbstractC8997hK.b(str3);
        } else {
            abstractC8997hK8 = AbstractC8997hK.e.c;
        }
        C2973aqF c2973aqF = new C2973aqF(null, null, null, null, str4, null, bVar10, abstractC8997hK5, null, null, null, bVar13, abstractC8997hK14, bVar9, bVar11, bVar12, null, abstractC8997hK15, abstractC8997hK16, abstractC8997hK8, 67375, null);
        AbstractC8997hK.b bVar14 = new AbstractC8997hK.b(f ? "pad" : "phone");
        AbstractC8997hK.b bVar15 = new AbstractC8997hK.b("Android");
        AbstractC8997hK.b bVar16 = new AbstractC8997hK.b(C8055ddE.e(AbstractApplicationC1040Mh.d()));
        j = C8569dql.j("nullImpressionTokens", "billboard");
        C3003aqj c3003aqj = new C3003aqj(null, null, new AbstractC8997hK.b(j), bVar14, bVar15, bVar16, 3, null);
        if (z2) {
            c2973aqF = c2973aqF.b((r38 & 1) != 0 ? c2973aqF.d : new AbstractC8997hK.b(bool), (r38 & 2) != 0 ? c2973aqF.c : new AbstractC8997hK.b(Boolean.FALSE), (r38 & 4) != 0 ? c2973aqF.e : new AbstractC8997hK.b(f ? "android-tablet" : "android-phone"), (r38 & 8) != 0 ? c2973aqF.a : null, (r38 & 16) != 0 ? c2973aqF.h : null, (r38 & 32) != 0 ? c2973aqF.b : null, (r38 & 64) != 0 ? c2973aqF.f13479o : null, (r38 & 128) != 0 ? c2973aqF.n : null, (r38 & JSONzip.end) != 0 ? c2973aqF.r : null, (r38 & 512) != 0 ? c2973aqF.l : null, (r38 & 1024) != 0 ? c2973aqF.g : null, (r38 & 2048) != 0 ? c2973aqF.q : null, (r38 & 4096) != 0 ? c2973aqF.i : null, (r38 & 8192) != 0 ? c2973aqF.j : null, (r38 & 16384) != 0 ? c2973aqF.t : null, (r38 & Privacy.DEFAULT) != 0 ? c2973aqF.s : null, (r38 & AleCryptoBouncyCastle.MAX_RANDOM_BYTES) != 0 ? c2973aqF.f : null, (r38 & 131072) != 0 ? c2973aqF.p : null, (r38 & 262144) != 0 ? c2973aqF.m : null, (r38 & 524288) != 0 ? c2973aqF.k : null);
            j2 = C8569dql.j("standard", "episodic", "awards");
            c3003aqj = C3003aqj.e(c3003aqj, new AbstractC8997hK.b(j2), null, null, null, null, null, 62, null);
        }
        return new C3004aqk(abstractC8997hK14, c2973aqF, new AbstractC8997hK.b(c3003aqj));
    }
}
