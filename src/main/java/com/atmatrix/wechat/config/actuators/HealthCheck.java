package com.atmatrix.wechat.config.actuators;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: wx-msg-persistence
 * @ClassName: HealthCheck
 * @Description: TODO
 * @Author: edgeowner
 * @Create: 2019-01-11 1:03 PM
 **/

@Component
public class HealthCheck implements HealthIndicator {
    @Override
    public Health health() {
        int errorCode = check(); // perform some specific health check
        if (errorCode != 0) {
            return Health.down()
                    .withDetail("Error Code", errorCode).build();
        }
        return Health.up().build();
    }

    public int check() {
        // Our logic to check health
        return 0;
    }
}
