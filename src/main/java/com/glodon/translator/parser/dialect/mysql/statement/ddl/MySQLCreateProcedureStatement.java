package com.glodon.translator.parser.dialect.mysql.statement.ddl;

import com.glodon.translator.parser.dialect.mysql.statement.MySQLStatement;
import com.glodon.translator.parser.segment.ddl.routine.RoutineBodySegment;
import com.glodon.translator.parser.statement.ddl.CreateProcedureStatement;

import java.util.Optional;

public final class MySQLCreateProcedureStatement extends CreateProcedureStatement implements MySQLStatement {

    private RoutineBodySegment routineBody;

    public Optional<RoutineBodySegment> getRoutineBody() {
        return Optional.ofNullable(routineBody);
    }

    public void setRoutineBody(RoutineBodySegment routineBody) {
        this.routineBody = routineBody;
    }
}
