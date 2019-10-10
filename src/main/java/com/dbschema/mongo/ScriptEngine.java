package com.dbschema.mongo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Liudmila Kornilova
 **/
public interface ScriptEngine {
  @Nullable
  ResultSet execute(@NotNull String query, int fetchSize) throws SQLException;
}
