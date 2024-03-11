package com.netflix.mediaclient.ui.dpcredits;

import android.content.Context;
import android.util.Base64;
import android.view.View;
import com.airbnb.epoxy.TypedEpoxyController;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.mediaclient.servicemgr.interface_.genre.DefaultGenreItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.dpcredits.DpCreditsEpoxyController;
import com.netflix.model.leafs.PersonSummary;
import com.netflix.model.leafs.advisory.Advisory;
import java.nio.charset.StandardCharsets;
import java.util.List;
import o.C1332Xp;
import o.C3774bKd;
import o.C3812bLo;
import o.C3817bLt;
import o.C8627dsp;
import o.C8632dsu;
import o.C8932fz;
import o.C9935zP;
import o.InterfaceC5198buI;
import o.InterfaceC8366diy;
import o.bIC;
import o.bIJ;
import o.bIT;
import o.bKU;

/* loaded from: classes4.dex */
public final class DpCreditsEpoxyController extends TypedEpoxyController<bIJ> {
    public static final int $stable = 8;
    private static int c = 0;
    private static int e = 1;
    private static byte e$ss2$217;
    private final NetflixActivity activity;
    private final C9935zP eventBusFactory;
    private final boolean maturityRatingOnTop;
    private final boolean showSeasonLevelMaturityRatings;
    private final TrackingInfoHolder trackingInfoHolder;

    static {
        c();
    }

    static void c() {
        e$ss2$217 = (byte) 24;
    }

    public final NetflixActivity getActivity() {
        return this.activity;
    }

    public final C9935zP getEventBusFactory() {
        return this.eventBusFactory;
    }

    public final boolean getMaturityRatingOnTop() {
        return this.maturityRatingOnTop;
    }

    public final boolean getShowSeasonLevelMaturityRatings() {
        return this.showSeasonLevelMaturityRatings;
    }

    public final TrackingInfoHolder getTrackingInfoHolder() {
        return this.trackingInfoHolder;
    }

