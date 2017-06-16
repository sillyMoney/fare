package com.yushan.flight.provider;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;

/**
 * Created by sillyfrog on 17-6-17.
 */
public class BaseDataProvider {

    private static final String DISTANCE = "t_distance";

    private static final String COMMON_COL = "del_flag as defFlag, create_time as createTime, create_user as createUser," +
            " dis_user as disUser, dis_time as disTime, last_id as lastId";

    public String getDistanceListSql() {
        BEGIN();
        SELECT("id, ori, dest, dis, "+COMMON_COL);
        FROM(DISTANCE);
        return SQL();
    }
}
