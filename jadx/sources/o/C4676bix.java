package o;

import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.dash.manifest.Representation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o.C4636biJ;

/* renamed from: o.bix  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4676bix implements InterfaceC4665bim {
    private final List<InterfaceC4665bim> b;

    public C4676bix(InterfaceC4665bim... interfaceC4665bimArr) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.b = copyOnWriteArrayList;
        if (interfaceC4665bimArr == null || interfaceC4665bimArr.length <= 0) {
            return;
        }
        copyOnWriteArrayList.addAll(Arrays.asList(interfaceC4665bimArr));
    }

    @Override // o.InterfaceC4665bim
    public List<C4658bif> e(TrackGroup trackGroup, long j) {
        ArrayList arrayList = null;
        for (InterfaceC4665bim interfaceC4665bim : this.b) {
            List<C4658bif> e = interfaceC4665bim.e(trackGroup, j);
            if (!e.isEmpty()) {
                if (arrayList == null) {
                    arrayList = new ArrayList(e);
                } else {
                    arrayList.addAll(e);
                }
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    @Override // o.InterfaceC4665bim
    public List<C4658bif> d(long j, long j2) {
        ArrayList arrayList = null;
        for (InterfaceC4665bim interfaceC4665bim : this.b) {
            List<C4658bif> d = interfaceC4665bim.d(j, j2);
            if (!d.isEmpty()) {
                if (arrayList == null) {
                    arrayList = new ArrayList(d);
                } else {
                    arrayList.addAll(d);
                }
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    @Override // o.InterfaceC4665bim
    public List<C4677biy> c() {
        ArrayList arrayList = new ArrayList(this.b.size());
        for (InterfaceC4665bim interfaceC4665bim : this.b) {
            arrayList.addAll(interfaceC4665bim.c());
        }
        return arrayList;
    }

    @Override // o.InterfaceC4665bim
    public void e(InterfaceC4662bij interfaceC4662bij, List<Representation> list, List<Representation> list2, long j, long j2, boolean z, C4636biJ.d dVar) {
        for (InterfaceC4665bim interfaceC4665bim : this.b) {
            if (interfaceC4665bim instanceof C4627biA) {
                interfaceC4665bim.e(interfaceC4662bij, list, list2, j, j2, z, dVar);
                return;
            }
        }
    }
}
