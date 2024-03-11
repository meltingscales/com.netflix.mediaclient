package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.util.PlayContext;
import java.util.Collections;
import o.C4882boK;
import o.C4905boh;
import o.C5208buS;
import o.C5273bve;

/* renamed from: o.boh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4905boh extends C4882boK {
    @Override // o.C4882boK, o.AbstractC4918bou
    protected boolean a(IPlayer.c cVar) {
        return false;
    }

    public C4905boh(Context context, final Handler handler, Looper looper, final long j, PlayContext playContext, final PlaylistTimestamp playlistTimestamp, PlaybackExperience playbackExperience, final C4606bhg c4606bhg, InterfaceC4708bjc interfaceC4708bjc, boolean z, final long j2, final boolean z2, String str, final PreferredLanguageData preferredLanguageData, InterfaceC4766bmA interfaceC4766bmA, C4875boD c4875boD) {
        super(context, handler, looper, null, playContext, playlistTimestamp, playbackExperience, c4606bhg, interfaceC4708bjc, z, j2, str, preferredLanguageData, interfaceC4766bmA, c4875boD);
        ((C4882boK) this).F.set(j);
        this.y = c4606bhg.a().e(Collections.singletonList(Long.valueOf(j)));
        ((C4882boK) this).N = true;
        c(new Runnable() { // from class: o.boj
            @Override // java.lang.Runnable
            public final void run() {
                C4905boh.this.e(j, playlistTimestamp, j2, c4606bhg, handler, preferredLanguageData, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.boh$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 extends C4882boK.c {
        final /* synthetic */ Handler d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(C4886boO c4886boO, Handler handler) {
            super(c4886boO);
            this.d = handler;
        }

        @Override // o.C4882boK.c, o.InterfaceC4873boB.a
        public void d(final long j, final InterfaceC4525bgE interfaceC4525bgE, final boolean z) {
            this.d.post(new Runnable() { // from class: o.bop
                @Override // java.lang.Runnable
                public final void run() {
                    C4905boh.AnonymousClass3.this.e(interfaceC4525bgE, j, z);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(final InterfaceC4525bgE interfaceC4525bgE, final long j, final boolean z) {
            C4905boh.this.s().d(interfaceC4525bgE.af());
            C4905boh.this.I.post(new Runnable() { // from class: o.boo
                @Override // java.lang.Runnable
                public final void run() {
                    C4905boh.AnonymousClass3.this.e(j, interfaceC4525bgE, z);
                }
            });
        }

        @Override // o.C4882boK.c, o.InterfaceC4873boB.a
        public void a(final long j, final Status status) {
            final String l = Long.toString(j);
            this.d.post(new Runnable() { // from class: o.bol
                @Override // java.lang.Runnable
                public final void run() {
                    C4905boh.AnonymousClass3.this.b(l, j, status);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str, final long j, final Status status) {
            C4905boh.this.s().d(new C5208buS.b(str).a(str, new C5273bve.b(j).d()).d(str).a());
            C4905boh.this.I.post(new Runnable() { // from class: o.boi
                @Override // java.lang.Runnable
                public final void run() {
                    C4905boh.AnonymousClass3.this.e(j, status);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void e(long j, InterfaceC4525bgE interfaceC4525bgE, boolean z) {
            super.d(j, interfaceC4525bgE, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void e(long j, Status status) {
            super.a(j, status);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(long j, PlaylistTimestamp playlistTimestamp, long j2, C4606bhg c4606bhg, Handler handler, PreferredLanguageData preferredLanguageData, boolean z) {
        this.w.b(j, playlistTimestamp.e, j2);
        c4606bhg.a().b(Collections.singletonList(Long.valueOf(j)), new AnonymousClass3(this.w, handler), new C4877boF(true, this.v.g(), this.v.j(), ((C4882boK) this).M, preferredLanguageData, this.w.c(j), this.v.b().b()), z, null);
    }

    @Override // o.C4882boK, o.InterfaceC5085bsB
    public String c() {
        return String.valueOf(H());
    }
}
