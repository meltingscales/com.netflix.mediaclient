package o;

import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.model.leafs.PersonSummary;

/* loaded from: classes4.dex */
public abstract class bIC extends C9941zV {
    public /* synthetic */ bIC(C8627dsp c8627dsp) {
        this();
    }

    private bIC() {
    }

    /* loaded from: classes4.dex */
    public static final class a extends bIC {
        private final PersonSummary e;

        public final PersonSummary a() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PersonSummary personSummary) {
            super(null);
            C8632dsu.c((Object) personSummary, "");
            this.e = personSummary;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends bIC {
        private final GenreItem e;

        public final GenreItem b() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GenreItem genreItem) {
            super(null);
            C8632dsu.c((Object) genreItem, "");
            this.e = genreItem;
        }
    }
}
