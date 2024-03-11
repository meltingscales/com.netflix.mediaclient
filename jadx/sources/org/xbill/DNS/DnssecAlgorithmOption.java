package org.xbill.DNS;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.xbill.DNS.DNSSEC;
import org.xbill.DNS.EDNSOption;

/* loaded from: classes5.dex */
public class DnssecAlgorithmOption extends EDNSOption {
    private List<Integer> algCodes;

    private DnssecAlgorithmOption(int i) {
        super(i);
        if (i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException("Invalid option code, must be one of DAU, DHU, N3U");
        }
        this.algCodes = new ArrayList();
    }

    public DnssecAlgorithmOption(int i, int... iArr) {
        this(i);
        if (iArr != null) {
            for (int i2 : iArr) {
                this.algCodes.add(Integer.valueOf(i2));
            }
        }
    }

    @Override // org.xbill.DNS.EDNSOption
    void optionFromWire(DNSInput dNSInput) {
        this.algCodes.clear();
        while (dNSInput.remaining() > 0) {
            this.algCodes.add(Integer.valueOf(dNSInput.readU8()));
        }
    }

    @Override // org.xbill.DNS.EDNSOption
    void optionToWire(final DNSOutput dNSOutput) {
        List<Integer> list = this.algCodes;
        dNSOutput.getClass();
        list.forEach(new Consumer() { // from class: org.xbill.DNS.DnssecAlgorithmOption$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                DNSOutput.this.writeU8(((Integer) obj).intValue());
            }
        });
    }

    @Override // org.xbill.DNS.EDNSOption
    String optionToString() {
        return EDNSOption.Code.string(getCode()) + ": [" + ((String) this.algCodes.stream().map(new Function() { // from class: org.xbill.DNS.DnssecAlgorithmOption$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DNSSEC.Algorithm.string(((Integer) obj).intValue());
            }
        }).collect(Collectors.joining(", "))) + "]";
    }
}