    public /* synthetic */ DpCreditsEpoxyController(NetflixActivity netflixActivity, C9935zP c9935zP, TrackingInfoHolder trackingInfoHolder, boolean z, boolean z2, int i, C8627dsp c8627dsp) {
        this(netflixActivity, c9935zP, trackingInfoHolder, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    public DpCreditsEpoxyController(NetflixActivity netflixActivity, C9935zP c9935zP, TrackingInfoHolder trackingInfoHolder, boolean z, boolean z2) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) c9935zP, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        this.activity = netflixActivity;
        this.eventBusFactory = c9935zP;
        this.trackingInfoHolder = trackingInfoHolder;
        this.maturityRatingOnTop = z;
        this.showSeasonLevelMaturityRatings = z2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(bIJ bij) {
        C8632dsu.c((Object) bij, "");
        if (bij.d() instanceof C8932fz) {
            buildLoadingModels();
            return;
        }
        InterfaceC8366diy c2 = bij.d().c();
        if (c2 != null) {
            buildSuccessModels(c2);
        }
    }

    private final void buildLoadingModels() {
        add(new C3774bKd().c((CharSequence) "loading-animation").b(400L));
    }

    private final void buildSuccessModels(InterfaceC8366diy interfaceC8366diy) {
        if (this.showSeasonLevelMaturityRatings) {
            add(new C3817bLt().b((CharSequence) "season-text").c((CharSequence) interfaceC8366diy.getTitle()));
            addSeasonLevelMaturityRatings(interfaceC8366diy);
            return;
        }
        if (this.maturityRatingOnTop) {
            addMaturityRatings(interfaceC8366diy);
        }
        addPersonTypeList(interfaceC8366diy.bO_(), "cast", R.o.bE);
        addPersonTypeList(interfaceC8366diy.r(), "director", R.o.bD);
        addPersonTypeList(interfaceC8366diy.ao_(), "creator", R.o.bC);
        addPersonTypeList(interfaceC8366diy.ah(), "writer", R.o.bF);
        if (!this.maturityRatingOnTop) {
            addMaturityRatings(interfaceC8366diy);
        }
        addGenreTypeList(interfaceC8366diy.z(), "genres", R.o.bA);
        addGenreTypeList(interfaceC8366diy.I(), "moodTags", interfaceC8366diy.getType() == VideoType.MOVIE ? R.o.bG : R.o.bI);
        bKU d = new bKU().d((CharSequence) "bottomPadding");
        C1332Xp c1332Xp = C1332Xp.b;
        add(d.a(Integer.valueOf(((Context) C1332Xp.b(Context.class)).getResources().getDimensionPixelSize(R.b.R))));
    }

    private final void addPersonTypeList(List<? extends PersonSummary> list, String str, int i) {
        int i2 = 2 % 2;
        int i3 = e + 123;
        c = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (list == null) {
            return;
        }
        C3812bLo c3812bLo = new C3812bLo();
        C3812bLo e2 = c3812bLo.e((CharSequence) (str + "-header"));
        String string = this.activity.getString(i);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            b(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i4 = e + 73;
            c = i4 % 128;
            int i5 = i4 % 2;
        }
        add(e2.d((CharSequence) string));
        for (final PersonSummary personSummary : list) {
            C3817bLt c3817bLt = new C3817bLt();
            int personId = personSummary.getPersonId();
            add(c3817bLt.b((CharSequence) (str + "-" + personId)).c((CharSequence) personSummary.getPersonName()).e(new View.OnClickListener() { // from class: o.bID
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DpCreditsEpoxyController.addPersonTypeList$lambda$2$lambda$1(DpCreditsEpoxyController.this, personSummary, view);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addPersonTypeList$lambda$2$lambda$1(DpCreditsEpoxyController dpCreditsEpoxyController, PersonSummary personSummary, View view) {
        C8632dsu.c((Object) dpCreditsEpoxyController, "");
        C8632dsu.c((Object) personSummary, "");
        dpCreditsEpoxyController.eventBusFactory.b(bIC.class, new bIC.a(personSummary));
    }

    private final void addGenreTypeList(List<? extends GenreItem> list, String str, int i) {
        int i2 = 2 % 2;
        if (list == null || list.isEmpty()) {
            return;
        }
        C3812bLo c3812bLo = new C3812bLo();
        C3812bLo e2 = c3812bLo.e((CharSequence) (str + "-header"));
        String string = this.activity.getString(i);
        if (string.startsWith("'!#+")) {
            int i3 = c + 71;
            e = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                b(string.substring(4), objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            b(string.substring(4), objArr2);
            string = ((String) objArr2[0]).intern();
            int i4 = e + 31;
            c = i4 % 128;
            int i5 = i4 % 2;
        }
        add(e2.d((CharSequence) string));
        for (final GenreItem genreItem : list) {
            C3817bLt c3817bLt = new C3817bLt();
            String id = genreItem.getId();
            add(c3817bLt.b((CharSequence) (str + "-" + id)).c((CharSequence) genreItem.getTitle()).e(new View.OnClickListener() { // from class: o.bIB
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DpCreditsEpoxyController.addGenreTypeList$lambda$4$lambda$3(GenreItem.this, this, view);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addGenreTypeList$lambda$4$lambda$3(GenreItem genreItem, DpCreditsEpoxyController dpCreditsEpoxyController, View view) {
        C8632dsu.c((Object) genreItem, "");
        C8632dsu.c((Object) dpCreditsEpoxyController, "");
        int trackId = genreItem.getTrackId();
        C9935zP c9935zP = dpCreditsEpoxyController.eventBusFactory;
        String title = genreItem.getTitle();
        C8632dsu.d((Object) title);
        c9935zP.b(bIC.class, new bIC.b(new DefaultGenreItem(title, genreItem.getId(), GenreItem.GenreType.GALLERY, trackId, genreItem.getUnifiedEntityId(), null)));
    }

    private final void addSeasonLevelMaturityRatings(InterfaceC8366diy interfaceC8366diy) {
        int i = 2 % 2;
        C3812bLo c3812bLo = new C3812bLo();
        C3812bLo e2 = c3812bLo.e((CharSequence) ("maturity-header"));
        String string = this.activity.getString(R.o.bB);
        if (string.startsWith("'!#+")) {
            int i2 = c + 85;
            e = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                b(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
            } else {
                Object[] objArr2 = new Object[1];
                b(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
                int i3 = 47 / 0;
            }
            int i4 = e + 69;
            c = i4 % 128;
            int i5 = i4 % 2;
        }
        add(e2.d((CharSequence) string));
        bIT bit = new bIT();
        add(bit.a((CharSequence) ("maturity-certification")).e((InterfaceC5198buI) interfaceC8366diy));
    }

    private final void addMaturityRatings(InterfaceC8366diy interfaceC8366diy) {
        int i = 2 % 2;
        int i2 = e + 75;
        c = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        } else if (interfaceC8366diy == null || !interfaceC8366diy.isAvailableToPlay()) {
        } else {
            int i3 = c + 11;
            e = i3 % 128;
            int i4 = i3 % 2;
            List<Advisory> e2 = interfaceC8366diy.e();
            if (e2 != null) {
                int i5 = e + 43;
                c = i5 % 128;
                if (i5 % 2 != 0) {
                    e2.isEmpty();
                    throw null;
                } else if (e2.isEmpty()) {
                    int i6 = e + 83;
                    c = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    C3812bLo c3812bLo = new C3812bLo();
                    C3812bLo e3 = c3812bLo.e((CharSequence) ("maturity-header"));
                    String string = this.activity.getString(R.o.bB);
                    if (string.startsWith("'!#+")) {
                        Object[] objArr = new Object[1];
                        b(string.substring(4), objArr);
                        string = ((String) objArr[0]).intern();
                    }
                    add(e3.d((CharSequence) string));
                    bIT bit = new bIT();
                    add(bit.a((CharSequence) ("maturity-certification")).e((InterfaceC5198buI) interfaceC8366diy));
                }
            }
        }
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$217);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
