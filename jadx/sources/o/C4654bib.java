package o;

import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bib  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4654bib {
    private final C4753bkr a;
    private a c;
    private final ExoPlayer d;
    private int b = 0;
    private final Runnable e = new Runnable() { // from class: o.bib.3
        @Override // java.lang.Runnable
        public void run() {
            long totalBufferedDuration = C4654bib.this.d.getTotalBufferedDuration();
            long currentPosition = C4654bib.this.d.getCurrentPosition();
            if (C4654bib.this.d(totalBufferedDuration - (C4654bib.this.d.getBufferedPosition() - currentPosition))) {
                C4654bib.this.c.d();
                return;
            }
            C4654bib c4654bib = C4654bib.this;
            int i = c4654bib.b;
            c4654bib.b = i + 1;
            if (i < 20) {
                C8187dfe.a(this, 200L);
            }
        }
    };

    /* renamed from: o.bib$a */
    /* loaded from: classes3.dex */
    public interface a {
        void d();
    }

    public C4654bib(ExoPlayer exoPlayer, C4753bkr c4753bkr) {
        this.d = exoPlayer;
        this.a = c4753bkr;
    }

    public void c(a aVar) {
        this.c = aVar;
        C8187dfe.c(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(long j) {
        return j >= this.a.d().aV();
    }
}
