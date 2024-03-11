package o;

import com.netflix.mediaclient.commanderinfra.api.util.PlaybackControlKey;
import com.netflix.mediaclient.commanderinfra.api.util.PlaybackKey;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes3.dex */
public final class WV implements WW {
    public static final c d = new c(null);

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("PlaybackEventManagerImpl");
        }
    }

    @Override // o.WW
    public void e() {
        d.getLogTag();
        C1328Xl.b.b(PlaybackControlKey.a);
    }

    @Override // o.WW
    public void d() {
        d.getLogTag();
        C1328Xl.b.b(PlaybackControlKey.b);
    }

    @Override // o.WW
    public void c() {
        d.getLogTag();
        C1328Xl.b.a(PlaybackKey.c);
    }

    @Override // o.WW
    public void b() {
        d.getLogTag();
        C1328Xl.b.a(PlaybackKey.f);
    }

    @Override // o.WW
    public void b(long j) {
        d.getLogTag();
        C1329Xm.c.d(new C1257Us(j / 1000));
    }

    @Override // o.WW
    public void a() {
        d.getLogTag();
        C1328Xl.b.a(PlaybackKey.a);
    }

    @Override // o.WW
    public void f() {
        d.getLogTag();
        C1328Xl.b.a(PlaybackKey.g);
    }
}
