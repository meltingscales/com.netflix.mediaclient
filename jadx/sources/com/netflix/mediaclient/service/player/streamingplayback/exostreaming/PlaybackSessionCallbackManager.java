package com.netflix.mediaclient.service.player.streamingplayback.exostreaming;

import android.os.Handler;
import com.netflix.mediaclient.media.PlayerManifestData;
import com.netflix.mediaclient.servicemgr.IPlayer;
import java.util.ArrayList;
import java.util.List;
import o.C1044Mm;
import o.C5086bsC;
import o.InterfaceC5097bsN;

/* loaded from: classes4.dex */
public final class PlaybackSessionCallbackManager {
    private static String d = "PlaybackSessionCallback";
    private final List<InterfaceC5097bsN> b = new ArrayList();
    private IPlayer.c c;
    private final Handler e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum ListenerType {
        PREPARED,
        STARTED,
        STALLED,
        CLOSED,
        COMPLETION,
        ERROR,
        DETACHED,
        PAUSED,
        FIRST_VIDEO_FRAME,
        LIVE_WINDOW,
        LIVE_EVENT_STATE,
        VOLUME_CHANGED
    }

    public PlaybackSessionCallbackManager(Handler handler) {
        this.e = handler;
    }

    public void b(PlayerManifestData playerManifestData) {
        b(ListenerType.PREPARED, playerManifestData);
    }

    public void a() {
        b(ListenerType.STARTED, null);
    }

    public void b(long j) {
        b(ListenerType.COMPLETION, Long.valueOf(j));
    }

    public void c(long j) {
        b(ListenerType.LIVE_WINDOW, Long.valueOf(j));
    }

    public void b(C5086bsC c5086bsC) {
        b(ListenerType.LIVE_EVENT_STATE, c5086bsC);
    }

    public void b() {
        if (this.c != null) {
            C1044Mm.a(d, "checkForLastError reporting now.");
            b(this.c);
            this.c = null;
        }
    }

    public void c(int i, int i2) {
        b(ListenerType.VOLUME_CHANGED, Integer.valueOf(i2));
    }

    public void b(IPlayer.c cVar) {
        b(ListenerType.ERROR, cVar);
    }

    public void d() {
        b(ListenerType.STALLED, null);
    }

    public void c() {
        b(ListenerType.CLOSED, null);
    }

    public void e() {
        b(ListenerType.PAUSED, null);
    }

    public void c(final InterfaceC5097bsN interfaceC5097bsN) {
        if (interfaceC5097bsN == null) {
            return;
        }
        this.e.post(new Runnable() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exostreaming.PlaybackSessionCallbackManager.1
            @Override // java.lang.Runnable
            public void run() {
                PlaybackSessionCallbackManager.this.b.add(interfaceC5097bsN);
            }
        });
    }

    public void d(final InterfaceC5097bsN interfaceC5097bsN) {
        if (interfaceC5097bsN == null) {
            return;
        }
        b(ListenerType.DETACHED, interfaceC5097bsN);
        this.e.post(new Runnable() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exostreaming.PlaybackSessionCallbackManager.2
            @Override // java.lang.Runnable
            public void run() {
                PlaybackSessionCallbackManager.this.b.add(interfaceC5097bsN);
            }
        });
    }

    public void b(final InterfaceC5097bsN interfaceC5097bsN) {
        if (interfaceC5097bsN == null) {
            return;
        }
        this.e.post(new Runnable() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exostreaming.PlaybackSessionCallbackManager.5
            @Override // java.lang.Runnable
            public void run() {
                PlaybackSessionCallbackManager.this.b.remove(interfaceC5097bsN);
            }
        });
    }

    private void b(final ListenerType listenerType, final Object obj) {
        C1044Mm.c(d, "ListenerType=%s", listenerType.toString());
        this.e.post(new Runnable() { // from class: com.netflix.mediaclient.service.player.streamingplayback.exostreaming.PlaybackSessionCallbackManager.4
            @Override // java.lang.Runnable
            public void run() {
                for (InterfaceC5097bsN interfaceC5097bsN : PlaybackSessionCallbackManager.this.b) {
                    if (interfaceC5097bsN != null && interfaceC5097bsN.b()) {
                        switch (AnonymousClass3.c[listenerType.ordinal()]) {
                            case 1:
                                interfaceC5097bsN.a((PlayerManifestData) obj);
                                continue;
                            case 2:
                                interfaceC5097bsN.i();
                                continue;
                            case 3:
                                interfaceC5097bsN.c();
                                continue;
                            case 4:
                                interfaceC5097bsN.a();
                                continue;
                            case 5:
                                interfaceC5097bsN.d(((Long) obj).longValue());
                                continue;
                            case 6:
                                interfaceC5097bsN.d((IPlayer.c) obj);
                                continue;
                            case 7:
                                if (interfaceC5097bsN != obj) {
                                    interfaceC5097bsN.d();
                                    break;
                                } else {
                                    continue;
                                }
                            case 8:
                                interfaceC5097bsN.e();
                                continue;
                            case 9:
                                interfaceC5097bsN.j();
                                continue;
                            case 10:
                                interfaceC5097bsN.e(((Long) obj).longValue());
                                continue;
                            case 11:
                                interfaceC5097bsN.d((C5086bsC) obj);
                                continue;
                            case 12:
                                interfaceC5097bsN.b(((Integer) obj).intValue());
                                continue;
                        }
                    }
                }
            }
        });
    }

    /* renamed from: com.netflix.mediaclient.service.player.streamingplayback.exostreaming.PlaybackSessionCallbackManager$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ListenerType.values().length];
            c = iArr;
            try {
                iArr[ListenerType.PREPARED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[ListenerType.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[ListenerType.STALLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                c[ListenerType.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                c[ListenerType.COMPLETION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                c[ListenerType.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                c[ListenerType.DETACHED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[ListenerType.PAUSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[ListenerType.FIRST_VIDEO_FRAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                c[ListenerType.LIVE_WINDOW.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                c[ListenerType.LIVE_EVENT_STATE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c[ListenerType.VOLUME_CHANGED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }
}
