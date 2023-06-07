package com.glodon.translator.parser.dialect.mysql.statement.segment;

import com.glodon.translator.parser.segment.ddl.index.IndexSegment;
import com.glodon.translator.parser.segment.generic.table.SimpleTableSegment;

import java.util.Collection;
import java.util.LinkedList;

public final class CacheTableIndexSegment extends TableIndexSegment {
    
    private final Collection<IndexSegment> indexes = new LinkedList<>();
    
    public CacheTableIndexSegment(final int startIndex, final int stopIndex, final SimpleTableSegment table) {
        super(startIndex, stopIndex, table);
    }

    public Collection<IndexSegment> getIndexes() {
        return indexes;
    }
}
