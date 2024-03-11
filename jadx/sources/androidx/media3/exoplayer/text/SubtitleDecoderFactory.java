package androidx.media3.exoplayer.text;

import androidx.media3.common.Format;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleDecoder;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface SubtitleDecoderFactory {
    public static final SubtitleDecoderFactory DEFAULT = new SubtitleDecoderFactory() { // from class: androidx.media3.exoplayer.text.SubtitleDecoderFactory.1
        private final DefaultSubtitleParserFactory delegate = new DefaultSubtitleParserFactory();

        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return this.delegate.supportsFormat(format) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[ADDED_TO_REGION] */
        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.media3.extractor.text.SubtitleDecoder createDecoder(androidx.media3.common.Format r6) {
            /*
                r5 = this;
                androidx.media3.extractor.text.DefaultSubtitleParserFactory r0 = r5.delegate
                boolean r0 = r0.supportsFormat(r6)
                if (r0 == 0) goto L2d
                androidx.media3.extractor.text.DefaultSubtitleParserFactory r0 = r5.delegate
                androidx.media3.extractor.text.SubtitleParser r6 = r0.create(r6)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class r1 = r6.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = "Decoder"
                r0.append(r1)
                androidx.media3.exoplayer.text.DelegatingSubtitleDecoder r1 = new androidx.media3.exoplayer.text.DelegatingSubtitleDecoder
                java.lang.String r0 = r0.toString()
                r1.<init>(r0, r6)
                return r1
            L2d:
                java.lang.String r0 = r6.sampleMimeType
                if (r0 == 0) goto L82
                int r1 = r0.hashCode()
                r2 = 930165504(0x37713300, float:1.4376594E-5)
                r3 = 2
                r4 = 1
                if (r1 == r2) goto L5d
                r2 = 1566015601(0x5d578071, float:9.7053348E17)
                if (r1 == r2) goto L52
                r2 = 1566016562(0x5d578432, float:9.7059952E17)
                if (r1 == r2) goto L47
                goto L65
            L47:
                java.lang.String r1 = "application/cea-708"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L50
                goto L65
            L50:
                r1 = r3
                goto L68
            L52:
                java.lang.String r1 = "application/cea-608"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L5b
                goto L65
            L5b:
                r1 = r4
                goto L68
            L5d:
                java.lang.String r1 = "application/x-mp4-cea-608"
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L67
            L65:
                r1 = -1
                goto L68
            L67:
                r1 = 0
            L68:
                if (r1 == 0) goto L78
                if (r1 == r4) goto L78
                if (r1 != r3) goto L82
                androidx.media3.extractor.text.cea.Cea708Decoder r0 = new androidx.media3.extractor.text.cea.Cea708Decoder
                int r1 = r6.accessibilityChannel
                java.util.List<byte[]> r6 = r6.initializationData
                r0.<init>(r1, r6)
                return r0
            L78:
                androidx.media3.extractor.text.cea.Cea608Decoder r1 = new androidx.media3.extractor.text.cea.Cea608Decoder
                int r6 = r6.accessibilityChannel
                r2 = 16000(0x3e80, double:7.905E-320)
                r1.<init>(r0, r6, r2)
                return r1
            L82:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r1 = "Attempted to create decoder for unsupported MIME type: "
                r6.append(r1)
                r6.append(r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r6 = r6.toString()
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.text.SubtitleDecoderFactory.AnonymousClass1.createDecoder(androidx.media3.common.Format):androidx.media3.extractor.text.SubtitleDecoder");
        }
    };

    SubtitleDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
