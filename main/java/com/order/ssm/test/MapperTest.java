package com.order.ssm.test;

import com.order.ssm.bean.Orrder;
import com.order.ssm.dao.OrrderMapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    OrrderMapper orderMapper;

    @Autowired
    SqlSession sqlSession;

    @Test
    public void testCRUD(){
//        System.out.println(orderMapper);

//        orderMapper.insertSelective(new Orrder(null,"张三", 15101, "麻辣小龙虾", 2 , 58));

        OrrderMapper mapper = sqlSession.getMapper(OrrderMapper.class);
        for(int i = 0; i< 40 ; i++){
            String uid = UUID.randomUUID().toString().substring(0,5) + i;
            if(i % 3 == 0) {
                int intFlag1 = (int)(Math.random() * 10000 + 10000);
                mapper.insertSelective(new Orrder(null, uid, intFlag1, "蒜泥小龙虾", 2, 68));
            }
            if(i % 3 == 1){
                int intFlag2 = (int)(Math.random() * 10000 + 10000);
                mapper.insertSelective(new Orrder(null, uid, intFlag2, "麻辣小龙虾", 2, 68));
            }
            if(i % 3 == 2){
                int intFlag3 = (int)(Math.random() * 10000 + 10000);
                mapper.insertSelective(new Orrder(null, uid, intFlag3, "十三香龙虾", 2, 68));

            }
        }
        System.out.println("批量成功！");
    }
}
