package com.netflix.mediaclient.ui.offline;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.ui.offline.DownloadButton;
import com.netflix.mediaclient.ui.offline.SeasonDownloadButton;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.AbstractC7302cte;
import o.C1045Mp;
import o.C1204Sr;
import o.C1333Xq;
import o.C7350cuZ;
import o.C8569dql;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5107bsX;
import o.InterfaceC5206buQ;
import o.InterfaceC5227bul;
import o.InterfaceC7281ctJ;
import o.InterfaceC7303ctf;

@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class SeasonDownloadButton extends AbstractC7302cte {
    @Inject
    public b clickListener;
    private String g;
    private List<? extends InterfaceC5227bul> j;
    @Inject
    public InterfaceC7303ctf offlineApi;
    public static final e f = new e(null);
    public static final int b = 8;

    /* loaded from: classes4.dex */
    public interface b {
        void e(SeasonDownloadButton seasonDownloadButton, Activity activity, List<? extends InterfaceC5227bul> list);
    }

    /* loaded from: classes4.dex */
    public final /* synthetic */ class d {
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[DownloadButton.ButtonState.values().length];
            try {
                iArr[DownloadButton.ButtonState.SAVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadButton.ButtonState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadButton.ButtonState.DOWNLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = iArr;
        }
    }

    @Override // com.netflix.mediaclient.ui.offline.DownloadButton
    protected int a() {
        return C7350cuZ.d.h;
    }

    @Override // com.netflix.mediaclient.ui.offline.DownloadButton
    public void setProgress(int i) {
    }

    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("SeasonDownloadButton");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeasonDownloadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        List<? extends InterfaceC5227bul> i;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) attributeSet, "");
        i = C8569dql.i();
        this.j = i;
    }

    protected final b m() {
        b bVar = this.clickListener;
        if (bVar != null) {
            return bVar;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // com.netflix.mediaclient.ui.offline.DownloadButton
    protected void j() {
        DownloadButton.ButtonState c = c();
        int i = c == null ? -1 : d.d[c.ordinal()];
        C1333Xq d2 = C1333Xq.d(i != 1 ? i != 2 ? i != 3 ? C7350cuZ.a.d : C7350cuZ.a.l : C7350cuZ.a.b : C7350cuZ.a.j);
        String str = this.g;
        if (str == null) {
            str = getContext().getString(C7350cuZ.a.l);
            C8632dsu.a(str, "");
        }
        String c2 = d2.d("season", str).c();
        C1204Sr c1204Sr = this.d;
        if (c1204Sr != null) {
            c1204Sr.setText(c2);
        }
        setContentDescription(c2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.netflix.mediaclient.ui.offline.DownloadButton
    public void e(DownloadButton.ButtonState buttonState, String str) {
        q();
    }

    public final void setStateFromEpisodes(final List<? extends InterfaceC5227bul> list, String str, int i, final Activity activity) {
        List<? extends InterfaceC5227bul> g;
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) activity, "");
        if (!(activity instanceof InterfaceC5107bsX)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (list.isEmpty() || !((InterfaceC5107bsX) activity).getServiceManager().c()) {
            return;
        }
        Iterator<? extends InterfaceC5227bul> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (it.next().aw_() == i) {
                break;
            } else {
                i2++;
            }
        }
        int max = Math.max(i2, 0);
        g = C8576dqs.g((Collection) list.subList(max, list.size()), (Iterable) list.subList(0, max));
        this.j = g;
        this.g = str;
        setTag("SeasonDownloadButton");
        setOnClickListener(new View.OnClickListener() { // from class: o.cux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SeasonDownloadButton.b(SeasonDownloadButton.this, activity, list, view);
            }
        });
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SeasonDownloadButton seasonDownloadButton, Activity activity, List list, View view) {
        C8632dsu.c((Object) seasonDownloadButton, "");
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) list, "");
        seasonDownloadButton.m().e(seasonDownloadButton, activity, list);
    }

    private final void q() {
        InterfaceC7281ctJ a = this.offlineApi.a();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        double d2 = 0.0d;
        for (InterfaceC5227bul interfaceC5227bul : this.j) {
            InterfaceC5206buQ c = a.c(interfaceC5227bul.aE_().aH_());
            DownloadButton.ButtonState b2 = DownloadButton.b(c, interfaceC5227bul.aE_());
            if (c != null) {
                z2 = true;
            }
            DownloadButton.ButtonState buttonState = DownloadButton.ButtonState.SAVED;
            if (b2 != buttonState && b2 != DownloadButton.ButtonState.DOWNLOADING && b2 != DownloadButton.ButtonState.QUEUED && b2 != DownloadButton.ButtonState.PRE_QUEUED && b2 != DownloadButton.ButtonState.PAUSED && b2 != DownloadButton.ButtonState.ERROR) {
                a(DownloadButton.ButtonState.AVAILABLE);
                return;
            }
            if (b2 == DownloadButton.ButtonState.PAUSED) {
                z = true;
            }
            if (b2 == DownloadButton.ButtonState.DOWNLOADING) {
                z3 = true;
            }
            if (b2 == DownloadButton.ButtonState.ERROR) {
                z4 = true;
            }
            if (b2 == buttonState) {
                d2 += 1.0d;
            } else if (c != null) {
                d2 += (c.aD_() * 1.0d) / 100;
            }
        }
        int size = (int) (((1.0d * d2) / this.j.size()) * 100);
        if (z && !z3) {
            a(DownloadButton.ButtonState.PAUSED);
        } else if (d2 < 0.0d) {
            a(DownloadButton.ButtonState.QUEUED);
        } else if (size >= 100) {
            a(DownloadButton.ButtonState.SAVED);
        } else {
            a(DownloadButton.ButtonState.DOWNLOADING);
            e(size);
        }
        if (z3 || size > 100 || !z2 || !z4) {
            return;
        }
        a(DownloadButton.ButtonState.ERROR);
    }

    private final void a(DownloadButton.ButtonState buttonState) {
        DownloadButton.ButtonState buttonState2 = this.a;
        if (buttonState2 != buttonState && buttonState2 == DownloadButton.ButtonState.NOT_AVAILABLE) {
            setVisibility(0);
        }
        this.a = buttonState;
        i();
        j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.netflix.mediaclient.ui.offline.DownloadButton
    public AppView e() {
        return AppView.downloadSeasonButton;
    }
}
