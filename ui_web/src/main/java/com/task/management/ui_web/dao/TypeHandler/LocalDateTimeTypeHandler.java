package com.task.management.ui_web.dao.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.sql.Date;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

@MappedTypes(LocalDateTime.class)
@MappedJdbcTypes(JdbcType.DATE)
//@MappedTypes({Date.class})
public class LocalDateTimeTypeHandler extends BaseTypeHandler<LocalDateTime>  {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, LocalDateTime parameter, JdbcType jdbcType)
			throws SQLException {
		// TODO Auto-generated method stub
		//ps.setDate(i, Date.valueOf(parameter));
		java.util.Date temp=java.util.Date
	      .from(parameter.atZone(ZoneId.systemDefault())
	      .toInstant());
		ps.setDate(i, Date.valueOf(temp.toString()));
		
	}

	@Override
	public LocalDateTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
		// TODO Auto-generated method stub
		 Date date = rs.getDate(columnName);
		 return getLocalDate(date);
		
	}

	@Override
	public LocalDateTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		Date date = rs.getDate(columnIndex);
	    return getLocalDate(date);
		
	}

	@Override
	public LocalDateTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		Date date = cs.getDate(columnIndex);
	    return getLocalDate(date);
	}
	
	 private static LocalDateTime getLocalDate(Date date) {
		    if (date != null) {
		      return date.toInstant()
		    	      .atZone(ZoneId.systemDefault())
		    	      .toLocalDateTime();
		    }
		    return null;
		  }

}
