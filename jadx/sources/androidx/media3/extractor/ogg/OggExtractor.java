package androidx.media3.extractor.ogg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import com.google.android.material.ripple.RippleUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes5.dex */
public class OggExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: androidx.media3.extractor.ogg.OggExtractor$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] lambda$static$0;
            lambda$static$0 = OggExtractor.lambda$static$0();
            return lambda$static$0;
        }
    };
    private ExtractorOutput output;
    private StreamReader streamReader;
    private boolean streamReaderInitialized;

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new OggExtractor()};
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        try {
            return sniffInternal(extractorInput);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        StreamReader streamReader = this.streamReader;
        if (streamReader != null) {
            streamReader.seek(j, j2);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        Assertions.checkStateNotNull(this.output);
        if (this.streamReader == null) {
            if (!sniffInternal(extractorInput)) {
                throw ParserException.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            extractorInput.resetPeekPosition();
        }
        if (!this.streamReaderInitialized) {
            TrackOutput track = this.output.track(0, 1);
            this.output.endTracks();
            this.streamReader.init(this.output, track);
            this.streamReaderInitialized = true;
        }
        return this.streamReader.read(extractorInput, positionHolder);
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = RippleUtils.USE_FRAMEWORK_RIPPLE)
    private boolean sniffInternal(ExtractorInput extractorInput) {
        OggPageHeader oggPageHeader = new OggPageHeader();
        if (oggPageHeader.populate(extractorInput, true) && (oggPageHeader.type & 2) == 2) {
            int min = Math.min(oggPageHeader.bodySize, 8);
            ParsableByteArray parsableByteArray = new ParsableByteArray(min);
            extractorInput.peekFully(parsableByteArray.getData(), 0, min);
            if (FlacReader.verifyBitstreamType(resetPosition(parsableByteArray))) {
                this.streamReader = new FlacReader();
            } else if (VorbisReader.verifyBitstreamType(resetPosition(parsableByteArray))) {
                this.streamReader = new VorbisReader();
            } else if (OpusReader.verifyBitstreamType(resetPosition(parsableByteArray))) {
                this.streamReader = new OpusReader();
            }
            return true;
        }
        return false;
    }

    private static ParsableByteArray resetPosition(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(0);
        return parsableByteArray;
    }
}
