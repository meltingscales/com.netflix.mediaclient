package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.text.Subtitle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bdJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4371bdJ implements Subtitle {
    private final long a;
    final List<Cue> c;
    final boolean d;

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        if (i == 0) {
            return 0L;
        }
        return this.a;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        return j <= this.a ? 0 : 1;
    }

    public C4371bdJ(long j, byte[] bArr, int i) {
        short readShort;
        short readShort2;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 24, i - 24);
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, 24);
        this.d = parsableByteArray.readInt() == 0;
        short readShort3 = parsableByteArray.readShort();
        short readShort4 = parsableByteArray.readShort();
        parsableByteArray.readInt();
        this.a = androidx.media3.common.C.msToUs(parsableByteArray.readInt());
        short readShort5 = parsableByteArray.readShort();
        short readShort6 = parsableByteArray.readShort();
        float f = readShort4;
        arrayList.add(new Cue.Builder().setBitmap(decodeByteArray).setLine((readShort6 + (readShort2 / 2)) / f, 0).setLineAnchor(1).setPosition((readShort5 + (readShort / 2)) / readShort3).setPositionAnchor(1).setSize(parsableByteArray.readShort() / f).setBitmapHeight(parsableByteArray.readShort() / f).build());
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j) {
        return j < this.a ? this.c : new ArrayList();
    }

    public static int a(byte[] bArr) {
        return new ParsableByteArray(bArr, 24).readInt();
    }
}
