package com.yushan.flight.controller;

import com.yushan.flight.data.base.DistanceDO;
import com.yushan.flight.mapper.DistanceMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sillyfrog on 17-6-17.
 */
@RestController
public class DistanceController {

    private final DistanceMapper distanceMapper;

    public DistanceController(DistanceMapper distanceMapper) {
        this.distanceMapper = distanceMapper;
    }

    @RequestMapping("/disAll")
    public List<DistanceDO> findAll() {
        return distanceMapper.queryDistanceList();
    }

}
