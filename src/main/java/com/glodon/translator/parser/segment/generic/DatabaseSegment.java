package com.glodon.translator.parser.segment.generic;

import com.glodon.translator.parser.segment.SQLSegment;
import com.glodon.translator.parser.value.identifier.IdentifierValue;

public final class DatabaseSegment implements SQLSegment {

    private final int startIndex;

    private final int stopIndex;

    private final IdentifierValue identifier;

    public DatabaseSegment(int startIndex, int stopIndex, IdentifierValue identifier) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.identifier = identifier;
    }

    @Override
    public int getStartIndex() {
        return startIndex;
    }

    @Override
    public int getStopIndex() {
        return stopIndex;
    }

    public IdentifierValue getIdentifier() {
        return identifier;
    }
}
