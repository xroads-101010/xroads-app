package com.xroads.dao.util;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class DateTimeTypeHandler implements TypeHandler<DateTime> {

	public void setParameter(PreparedStatement ps, int i, DateTime parameter,
			JdbcType jdbcType) throws SQLException {
		if (parameter != null) {
			ps.setTimestamp(i, new Timestamp((parameter).getMillis()));
		} else {
			ps.setTimestamp(i, null);
		}

	}

	public DateTime getResult(ResultSet rs, String columnName)
			throws SQLException {
		// TODO Auto-generated method stub
		Timestamp ts = rs.getTimestamp(columnName);
		if (ts != null) {
			return new DateTime(ts.getTime(), DateTimeZone.UTC);
		} else {
			return null;
		}
	}

	public DateTime getResult(ResultSet rs, int columnIndex)
			throws SQLException {
		Timestamp ts = rs.getTimestamp(columnIndex);
		if (ts != null) {
			return new DateTime(ts.getTime(), DateTimeZone.UTC);
		} else {
			return null;
		}
	}

	public DateTime getResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		Timestamp ts = cs.getTimestamp(columnIndex);
		if (ts != null) {
			return new DateTime(ts.getTime(), DateTimeZone.UTC);
		} else {
			return null;
		}
	}

}