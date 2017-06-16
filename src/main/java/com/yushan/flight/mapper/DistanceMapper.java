package com.yushan.flight.mapper;

import com.yushan.flight.data.base.DistanceDO;
import com.yushan.flight.provider.BaseDataProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * Created by sillyfrog on 17-6-17.
 */
@Mapper
public interface DistanceMapper {

    @SelectProvider(type = BaseDataProvider.class, method = "getDistanceListSql")
    List<DistanceDO> queryDistanceList();

}
