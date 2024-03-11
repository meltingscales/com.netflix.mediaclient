package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.cache;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.Representation;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$StreamingState;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.StreamSelection;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C1044Mm;
import o.C4637biK;
import o.C4656bid;
import o.C4738bkW;
import o.C4753bkr;
import o.C4755bkv;
import o.InterfaceC4657bie;
import o.InterfaceC4663bik;
import o.InterfaceC4734bkH;

/* loaded from: classes3.dex */
public class SegmentAsePlayerState implements IStreamSelector$b {
    private final long a;
    private int b;
    private final Object[] c$45faca22;
    private final InterfaceC4734bkH d;
    private final InterfaceC4657bie e;
    private final PrefetchMode f;
    private final Object g$5334cdba;
    private final IAsePlayerState h;
    private final C4738bkW i;
    private final C4637biK j;
    private final List<Representation> l = new ArrayList();

    /* loaded from: classes3.dex */
    enum PrefetchMode {
        RANDOM_ACCESS,
        STREAMING
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b
    public int f() {
        return (int) this.a;
    }

    public SegmentAsePlayerState(C4637biK c4637biK, C4753bkr c4753bkr, InterfaceC4663bik interfaceC4663bik, IAsePlayerState iAsePlayerState, InterfaceC4657bie interfaceC4657bie, C4738bkW c4738bkW, InterfaceC4734bkH interfaceC4734bkH, Representation representation) {
        this.b = -1;
        this.j = c4637biK;
        this.i = c4738bkW;
        this.d = interfaceC4734bkH;
        this.h = iAsePlayerState;
        this.e = interfaceC4657bie;
        this.a = interfaceC4657bie.h();
        for (int i = 0; i < c4637biK.l().getPeriodCount(); i++) {
            for (AdaptationSet adaptationSet : c4637biK.l().getPeriod(i).adaptationSets) {
                if (adaptationSet.type == 2) {
                    for (Representation representation2 : adaptationSet.representations) {
                        this.l.add(representation2);
                    }
                }
            }
        }
        Collections.reverse(this.l);
        Object[] objArr = (Object[]) Array.newInstance((Class) C4755bkv.b((char) 0, 117, 2358), this.l.size());
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            try {
                Object[] objArr2 = {this.l.get(i2).format, Integer.valueOf(i2)};
                Object obj = C4755bkv.q.get(-93749372);
                if (obj == null) {
                    obj = ((Class) C4755bkv.b((char) 0, 5, 797)).getDeclaredConstructor(Format.class, Integer.TYPE);
                    C4755bkv.q.put(-93749372, obj);
                }
                objArr[i2] = ((Constructor) obj).newInstance(objArr2);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        try {
            Object[] objArr3 = {this.e.e(c4753bkr.d(), false), objArr, Boolean.valueOf(c4753bkr.d().bx())};
            Object obj2 = C4755bkv.q.get(-654284005);
            if (obj2 == null) {
                obj2 = ((Class) C4755bkv.b((char) 31478, 5, 2552)).getMethod("b", StreamRange.class, Array.newInstance((Class) C4755bkv.b((char) 0, 117, 2358), 0).getClass(), Boolean.TYPE);
                C4755bkv.q.put(-654284005, obj2);
            }
            this.c$45faca22 = (Object[]) ((Method) obj2).invoke(null, objArr3);
            if (representation != null) {
                int i3 = 0;
                while (true) {
                    Object[] objArr4 = this.c$45faca22;
                    if (i3 >= objArr4.length) {
                        break;
                    } else if (this.l.get(((Class) C4755bkv.b((char) 0, 117, 2358)).getField("a").getInt(objArr4[i3])).format == representation.format) {
                        this.b = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (this.b == -1) {
                    C1044Mm.e("nf_branch_cache", "unable to find current streaming index in prefetch list %s", representation.format);
                }
            }
            try {
                Object[] objArr5 = {c4753bkr, interfaceC4663bik, this, interfaceC4657bie};
                Object obj3 = C4755bkv.q.get(-2036788905);
                if (obj3 == null) {
                    obj3 = ((Class) C4755bkv.b((char) 0, 5, 2569)).getMethod("c", C4753bkr.class, InterfaceC4663bik.class, IStreamSelector$b.class, InterfaceC4657bie.class);
                    C4755bkv.q.put(-2036788905, obj3);
                }
                Object invoke = ((Method) obj3).invoke(null, objArr5);
                this.g$5334cdba = invoke;
                try {
                    Object[] objArr6 = {this.c$45faca22};
                    Object obj4 = C4755bkv.q.get(85400085);
                    if (obj4 == null) {
                        obj4 = ((Class) C4755bkv.b((char) 23166, 115, 2243)).getMethod("e", Array.newInstance((Class) C4755bkv.b((char) 0, 117, 2358), 0).getClass());
                        C4755bkv.q.put(85400085, obj4);
                    }
                    ((Method) obj4).invoke(invoke, objArr6);
                    long c = c4753bkr.d().c();
                    this.f = (c <= 0 || c >= 4611686018427387903L) ? PrefetchMode.STREAMING : PrefetchMode.RANDOM_ACCESS;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    public Representation a() {
        IStreamSelector$StreamingState iStreamSelector$StreamingState;
        int i = this.b;
        if (i == -1 || this.f == PrefetchMode.RANDOM_ACCESS) {
            iStreamSelector$StreamingState = IStreamSelector$StreamingState.STARTING;
        } else {
            iStreamSelector$StreamingState = IStreamSelector$StreamingState.PLAYING;
        }
        Object obj = this.g$5334cdba;
        try {
            Object[] objArr = {iStreamSelector$StreamingState, Integer.valueOf(i), Long.valueOf(o()), Long.valueOf(this.j.c()), Long.valueOf(this.j.e())};
            Object obj2 = C4755bkv.q.get(-1370557141);
            if (obj2 == null) {
                obj2 = ((Class) C4755bkv.b((char) 23166, 115, 2243)).getMethod("c", IStreamSelector$StreamingState.class, Integer.TYPE, Long.TYPE, Long.TYPE, Long.TYPE);
                C4755bkv.q.put(-1370557141, obj2);
            }
            int index = ((StreamSelection) ((Method) obj2).invoke(obj, objArr)).index();
            if (index >= 0) {
                this.b = index;
                return this.l.get(((Class) C4755bkv.b((char) 0, 117, 2358)).getField("a").getInt(this.c$45faca22[index]));
            }
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private long o() {
        return C.msToUs(this.h.a(2)) + this.j.j();
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b
    public int d() {
        return (int) (this.a - this.j.h());
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b
    public int j() {
        return this.i.d();
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b
    public int g() {
        return this.i.e();
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b
    public int i() {
        return this.i.b();
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b
    public int h() {
        return this.i.j();
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b
    public int c() {
        return this.i.c();
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b
    public long b() {
        return this.i.i();
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b
    public List<C4656bid> l() {
        ArrayList arrayList = new ArrayList(this.h.c(2));
        arrayList.addAll(this.j.b(2));
        return arrayList;
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b
    public int e() {
        return (int) (this.d.getBitrateEstimate() / 1000);
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b
    public int k() {
        return this.d.c();
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b
    public float m() {
        return this.h.c();
    }

    @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.streamselector.IStreamSelector$b
    public boolean n() {
        return InterfaceC4657bie.e(this.e);
    }
}
