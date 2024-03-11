package o;

import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.context.MediaOffset;
import com.netflix.cl.model.event.session.Presentation;
import com.netflix.mediaclient.clutils.CLv2Utils;
import io.reactivex.Observable;
import o.bFX;
import o.bFZ;

/* renamed from: o.bEg  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3611bEg extends AbstractC9940zU<bFZ, bFV> {
    private Long b;
    private final bEG d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3611bEg(bEG beg, Observable<bFZ> observable) {
        super(observable, beg);
        C8632dsu.c((Object) beg, "");
        C8632dsu.c((Object) observable, "");
        this.d = beg;
    }

    @Override // o.AbstractC9940zU
    public void onEvent(bFZ bfz) {
        C8632dsu.c((Object) bfz, "");
        if (C8632dsu.c(bfz, bFZ.b.e)) {
            this.d.c();
        } else if (bfz instanceof bFZ.d) {
            this.d.a();
            bFZ.d dVar = (bFZ.d) bfz;
            this.d.d(dVar.e(), dVar.b(), dVar.d());
        } else if (bfz instanceof bFZ.c) {
            bFZ.c cVar = (bFZ.c) bfz;
            if (cVar.b() != -1) {
                this.d.d(cVar.b(), 0);
            }
        } else if (bfz instanceof bFZ.e) {
            bFZ.e eVar = (bFZ.e) bfz;
            a(eVar.i(), eVar.a(), eVar.d(), eVar.b(), eVar.c(), eVar.e());
        } else if (bfz instanceof bFZ.a) {
            d(((bFZ.a) bfz).e());
        } else if (bfz instanceof bFZ.j) {
            this.d.b(((bFZ.j) bfz).e());
        } else if (bfz instanceof bFZ.i) {
            int h = this.d.h();
            if (h == -1 || ((bFZ.i) bfz).b().D_() == h) {
                return;
            }
            this.d.b((bEG) bFX.e.b);
        } else if (C8632dsu.c(bfz, bFZ.f.e)) {
            this.d.f();
        } else if (bfz instanceof bFZ.h) {
            bFZ.h hVar = (bFZ.h) bfz;
            this.d.d(hVar.b(), hVar.d());
        }
    }

    public void a(int i, long j, String str, Integer num, Integer num2, Long l) {
        C8632dsu.c((Object) str, "");
        Long valueOf = l == null ? null : Long.valueOf(Logger.INSTANCE.addContext(new MediaOffset(l, Long.valueOf(j))));
        Logger logger = Logger.INSTANCE;
        this.b = logger.startSession(new Presentation(AppView.episodesSelector, CLv2Utils.INSTANCE.d(Integer.valueOf(i), str, num, num2)));
        if (valueOf != null) {
            logger.removeContext(valueOf);
        }
    }

    public void d(boolean z) {
        Long l = this.b;
        if (l != null) {
            long longValue = l.longValue();
            if (z) {
                Logger.INSTANCE.cancelSession(Long.valueOf(longValue));
            } else {
                Logger.INSTANCE.endSession(Long.valueOf(longValue));
            }
            this.b = null;
        }
    }
}
