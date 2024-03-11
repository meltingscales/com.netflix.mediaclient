package o;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.text.DelegatingSubtitleDecoder;
import androidx.media3.exoplayer.text.SubtitleDecoderFactory;
import androidx.media3.extractor.text.SubtitleDecoder;

/* renamed from: o.ben  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4454ben implements SubtitleDecoderFactory {
    @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
    public boolean supportsFormat(Format format) {
        return "application/nflx-cmisc".equals(format.sampleMimeType) || SubtitleDecoderFactory.DEFAULT.supportsFormat(format);
    }

    @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
    public SubtitleDecoder createDecoder(Format format) {
        if ("application/nflx-cmisc".equals(format.sampleMimeType)) {
            return new C4442beb();
        }
        if ("application/ttml+xml".equals(format.sampleMimeType)) {
            return new DelegatingSubtitleDecoder("ttml", new C4446bef());
        }
        return SubtitleDecoderFactory.DEFAULT.createDecoder(format);
    }
}
