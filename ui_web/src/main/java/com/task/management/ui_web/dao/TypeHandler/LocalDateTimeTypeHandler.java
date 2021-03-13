package com.task.management.ui_web.dao.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;



import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



//@MappedTypes(LocalDateTime.class)
//@MappedJdbcTypes(JdbcType.TIMESTAMP)
public class LocalDateTimeTypeHandler extends BaseTypeHandler<LocalDateTime>  {
	
	Logger logger = LogManager.getLogger(LocalDateTimeTypeHandler.class);

	 @Override
	  public void setNonNullParameter(PreparedStatement ps, int i, LocalDateTime parameter, JdbcType jdbcType)
	      throws SQLException {
	    ps.setTimestamp(i, Timestamp.valueOf(parameter));
	  }

	  @Override
	  public LocalDateTime getNullableResult(ResultSet rs, String columnName) throws SQLException {
	    Timestamp timestamp = rs.getTimestamp(columnName);
	    logger.info("timestamp:"+timestamp);
	    return getLocalDateTime(timestamp);
	  }

	  @Override
	  public LocalDateTime getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
	    Timestamp timestamp = rs.getTimestamp(columnIndex);
	    logger.info("timestamp:"+timestamp);
	    return getLocalDateTime(timestamp);
	  }

	  @Override
	  public LocalDateTime getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
	    Timestamp timestamp = cs.getTimestamp(columnIndex);
	    logger.info("timestamp:"+timestamp);
	    return getLocalDateTime(timestamp);
	  }

	  private static LocalDateTime getLocalDateTime(Timestamp timestamp) {
		  
	    if (timestamp != null) {
	      return timestamp.toLocalDateTime();
	      
	    }
	    return null;
	  }
}
