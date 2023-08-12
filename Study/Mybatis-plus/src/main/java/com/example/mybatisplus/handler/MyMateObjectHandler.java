package com.example.mybatisplus.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class MyMateObjectHandler implements MetaObjectHandler {
        //插入时的填充策略
        @Override
        public void insertFill(MetaObject metaObject) {
            log.info("start intsert fill ....");
            //strictInsertFill(MetaObject metaObject, String fieldName, Class<T> fieldType, E fieldVal)
            this.strictInsertFill(metaObject,"create_time", LocalDateTime.class,LocalDateTime.now());// 起始版本 3.3.0(推荐使用)
        }
        //更新时的填充策略
        @Override
        public void updateFill(MetaObject metaObject) {
            log.info("start update fill ....");
            this.strictUpdateFill(metaObject, "update_time", LocalDateTime.class, LocalDateTime.now()); // 起始版本 3.3.0(推荐)
        }

}
